package Methods;

import java.util.Scanner;
public class Palindrome {
    static int isPalindrome (int number) {
        int lastNum, reverseNum = 0, temp = number;
        // 123
        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = reverseNum * 10 + lastNum;
            temp /= 10;
        }
        if (number == reverseNum) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int num;
        System.out.print("Enter number for check: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (isPalindrome(num) == 1) {
            System.out.println("This is palindrome number");
        }
        else {
            System.out.println("This isn't palindrome number");
        }
    }
}
