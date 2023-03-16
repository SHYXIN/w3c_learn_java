package oop.dates;
import java.time.LocalDate; // import the LocalDate class
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Main {
    public static void main(String[] args) {
        LocalDate myObj= LocalDate.now(); // Create a date object
        // Display the current date
        System.out.println(myObj);  // 2023-03-16

        LocalTime myTime = LocalTime.now();
//        Display the current time h:m:s nm
        System.out.println(myTime); // 15:10:21.507

        LocalDateTime myDateTime = LocalDateTime.now();
//        Display the current date and time
        System.out.println(myDateTime); // 2023-03-16T15:10:21.507

//        Formatting Date and Time

        LocalDateTime myDateTime2 = LocalDateTime.now();
        System.out.println("Before formatting: "+ myDateTime2);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDate = myDateTime2.format(myFormatObj);
        System.out.println("After formatting: "+ formattedDate);

    }
}
