package test;

public class ObjectInit {

	public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println(new Parent());
		System.out.println(p);
	}
	
	
}

class Parent
{
	public int id;
}
class Child extends Parent
{
	public int name;
}