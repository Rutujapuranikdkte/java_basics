package com.dkte;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program3 {

	public static int divide(int num,int deno)
	{
		int res = num / deno; //divide operator may throw Arithmetic Exception 
		return res; 
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num,deno,res;
		try
		{
			System.out.println("enter numerator");
			num=sc.nextInt();
			System.out.println("enter denominator");
			deno=sc.nextInt();
			res=divide(num,deno);
			System.out.println("res:"+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid I/p");
		}
	}

}
