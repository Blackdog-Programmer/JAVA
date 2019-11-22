// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html
package com.blackdog;

public class Main {

    public static void main(String[] args) {
        double number = 1.5;
        long rounded = Math.round(number);
        System.out.println("rounded= " + rounded);
        System.out.println("with 3.9= " + Math.round(3.9));
        System.out.println("with 4.5= " + Math.round(4.5));
        int sum = 45;
        int count = 10;
        // typecasting so result is double e.g. double / int -> double
        double average = (double) sum / count;
        long roundedAverage = Math.round(average);
        System.out.println("average= " + average);
        System.out.println("roundedAverage= " + roundedAverage);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour / 1.609d); // 1.609 = kilometers per hour
    }

    public static void printConversion(double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour) == -1) {
            System.out.println("Invalid Value");
        } else { System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h"); }
    }
}
