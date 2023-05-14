package Variables;

import java.util.Scanner;

public class SectorArea {
    public static void main(String[] args) {
        float pi = 3.14F;
        // a = central angle
        double a , radius, area;
        // sector area formula = (𝜋 * (r*r) * 𝛼) / 360
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter central angle: ");
        a = scanner.nextDouble();
        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();
        area = (pi * radius * radius * a)/360;
        System.out.print("Sector area is: "+area);
    }
}
