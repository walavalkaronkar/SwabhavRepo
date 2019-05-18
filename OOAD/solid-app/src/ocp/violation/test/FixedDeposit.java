package ocp.violation.test;

public  class FixedDeposit {
	private int number;
	private String name;
	private double principal;
	private float duration;
	private Festival festival;
	private float rateOfInterest;
	
	public FixedDeposit(int number,String name,double principal,float duration,Festival festival) 
	{
		this.number=number;
		this.name=name;
		this.principal=principal;
		this.duration=duration;
		this.festival=festival;
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
	
	public double calculateTotalAmount()
	{
		double amount;
		amount=principal+principal * duration * rateOfInterest / 100;
		return amount;
	}
	
	public void setRateOfInterest()
	{
		if(festival.equals(Festival.NORMAL))
		{
			rateOfInterest=6.0f;
		}
		else if(festival.equals(Festival.HOLI))
		{
			rateOfInterest=7.0f;
		}
		else if(festival.equals(Festival.DIWALI))
		{
			rateOfInterest=8.0f;
		}
	}
}
