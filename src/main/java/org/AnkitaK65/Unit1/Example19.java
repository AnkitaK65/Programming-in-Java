package org.AnkitaK65.Unit1;

// Example19: Switch Case Statement in Java

/*
1. Switch statement:
    - Allows multi-way branching based on the value of a variable or expression.
    - Often used when you have multiple discrete values to compare.

2. Syntax:
    switch(expression) {
        case value1:
            // statements
            break;
        case value2:
            // statements
            break;
        ...
        default:
            // statements
    }

3. Important Points:
    - Expression must return a value of type: byte, short, int, char, String, or enum.
    - Each case should end with a 'break' to prevent fall-through (optional if fall-through is desired).
    - default case is optional but recommended for unmatched values.
    - Multiple cases can share the same block by omitting the break between them.

4. Best Practices:
    - Use switch for discrete known values instead of multiple if-else-if.
    - Always include default to handle unexpected values.
    - Avoid complex expressions inside switch; keep it simple and readable.
*/

class Example19 {
    public static void main(String[] args) {

        int day = 4;

        // ---------- 1. Basic switch-case ----------
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // ---------- 2. Multiple cases sharing same block ----------
        char grade = 'B';
        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("You passed");
                break;
            case 'D':
            case 'F':
                System.out.println("You failed");
                break;
            default:
                System.out.println("Invalid grade");
        }

        // ---------- 3. Switch with String ----------
        String fruit = "Apple";
        switch (fruit) {
            case "Apple":
                System.out.println("Fruit is Apple");
                break;
            case "Banana":
                System.out.println("Fruit is Banana");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}

/*
Output:
Thursday
You passed
Fruit is Apple
*/