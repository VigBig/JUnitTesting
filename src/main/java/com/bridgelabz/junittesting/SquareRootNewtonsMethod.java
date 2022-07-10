package com.bridgelabz.junittesting;

import java.util.Scanner;

public class SquareRootNewtonsMethod {

    static double EPSILON = 1E-15;

    public static double sqrt(double c){

        double t = c;

        while(Math.abs(t - c/t) > EPSILON*t){
            t = (c/t + t)/2;
        }

        return t;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        double num = sc.nextInt();

        if(num >=1) {
         double sqrt = sqrt(num);
            System.out.println("The square root of "+num+" is :"+sqrt);
        }
        else{
            System.out.println("Number must be non-negative!");
        }
    }
}
