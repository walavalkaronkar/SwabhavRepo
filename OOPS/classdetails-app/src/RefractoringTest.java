
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class RefractoringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		// NeedForRefractingAnnotaion at=new NeedForRefractingAnnotaion();
		
		 String className="NeedForRefractingAnnotaion";
		 Class c=Class.forName(className);
		 int count=0;
		 for (Method m : c.getMethods()) {
	           NeedForRefracting nfr = (NeedForRefracting) m.getAnnotation(NeedForRefracting.class);
	           
	           if (nfr != null) 
	           {
	        	   count++;
	        	   //System.out.println("NEED For"+nfr);
	        	   System.out.println("MEthod"+m.getName());
	        	   
	           }
		 }
		 System.out.println("Total Number of NeedForRefractoting Methods are "+count);
		
		
	}

}
