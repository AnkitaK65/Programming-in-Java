package org.AnkitaK65.Unit1;

// Example20: Loops in Java and Jump Statements – break, continue

/*
1. Loops are used to execute a block of code repeatedly as long as a condition is true.

2. Types of loops in Java:
    a) for loop:
        - Best when the number of iterations is known.
        - Syntax: for(initialization; condition; update) { statements }
    b) while loop:
        - Best when the number of iterations is unknown; executes while condition is true.
        - Syntax: while(condition) { statements }
    c) do-while loop:
        - Executes the block at least once and then checks the condition.
        - Syntax: do { statements } while(condition);

3. Key Points:
    - Loops can be nested.
    - Use break to exit loop early.
    - Use continue to skip the current iteration.
    - Infinite loops occur if the exit condition is never met.
        - Example: while(true) { ... } // infinite unless break used
    - Avoid complex conditions; keep loops readable.

4. Nested loops: loop inside another loop
    - Used for patterns, matrices, tables
*/

class Example20 {
    public static void main(String[] args) {

        // ---------- 1. for loop ----------
        System.out.println("For loop example:");
        for (int i = 1; i <= 5; i++) { // loops 5 times
            System.out.println("i = " + i);
        }

        // ---------- 2. while loop ----------
        System.out.println("\nWhile loop example:");
        int j = 1;
        while (j <= 5) { // loops 5 times
            System.out.println("j = " + j);
            j++;
        }

        // ---------- 3. do-while loop ----------
        System.out.println("\nDo-while loop example:");
        int k = 1;
        do { // executes at least once
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        // ---------- 4. Nested loop ----------
        System.out.println("\nNested loop example:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ---------- 5. Using break and continue ----------
        System.out.println("\nBreak and continue example:");
        for (int n = 1; n <= 10; n++) {
            if (n == 7) {
                break; // exit loop
            }
            if (n % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println("n = " + n);
        }
    }
}

/*
Output:
For loop example:
i = 1
i = 2
i = 3
i = 4
i = 5

While loop example:
j = 1
j = 2
j = 3
j = 4
j = 5

Do-while loop example:
k = 1
k = 2
k = 3
k = 4
k = 5

Nested loop example:
* * * 
* * * 
* * * 

Break and continue example:
n = 1
n = 3
n = 5
*/

