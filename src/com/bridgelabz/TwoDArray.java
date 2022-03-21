package com.bridgelabz;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Printing the 2D Array...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter m rows");
        int m = scanner.nextInt();
        System.out.println("Enter n columns");
        int n = scanner.nextInt();

        //*-*-*-*-Integer arrays-*-*-*-*
        System.out.println("Enter Integer Array elements");
        int a[][] = new int[m][n];
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++)
                a[i][j] = scanner.nextInt();
        }
        PrintWriter pw = new PrintWriter(System.out);
        for (int b[] : a) {
            for (int c : b) {
                pw.print(c + " ");
               pw.flush();
            }
            System.out.println();
        }
        //*-*-*-*-Double Array-*-*-*-*
        System.out.println("Enter Double Array Elements");
        double b[][] = new double[m][n];
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++)
                b[i][j] = scanner.nextDouble();
        }
        for (double p[] : b) {
            for (double c : p) {
                pw.print(c + " ");
                pw.flush();
            }
            System.out.println();
        }
    //*-*-*-*-Boolean Array-*-*-*-*
        System.out.println("Enter Boolean Array Elements");
        boolean x[][] = new boolean[m][n];
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++)
                x[i][j] = scanner.nextBoolean();
        }
        for (boolean y[] : x) {
            for (boolean c : y) {
                pw.print(c + " ");
                pw.flush();
            }
            System.out.println();
        }
    }
}
