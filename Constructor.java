package com.dkte;
import java.util.Scanner;
import java.util.Calendar;
class Date
{
	private int day;
	private int month;
	private int year;
	public void initDate()
	{
		Calendar c = Calendar.getInstance(); //parameterless constructor
		   day = c.get(Calendar.DATE); 
		   month = c.get(Calendar.MONTH) + 1; 
		   year = c.get(Calendar.YEAR); 
	}
	public void acceptRecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Day: ");
		day=sc.nextInt();
		System.out.println("Month: ");
		month=sc.nextInt();
		System.out.println("Year: ");
		year=sc.nextInt();
	}
	public void printRecord()
	{
		System.out.println("\nDay: "+this.day+"\nMonth: "+this.month+"\nYear: "+this.year);
	}
}
public class Constructor {

	public static void main(String[] args) {
		Date dt1=new Date();
		dt1.initDate();
		dt1.printRecord();

	}

}
