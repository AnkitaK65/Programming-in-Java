/*
Q17. Write a Java program to learn the use of single-dimensional arrays by defining the array dynamically.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Define the array dynamically
        int[] array = new int[size];

        // Prompt user to input elements
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Display the elements of the array
        System.out.println("\nThe elements in the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        // Calculate and display the sum of array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("\nThe sum of the elements in the array is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
//Output:-
//Enter the size of the array: 5
//Enter 5 elements for the array:
//Element 1: 1
//Element 2: 100
//Element 3: 23
//Element 4: 12
//Element 5: 43
//
//The elements in the array are:
//Element at index 0: 1
//Element at index 1: 100
//Element at index 2: 23
//Element at index 3: 12
//Element at index 4: 43
//
//The sum of the elements in the array is: 179