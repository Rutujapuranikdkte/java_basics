package com.dkte;
import java.util.Scanner;
class Invoice
{
	String number;
	String partnm;
	int quantity;
	double price;
	
public void setInfo()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number: ");
	number=sc.nextLine();
	System.out.println("enter part name: ");
	partnm=sc.nextLine();
	System.out.println("enter quantity: ");
	quantity=sc.nextInt();
	while(quantity<=0)
	{
		quantity=0;
	}
	System.out.println("enter price: ");
	price=sc.nextDouble();
	if(price<0)
	{
		price=0;
	}
	
	
}
	public Invoice(String number,String partnm,int quantity,double price)
	{
		this.number=number;
		this.partnm=partnm;
		this.quantity=quantity;
		this.price=price;
	}
	public double getInvoiceAmount() {
        return quantity * price;
    }
	public void getInfo()
	{
		System.out.println("number: "+this.number+"\npart name: "+this.partnm+"\nquantity: "+this.quantity+"\nprice: "+this.price);
		System.out.println("Total Invoice Amount: ₹" + getInvoiceAmount());
	}
	
}

public class InvoiceTester {

	public static void main(String[] args) {
		Invoice invoice=new Invoice("p001","Screwdriver",2,250.0);
		invoice.getInvoiceAmount();
		invoice.getInfo();
		
		Invoice invoice1=new Invoice(" "," ",0,0.0);
		invoice1.setInfo();
		invoice1.getInvoiceAmount();
		invoice1.getInfo();
		
	}

}
