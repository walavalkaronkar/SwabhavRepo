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
		EmployeeLoader el=new EmployeeLoader();
		File file=new File("dataFile.txt");
		InputStream in =new FileInputStream(file);
		DataInputStream dis=new DataInputStream(in);
		
		String s=null;
		
		while((s=dis.readLine())!=null)
		{
	    	emp=el.loadEmployee(emp, s);
		}
		dis.close();
		in.close();
		
		return emp;
	}
}
