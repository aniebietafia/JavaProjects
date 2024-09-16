package com.brints.advancedjava.examples.example01;

import java.time.LocalDate;

public class Enclosing {

    private static int number = 23;
    private static LocalDate date = LocalDate.of(2024, 9, 16);

    private String name = "John Smith";

    private static void printNumber() {
        System.out.println(number);
    }

    private static void printDate() {
        System.out.println(date);
    }

    public void printName() {
        System.out.println(name);
    }

    static class Nested {
        private LocalDate date = LocalDate.of(2024, 9, 16);

        private void printDate() {
            System.out.println(date);
        }

       void run() {
           System.out.println(date);
           printDate();

           System.out.println(Enclosing.date);
           Enclosing.printDate();

            System.out.println(number);
            printNumber();
        }
    }
}
