package Methods;

import java.util.Scanner;

public class RecursivePattern {
    static void pattern(int constantNum, int variableNum, int sign) {
        if (variableNum > constantNum) {
            return;
        }
        if (variableNum < 1) {
            sign *= -1;
        }
        System.out.print(" " + variableNum + " ");
        pattern(constantNum, variableNum  + sign * 5, sign);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int input = scanner.nextInt();
        pattern(input, input, -1);
    }
}
