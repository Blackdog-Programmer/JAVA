package com.blackdog;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------------------------------------");

        // boolean
        System.out.println("Boolean false Value = " + Boolean.FALSE);
        System.out.println("Boolean true Value = " + Boolean.TRUE);
        System.out.println("---------------------------------------");

        // char
        char minCharVal = Character.MIN_VALUE;
        char maxCharVal = Character.MAX_VALUE;
        System.out.println("Char Minimum Value = " + (int)minCharVal);
        System.out.println("Char Maximum Value = " + (int)maxCharVal);
        System.out.println("Char size of Bytes = " + Character.BYTES);
        System.out.println("Unicode character ex1: " + '\u0283'); // ʃ
        System.out.println("Unicode character ex2: " + '\u03A3'); // Σ
        System.out.println("---------------------------------------");

        // byte
        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + minByteVal);
        System.out.println("Byte Maximum Value = " + maxByteVal);
        System.out.println("Byte size of Bytes = " + Byte.BYTES);

        System.out.println("Overflow Byte Minimum Value = " + (byte)(minByteVal - 1));
        System.out.println("Overflow Byte Maximum Value = " + (byte)(maxByteVal + 1));
        System.out.println("---------------------------------------");

        // short
        short minShortVal = Short.MIN_VALUE;
        short maxShortVal = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + minShortVal);
        System.out.println("Short Maximum Value = " + maxShortVal);
        System.out.println("Short size of Bytes = " + Short.BYTES);

        System.out.println("Overflow Short Minimum Value = " + (short)(minShortVal - 1));
        System.out.println("Overflow Short Maximum Value = " + (short)(maxShortVal + 1));
        System.out.println("---------------------------------------");

        // int
        int minIntVal = Integer.MIN_VALUE;
        int maxIntVal = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + minIntVal);
        System.out.println("Integer Maximum Value = " + maxIntVal);
        System.out.println("Integer size of Bytes = " + Integer.BYTES);

        System.out.println("Overflow Integer Minimum Value = " + (minIntVal - 1));
        System.out.println("Overflow Integer Maximum Value = " + (maxIntVal + 1));
        System.out.println("---------------------------------------");

        // long
        long minLongVal = Long.MIN_VALUE;
        long maxLongVal = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + minLongVal);
        System.out.println("Long Maximum Value = " + maxLongVal);
        System.out.println("Long size of Bytes = " + Long.BYTES);

        System.out.println("Overflow Long Minimum Value = " + (minLongVal - 1));
        System.out.println("Overflow Long Maximum Value = " + (maxLongVal + 1));
        System.out.println("---------------------------------------");

        // float
        float minFloatVal = Float.MIN_VALUE;
        float maxFloatVal = Float.MAX_VALUE;

        System.out.println("Float Minimum Value = " + minFloatVal);
        System.out.println("Float Maximum Value = " + maxFloatVal);
        System.out.println("Float size of Bytes = " + Float.BYTES);
        System.out.println("---------------------------------------");

        // double
        double minDoubleVal = Double.MIN_VALUE;
        double maxDoubleVal = Double.MAX_VALUE;

        System.out.println("Double Minimum Value = " + minDoubleVal);
        System.out.println("Double Maximum Value = " + maxDoubleVal);
        System.out.println("Double size of Bytes = " + Double.BYTES);

        System.out.println("---------------------------------------");
    }
}
