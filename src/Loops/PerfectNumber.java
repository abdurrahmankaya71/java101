package Loops;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num, sum = 0;
        num = scanner.nextInt();
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num * 2) {
            System.out.println(num +" sayisi mukemmel sayidir");
        }
        else {
            System.out.println(num +" sayisi mukemmel sayi degildir");
        }
    }
}
