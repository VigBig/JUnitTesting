package com.bridgelabz.junittesting;

import java.util.Scanner;

import static java.lang.Math.round;

public class TemperatureConversion {
    static int CHOICE = 0;
    static double TEMP = 0;
    static double CONV_VALUE = 0.0;
    public static double temperatureConversion(double temp, int choice){
        double conv_value;
        if(choice == 1) {
            conv_value   = round( (temp * 9/5) + 32 );
        }
        else{
            conv_value   = round( (temp -32) * 5/9 );
        }
        return conv_value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select :\n" +
                "1. Celsius\n" +
                "2.Fahrenheit:\n");
        CHOICE = sc.nextInt();

        if(CHOICE ==1) {
            System.out.println("Enter Temperature in Celsius:");
            TEMP = sc.nextDouble();
            CONV_VALUE = temperatureConversion(TEMP,CHOICE);
            System.out.println("Temperature in Fahrenheit is :" + CONV_VALUE);
        }
        else if(CHOICE ==2) {
            System.out.println("Enter Temperature in Fahrenheit:");
            TEMP = sc.nextDouble();
            CONV_VALUE = temperatureConversion(TEMP,CHOICE);
            System.out.println("Temperature in Celsius is :" + CONV_VALUE);
        }
        else {
            System.out.println("Choices are 1 and 2 only!");
        }


    }
}
