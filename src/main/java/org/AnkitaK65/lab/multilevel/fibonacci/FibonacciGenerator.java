package org.AnkitaK65.lab.multilevel.fibonacci;

// Reusable class to generate the Fibonacci series
public class FibonacciGenerator {
    // Method to generate and return the Fibonacci series as a String
    public String generateFibonacci(int n) {
        if (n <= 0) {
            return "Invalid input. Please enter a positive integer.";
        }

        // Using StringBuilder for efficient string concatenation in a loop.
        // String is immutable (slow), StringBuffer is thread-safe (moderate performance),
        // while StringBuilder is mutable and faster (no synchronization overhead) in single-threaded contexts.
        StringBuilder result = new StringBuilder();
        int a = 0, b = 1;

        result.append(a); // Add the first number
        if (n > 1) {
            result.append(", ").append(b); // Add the second number
        }

        for (int i = 2; i < n; i++) {
            int next = a + b;
            result.append(", ").append(next);
            a = b;
            b = next;
        }

        return result.toString();
    }
}
