package ocp.solution.test;

public  class FixedDeposit {
	private int number;
	private String name;
	private double principal;
	private float duration;
	private IFestivalRate rate;
	private float rateOfInterest;
	
	public FixedDeposit(int number,String name,double principal,float duration,IFestivalRate rate) 
	{
		this.number=number;
		this.name=name;
		this.principal=principal;
		this.duration=duration;
		this.rate=rate;	
		this.rateOfInterest=rate.getRateOfInterest();
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
	
	
	public double calculateTotalAmount()
	{
		double amount;
		amount=principal+principal * duration * rateOfInterest / 100;
		return amount;
	}
	
}
