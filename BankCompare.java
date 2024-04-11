import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int p = sc.nextInt();
        System.out.println("Enter the total tenure in years:");
        int t = sc.nextInt();
        // Initialize variables to store total EMI values for each bank
        double total_emi_a = 0;
        double total_emi_b = 0;
        // Loop twice to handle Bank A and Bank B
        for (int times = 0; times < 2; times++) {
            // Get the number of slabs
            System.out.println("Enter the number of slabs: ");
            int slabs = sc.nextInt();
            // Initialize total EMI for the current bank
            double total_emi = 0;
            // Loop through the slabs
            for (int i = 0; i < slabs; i++) {
                // Get year and rate
                System.out.println("Enter year and rate: ");
                double year = sc.nextDouble();
                double rate = sc.nextDouble();
                // Calculate monthly rate
                double monthly_rate = rate / 12;
                // Calculate total months (tenure in years * 12)
                double total_months = year * 12;
                // Calculate EMI using formula provided
                double emi = p * monthly_rate / (1 - 1 / (Math.pow(1 + monthly_rate, total_months)));
                // Add current EMI to total EMI
                total_emi += emi;
            }

            // Store the total EMI for the current bank in the variable
            if (times == 0) {
                total_emi_a = total_emi;
            } else {
                total_emi_b = total_emi;
            }
        }

        // Decide which bank to choose based on total EMI
        if (total_emi_a < total_emi_b) {
            System.out.println("Bank A");
        } else {
            System.out.println("Bank B");
        }
    }
}
