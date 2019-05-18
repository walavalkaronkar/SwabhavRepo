package srp.violation.test;

public class Invoice {

	private String id;
	private String name;
	private double cost;
	private float discount;
	private float gst;
	
	public Invoice(String id,String name,double cost,float discount,float gst)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.discount=discount;
		this.gst=gst;
	}
	
	public double calculateTax()
	{
		double tax;
		tax=cost*gst/100;
		return tax;
	}
	
	public double calculateDiscount()
	{
		double dis;
		dis=cost *discount/100;
		return dis;
	}
	
	public double calculateTotalCost()
	{
		double total;
		total=cost-calculateDiscount()+calculateTax();
		return total;
	}
	
	public void printInvoice()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println("Cost is"+cost);
		System.out.println("Tax is:"+calculateTax());
		System.out.println("Discount"+calculateDiscount());
		System.out.println("total cost"+calculateTotalCost());
	}
}
