package dip.solution.tax;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		TaxCalculator tax=new TaxCalculator(new TxtLoger());
		tax.calculateRate(1200, 0);
	}
}
