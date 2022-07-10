package com.bridgelabz.junittesting;

import java.util.Scanner;

public class LoanMonthlyPayment {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        int principal = Integer.parseInt(args[0]);
        int years = Integer.parseInt(args[1]);
        double rate = Integer.parseInt(args[2]);

//        System.out.println("Enter Principal:");
//        int principal = sc.nextInt();
//
//        System.out.println("Enter Years:");
//        int years = sc.nextInt();
//
//        System.out.println("Enter Rate:");
//        double rate = sc.nextDouble();

        double monthlyPayment = payment(principal,years,rate);
        System.out.println("The Monthly Payment is: " + monthlyPayment);

    }

    public static double payment(int p, int y, double rate) {
        double r = rate / 1200;
        int n = 12 * y;

        double monthlyPayment = ((p * r) / 1 - Math.pow((1 + r), -n));
        return monthlyPayment;
    }
}
