package Variables;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // BMI = Body Mass Index
        double weight,  height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height (in meters): ");
        height = scanner.nextDouble();
        System.out.print("Please enter your weight: ");
        weight = scanner.nextDouble();
        // formula for BMI
        bmi = weight / (height * height);
        System.out.println("Your Body Mass Index (BMI): "+bmi);
    }
}
