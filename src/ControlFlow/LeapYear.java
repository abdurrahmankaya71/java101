package ControlFlow;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("Please enter a year: ");
        year = scanner.nextInt();
        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        }
        // Check if the year is divisible by both 100 and 400
        else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
