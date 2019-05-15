package constructor.inheritance.caseone;

public class Parent {

	private int foo;
	
	/*Parent()
	{
		System.out.println("Parent class constuctor");
	}*/
	
	public Parent(int foo)
	{
		this.foo=foo;
	}
	public int getFoo()
	{
		return foo;
	}
}
