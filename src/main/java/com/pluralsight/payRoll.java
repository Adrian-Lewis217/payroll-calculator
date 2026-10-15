package com.pluralsight;

import java.util.Scanner;

public class payRoll {
    public static void main(String[] args) {
        // The variables for each item
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String workerName = scanner.nextLine();


        System.out.println("Enter your hours for a day: ");
        double hours = scanner.nextInt();

        System.out.println("Enter pay rate: ");
        double payRate = scanner.nextInt();

        System.out.println("Enter hours you worked this week: ");
        double hoursInWeek = scanner.nextInt();

        // Calculate for gross pay. hours * pay rate * hours worked in the week.
        double grossPay = hours * payRate * hoursInWeek;
        System.out.println("Gross Pay: " + grossPay);
    }
}
