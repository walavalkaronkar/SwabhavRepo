package dip.solution.tax;

public class TaxCalculator {

	protected ILogger logger;
	
	public TaxCalculator(ILogger logger) {
		this.logger=logger;
	}
	public int calculateRate(int income,int rate)
	{
		int result=-1;
		try
		{
			result=income/rate;
		}
		catch(Exception e)
		{
			String message=e.getMessage();
			logger.log(message);
		}
		return result;
	}
}
