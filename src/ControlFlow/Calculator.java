package ControlFlow;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double num1, num2, resault;
        int operator;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
        System.out.println("Chose an operator: + , - , / , * ");
        operator = scanner.next().charAt(0);
        switch (operator) {
            case '+' -> {
                resault = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resault);
            }
            case '-' -> {
                resault = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resault);
            }
            case '/' -> {
                resault = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resault);
            }
            case '*' -> {
                resault = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resault);
            }
            default -> System.out.println("Invalid operator!");
        }
    }
}
