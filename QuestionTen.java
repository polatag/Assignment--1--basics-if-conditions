//10- Write java program to read integer from user then print sum of digit means add
//all the digits of any number for example if user enter 123 .output is 6 because 1 +2
//+3 = 6 an so on
package com.mycompany.assignmentoneloops;

import java.util.Scanner;

public class QuestionTen {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = input.nextInt();
        int digit = 0;
        int sum = 0;
        while (number != 0) {
            digit = number % 10;
            sum += digit;
            number/=10;
        }
        System.out.println("the sum of number's digits is: "+ sum);
        

    }

}
