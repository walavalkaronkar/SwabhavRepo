package constructor.inheritance.caseone;

public class Child extends Parent{

	/*
	public Child()
	{
		System.out.println("Child class constructor");
	}
	*/
	
	public Child()
	{
		super(100);
	}
	
	public Child(int foo)
	{
		super(foo);
	}
}
