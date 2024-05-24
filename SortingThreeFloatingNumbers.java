//Q8->SortingThreeFloatingNumbers

package com.mycompany.assignmentone;

import java.util.Scanner;

public class SortingThreeFloatingNumbers {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        float one, two, three;
        one = cin.nextFloat();
        two = cin.nextFloat();
        three = cin.nextFloat();
        if (one < two && one < three && two < three) {
            System.out.println(one);
            System.out.println(two);
            System.out.println(three);
        } else if (two < one && two < three && one < three) {
            System.out.println(two);
            System.out.println(one);
            System.out.println(three);
        } else if (three < two && three < one && two < one) {
            System.out.println(three);
            System.out.println(two);
            System.out.println(one);
        } else if (one < three && one < two && three < one) {
            System.out.println(one);
            System.out.println(three);
            System.out.println(two);
        } else if (one > three && one < two && three < one) {
            System.out.println(three);
            System.out.println(one);
            System.out.println(two);
        }

    }
}
