import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // create Scanner object

        int firstNumber ;
        int secondNumber ;

        // Infinite loop
        // Loop until valid first number is entered
        while (true) {
            System.out.print("Enter first number: ");
            String firstInput = input.next();

            // Use try catch to handle an error that might occur
            try {
                firstNumber = Integer.parseInt(firstInput); // convert String firstInput to int
                break; // exit loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
         // Infinite loop
        // Loop until valid second number is entered
        while (true) {
            System.out.print("Enter second number: ");
            String secondInput = input.next();

            // Use try catch to handle an error that might occur
            try {
                secondNumber = Integer.parseInt(secondInput); // convert String secondInput to int
                break; // exit loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }

        // Display the sum
        int sum = firstNumber + secondNumber;
        System.out.println("The sum is: " + sum);
    }
}
