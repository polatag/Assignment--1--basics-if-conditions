//1- A program to print numbers divisible by 5, for the integers from 1 to 99.
package com.mycompany.assignmentoneloops;


public class QuestionOne {
    public static void main(String[] args) {
        for (int i = 1; i < 99; i++) {
            if (i%5==0) {
                System.out.print(i+",");
            }
            
        }
    }
    
}
