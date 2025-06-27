package com.dkte;

import java.util.Scanner;


class Date1 {
    private int day;
    private int month;
    private int year;

   
    public Date1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    public void setInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Day: ");
        day = sc.nextInt();
        System.out.print("Month: ");
        month = sc.nextInt();
        System.out.print("Year: ");
        year = sc.nextInt();
    }

    
    public void getInfo() {
        System.out.println("\nDate: " + day + "/" + month + "/" + year);
    }




    public static void main(String[] args) {
        
        Date1 d = new Date1(1, 1, 2000);

        System.out.println("Initial Date:");
        d.getInfo();

        
        System.out.println("\nEnter new date:");
        d.setInfo();

        
        System.out.println("\nUpdated Date:");
        d.getInfo();
    }
}
