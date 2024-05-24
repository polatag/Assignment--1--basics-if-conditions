/*Q4->In this Program we are making a simple calculator that performs addition, subtraction, multiplication
and division based on the user input. The program takes the value of both the numbers (entered by
user) and then user is asked to enter the operation (+, -, * and /), based on the input program
performs the selected operation on the entered numbers*/
package com.mycompany.assignmentone;

import java.util.Scanner;

public class Calculator {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int valueFirst = 0, valueSecond = 0;
        char operator = '\u00A9';
        System.out.println("Please entre first value:");
        valueFirst = input.nextInt();
        System.out.println("kindlly entre the operation");
        System.out.println("+,-,*,/");
        operator = input.next().charAt(0);
        System.out.println("Please entnre second value");
        valueSecond = input.nextInt();

        if (operator == '+') {
            System.out.println(valueFirst + valueSecond);
        } else if (operator == '-') {
            System.out.println(valueFirst - valueSecond);
        } else if (operator == '/') {
            while (valueSecond != 0) {
                System.out.println(valueFirst / valueSecond);
            }
        } else if (operator == '*') {
            System.out.println(valueFirst * valueSecond);
        } else {
            System.out.println("not valid operator");
        }

    }

}
