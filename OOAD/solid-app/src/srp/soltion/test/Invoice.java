package srp.soltion.test;

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

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discount;
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

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getGst() {
		return gst;
	}

	public void setGst(float gst) {
		this.gst = gst;
	}
	
	
}
