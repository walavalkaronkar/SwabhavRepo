package srp.soltion.test;

public class InvoicePrinter {

	public void printInvoice(Invoice invoice)
	{
		System.out.println(invoice.getId());
		System.out.println(invoice.getName());
		System.out.println("Cost is"+invoice.getCost());
		System.out.println("Tax is:"+invoice.calculateTax());
		System.out.println("Discount"+invoice.calculateDiscount());
		System.out.println("total cost"+invoice.calculateTotalCost());
	}
}
