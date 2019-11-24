package com.blackdog;

public class SharedDigit {
    public static boolean hasSharedDigit(int lhs, int rhs) {
        if (lhs < 10 || lhs > 99 || rhs < 10 || rhs > 99 ) return false;
        int lhsFirstDigit = lhs / 10; int lhsLastDigit = lhs % 10;
        int rhsFirstDigit = rhs / 10; int rhsLastDigit = rhs % 10;
        if (lhsFirstDigit == rhsFirstDigit) return true;
        if (lhsLastDigit == rhsLastDigit) return true;
        if (lhsFirstDigit == rhsLastDigit) return true;
        if (lhsLastDigit == rhsFirstDigit) return true;
        return false;
    }
}
