package org.study.java.homework1.basics;

import java.util.Scanner;

public class NestedLoops {

    private static final Scanner scanner = new Scanner(System.in);

    public static void multiplication() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i*j));
            }
        }
    }


    public static void square() {
        System.out.println("Height: ");
        int first = scanner.nextInt();
        System.out.println("Width: ");
        int second = scanner.nextInt();

        for(int i = 0; i < first; i++) {
            for(int j = 0; j < second; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumbers() {
        System.out.println("NUmber: ");
        int first = scanner.nextInt();
        System.out.print("Prime numbers: ");
        for (int i = 2; i <= first; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
