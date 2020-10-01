package com.blackdog;

// Class Math: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html

public class SpeedConverter {

    private static final double kilometerMileRatio = 1.609d;

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) return -1L;
        else return Math.round(kilometersPerHour / kilometerMileRatio);
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) System.out.println("Invalid Value");
        else System.out.println(kilometersPerHour + " km/h" + " = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour((1.5d)));
        System.out.println(toMilesPerHour((10.25d)));
        System.out.println(toMilesPerHour((-5.6d)));
        System.out.println(toMilesPerHour((25.42d)));
        System.out.println(toMilesPerHour((75.114d)));
        System.out.println("-----------------------");

        printConversion(1.5d);
        printConversion(10.25d);
        printConversion(-5.6d);
        printConversion(25.42d);
        printConversion(75.114d);
        printConversion(-2.0d);
    }
}
