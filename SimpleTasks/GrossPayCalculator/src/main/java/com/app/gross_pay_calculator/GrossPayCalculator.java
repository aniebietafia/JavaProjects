package com.app.gross_pay_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public GrossPayCalculator () {}

    public void execute() {
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?");
        double rate = scanner.nextDouble();
        scanner.close();

        double payRate = hours * rate;

        System.out.println("Gross Pay: " + payRate);
    }
}
