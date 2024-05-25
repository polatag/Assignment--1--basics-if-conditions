//11- Write java program to read an integer from user then print how many digit in
//this number

package com.mycompany.assignmentoneloops;

import java.util.Scanner;

public class QestionEleven {
     private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = input.nextInt();
        int digit = 0;
        int count = 0;
        while (number != 0) {
            digit = number % 10;
            count ++;
            number/=10;
        }
        System.out.println("the count of number's digits is: "+ count);
        

    }
    
}
