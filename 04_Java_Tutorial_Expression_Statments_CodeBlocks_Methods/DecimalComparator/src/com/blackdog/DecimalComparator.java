package com.blackdog;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double lhs, double rhs) {
        if ((int)(lhs * 1000) == (int)(rhs * 1000) )return true;
        else return false;
    }
}
