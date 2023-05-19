package ControlFlow;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, password;
        char option;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        userName = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();

        // Check if the username and password match the predefined values
        if (userName.equals("patika") && password.equals("patika1234")) {
            System.out.println("User login successful");
        } else if (!userName.equals("patika") && password.equals("patika1234")) {
            System.out.println("Invalid username, please try again");
        } else {
            System.out.println("Invalid password. If you want to reset your password, press 'y" +
                    ". Otherwise, press any key.");
            option = scanner.next().charAt(0);
            String newPassword;
            if (option == 'y') {
                System.out.print("Enter a new password: ");
                newPassword = scanner.next();
                if (newPassword.equals("patika1234")) {
                    System.out.println("Invalid password, please try again");
                } else {
                    System.out.println("Congratulations! Your new password is: " + newPassword);
                }
            }
        }
    }
}
