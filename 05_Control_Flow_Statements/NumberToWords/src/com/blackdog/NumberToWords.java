package com.blackdog;

public class NumberToWords {
    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int count = getDigitCount(num);
        num = reverse(num);
        for (int i = 1; i <= count; ++i) {
            int digit = num % 10;
            num /= 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Digit");
                    break;
            }
        }
    }

    public static int reverse(int num) {
        int count = 1, tmp = num;
        while ((tmp /= 10) != 0) {
            ++count;
        }
        int sum = 0;
        for (int i = 1; i <= count; ++i) {
            int digit = (num % 10);
            sum += digit * (int)Math.pow(10, count - i);
            num /= 10;
        }
        return sum;
    }

    public static int getDigitCount(int num) {
        if (num < 0) return -1;
        int count = 1;
        while ((num /= 10) != 0) {
            ++count;
        }
        return count;
    }
}
