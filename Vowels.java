/* Q3->The alphabets A, E, I, O and U (smallcase and uppercase) are known as Vowels and rest of the
    alphabets are known as consonants. Here we will write a java program that checks whether the
    input character is vowel or Consonant. */
package com.mycompany.assignmentone;

import java.util.Scanner;

public class Vowels {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a letter to check if is it vowels");
        char letter = input.next().charAt(0);
        if (letter == 'o' || letter == 'O' || letter == 'e' || letter == 'E' || letter == 'A'
                || letter == 'a' || letter == 'i' || letter == 'I' || letter == 'u' || letter == 'U') {

            System.out.println("this letter is vowel");
        } else {
            System.out.println("this letter is consonant");
        }

    }

}
