package org.AnkitaK65.Unit1;

// Example17: Comments in Java

/*
1. Comments in Java are ignored by the compiler and are used for documentation and readability.
2. Types of Comments:
    a) Single-line comment
        - Use: Short explanation for a line or part of a line
    b) Multi-line comment    
        - Use: Longer explanations, temporarily disable code
        - Can span multiple lines
    c) Documentation comment (Javadoc)
        - Use: Generate HTML documentation using `javadoc` tool
        - Can include tags like @param, @return, @author
3. Best Practices:
    - Use comments to explain **why**, not **what** (code should be self-explanatory)
    - Avoid over-commenting trivial code
    - Update comments if code changes
*/

class Example17 {
    public static void main(String[] args) {

        // ---------- 1. Single-line Comment ----------
        // This is a single-line comment
        // Used for brief explanations
        int a = 10; // inline comment explaining the variable

        System.out.println("Value of a = " + a);

        /* ---------- 2. Multi-line Comment ----------
            This is a multi-line comment
            Used to explain code that spans multiple lines
            Can also be used to temporarily disable a block of code
        */
        int b = 20;
        int sum = a + b;
        System.out.println("Sum of a and b = " + sum);

        /** ---------- 3. Documentation Comment (Javadoc) ----------
            * Used to generate HTML documentation using javadoc tool
            * Placed above classes, methods, or fields
            * Can include @param, @return, @author, etc.
        */
        System.out.println("This demonstrates Javadoc style comment");
    }
}

/*
Output:
Value of a = 10
Sum of a and b = 30
This demonstrates Javadoc style comment
*/
