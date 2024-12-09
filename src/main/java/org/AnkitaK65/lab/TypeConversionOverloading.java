/*
Q25. Write a program to show that during function overloading, if no matching argument is found,
Java will apply automatic type conversions (from lower to higher data types).
*/

package org.AnkitaK65.lab;

public class TypeConversionOverloading {
    // Method with double argument
    public void display(double value) {
        System.out.println("Method with double argument called: " + value);
    }

    // Method with long argument
    public void display(long value) {
        System.out.println("Method with long argument called: " + value);
    }

    public static void main(String[] args) {
        TypeConversionOverloading obj = new TypeConversionOverloading();

        // Exact match for double
        obj.display(10.5); // Calls the method with double

        // Exact match for long
        obj.display(100L); // Calls the method with long

        // Automatic type conversion: int to long
        obj.display(50); // Calls the method with long

        // Automatic type conversion: float to double
        obj.display(15.7f); // Calls the method with double

        // Automatic type conversion: char to int, then to long
        obj.display('A'); // ASCII value 65, calls the method with long
    }
}
//Output:
//Method with double argument called: 10.5
//Method with long argument called: 100
//Method with long argument called: 50
//Method with double argument called: 15.699999809265137
//Method with long argument called: 65

//obj.display('Adh'); --> gives -->  java: unclosed character literal