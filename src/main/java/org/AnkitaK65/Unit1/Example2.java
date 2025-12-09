/*
Topic: Output in Java (print, println, printf)

Notes:
- System.out is used to display output on the screen in Java.
- print(): Prints text on the same line.
- println(): Prints text and then moves the cursor to the next line.
- printf(): Prints formatted output (like %d for integer, %f for float, %s for string etc.).
- All of them belong to Java's standard output stream.

Aim: To print output using print, println, and printf.

Algorithm:
1. Start program
2. Display text using different output statements
3. End
*/

package org.AnkitaK65.Unit1;

class Example2 {
    public static void main(String[] args) {

        // print(): prints on same line
        System.out.print("Hello ");

        // println(): prints and moves to next line
        System.out.println("World!");

        // printf(): formatted output
        System.out.printf("Number = %d", 10);
    }
}

/*
Output:
Hello World!
Number = 10
*/