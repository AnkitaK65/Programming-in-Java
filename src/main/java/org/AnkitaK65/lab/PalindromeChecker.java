/*
Q4. Write a Java program to check if a given string or number is a palindrome using both inbuilt function and manual method.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a word or number to check if it is the same forward and backward: ");
        String input = scanner.nextLine();

        // Show menu for selecting method
        System.out.println("Choose a method to check palindrome:");
        System.out.println("1. Using inbuilt function");
        System.out.println("2. Using manual method");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character after the integer input

        // Clean the input by removing any extra spaces and converting it to lowercase for easier comparison
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        switch (choice) {
            case 1:
                // Using inbuilt function to check palindrome
                String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
                if (cleanedInput.equals(reversedInput)) {
                    System.out.println(input + " is a palindrome (Using inbuilt function)!");
                } else {
                    System.out.println(input + " is not a palindrome (Using inbuilt function).");
                }
                break;

            case 2:
                // Using manual method to check palindrome
                int start = 0;
                int end = cleanedInput.length() - 1;
                boolean isPalindrome = true;

                // Manually compare letters from the front and back of the cleaned word
                while (start < end) {
                    if (cleanedInput.charAt(start) != cleanedInput.charAt(end)) {
                        isPalindrome = false; // If letters don't match, it's not a palindrome
                        break;
                    }
                    start++;
                    end--;
                }

                if (isPalindrome) {
                    System.out.println(input + " is a palindrome (Using manual method)!");
                } else {
                    System.out.println(input + " is not a palindrome (Using manual method).");
                }
                break;

            default:
                System.out.println("Invalid choice! Please choose 1 or 2.");
        }

        scanner.close();
    }
}
//Output:
//Enter a word or number to check if it is the same forward and backward: racecar
//Choose a method to check palindrome:
//1. Using inbuilt function
//2. Using manual method
//2
//racecar is a palindrome (Using manual method)!

//Enter a word or number to check if it is the same forward and backward: hello
//Choose a method to check palindrome:
//1. Using inbuilt function
//2. Using manual method
//1
//hello is not a palindrome (Using inbuilt function).

//Enter a word or number to check if it is the same forward and backward: 123 21
//Choose a method to check palindrome:
//1. Using inbuilt function
//2. Using manual method
//2
//123 21 is a palindrome (Using manual method)!

//Enter a word or number to check if it is the same forward and backward: A man, a plan, a canal, Panama
//Choose a method to check palindrome:
//1. Using inbuilt function
//2. Using manual method
//2
//A man, a plan, a canal, Panama is a palindrome (Using manual method)!