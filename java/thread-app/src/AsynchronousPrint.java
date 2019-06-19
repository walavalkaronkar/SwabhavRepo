import java.util.Date;

public class AsynchronousPrint implements Runnable {

	@Override
	public void run() {
		while(true)
		{
			Date date=new Date();
			System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		}
		
	}

}
