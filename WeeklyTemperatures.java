import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        // Create two ArrayLists: one for days of the week, one for temperatures
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        Scanner scanner = new Scanner(System.in);

        // Collect user input for daily temperatures
        for (String day : daysOfWeek) {
            System.out.println("Enter the average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }

        // Ask user for the output option: specific day or weekly summary
        System.out.println("\nWould you like to see the temperature for a specific day or the full week?");
        System.out.println("Type 'week' for the full week, or enter a specific day of the week (e.g., 'Monday'): ");
        String userChoice = scanner.next();

        // Process user input
        if (userChoice.equalsIgnoreCase("week")) {
            // Display all days and their temperatures
            System.out.println("\nWeekly Temperatures:");
            double totalTemp = 0;
            for (int i = 0; i < daysOfWeek.size(); i++) {
                System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i) + "°F");
                totalTemp += temperatures.get(i);
            }
            // Calculate and display the weekly average
            double weeklyAverage = totalTemp / temperatures.size();
            System.out.printf("Average Weekly Temperature: %.2f°F\n", weeklyAverage);
        } else if (daysOfWeek.contains(userChoice)) {
            // Display the temperature for the specific day
            int index = daysOfWeek.indexOf(userChoice);
            System.out.println(userChoice + ": " + temperatures.get(index) + "°F");
        } else {
            // Handle invalid input
            System.out.println("Invalid input. Please enter 'week' or a valid day of the week.");
        }

        // Close the scanner
        scanner.close();
    }
}
