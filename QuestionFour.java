//4- You take two number from the user , base and power The output: Base ^ power
package com.mycompany.assignmentoneloops;

import java.util.Scanner;

public class QuestionFour {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int base = input.nextInt();
        int power = input.nextInt();
        int res = 1;
        for (int i = 0 ; i < power; i++) {
            res*=base;
        }
        
        System.out.println(res);
    }

}
