package Methods;

import java.util.Scanner;

public class Calculator {
    // Collection Process
    static int sum(int num1, int num2) {
        return num1 + num2;
    }
    // Collection Process
    static int ubtraction(int num1, int num2) {
        return num1 - num2;
    }
    // Multiplication
    static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    // Division process
    static int division(int num1, int num2) {
        return num1 / num2;
    }
    // Exponent Calculation
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp ; i++) {
            result *= base;
        }
        return result;
    }
    // Factorial Calculation
    static int factorial(int fact) {
        int result = 1;
        for (int i = 1; i <= fact ; i++) {
            result *= i;
        }
        return result;
    }
    // Get Mode
    static int mode(int num, int modular) {
        return num % modular;
    }
    // Rectangular Area
    static int area(int a, int b) {
        return a * b;
    }
    // Rectangular perimeter
    static int perimeter(int a, int b) {
        return (a + b) * 2;
    }
    // Enter two number
    static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;
        String menu = """
                \n
                1- Collection Process
                2- Subtraction
                3- Multiplication
                4- Division process
                5- Exponent Calculation
                6- Factorial Calculation
                7- Get Mode
                8- Rectangular Area Calculation
                9- Rectangular Perimeter Calculation
                0- Logout
                """;
        while (true) {
            System.out.println(menu);
            System.out.print("Please select one: ");
            select = scanner.nextInt();
            if (select == 0){
                break;
            }
            if (select == 1) {
                int a = enterNumber(), b = enterNumber();
                System.out.println(a + " + " + b + " = " + sum(a,b));
            } else if (select == 2) {
                int a = enterNumber(), b = enterNumber();
                System.out.println(a + " - " + b + " = " + ubtraction(a,b));
            } else if (select == 3) {
                int a = enterNumber(), b = enterNumber();
                System.out.println(a + " * " + b + " = " + multiplication(a,b));
            } else if (select == 4) {
                int a = enterNumber(), b = enterNumber();
                System.out.println(a + " / " + b + " = " + division(a,b));
            } else if (select == 5) {
                int a = enterNumber(), b = enterNumber();
                System.out.println(a + "^" + b + " = " + power(a,b));
            } else if (select == 6) {
                int a = enterNumber();
                System.out.println(a+"! =" +factorial(a));
            } else if (select == 7) {
                int a = enterNumber(), b = enterNumber();
                System.out.println(a + " % " + b + " = " + mode(a,b));
            } else if (select == 8) {
                int a = enterNumber(), b = enterNumber();
                System.out.println("Perimeter is: " + perimeter(a,b));
            } else if (select == 9) {
                int a = enterNumber(), b = enterNumber();
                System.out.println("Area is: " + area(a,b));
            }
            else {
                System.out.println("Invalid select!, please try again");
            }
        }
    }
}
