package com.colucy;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum Integer Value = " + myMinIntValue);
        System.out.println("Maximum Integer Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value = " + myMinByteValue);
        System.out.println("Maximum Byte Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short Value = " + myMinShortValue);
        System.out.println("Maximum Short Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value = " + myMinLongValue);
        System.out.println("Maximum Long Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        //casting
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        //challenge
        byte cindyByteValue = 100;
        short cindyShortValue = 1000;
        int cindyIntValue = 10000;
        long mathyValue = 50000 + 10 * (cindyByteValue + cindyShortValue + cindyIntValue);
        System.out.println(mathyValue);
    }
}
