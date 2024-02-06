public class Time {
    public static void main(String[] args) {


        int hour = 17;
        int minute = 15;
        int second = 30;


        int secondSinceMidnight = (hour * 3600) + (minute * 60) + second;
        System.out.println("Seconds since midnight: " + secondSinceMidnight);


        int secondInADay = 24 * 3600;
        int secondsRemaining = secondInADay - secondSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);


        double percentageOfDayPassed= ((double) secondSinceMidnight / secondInADay) * 100;
        System.out.printf("Percentage of the day passed: %.2f%%%n", percentageOfDayPassed);


    }
}
