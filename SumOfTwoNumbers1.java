import java.util.Scanner;

public class SumOfTwoNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double num1 = 0;
        double num2 = 0;
        boolean validInput = false;

        // Loop until valid input is entered
        while (!validInput) {
            try {
                // Prompt the user to enter the first number
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();
                
                // Prompt the user to enter the second number
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                
                // If no exception occurs, set validInput to true to break the loop
                validInput = true;
            } catch (Exception e) {
                // Handle invalid input (non-numeric values)
                System.out.println("Invalid input! Please enter numeric values.");
                // Clear the invalid input from the scanner buffer
                scanner.next();  // This is to consume the invalid input
            }
        }

        // Calculate the sum of the two numbers
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
