package Methods;

import java.util.Scanner;

public class RecursivePower {

    // 3^4 = 81
    // 3^4  = 3 * 3^3 = 81
    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, (exp-1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter exp number: ");
        int exp = scanner.nextInt();
        System.out.println("Result is: " + power(base, exp));
    }
}
