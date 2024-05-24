//Q->51. Write a Java program to get a number from the user and print whether it is positive or negative.
package com.mycompany.assignmentone;

import java.util.Scanner;

public class PositiveorNegative {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("entre number to check if positive or negative");
        int number = input.nextInt();
        if (number >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("Negative");
        }
    }

}
