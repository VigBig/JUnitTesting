package com.bridgelabz.junittesting;

import java.util.Scanner;

public class Binary {

    static int power = 1;
    static int maxPower = 0;
    static int binaryDigit;
    static int rem;

    public static String toBinary(int num) {
        while(num>power){

            power = 2* power;

            if(power>num)
                break;

            maxPower++;

        }


        int[] powersOf2 = new int[maxPower+1];

        for(int i=0; i<(maxPower+1); i++){

            powersOf2[i] = (int)Math.pow(2,i);

        }

        String binary = "";


        for (int i = powersOf2.length-1; i >= 0; i--) {

            binaryDigit = num / powersOf2[i];
            binary = Integer.toString(binaryDigit) + binary;

            rem = num%powersOf2[i];
            num = rem;

        }

        String binaryString = "";
        char ch;
        for (int i=0; i<binary.length(); i++)
        {
            ch= binary.charAt(i);
            binaryString= ch+binaryString;
        }
        return binaryString;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number:");
        int num = sc.nextInt();

        String binary= toBinary(num);

        System.out.println("The binary equivalent of "+num+" is :"+binary);

    }


}
