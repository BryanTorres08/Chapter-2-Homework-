import java.util.Scanner;
public class PaintCalculator {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the length of the room (in feet): ");
        double length = Scanner.nextDouble();

        System.out.println("Enter the width of the room (in feet): ");
        double width = Scanner.nextDouble();

        System.out.println("Enter the height of the room (in feet): ");
        double height = Scanner.nextDouble();

        System.out.println("Enter the number of windows: ");
        double numWindows = Scanner.nextInt();

        System.out.println("Enter the number of doors");
        int numDoors = Scanner.nextInt();

        double totalSquareFeet = 2 * (length * width + length * height + width * height);
        totalSquareFeet -= numWindows * 15;
        totalSquareFeet -= numDoors * 21;

        int gallonsNeeded = (int) Math.ceil(totalSquareFeet / 350);
        double quartsNeeded = (totalSquareFeet % 350) / 350.0;

        System.out.println("Gallons of paint needed: " +gallonsNeeded);
        System.out.printf("Quarts of paint needed: %.2f%n", quartsNeeded);

        Scanner.close();



    }
}
