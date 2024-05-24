/*Q->7Write a program which calculates marks on basis of given grades in java using switch statement
if Grade A then marks >=80
if Grade B then marks >=60 and less than 80
if Grade C then marks >=40 and less than 60
if Grade F then marks <=40
if any other grade is passed then print invalid grade*/
package com.mycompany.assignmentone;

import java.util.Scanner;

public class Grades {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter grade A,B or C");
        char grade = cin.next().charAt(0);
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("your marks >=80");
                break;
            case 'B':
            case 'b':
                System.out.println("your marks >=60 and less than 80");
                break;
            case 'C':
            case 'c':
                System.out.println("your marks >=40 and less than 60");
                break;
            case 'F':
            case 'f':
                System.out.println("your marks <=40");
                break;
            default:
                System.out.println("invalid grade");
        }

    }
}
