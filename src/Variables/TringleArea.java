package Variables;

import java.util.Scanner;
import java.lang.Math;
public class TringleArea {
    public static void main(String[] args) {
        // a, b and c are triangle side lengths
        // u = (a+b+c)/2
        double a,b,c, u, area;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tringel side lenghts: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        u = (a+b+c)/2;
        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Area for this tringle is: "+area);


    }
}
