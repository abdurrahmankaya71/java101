package Variables;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        int math, physics, chemistry, turkish, history, music; // variable names for course grades
        double sum, average; // variable names for sum and average of grades
        Scanner scan = new Scanner(System.in);
        // get input from user
        System.out.print("Please enter your math grade: ");
        math = scan.nextInt();
        System.out.print("Please enter your physics grade: ");
        physics = scan.nextInt();
        System.out.print("Please enter your chemistry grade: ");
        chemistry = scan.nextInt();
        System.out.print("Please enter your turkish grade: ");
        turkish = scan.nextInt();
        System.out.print("Please enter your history grade: ");
        history = scan.nextInt();
        System.out.print("Please enter your music grade: ");
        music = scan.nextInt();
        sum = math + physics + chemistry + turkish + music + history; // calculate the sum of grades
        average = sum/6; // calculate the average of grades
        // determine pass or fail status
        String status = (average>60) ? "Congratulations, you passed the class" : "You failed the class";
        System.out.println("Your average grade is: "+average +" "+status); // print the result
    }
}
