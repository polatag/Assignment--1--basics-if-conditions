//     Q1_>  Write a java program that read a number of the month And then print the name of it
package com.mycompany.assignmentone;

import java.util.Scanner;

public class MonthConvert {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please insert the month number to see the name");
        int monthNumber = input.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("fabruary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("not valid number");

        }

    }

}
