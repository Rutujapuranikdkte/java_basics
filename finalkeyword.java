package com.dkte;
import java.util.Scanner;

class Teacher
{
	String name;
	int age;
	int salary;
	
	
	public void setInfo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name: ");
		name=sc.nextLine();
		System.out.println("enter age: ");
		age=sc.nextInt();
		
	}
	public final void dispSalary()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary: ");
		salary=sc.nextInt();
	}
	public void getInfo()
	{
		System.out.println("\nname: "+name+"\nage: "+age+"\nsalary: "+salary);
	}
}

class Student extends Teacher
{
	
	    int rollNo;

	    public void setRollNo() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter roll number: ");
	        rollNo = sc.nextInt();
	    }
	    public void getRollNo()
	    {
	    	 System.out.print("\nroll number: "+rollNo);
	    }
	    
}


public class Program4 {

	public static void main(String[] args) {
		Student s=new Student();
		s.setInfo();
		s.setRollNo();
		s.getRollNo();
		s.getInfo();
		
		Teacher t=new Teacher();
		t.setInfo();
		t.dispSalary();
		t.getInfo();
		
		

	}

}
