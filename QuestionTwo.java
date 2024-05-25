//Your program print the numbers from one up to 100 in ascending order
package com.mycompany.assignmentoneloops;

public class QuestionTwo {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ",");
        }
        System.out.println("");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + ",");
        }
    }

}
