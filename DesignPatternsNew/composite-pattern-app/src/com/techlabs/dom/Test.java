package com.techlabs.dom;

public class Test {

	public static void main(String[] args) {
		
		ControlCmp root=new ControlCmp("html",null,0);
		
		ControlCmp cc1=new ControlCmp("body", "",root.getLevel()+1);
		root.addElements(cc1);
		
		ControlCmp cc2=new ControlCmp("form", "",cc1.getLevel()+1);
		cc1.addElements(cc2);
		
		
		cc2.addElements(new Control("input","text","","","Enter the username"));
		cc2.addElements(new Control("input","password","","","Enter the password"));
		cc2.addElements(new Control("input","submit","","",""));
		String tag=root.generate();
		System.out.println(tag);
		
		
		

	}

}
