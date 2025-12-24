package org.AnkitaK65.Unit1;

// Example25: Method Declaration vs Method Definition in Java

/*
1. Method Declaration:
    - Also called method signature or prototype.
    - Specifies method name, return type, and parameters (if any).
    - Does NOT include method body (implementation) in some languages like C/C++.
    - In Java, declaration is implicit when you define the method in a class/interface.
    - Example in interface:
        int add(int a, int b);  // declaration without body
    - In abstract classes, abstract methods are declarations.

2. Method Definition:
    - Provides the actual implementation (method body).
    - Includes code statements inside curly braces { }.
    - Example:
        int add(int a, int b) {
            return a + b;
        }

3. Java Specific:
    - Concrete methods always have both declaration and definition together in the same place.
    In Java, a concrete method must declare the method and define (implement) it together in the same place.
        - Java does not allow method prototypes like C/C++.
        - Example:
            void add(int a, int b) {   // declaration + definition
                System.out.println(a + b);
            }
    - Abstract/interface methods: declaration only.
    - Overloaded methods: multiple declarations, separate definitions.
*/


class Example25 {

    public static void main(String[] args) {

        System.out.println("---------- Method Declaration vs Definition ----------");

        // Declaration example (interface style) simulated in comments
        System.out.println("Declaration: int add(int a, int b); // only signature, no body");

        // Definition example
        System.out.println("Definition: int add(int a, int b) { return a + b; }");

        // Using actual method
        int sum = add(10, 20);
        System.out.println("Using defined method add(10,20) = " + sum);

        // Demonstrating overloading (multiple declarations with definitions)
        System.out.println("Overloaded method add(10,20,30) = " + add(10, 20, 30));
    }

    // ---------- Method Definition ----------
    static int add(int a, int b) { // definition with body
        return a + b;
    }

    // ---------- Overloaded Method Definition ----------
    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

/*
Output:
---------- Method Declaration vs Definition ----------
Declaration: int add(int a, int b); // only signature, no body
Definition: int add(int a, int b) { return a + b; }
Using defined method add(10,20) = 30
Overloaded method add(10,20,30) = 60
*/

