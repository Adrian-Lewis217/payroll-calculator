package com.pluralsight;

import java.util.Scanner;

public class payRoll {
    public static void main(String[] args) {
        // The variables for each item
        Scanner scanner = new Scanner();
        String workerName = scanner.nextLine();
        double hours = scanner.nextInt();
        double payRate = scanner.nextInt();
        double hoursInWeek = scanner.nextInt();

        // Calculate for gross pay. hours * pay rate * hours worked in the week.
        double grossPay = hours * payRate * hoursInWeek;
        System.out.println("Gross Pay: " + grossPay);
    }
}
