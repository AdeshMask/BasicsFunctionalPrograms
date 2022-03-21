package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        System.out.println("Finding the roots of the equation::");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a :");
        int a  = scanner.nextInt();
        System.out.print("Enter value of b :");
        int b =scanner.nextInt();
        System.out.print("Enter value of c :");
        int c = scanner.nextInt();
        int delta = Math.abs( b * b - 4 * a *c);
        System.out.println(delta);
        int root1 = (-b + (delta / 2 * a));
        int root2 = (-b - (delta / 2 * a));
        System.out.println("Root 1 of X is ::"+root1);
        System.out.println("Root 2 of X is ::"+root2);
    }
}
