import java.util.Scanner;
public class AquaGuardMonitor
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current water level (%): ");
        int percentage = scanner.nextInt();
        scanner.close();
        String message;
        if (percentage < 0) {
            message = "Sensor Error: Water level reading invalid!";
        } else if (percentage <= 19) {
            message = "Water critically low. Refill soon.";
        } else if (percentage <= 39) {
            message = "Water level low. Consider refilling.";
        } else if (percentage <= 80) {
            message = "Water level normal.";
        } else if (percentage <= 95) {
            message = "Warning: Water level high. Monitor closely.";
        } else if (percentage <= 100) {
            message = "Critical: Water tank almost full! Check for overflow.";
        } else if (percentage <= 120) {
            message = "System Alert: Potential overflow risk!";
        } else {
            message = "Invalid Input";
        }

        System.out.println(message);
    }
}
