package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        System.out.println("Wind chill program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temprature in faerenheit::");
        int t = scanner.nextInt();
        System.out.print("Enter Wind Speed inmiles per hour::");
        int v = scanner.nextInt();
        if (t >50 || v > 120 || v < 3) {
            System.out.println("Enter correct imputs");
        }
        else {
            double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("The Effective temprature is ::"+w);
        }
    }
}
