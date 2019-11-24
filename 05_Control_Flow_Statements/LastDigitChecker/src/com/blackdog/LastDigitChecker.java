package com.blackdog;

public class LastDigitChecker {
    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) return true;
        else return false;
    }
    public static boolean hasSameLastDigit(int p, int q, int r) {
        if (!isValid(p) || !isValid(q) || !isValid(r)) return false;
        int lastP = p % 10; int lastQ = q % 10; int lastR = r % 10;
        if (lastP == lastQ || lastQ == lastR || lastR == lastP) return true;
        return false;
    }
}
