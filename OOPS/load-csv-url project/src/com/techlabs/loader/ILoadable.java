package com.techlabs.loader;

import java.util.HashSet;

import com.techlabs.analyser.Employee;

public interface ILoadable {

	public HashSet<Employee> loadEmployee() throws Exception;
}
