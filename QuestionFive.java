//You will take number from the user Write a java program to print its factorial.
package com.mycompany.assignmentoneloops;

import java.util.Scanner;

public class QuestionFive {
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int number=input.nextInt();
        int factorial=1;
        while(number!=0)
        {
            factorial*=number;
            number--;
        }
        System.out.println(factorial);
    }
    
    
}
