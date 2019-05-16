package com.techlabs.loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;

import com.techlabs.analyser.Employee;

public class URLFileLoader implements ILoadable {

	@Override
	public HashSet<Employee> loadEmployee() throws IOException {
	
		HashSet<Employee> emp=new HashSet<Employee>();
	    String theUrl="https://swabhav-tech.firebaseapp.com/emp.txt";
	    URL url = new URL(theUrl);
	    URLConnection urlConnection = url.openConnection();
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
	    String s;
	    while ((s = bufferedReader.readLine()) != null)
	    {
	    	String[] details=s.split(",");
			Employee employee=new Employee();
			employee.setEmployeeId(Integer.parseInt(details[0]));
			employee.setEmployeeName(details[1].substring(1, details[1].length()-1));
			employee.setEmpDesignation(details[2].substring(1, details[2].length()-1));
			employee.setManagerId(details[3]);
			employee.setDateOfJoining(details[4].substring(1, details[4].length()-1));
			employee.setSalary(Double.parseDouble(details[5]));
			employee.setCommision(details[6]);
			employee.setDepartmentNumber(Integer.parseInt(details[7]));
			
			emp.add(employee);
			//System.out.println(emp);
	    }
	    bufferedReader.close();
	    return emp;
	}

}
