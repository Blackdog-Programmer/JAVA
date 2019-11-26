package com.blackdog;

public class LargestPrime {
    public static int getLargestPrime(int num) {
        if (num <= 1) return -1;
        while (true) {
            for (int i = num; i > 1; --i) {
                if (num % i == 0) {
                    int candidate = i;
                    boolean isPrime = true;
                    for (int j = candidate - 1; j >= 2; --j) {
                        if (candidate % j == 0) isPrime = false;
                    }
                    if (isPrime) return candidate;
                }
            }
        }
    }
}