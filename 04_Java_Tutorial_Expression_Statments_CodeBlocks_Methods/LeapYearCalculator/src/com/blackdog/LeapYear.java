package com.blackdog;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;
        if (year % 4 == 0) { // Step1
            if (year % 100 == 0) { // Step2
                   if (year % 400 == 0) {
                       return true; // Step 4
                   }
                   else return false; // Step 5
            }
            else return true; // Step 4
        }
        return false; // Step 5;
    }
}
