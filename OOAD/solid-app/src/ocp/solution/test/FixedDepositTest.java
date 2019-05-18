package ocp.solution.test;

import ocp.solution.test.Festival;

public class FixedDepositTest {

	public static void main(String[] args) {
		
		FixedDeposit fd;
		fd=new FixedDeposit(1,"Onkar",1000,10f,Festival.NORMAL);
		CalculateRate cr=new CalculateRate();
		float roi=cr.caluclateRateOfInterest(fd);
		System.out.println(fd.calculateTotalAmount(roi));

	}

}
