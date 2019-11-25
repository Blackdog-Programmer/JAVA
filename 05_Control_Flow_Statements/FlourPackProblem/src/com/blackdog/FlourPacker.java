package com.blackdog;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int bigCnt = 0, tempGoal = goal;
        while ((tempGoal - 5 >= 0) && (bigCnt < bigCount)) {
            ++bigCnt; tempGoal -= 5;
        }
        int smallCnt = goal - 5 * bigCnt;
        if (smallCnt <= smallCount) return true;
        return false;
    }
}
