package com.blackdog;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        long sum = 0, count = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            ++count;
        }
        if (count == 0) count = 1;
        long avg = Math.round(sum / (double)count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }
}