package com.blackdog;

public class NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (year < 1 || year > 9999) return -1;
        switch (month) {
            case 1: // January
                return 31;
            case 2: // February {
                if (isLeapYear(year)) return 29;
                else return 28;
            case 3: // March
                return 31;
            case 4: // April
                return 30;
            case 5: // May
                return 31;
            case 6: // Jun
                return 30;
            case 7: // July
                return 31;
            case 8: // August
                return 31;
            case 9: // September
                return 30;
            case 10: // October
                return 31;
            case 11: // November
                return 30;
            case 12: // December
                return 31;
            default: // Invalid Exception
                return -1;
        }
    }
}
