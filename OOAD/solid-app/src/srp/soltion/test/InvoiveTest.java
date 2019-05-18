package srp.soltion.test;

import srp.soltion.test.Invoice;

public class InvoiveTest {

	public static void main(String[] args) {
		Invoice invoice=new Invoice("01","Onkar",1000,10f,2.5f);
		InvoicePrinter ip=new InvoicePrinter();
		ip.printInvoice(invoice);;

	}

}