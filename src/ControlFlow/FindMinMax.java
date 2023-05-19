package ControlFlow;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        int a, b, c, max, min;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a > b) {
            max = a;
            if (b > c) min = c;
            else {
                min = b;
            }
        }
        else {
            max = c;
            min = a;
        }
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);
    }
}