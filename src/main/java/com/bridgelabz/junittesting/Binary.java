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

    public static String swapNibbles(String binary) {
        int nibbleArraySize = binary.length()/4;
        String[] nibbles = new String[nibbleArraySize];


        int k=0;
        for(int m=0; m<nibbleArraySize;m++){
            nibbles[m]= binary.substring(k,k+4);
            k=k+4;
        }

        System.out.println("Binary number separated into nibbles:");
        for(int n=0; n<nibbles.length;n++){
            System.out.print(nibbles[n]+" ");
        }

        System.out.println();
        String temp = "";
        for(int n=0; n<nibbles.length;n++){
            temp = nibbles[n];

            if(n==nibbles.length-1){
                break;
            }

            nibbles[n]=nibbles[n+1];
            nibbles[n+1]=temp;


        }

        System.out.println("Swapped nibbles: ");
        String swappedNibbles = "";
        for(int n=0; n<nibbles.length;n++){
            System.out.print(nibbles[n]+" ");
            swappedNibbles = swappedNibbles + nibbles[n];
        }
        System.out.println();

        return swappedNibbles;

    }

    public static int toDecimal(int swappedNibbles) {

        int decimalArraySize = Integer.toString(swappedNibbles).length();

        int decimalArray[] = new int[decimalArraySize];

        int j=0;
        while(swappedNibbles!=0)
        {
            decimalArray[decimalArraySize-j-1] = swappedNibbles%10;
            swappedNibbles=swappedNibbles/10;
            j++;
        }

        int decimal=0;
        int n=decimalArraySize-1;
        for(int m=0; m<decimalArray.length;m++){
            decimal= decimal + (int)(Math.pow(2,m)) * decimalArray[n];
            n--;
        }

        return decimal;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter decimal number:");
        int num = sc.nextInt();

        String binary= toBinary(num);

        System.out.println("The binary equivalent of "+num+" is :"+binary);
//        System.out.println("Length of binary string "+binary+" is :"+binary.length());

        int multipleOf4 = 1;
        int i=1;
        int padding=0;
        int swappedNibbles;

        if(binary.length()%4 != 0){

            while(true){

                multipleOf4 = 4 * i;

                if(multipleOf4>binary.length()) {
                    padding = multipleOf4 - binary.length();
                    break;
                }

                ++i;

            }

            for(int j=1; j<=padding;j++){
               binary = "0"+ binary;
            }

//            System.out.println("The padded binary equivalent of "+num+" is :"+binary);
//            System.out.println("Length of padded binary string "+binary+" is :"+binary.length());

            swappedNibbles = Integer.parseInt(swapNibbles(binary));

        }else{

            swappedNibbles = Integer.parseInt(swapNibbles(binary));

        }

        System.out.println("Converting the swapped nibbles "+swappedNibbles+" into decimal equivalent: "+toDecimal(swappedNibbles));

    }

}
