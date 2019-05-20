package dip.violation.tax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TxtLoger {

	public void log(String message) throws IOException
	{
		File file =new File("LoggerFile.txt");
		file.createNewFile();
		
		FileOutputStream fos=new FileOutputStream(file);
		byte[] msg=message.getBytes();
		fos.write(msg);
		
		fos.close();
		System.out.println("From the Text Loger message"+message);
	}
}
