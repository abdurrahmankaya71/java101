package ControlFlow;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName, password;
        char option;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name: ");
        userName = scanner.nextLine();
        System.out.print("Enter password: ");
        password = scanner.nextLine();
        if (userName.equals("patika") && password.equals("patika1234")) {
            System.out.println("User successfully");
        } else if (!userName.equals("patika") && password.equals("patika1234")){
            System.out.println("User name is invalid, try again");
        }
        else {
            System.out.println("Password is invalid, if you need to refactor password, click y, else clisk anything");
            option = scanner.next().charAt(0);
            String newPassword;
            if (option == 'y'){
                System.out.print("Enter a new password: ");
                newPassword = scanner.next();
                if(newPassword.equals("patika1234")){
                    System.out.println("Invalid password, please try again");
                }
                else {
                    System.out.println("Congrats!, your new passowrd is: "+newPassword);
                }
            }
        }
    }
}
