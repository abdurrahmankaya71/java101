package ControlFlow;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get necessary input from the user
        double distance, seniorDiscount, regularPrice, ageDiscount, totalFare;
        int age, type;
        System.out.print("Please enter the distance of your journey in KM: ");
        distance = scanner.nextDouble();
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        System.out.print("Press 1 for one-way ticket, 2 for round-trip ticket: ");
        type = scanner.nextInt();

        // Base price is 0.10 per KM
        regularPrice = distance * 0.10;

        if (distance <= 0 || age < 0 || type > 2 || type < 0) {
            System.out.println("Invalid input!");
        } else if (type == 2) {
            // Round-trip and age discounts
            if (age <= 12) {
                // Round-trip and age discount for children (below 12)
                System.out.println("Regular price: " + regularPrice);
                ageDiscount = regularPrice * 0.50;
                System.out.println("Age discount: " + ageDiscount);
                seniorDiscount = (regularPrice - ageDiscount) * 0.20;
                System.out.println("Round-trip discount: " + seniorDiscount);
                totalFare = (regularPrice - ageDiscount - seniorDiscount) * 2;
                System.out.println("Total fare for two tickets: " + totalFare);
            } else if (age <= 24) {
                // Round-trip and age discount for young adults (between 12 and 24)
                System.out.println("Regular price: " + regularPrice);
                ageDiscount = regularPrice * 0.10;
                System.out.println("Age discount: " + ageDiscount);
                seniorDiscount = (regularPrice - ageDiscount) * 0.20;
                System.out.println("Round-trip discount: " + seniorDiscount);
                totalFare = (regularPrice - ageDiscount - seniorDiscount) * 2;
                System.out.println("Total fare for two tickets: " + totalFare);
            } else if (age > 65) {
                // Round-trip and age discount for senior citizens (above 65)
                System.out.println("Regular price: " + regularPrice);
                ageDiscount = regularPrice * 0.30;
                System.out.println("Age discount: " + ageDiscount);
                seniorDiscount = (regularPrice - ageDiscount) * 0.20;
                System.out.println("Round-trip discount: " + seniorDiscount);
                totalFare = (regularPrice - ageDiscount - seniorDiscount) * 2;
                System.out.println("Total fare for two tickets: " + totalFare);
            } else {
                // Round-trip ticket discount
                seniorDiscount = regularPrice * 0.20;
                totalFare = (regularPrice - seniorDiscount) * 2;
                System.out.print("Total fare for two tickets: " + totalFare);
            }
        } else {
            // Only age discounts
            if (age <= 12) {
                // Age discount for children (below 12)
                System.out.println("Regular price: " + regularPrice);
                ageDiscount = regularPrice * 0.50;
                System.out.println("Age discount: " + ageDiscount);
                totalFare = (regularPrice - ageDiscount) * 2;
                System.out.println("Total fare: " + totalFare);
                

