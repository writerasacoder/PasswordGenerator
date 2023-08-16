import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter time in 12-hour format (hh:mm:ss AM/PM): ");
            //Enter time in 12-hour format (hh:mm:ss AM/PM): 03:30:45 PM

            String time12Hour = scanner.nextLine();
            
            String militaryTime = convertToMilitaryTime(time12Hour);
            
            System.out.println("Military time: " + militaryTime);
            //Military time: 15:30:45

        }
    }
    
    public static String convertToMilitaryTime(String time12Hour) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        LocalTime localTime = LocalTime.parse(time12Hour, inputFormatter);
        
        return localTime.format(outputFormatter);
    }
}
