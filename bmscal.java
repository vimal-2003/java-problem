import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

       
        double bmi = weight / (height * height);

        // Output the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Close the Scanner
        scanner.close();
    }
}
