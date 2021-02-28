package com.colucy;

public class Main {

    public static void main(String[] args) {

        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double result = (firstDouble + secondDouble) * 100;
        System.out.println("result = " + result);
        double remainder = result % 40.00;
        System.out.println("remainder = " + remainder);
        boolean isZero = (remainder == 0) ? true : false;
        if (!isZero){
            System.out.println("Got some remainder.");
        }

    }
}
