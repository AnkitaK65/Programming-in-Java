package org.AnkitaK65.Unit1;

// Example18: Control Flow in Java

/*
Notes:
1. Control flow statements decide the execution path of a program.
2. Types of conditional statements:
    a) if statement:
        - Executes a block of code if the condition is true.
        - Syntax: if (condition) { statements }
    b) if-else statement:
        - Executes one block if condition is true, another if false.
        - Syntax: if (condition) { statements } else { statements }
    c) if-else-if ladder:
        - Tests multiple conditions in sequence.
        - Else block is optional
        - Syntax: if (condition1) { ... } else if (condition2) { ... } else { ... }
3. Condition must return a boolean value (true/false).
4. Blocks are enclosed in curly braces `{ }`. Single statements can omit braces.
5. Nested if:
    - if statement inside another if
    - Useful for multiple dependent conditions
6. Best Practices:
    - Use braces for clarity even for single statements.
    - Arrange conditions from most specific to least specific in if-else-if ladder.
*/

class Example18 {
    public static void main(String[] args) {

        int num = 75;

        // ---------- 1. Simple if statement ----------
        if (num > 50) {
            System.out.println("Number is greater than 50");
        }

        // ---------- 2. if-else statement ----------
        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // ---------- 3. if-else-if ladder ----------
        if (num >= 90) {
            System.out.println("Grade: A");
        } else if (num >= 75) {
            System.out.println("Grade: B");
        } else if (num >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        // ---------- 4. Nested if ----------
        int age = 20;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible: ID missing");
            }
        } else {
            System.out.println("Not eligible: Underage");
        }
    }
}

/*
Output:
Number is greater than 50
Number is odd
Grade: B
Eligible to vote
*/