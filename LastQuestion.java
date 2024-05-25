//*13-Write a program that displays all the numbers from 100 to
//200, ten per line, that are divisible by 5 or 6, but not both.
//Numbers are separated by exactly one spac
package com.mycompany.assignmentoneloops;

public class LastQuestion {

    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                continue;
            } else if (i % 5 == 0 || i % 6 == 0) {
                System.out.print(i + " ");
                cnt++;
                if (cnt%10==0) {
                    System.out.println("");
                }
            }

        }
    }

}
