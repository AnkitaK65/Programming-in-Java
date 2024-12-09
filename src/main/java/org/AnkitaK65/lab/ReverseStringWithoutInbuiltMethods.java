/*
Q7. Write a Java program to reverse a string without using inbuilt methods.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class ReverseStringWithoutInbuiltMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert string to character array to manipulate
        char[] charArray = inputString.toCharArray();
        int length = charArray.length;

        // Reverse the string by swapping characters
        System.out.print("Reversed string: ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

        // Close scanner
        scanner.close();
    }
}
//Output:
//Enter a string: Hello World
//Reversed string: dlroW olleH