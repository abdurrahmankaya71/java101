package Loops;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        System.out.println("Enter two number: ");
        Scanner scanner = new Scanner(System.in);
        int num1, num2, lcm, gcd = 1;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        int small;
        if (num1 <= num2) small = num1;
        else small = num2;
        int i = 1;
        while (i <= small) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
           i++;
        }
        System.out.print("GCD for this two number is: " + gcd);
        // LCM formula -> lcm = (num1 * num2) / gcd;
        lcm = num1 * num2 / gcd;
        System.out.print("\nLCM for this two number is: " + lcm);
    }
}


