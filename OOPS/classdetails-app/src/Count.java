import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Count {

	public static int getTotalMethods(Object obj)
	{
		int n=0;
		
		String className=obj.getClass().getName();
		System.out.println(className);
		Class myClassObject=obj.getClass();
		Method[] methodObject=myClassObject.getDeclaredMethods();
		//Method[] methodObject=Class.forName(className).getDeclaredMethods();
		n=methodObject.length;
		return n;
	}

	public static int getTotalConstructor(Object obj)
	{
		int n=0;
		Class myClassObject=obj.getClass();
		Constructor[] constuctorObject=myClassObject.getDeclaredConstructors();
		n=constuctorObject.length;
		return n;
	}
	
	public static int getTotalGetters(Object obj)
	{
		int n=0;
		Class myClassObject=obj.getClass();
		Method[] methods = myClassObject.getDeclaredMethods();
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
	public static int getTotalSetters(Object obj)
	{
		int n=0;
		Class myClassObject=obj.getClass();
		Method[] methods = myClassObject.getDeclaredMethods();
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
