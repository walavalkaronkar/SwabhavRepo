import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface NeedForRefracting
{
	
}


public class NeedForRefractingAnnotaion {
	
	@NeedForRefracting
	public void myMethodOne()
	{
		//
	}
	
	@NeedForRefracting
	public void myMethodTwo()
	{
		//
	}
	
	public void myMethodThree()
	{
		//
	}
	
	public void myMethodFour()
	{
		
	}
}



