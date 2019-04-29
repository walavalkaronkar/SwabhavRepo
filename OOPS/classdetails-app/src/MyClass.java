
public class MyClass {

	private static MyClass object=null;
	private MyClass()
	{
			
	}
	
	public static MyClass createObject()
	{
		if(object==null)
		{
			object=new MyClass();
			return object;
		}
		return null;
	}
}
