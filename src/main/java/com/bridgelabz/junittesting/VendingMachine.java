package com.bridgelabz.junittesting;

import java.util.Scanner;

public class VendingMachine {

    static double numNotes = 0;
    static int leftAmount;
    static int sumRsNotes;
    static int amount;

    public static int minimumNumberOfNotes(int rupees) {

        int totalNotes=0;
        int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

        for (int i = 0; i <= notes.length; i++) {

            if (notes[i] <= rupees) {
                numNotes = (rupees / notes[i]);
                amount = (int)numNotes * notes[i];
                sumRsNotes = (int)numNotes;
                totalNotes = sumRsNotes + totalNotes;
                System.out.println("Number of " + notes[i] + " Rs notes are " + sumRsNotes);

                if (rupees%notes[i] == 0) {
                    break;

                } else {
                    leftAmount = rupees - amount;
                    rupees = leftAmount;
                }
            }

        }
        return totalNotes;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter change amount : ");
        int rupees = sc.nextInt();

        int totalNotes =minimumNumberOfNotes(rupees);
        System.out.println("Total notes gathered are " + totalNotes);

    }


}
