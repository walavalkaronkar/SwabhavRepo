package dip.violation.tax;

import java.io.IOException;

public class TaxCalculator {

	protected LogType logType;
	
	public TaxCalculator(LogType logType) {
		this.logType=logType;
	}
	public int calculateRate(int income,int rate) throws IOException
	{
		int result=-1;
		try
		{
			result=income/rate;
		}
		catch(Exception e)
		{
			String message=e.getMessage();
			if(logType==LogType.TXT)
			{
				new TxtLoger().log(message);
			}
			else if(logType==LogType.TXT)
			{
				new DBLoger().log(message);
			}
		}
		return result;
	}
}
