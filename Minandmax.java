/*Q9->How Can Find The Minimum/maximum of three numbers using conditional operator. for example
3
1
5
Max=5
Min=1*/
package com.mycompany.assignmentone;

import java.util.Scanner;

public class Minandmax {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int x, y, z, max, min;
        System.out.println("entre three number to get the minimum and maximum");
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        

        if (x > y && x > z) {
            max=x;
            System.out.println("max is the maximaum");
            if (y > z) {
                System.out.println("z is the minimum");
            } else {
                System.out.println("y is the minimum");
            }
        } else if (y > x && y > z) {
            System.out.println("y is the maximaum");
            if (z > x) {
                System.out.println("x is the minimum");
            } else {
                System.out.println("y is the minimum");
            }

        } else if (z > y && z > x) {
            System.out.println("z is the maximaum");
            if (y > x) {
                System.out.println("x is the minimum");
            } else {
                System.out.println("y is the minimum");
            }
        }

    }

}
