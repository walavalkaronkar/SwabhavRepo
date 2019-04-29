import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CountUsingClass {

	public static int getTotalMethods(String className) throws SecurityException, ClassNotFoundException
	{
		int n=0;
		
		//String className=obj.getClass().getName();
		//System.out.println(className);
		//Class myClassObject=obj.getClass();
		//Method[] methodObject=myClassObject.getDeclaredMethods();
		Method[] methodObject=Class.forName(className).getDeclaredMethods();
		n=methodObject.length;
		return n;
	}

	public static int getTotalConstructor(String className) throws SecurityException, ClassNotFoundException
	{
		int n=0;
		//Class myClassObject=obj.getClass();
		Constructor[] constuctorObject=Class.forName(className).getDeclaredConstructors();
		n=constuctorObject.length;
		return n;
	}
	
	public static int getTotalGetters(String className) throws SecurityException, ClassNotFoundException
	{
		int n=0;
		//Class myClassObject=obj.getClass();
		Method[] methods = Class.forName(className).getDeclaredMethods();
		for(Method method : methods) 
		{
			String methodName = method.getName();
			if(methodName.startsWith("get") || methodName.startsWith("is")) 
			{
				n++;
			}
		}
		return n;
	}
	public static int getTotalSetters(String className) throws SecurityException, ClassNotFoundException
	{
		int n=0;
		//Class myClassObject=obj.getClass();
		Method[] methods = Class.forName(className).getDeclaredMethods();
		for(Method method : methods) 
		{
			String methodName = method.getName();
			if(methodName.startsWith("set")) 
			{
				n++;
			}
		}
		return n;
	}
}
