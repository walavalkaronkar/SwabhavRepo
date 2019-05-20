package dip.solution.tax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TxtLoger implements ILogger {

	public void log(String message)
	{
		System.out.println("From the Text Loger message :"+message);
	}
}
