package ocp.violation.test;

public class FixedDepositTest {
	public static void main(String[] args) 
	{
		FixedDeposit fd=new FixedDeposit(1,"Onkar",1000,10,Festival.DIWALI);
		fd.setRateOfInterest();
		System.out.println(fd.calculateTotalAmount());
	}
}
