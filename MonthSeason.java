//Q2-> Write a java program that read a number of the month and print the month is in Summer, spring,
//winter or autumn.
package com.mycompany.assignmentone;

import java.util.Scanner;

public class MonthSeason {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please insert the month number to know the season");
        int monthNumber = input.nextInt();

        if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Summer season");
        } else if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("Winter season");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("spring season");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("Autumn season");
        } else {
            System.out.println("not valid number");
        }

    }

}
