package com.bridgelabz;


import java.io.PrintWriter;
import java.util.Scanner;

public class SumOFThreeNos {
    public static void main(String[] args) {
        System.out.println("Program to Sum of Integer adds to Zero...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N integer input");
        int n = scanner.nextInt();
        PrintWriter pw = new PrintWriter(System.out);
        int a[] = new int[n];
        int count = 0;
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }
        for (int c : a) {
            pw.print(c + " ");
            pw.flush();
        }
        System.out.println();
        for (int i = 0;i < a.length;i++){
            for (int j = 0; j < a.length; j++){
                for (int k = 0; k < a.length; k++){
                    if (a[i]+a[j]+a[k]==0){
                        count++;
                        System.out.println(a[i]+ " + " +a[j]+ " + " +a[k]+ " = " + "0");
                    }

                }
            }
        }
        System.out.println("count = "+count);
    }
}
