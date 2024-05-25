//9- Write a java program that read positive numbers from user Until read a negative
//number … then calculate and print The average of these numbers
package com.mycompany.assignmentoneloops;

import java.util.Scanner;

public class QuestionNine {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double numbers = 0;
        double count = 0;
        double sumOfnumbers = 0;

        while (numbers >= 0) {
            if (numbers!=0) {
                count++;
            }
            
            sumOfnumbers += numbers;
            numbers = input.nextDouble();
            
        }
        double average = sumOfnumbers / count;
        System.out.println("the average of these numbers is: " + average);
    }
}
