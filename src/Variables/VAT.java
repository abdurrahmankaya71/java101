package Variables;

import java.util.Scanner;

public class VAT {
    public static void main(String[] args) {
        double input, vat_price, vat_amount;
        System.out.print("Please enter the price to calculate VAT: ");
        Scanner scan = new Scanner(System.in);
        input = scan.nextDouble();
        if(input<=1000 && input>=0){
            vat_amount = 0.18;
        }
        else{
            vat_amount = 0.8;
        }
        vat_price = input + input * vat_amount;
        System.out.println("VAT amount: "+vat_amount);
        System.out.println("Total price with VAT: "+vat_price);
    }
}
