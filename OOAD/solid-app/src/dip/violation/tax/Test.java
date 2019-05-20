package dip.violation.tax;

public class Test {
	public static void main(String[] args) {
		TaxCalculator tax=new TaxCalculator(LogType.TXT);
		try
		{
			System.out.println(tax.calculateRate(1200, 0));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
