package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci 0 1 1 2 3 5 8 13 21 34
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac elemenli bir fibonacci istiyorsaniz giriniz: ");
        input = scanner.nextInt();
        /* Fibonacci
        0 1 1 2 3 5 8 13 21 34
        a b c
          a b c
            a b c
              a b c
         */
        int a = 1, b = 1, c;
        System.out.print("0 ");
        System.out.print("1 ");
        System.out.print("1 ");
        for (int i = 0; i < input; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+ " ");
        }
    }
}
