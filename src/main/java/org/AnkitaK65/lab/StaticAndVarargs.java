package org.AnkitaK65.lab;

/**
 * Q27. Write a program to show the use of static functions
 * and to pass variable-length arguments to a function.
 *
 * Static functions belong to the class rather than any specific object.
 * Variable-length arguments (varargs) allow passing a variable number of arguments to a function.
 */

public class StaticAndVarargs {

    // Static function to calculate the sum of a variable number of integers
    public static int calculateSum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Static function to concatenate a variable number of strings
    public static String concatenateStrings(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Calling static function to calculate sum
        System.out.println("Sum of 1, 2, 3, 4, 5: " + calculateSum(1, 2, 3, 4, 5));
        System.out.println("Sum of 10, 20: " + calculateSum(10, 20));
//      Use:- StaticAndVarargsDemo.calculateSum(10, 20)); //when call is made from different class

        // Calling static function to concatenate strings
        System.out.println("Concatenated Strings: " + concatenateStrings("Hello", "World", "from", "Java!"));
        System.out.println("Concatenated Strings: " + concatenateStrings("Static", "functions", "are", "useful."));
    }
}

//Static Functions:
//- Declared using the static keyword.
//- Belong to the class, not to any specific instance.
//- Can be called directly using the class name without creating an object.
//
// Variable-Length Arguments (Varargs):
//- Declared using ... (three dots) after the type.
//- Allow passing zero or more arguments to the method.
//- Treated as an array inside the method.

//Output:
//Sum of 1, 2, 3, 4, 5: 15
//Sum of 10, 20: 30
//Concatenated Strings: Hello World from Java!
//Concatenated Strings: Static functions are useful.