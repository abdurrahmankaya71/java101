package Variables;

import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {
        // Fruits and their prices per kilogram
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00, total;
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many kilograms of pear?: ");
        input = scanner.nextInt();
        pear = input*pear;
        System.out.print("How many kilograms of apple?: ");
        input = scanner.nextInt();
        apple = input*apple;
        System.out.print("How many kilograms of tomato?: ");
        input = scanner.nextInt();
        tomato = input*tomato;
        System.out.print("How many kilograms of banana?: ");
        input = scanner.nextInt();
        banana = input*banana;
        System.out.print("How many kilograms of eggplant?: ");
        input = scanner.nextInt();
        eggplant = input*eggplant;
        total = pear + apple + tomato + banana + eggplant;
        System.out.println("Total price: "+total);
    }
}
