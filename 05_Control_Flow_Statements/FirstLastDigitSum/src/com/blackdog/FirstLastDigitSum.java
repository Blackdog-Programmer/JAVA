package com.blackdog;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int num) {
        if (num < 0 ) return -1;
        int count = 1;
        for (int tmp = num; (tmp /= 10) != 0; ++count);
        int firstDigit = num / (int)Math.pow(10, count - 1);
        int lastDigit = num % 10;
        return firstDigit + lastDigit;
    }
}
