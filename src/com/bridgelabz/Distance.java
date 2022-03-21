package com.bridgelabz;


import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Calculating the Distance between X and Y fromm origin (0,0)");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X value :");
        int x = scanner.nextInt();
        System.out.println("Enter Y value :");
        int y = scanner.nextInt();
        double distance =  Math.pow((x * x + y * y), 0.5);
        System.out.println("Distance is ::" +distance);
    }
}
