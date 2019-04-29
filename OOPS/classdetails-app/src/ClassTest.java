import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.circle.Circle;

public class ClassTest {

	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//String s="onkar";
		CountUsingClass c=new CountUsingClass();
		MyClass myclass=MyClass.createObject();
		
		System.out.println("Methods "+c.getTotalMethods("MyClass"));
		System.out.println("Constructor "+c.getTotalConstructor("MyClass"));
		System.out.println("Getters  "+c.getTotalGetters("MyClass"));
		System.out.println("Setters  "+c.getTotalSetters("MyClass"));
		
		/*System.out.println();
		Circle c=new Circle(10.5f);
		System.out.println("Methods "+getTotalMethods(c));
		System.out.println("Constructor "+getTotalConstructor(c));
		System.out.println("Getters  "+getTotalGetters(c));
		System.out.println("Setters"+getTotalSetters(c));
		
		System.out.println();
		System.out.println("Methods "+getTotalMethods(myclass));
		System.out.println("Constructor "+getTotalConstructor(myclass));
		System.out.println("Getters  "+getTotalGetters(myclass));
		System.out.println("Setters "+getTotalSetters(myclass));*/
	}
	
	
	
	
}


