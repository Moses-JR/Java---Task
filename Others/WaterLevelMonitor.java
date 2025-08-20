import java.util.Scanner;

public class WaterLevelMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        if (level < 0) {
            System.out.println("Sensor Error: Water level reading invalid!");
        } else if (level <= 19) {
            System.out.println("Water critically low. Refill soon.");
        } else if (level <= 39) {
            System.out.println("Water level low. Consider refilling.");
        } else if (level <= 80) {
            System.out.println("Water level normal.");
        } else if (level <= 95) {
            System.out.println("Warning: Water level high. Monitor closely.");
        } else if (level <= 100) {
            System.out.println("Critical: Water tank almost full! Check for overflow.");
        } else if (level <= 120) {
            System.out.println("System Alert: Potential overflow risk!");
        } else {
            System.out.println("Invalid Input.");
        }

        scanner.close();
    }
}
