package org.AnkitaK65.Unit1;

// Example13: Ternary Operator in Java
// Demonstrates simple ternary and nested ternary operator usage

// Notes:
// Ternary operator (?:) is a short form of if-else
// It is the only operator that works on three operands
// Nested ternary means using one ternary inside another
// Use nested ternary carefully as it may reduce readability


class Example13 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 15;

        // ---------- SIMPLE TERNARY OPERATOR ----------
        // Syntax: condition ? true_expression : false_expression

        int maxTwo = (a > b) ? a : b;
        System.out.println("Maximum of a and b = " + maxTwo);

        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + result);

        int age = 17;
        String status = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(status);

        // ---------- NESTED TERNARY OPERATOR ----------
        // Used when multiple conditions are required

        // Find maximum of three numbers
        int maxThree = (a > b) ? ((a > c) ? a : c)
                                : ((b > c) ? b : c);
        System.out.println("Maximum of a, b and c = " + maxThree);

        // Grade calculation using nested ternary
        int marks = 72;
        String grade = (marks >= 90) ? "A"
                        : (marks >= 75) ? "B"
                        : (marks >= 60) ? "C"
                        : "D";
        System.out.println("Grade = " + grade);
    }
}

/*
Output:
Maximum of a and b = 20
Number is Odd
Not eligible to vote
Maximum of a, b and c = 20
Grade = C
*/