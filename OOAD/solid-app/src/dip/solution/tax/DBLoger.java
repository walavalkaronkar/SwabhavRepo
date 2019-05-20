package dip.solution.tax;

public class DBLoger implements ILogger{

	public void log(String message)
	{
		System.out.println("From data base error message :"+message);
	}
}
