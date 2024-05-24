//Q7->Watermelon
package com.mycompany.assignmentone;

import java.util.Scanner;

public class Watermelon {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("entre weigh");
        int weigh = input.nextInt();
        if (weigh % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }

}
