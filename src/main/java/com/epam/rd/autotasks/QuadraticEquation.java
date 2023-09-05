package com.epam.rd.autotasks;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        findRoot(a, b, c);
    }

    /*
    Calculates the root of the equation, if there is such.
     */
    public static void findRoot(double a, double b, double c) {
        double x1, x2;
        double determinant = Math.pow(b, 2) - 4 * a * c;
        if(determinant < 0) {
            System.out.println("no roots");
        } else {
            x1 = (-b + sqrt(determinant))/(2*a);
            x2 = (-b - sqrt(determinant))/(2*a);
            System.out.println(x1);
            if(determinant > 0) {
                System.out.print(" " + x2);
            }
        }
    }
}