import java.util.Scanner;

public class FloatingPointProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int count = 0;

        // While loop to read exactly 5 floating-point values
        while (count < 5) {
            System.out.print("Enter a floating-point value: ");
            if (scanner.hasNextDouble()) {
                double input = scanner.nextDouble();
                total += input;

                // Update maximum and minimum
                if (input > max) {
                    max = input;
                }
                if (input < min) {
                    min = input;
                }
                count++;
            } else {
                // Handle invalid input
                System.out.println("Invalid input, please enter a valid floating-point number.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Calculate average and interest
        double average = total / 5;
        double interest = total * 0.20;

        // Print results
        System.out.println("\nResults:");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on Total (20%): " + interest);

        // Unique twist - feedback based on the total
        if (total > 500) {
            System.out.println("Wow, that's a pretty high total!");
        } else if (total < 100) {
            System.out.println("That’s a relatively low total.");
        } else {
            System.out.println("Your total is in a balanced range.");
        }
    }
}
