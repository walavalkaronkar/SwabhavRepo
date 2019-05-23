package com.techlabs.movies;

public class File implements Istorage{

	private String name;
	private String size;
	
	public File(String name,String size) {
		this.name=name;
		this.size=size;
	}
	
	@Override
	public void display() {
		System.out.println("  "+name+" "+size );
	}

}
