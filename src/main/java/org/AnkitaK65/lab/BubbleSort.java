/*
Q8. Write a Java program to implement bubble sort for sorting an array of integers.
*/

package org.AnkitaK65.lab;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the integers
        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform Bubble Sort
        bubbleSort(array);

        // Display the sorted array
        System.out.println("Sorted array using Bubble Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        // Close scanner
        scanner.close();
    }

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted, so no need to check them
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
//Output:
//Enter the number of elements in the array: 5
//Enter the elements of the array:
//64 34 25 12 22
//Sorted array using Bubble Sort:
//12 22 25 34 64