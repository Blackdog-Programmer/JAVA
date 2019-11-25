package com.blackdog;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int lhs, int rhs) {
        if (lhs < 10 || rhs < 10) return -1;
        int min = 0;
        if (lhs < rhs) min = lhs;
        else min = rhs;

        int greatestDivisor = 1;
        for (int i = 1; i <= min; ++i) {
            if (lhs % i == 0 && rhs % i == 0)
                greatestDivisor = i;
        }
        return greatestDivisor;
    }
}
