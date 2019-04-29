package com.techlabs;

public class MyTest {
	public static void main(String[] args) {
		
		Parent p=new Parent();
		Child c=new Child();
		Parent p1=new Child();
		p1.method();
		p1.method3();
	}
}


class Parent
{
	void method()
	{
		System.out.println("Parent");
	}
	void method3()
	{
		System.out.println("Mehod of parent only");
	}
}

class Child extends Parent
{
	 void method()
	 {
		 System.out.println("Child");
	 }
	 void Method2()
	 {
		 System.out.println("Method of Child only");
	 }
}