import java.util.Scanner;

public class GroceryBillCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the coupon discount from the user
        System.out.print("Enter your coupon discount as a decimal (e.g., 0.10 for 10%): ");
        double coupon = input.nextDouble();

        // Ensure the coupon is within the valid range
        if (coupon <= 0 || coupon > 1) {
            System.out.println("Invalid coupon, defaulting to 10% discount.");
            coupon = 0.10;
        }

        // Array to store grocery bills
        double[] weeklyBills = new double[4];

        // Get grocery bills for 4 weeks
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter your grocery bill for week " + (i + 1) + ": ");
            weeklyBills[i] = input.nextDouble();
        }

        // Calculate total monthly grocery bill
        double totalMonthly = 0;
        for (double bill : weeklyBills) {
            totalMonthly += bill;
        }

        // Calculate the average weekly grocery bill
        double averageWeekly = totalMonthly / 4;

        // Apply the coupon discount
        double totalMonthlyWithCoupon = totalMonthly * (1 - coupon);
        double averageWeeklyWithCoupon = totalMonthlyWithCoupon / 4;

        // Output the results
        System.out.printf("Total Monthly Grocery Bill (without coupon): $%.2f\n", totalMonthly);
        System.out.printf("Average Weekly Grocery Bill (without coupon): $%.2f\n", averageWeekly);
        System.out.printf("Total Monthly Grocery Bill (with coupon): $%.2f\n", totalMonthlyWithCoupon);
        System.out.printf("Average Weekly Grocery Bill (with coupon): $%.2f\n", averageWeeklyWithCoupon);

        input.close();
    }
}
