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
	public HashSet<Employee> loadEmployee()  throws IOException {
	
		HashSet<Employee> emp=new HashSet<Employee>();
		EmployeeLoader el=new EmployeeLoader();
	    String theUrl="https://swabhav-tech.firebaseapp.com/emp.txt";
	    URL url = new URL(theUrl);
	    URLConnection urlConnection = url.openConnection();
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
	    String s;
	    while ((s = bufferedReader.readLine()) != null)
	    {
	    	emp=el.loadEmployee(emp, s);
	    }
	    bufferedReader.close();
	    return emp;
	}

}
