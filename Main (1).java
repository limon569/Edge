import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
       
        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
       
        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
       
        // Calculate sum, difference, product, and quotient
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0.0;
       
        // Check for division by zero
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
       
        // Display all the results together
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
       
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        }
       
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}