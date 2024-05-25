//12- Given a number, print how many times can we divide it by 2?
package com.mycompany.assignmentoneloops;

import java.util.Scanner;

public class QuestionTwelve {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        note: number must be double type not int cause the int doesn't 
//              store decimal numbers and leads to a wrong answer;
        double number = input.nextInt();
        int cnt = 0;
        boolean flag = true;
        while (flag == true) {
            if (number % 2 == 0 && number != 0) {
                cnt++;
            } else if (number == 0) {
                flag = false;
            }
            number /= 2;

        }
        System.out.println("we can divide the number by 2 : " + cnt + " time");
    }

}
