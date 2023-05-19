package ControlFlow;

import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a > b)
            if (b > c)
                max = a;
            else
                max = b;
        else
            max = c;
        System.out.println("Max number is: "+max);
    }
}
