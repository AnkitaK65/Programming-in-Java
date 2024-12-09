/*
Q5. Write a Java program to find the largest and smallest elements in a given array.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of size n
        int[] arr = new int[n];

        // Take array elements input from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize the largest and smallest elements
        int largest = arr[0];
        int smallest = arr[0];

        // Loop through the array to find largest and smallest elements
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            }
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest if current element is smaller
            }
        }

        // Output the largest and smallest elements
        System.out.println("Largest element in the array: " + largest);
        System.out.println("Smallest element in the array: " + smallest);

        // Close scanner
        scanner.close();
    }
}
//Output:
//Enter the number of elements in the array: 5
//Enter 5 elements:
//34 12 56 7 90
//Largest element in the array: 90
//Smallest element in the array: 7