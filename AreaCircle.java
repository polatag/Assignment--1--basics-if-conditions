package com.mycompany.assignmentone;

import java.util.Scanner;

public class AreaCircle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = circleArea(radius);
        System.out.println("Area of the circle: " + area);
    }

    public static double circleArea(double rad) {
        double pi = 3.1415;
        return pi * (rad * rad);
    }
}
