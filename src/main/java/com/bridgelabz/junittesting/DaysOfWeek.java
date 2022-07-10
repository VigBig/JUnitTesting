package com.bridgelabz.junittesting;

import java.util.Scanner;

public class DaysOfWeek {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

//        System.out.println("Enter Day:");
//        int day = sc.nextInt();
//
//        System.out.println("Enter Month:");
//        int month = sc.nextInt();
//
//        System.out.println("Enter Month:");
//        int year = sc.nextInt();

        String dayOfWeek = dayOfWeek(day,month,year);
        System.out.println("Day at " + day + "/" + month + "/" + year + " is " + dayOfWeek);

    }

    public static String dayOfWeek(int d0, int m0, int y0) {

        String daysArr[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int y = y0 - (14 - m0) / 12;
        int x = y + (y / 4) - (y / 100) + (y / 400);
        int m = m0 + 12 * ((14 - m0) / 12) - 2;
        int d = (d0 + x + (31 * m) / 12) % 7;

        return daysArr[d];

    }


}
