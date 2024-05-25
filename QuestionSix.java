//6- program to display the following sequence of numbers: 7 14 21 28 35 42 49 56
//63 70 77 84 91 98
// 7- Program to display the following sequence of numbers: 1 2 4 8 16 32 64 128 256
//512
package com.mycompany.assignmentoneloops;

public class QuestionSix {

    public static void main(String[] args) {
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");

        }
    }
}
