public class DataFormatting {
    public static void main(String[] args) {


        String day = "Monday";
        int date = 2;
        String month = "September";
        int year = 2019;


        System.out.println("Day: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);


        System.out.printf("Standard American Format: %s, %s %d, %d%n" , day, month, date, year);


        System.out.printf("European Format: %d %s %s %d%n", date, month, day, year);


    }
}
