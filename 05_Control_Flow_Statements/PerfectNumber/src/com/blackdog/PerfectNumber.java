package com.blackdog;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num < 1) return false;
        int sum = 1;
        for (int i = 2; i < num; ++i) {
            if (num % i == 0) sum += i;
        }
        if (sum == num) return true;
        else return false;
    }
}
