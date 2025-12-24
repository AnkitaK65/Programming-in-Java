package org.AnkitaK65.Unit1;

// Example21: Methods in Java

/*
1. Method: A block of code that performs a specific task and can be reused.

2. Syntax:
    returnType methodName(parameters) {
        // statements
    }

3. Types of Methods:

    a) Void method:
        - Does not return any value.
        - Example: void greet() { ... }

    b) Parameterized method:
        - Accepts input parameters.
        - Example: void greet(String name) { ... }

    c) Return type method:
        - Returns a value of specified type.
        - Example: int sum(int a, int b) { return a+b; }

    d) Recursive method:
        - A method that calls itself.
        - Used for factorial, fibonacci, etc.

    e) Method overloading:
        - Multiple methods with same name but different parameters.
        - Compile-time polymorphism
            - The method to be executed is determined at compile time, not at runtime.
            - Also called static polymorphism.

4. Rules:
    - Method name should follow identifier rules.
        -> Identifier rules in Java: 
        Names of variables, methods, or classes must start with 
        a letter, _, or $, cannot be a keyword, and are case-sensitive.
    - Can be called from main or other methods.
    - Return type must match returned value.
*/

class Example21 {

    public static void main(String[] args) {

        System.out.println("---------- 1. Void Method ----------");
        greet(); // call void method

        System.out.println("\n---------- 2. Parameterized Method ----------");
        greetUser("Ankita");

        System.out.println("\n---------- 3. Return Type Method ----------");
        int result = add(10, 20);
        System.out.println("Sum of 10 and 20 = " + result);

        System.out.println("\n---------- 4. Recursive Method ----------");
        int factorialOf5 = factorial(5);
        System.out.println("Factorial of 5 = " + factorialOf5);

        System.out.println("\n---------- 5. Method Overloading ----------");
        System.out.println("Sum of 5 and 10 = " + add(5, 10));
        System.out.println("Sum of 2.5 and 3.5 = " + add(2.5, 3.5));
    }

    // ---------- Void Method ----------
    static void greet() {
        System.out.println("Hello! Welcome to Java Methods");
    }

    // ---------- Parameterized Method ----------
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // ---------- Return Type Method ----------
    static int add(int a, int b) {
        return a + b;
    }

    // ---------- Recursive Method ----------
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // ---------- Method Overloading ----------
    static int add(int a, int b, int c) { // different parameters
        return a + b + c;
    }

    static double add(double a, double b) { // different parameter types
        return a + b;
    }
}

/*
Output:
---------- 1. Void Method ----------
Hello! Welcome to Java Methods

---------- 2. Parameterized Method ----------
Hello, Ankita!

---------- 3. Return Type Method ----------
Sum of 10 and 20 = 30

---------- 4. Recursive Method ----------
Factorial of 5 = 120

---------- 5. Method Overloading ----------
Sum of 5 and 10 = 15
Sum of 2.5 and 3.5 = 6.0
*/
