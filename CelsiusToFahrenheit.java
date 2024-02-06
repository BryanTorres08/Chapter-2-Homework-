import java.util.Scanner;


public class CelsiusToFahrenheit {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter temperature in Celsius: ");


        double temperatureCelsius = scanner.nextDouble();


        double temperatureFahrenheit = (temperatureCelsius * 9/5) + 32;


        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit%n", temperatureCelsius, temperatureFahrenheit);


        scanner.close();


    }
}
