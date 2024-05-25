//8- Write an application that calculates the product of the odd integers from 1 to 15.
package com.mycompany.assignmentoneloops;


public class QuestionEight {
    public static void main(String[] args) {
        for (int i = 1; i < 16; i++) {
            if (i%2!=0) {
                System.out.print(i+" ");
            }
        }
    }
    
}
