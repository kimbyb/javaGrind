package org.study.java.homework1.basics;

import java.util.Scanner;

public class BaseOperations {

    private static final Scanner scanner = new Scanner(System.in);

    public static void sumAndDiff() {
        System.out.println("First number: ");
        int first = scanner.nextInt();
        System.out.println("Second number: ");
        int second = scanner.nextInt();

        System.out.println("Sum is: " + (first + second));
        System.out.println("Diff is: " + (first - second));
    }

    public static void rectangleArea() {
        System.out.println("Height: ");
        int first = scanner.nextInt();
        System.out.println("Width: ");
        int second = scanner.nextInt();

        System.out.println("Area is:" + (first * second));
    }

    public static void mod() {
        System.out.println("First number: ");
        int first = scanner.nextInt();
        System.out.println("Second number: ");
        int second = scanner.nextInt();

        System.out.println("Mod is:" + (first % second));
    }

    public static void celciusToFahrenheit() {
        System.out.println("Temperature in C: ");
        int first = scanner.nextInt();

        System.out.println("Fahrenheit: " + (first * 9/5 + 32));
    }

    public static void cahngePlaces() {
        System.out.println("First number: ");
        int first = scanner.nextInt();
        System.out.println("Second number: ");
        int second = scanner.nextInt();

        first += second;
        second = first - second;
        first -= second;

        System.out.println("first is " + first);
        System.out.println("Second is " + second);
    }
}
