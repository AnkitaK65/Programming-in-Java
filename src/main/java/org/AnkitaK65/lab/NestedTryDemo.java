package org.AnkitaK65.lab;

// Q33. Write a program to show the use of nested try statements that emphasize the sequence of checking for catch handler statements.

public class NestedTryDemo {
    public static void main(String[] args) {
        // Outer try block
        try {
            System.out.println("Outer try block starts.");

            // Case 1: Uncomment the line below to simulate an exception in the outer try block.
//             int result = 10 / 0; // Throws ArithmeticException

            // Inner try block (nested)
            try {
                System.out.println("Inner try block starts.");

                // Case 2: Uncomment the line below to simulate an exception in the inner try block.
//                 int[] numbers = {1, 2, 3};
//                 System.out.println(numbers[5]); // Throws ArrayIndexOutOfBoundsException

                // Case 3: Uncomment the line below to simulate an exception not handled by the inner catch block.
//                if(true)
//                    throw new NullPointerException("Simulated NullPointerException");

                System.out.println("Inner try block ends.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds!");
            }

            System.out.println("Outer try block ends.");
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Arithmetic exception occurred!");
        } catch (Exception e) {
            System.out.println("Outer catch: General exception handler.");
        }

        System.out.println("Program continues after the try-catch blocks.");
    }
}

//Output:
//Normal Case:
//Outer try block starts.
//Inner try block starts.
//Inner try block ends.
//Outer try block ends.
//Program continues after the try-catch blocks.

//Case 1:
//Outer try block starts.
//Outer catch: Arithmetic exception occurred!
//Program continues after the try-catch blocks.

//Case 2:
//Outer try block starts.
//Inner try block starts.
//Inner catch: Array index out of bounds!
//Outer try block ends.
//Program continues after the try-catch blocks.

//Case 3:
//Outer try block starts.
//Inner try block starts.
//Outer catch: General exception handler.
//Program continues after the try-catch blocks.