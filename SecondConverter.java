import java.util.Scanner;

public class SecondConverter {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = scanner.nextInt();


        int hours = totalSeconds / 3600;
        int remainingSecondsAfterHours = totalSeconds % 3600;
        int minutes = remainingSecondsAfterHours / 60;
        int seconds = remainingSecondsAfterHours % 60;


        System.out.printf("%d seconds is equal to %d hours, %d minutes, and %d seconds%n",
                totalSeconds, hours, minutes, seconds);

        scanner.close();
    }
}
