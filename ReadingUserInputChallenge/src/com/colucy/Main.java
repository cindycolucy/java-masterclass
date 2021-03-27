package com.colucy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int count = 1;
        int sum = 0;

        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

        }
        System.out.println("Sum is " + sum);
        scanner.close();
    }
}
