package Variables;

import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        double km_price = 2.20, travel_start = 10, input, total;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the distance you will travel in kilometers: ");
        input = scanner.nextDouble();
        total = km_price * input + travel_start;
        if(total >= 20){
            System.out.print("The amount you need to pay is "+total+"$");
        }
        // Minimum payable amount = 20
        else {
            System.out.println("The amount you need to pay is 20$");
        }
    }
}
