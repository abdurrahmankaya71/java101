package Methods;

import java.util.Scanner;

public class RecursivePrime {
    static boolean isPrime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for check: ");
        int n = scanner.nextInt();
        if (isPrime(n, n / 2))
            System.out.println("Yes, this number is a prime number");
        else
            System.out.println("No, this number isn't a prime number");
    }
}
