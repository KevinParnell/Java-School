package Payroll;

/*
 Homework 3: Payroll Bonus
 Program By: Kevin Parnell
 GitHub: https://github.com/KevinParnell
 File Name: Payroll.java
 Function: This program will calculate the bonus amount given a number of employees
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Starts the program and moves it over to bonus method
        System.out.println("Welcome to Payroll!");
        System.out.println("Please enter the number of employees:");
        int employees = scan.nextInt();

        bonus(employees);
    }

    public static void bonus(int employees) {

        Scanner scan = new Scanner(System.in);

        int empNum;
        double currPay;
        int year;
        double bonus = 0;
        double newPay;

        // Makes the counter start at 1 instead of 0 and increments the number by one until the employees int number is reached loop
        for (empNum = 1; empNum <= employees; empNum++) {
            System.out.println("Please enter employee " + empNum + "'s monthly pay:");
            currPay = scan.nextDouble();
            System.out.println("Please enter the number of years employee " + empNum + " has worked:");
            year = scan.nextInt();

            // Error checking for numbers not greater than 0
            while (year <= 0) {
                System.out.println("Please enter a number greater than 0.");
                year = scan.nextInt();
            }

            // Assigns bonus value for year inputs
            if (year < 5 && year > 0) {
                bonus = 0.05;
            } else if (year < 9 && year > 4) {
                bonus = 0.10;
            } else if (year > 9) {
                bonus = 0.15;
            }

            // Calculates the pay properly and assigns the percentage and currency in the proper format
            newPay = currPay + (currPay * bonus);
            System.out.println("Employee " + empNum + " receives a " + NumberFormat.getPercentInstance().format(bonus) + " bonus, bringing his monthly pay to " + NumberFormat.getCurrencyInstance().format(newPay) + ".");
        }
    }
}
