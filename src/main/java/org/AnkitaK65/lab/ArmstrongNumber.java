/*
Q14. Write a Java program to check if a given number is an Armstrong number.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to be checked
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Store the original number for comparison later
        int originalNum = num;

        // Variable to store the sum of digits raised to the power of the number of digits
        int sum = 0;

        // Find the number of digits in the given number
        int numOfDigits = String.valueOf(num).length();

        // Loop through each digit and calculate the sum of digits raised to the power of numOfDigits
        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            sum += Math.pow(digit, numOfDigits);  // Add the digit raised to the power
            num /= 10;  // Remove the last digit
        }

        // Check if the sum equals the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}
//Enter a number: 153
//153 is an Armstrong number.