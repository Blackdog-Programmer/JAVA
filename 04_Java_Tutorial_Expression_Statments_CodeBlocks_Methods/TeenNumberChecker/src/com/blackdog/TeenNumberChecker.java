package com.blackdog;

public class TeenNumberChecker {
    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19) return true;
        else return false;
    }
    public static boolean hasTeen(int p, int q, int r) {
        return (isTeen(p) || isTeen(q) || isTeen(r));
    }
}
