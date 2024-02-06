import java.util.Scanner;


public class CylinderCalculator {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner (System.in);


        System.out.print("Enter the radius of the base circle: ");
        double radius = scanner.nextDouble();

        double length = scanner.nextDouble();


        double baseArea = 3.1416 * Math.pow(radius, 2);
        double volume = baseArea * length;


        System.out.printf("Base Area: %.2f square units%n", baseArea);
        System.out.printf("Volume: %.2f cubic units%n", volume);


        scanner.close();


    }
}
