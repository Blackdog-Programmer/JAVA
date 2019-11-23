package com.blackdog;

public class IntEqualityPrinter {
    public static void printEqual(int p, int q, int r) {
        if (p < 0 || q < 0 || r < 0) {
            System.out.println("Invalid Value"); return;
        }
        if (p == q && q == r) {
            System.out.println("All numbers are equal"); return;
        }
        if (p != q && q !=r && r != p) {
            System.out.println("All numbers are different"); return;
        }
        System.out.println("Neither all are equal or different");
    }
}