package com.dkte;

public class factorial {

	public static void main(String[] args) {
		int i=1;
		int a=5;
		int fact=1;
		
		while(i<=a)
		{
			fact=i*fact;
			i++;
		}
		System.out.println("factorial of" +a +"is:" + fact);
		

	}

}
