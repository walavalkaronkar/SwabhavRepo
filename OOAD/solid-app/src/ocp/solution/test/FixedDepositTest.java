package ocp.solution.test;


public class FixedDepositTest {

	public static void main(String[] args) {
		
		FixedDeposit fd;
		
		fd=new FixedDeposit(1,"Onkar",1000,10f,new DiwaliRate());
		System.out.println(fd.calculateTotalAmount());
		fd=new FixedDeposit(1,"Onkar",1000,10f,new HoliRate());
		System.out.println(fd.calculateTotalAmount());
		fd=new FixedDeposit(1,"Onkar",1000,10f,new NormalRate());
		System.out.println(fd.calculateTotalAmount());
		

	}

}
