package org.AnkitaK65.lab;

// Q34. Write a program to create your own exception types to handle situations specific to your application.
// Hint: Define a subclass of Exception, which itself is a subclass of Throwable.

import java.util.Scanner;

// Custom exception class to handle invalid age
class InvalidAgeException extends Exception {
    /**
     * Constructor for InvalidAgeException.
     * @param message The error message to display when this exception is thrown.
     */
    public InvalidAgeException(String message) {
        // Pass the message to the parent Exception class
        super(message);
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user to input their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check if the age is valid; if not, throw the custom exception
            if (age < 18 || age > 60) {
                throw new InvalidAgeException("Age must be between 18 and 60 for this application.");
            }

            // If age is valid, print a success message
            System.out.println("Welcome! Your age is valid for this application.");

        } catch (InvalidAgeException e) {
            // Handle the custom exception and display its message
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions (e.g., input mismatch)
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

////Output:
//Enter your age: 5
//        Error: Age must be between 18 and 60 for this application.

//Enter your age: 12
//        Error: Age must be between 18 and 60 for this application.

//Enter your age: 62
//        Error: Age must be between 18 and 60 for this application.