package com.techlabs.loader;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;

import com.techlabs.analyser.Employee;

public class DiskFileLoader implements ILoadable {

	@Override
	public HashSet<Employee> loadEmployee() throws IOException {
		
		HashSet<Employee> emp=new HashSet<Employee>();
		File file=new File("dataFile.txt");
		InputStream in =new FileInputStream(file);
		DataInputStream dis=new DataInputStream(in);
		
		String s=null;
		
		while((s=dis.readLine())!=null)
		{
			s.replaceAll("'","");
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
		}
		dis.close();
		in.close();
		
		return emp;
	}
}
