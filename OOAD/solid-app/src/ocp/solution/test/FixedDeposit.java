package ocp.solution.test;


public class FixedDeposit {
	private int number;
	private String name;
	private double principal;
	private float duration;
	protected Festival festival;
	protected float rateOfInterest;

	public FixedDeposit(int number, String name, double principal, float duration, Festival festival) 
	{
		this.number = number;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public float getDuration() {
		return duration;
	}

	public Festival getFestival() {
		return festival;
	}

	public double calculateTotalAmount(double rateOfInterest) {
		double amount;
		amount = principal + principal * duration * rateOfInterest / 100;
		return amount;
	}

}
