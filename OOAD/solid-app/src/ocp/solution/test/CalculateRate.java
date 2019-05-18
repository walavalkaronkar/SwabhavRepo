package ocp.solution.test;


public class CalculateRate  {

	
	public float caluclateRateOfInterest(FixedDeposit fd) {

		//Festival festival=fd.getFestival();
		if (fd.getFestival().equals(Festival.HOLI)) {
			return  7.0f;
		}
		else if (fd.getFestival().equals(Festival.DIWALI)) {
			return  8.0f;
		}	
		return 6.0f;
	}

	
}
