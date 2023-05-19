package ControlFlow;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yil;
        System.out.print("Lutfen yil giriniz: ");
        yil = scanner.nextInt();
        if (yil % 4 == 0) {
            System.out.println(yil + " bir artik yildir.");
        }
        else if (yil % 100 == 0 && yil % 400 == 0)
            System.out.println(yil + " bir artik yildir.");
        System.out.println(yil + " bir artik yil degildir.");
    }
}

