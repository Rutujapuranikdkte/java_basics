package com.dkte;
import java.util.Scanner;
public class Reversetable {

	public static void main(String[] args) {
		int t,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		for(int i=10;i>=1;i--) {
			t=n*i;
			System.out.println(t);
		}

	}

}
