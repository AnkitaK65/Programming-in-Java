/*
Q13. Write a Java program to search for an element in an array using linear search.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Create an array of the given size
        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to be searched
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Perform linear search
        int index = -1; // Variable to store the index of the found element
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                index = i;  // Element found at index i
                break;
            }
        }

        // Output the result
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        // Close scanner
        scanner.close();
    }
}
//Enter the size of the array: 5
//Enter the elements of the array:
//10 5 98 20 34
//Enter the element to search: 20
//Element 20 found at index: 3

//Enter the size of the array: 5
//Enter the elements of the array:
//10 5 98 20 34
//Enter the element to search: 23
//Element 23 not found in the array.