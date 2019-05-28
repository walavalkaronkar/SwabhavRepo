import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList<Integer>();
		LinkedList<Integer> llist=new LinkedList<Integer>();


		 try {
	         Class cls = Class.forName("java.util.ArrayList");
	         System.out.println("Methods =");
	      
	         /* returns the array of Method objects representing the public 
	            methods of this class */
	         Method m[] = cls.getMethods();
	         for(int i = 0; i < m.length; i++) {
	            System.out.println(m[i].getName());
	         }
	      } catch (Exception e) {
	         System.out.println("Exception: " + e);
	      }
		 
		 System.out.println();
		 try {
	         Class cls = Class.forName("java.util.LinkedList");
	         System.out.println("Methods =");
	      
	         /* returns the array of Method objects representing the public 
	            methods of this class */
	         Method m[] = cls.getMethods();
	         for(int i = 0; i < m.length; i++) {
	            System.out.println(m[i].getName());
	         }
	      } catch (Exception e) {
	         System.out.println("Exception: " + e);
	      }

			
	}

}
