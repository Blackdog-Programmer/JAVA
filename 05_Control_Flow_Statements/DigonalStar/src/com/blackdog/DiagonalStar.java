package com.blackdog;

public class DiagonalStar {
    public static void printSquareStar(int length) {
        if (length < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int y = 1; y <= length; ++y) {
            if (y == 1 || y == length) {
                for (int x = 1; x <= length; ++x) System.out.print("*");
            }
            else {
                System.out.print("*");
                for (int x = 2; x < length; ++x) {
                    if (y == x) System.out.print("*");
                    else if (y == length - x + 1) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
