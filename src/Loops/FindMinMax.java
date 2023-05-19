package Loops;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, num, max = 0, min = 0;
        System.out.println("kac sayi gireceksiniz? ");
        input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.print(i+". Sayiyi giriniz: ");
            num = scanner.nextInt();
            if (num >= max){
                max = num;
            }
            else if (num <= min){
                min = num;
            }
        }
        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);
    }
}

