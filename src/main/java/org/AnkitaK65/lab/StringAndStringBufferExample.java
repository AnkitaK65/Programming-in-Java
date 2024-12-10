package org.AnkitaK65.lab;

// Question 22: Write a program that demonstrates the working of different functions of
// the String and StringBuffer classes like setCharAt(), setLength(), append(), insert(),
// concat(), equals().

/*
 * String:
 * - A String in Java is an object that represents a sequence of characters.
 * - Strings are immutable in Java, meaning once a String object is created, it cannot be changed.
 * - Any operation that modifies a String will result in the creation of a new String object.
 *
 * StringBuffer:
 * - StringBuffer is a mutable sequence of characters.
 * - Unlike Strings, StringBuffer objects can be modified after they are created, allowing for more efficient string manipulations.
 * - It provides methods like append(), insert(), setCharAt(), and setLength() to manipulate the characters in the buffer.
 * - StringBuffer is not synchronized and is generally used in single-threaded environments for better performance.
 */

public class StringAndStringBufferExample {

    public static void main(String[] args) {

        // 1. String: concat() method
        String str1 = "Hello";
        String str2 = " World!";
        String str3 = str1.concat(str2); // Concatenates str1 and str2
        System.out.println("Concatenated String (concat()): " + str3);

        // 2. String: equals() method
        String str4 = "Hello World!";
        System.out.println("str3 equals str4? " + str3.equals(str4)); // Checks if str3 equals str4

        // 3. String: toLowerCase() method
        String str5 = "HELLO WORLD";
        System.out.println("String in lowercase: " + str5.toLowerCase()); // Converts string to lowercase

        // 4. String: toUpperCase() method
        System.out.println("String in uppercase: " + str5.toUpperCase()); // Converts string to uppercase

        // 5. String: substring() method
        String str6 = "Hello Beautiful World!";
        System.out.println("Substring (substring(6, 16)): " + str6.substring(6, 16)); // Extracts substring

        // 6. String: charAt() method
        System.out.println("Character at index 6: " + str6.charAt(6)); // Returns the character at the specified index

        // 7. StringBuffer: append() method
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" World!"); // Appends " World!" to sb1
        System.out.println("Appended StringBuffer (append()): " + sb1);

        // 8. StringBuffer: insert() method
        sb1.insert(6, " Beautiful"); // Inserts " Beautiful" at index 6
        System.out.println("StringBuffer after insert() at index 6: " + sb1);

        // 9. StringBuffer: setLength() method
        sb1.setLength(13); // Sets the length of the StringBuffer to 13, truncating extra characters
        System.out.println("StringBuffer after setLength(13): " + sb1);

        // 10. StringBuffer: setCharAt() method
        sb1.setCharAt(6, 'B'); // Sets the character at index 6 to 'B'
        System.out.println("StringBuffer after setCharAt(6, 'B'): " + sb1);

        // 11. StringBuffer: reverse() method
        sb1.reverse(); // Reverses the content of StringBuffer
        System.out.println("Reversed StringBuffer (reverse()): " + sb1);

        // 12. StringBuffer: delete() method
        sb1.delete(0, 6); // Deletes characters from index 0 to 6
        System.out.println("StringBuffer after delete(0, 6): " + sb1);

        // 13. StringBuffer: deleteCharAt() method
        sb1.deleteCharAt(0); // Deletes the character at index 0
        System.out.println("StringBuffer after deleteCharAt(0): " + sb1);

        // 14. StringBuffer: equals() method (not directly available for StringBuffer)
        // StringBuffer does not have a direct equals() method for comparing values,
        // but we can convert it to a String using toString() and then compare.
        StringBuffer sb2 = new StringBuffer("Hello Beautiful");
        System.out.println("sb1 equals sb2? " + sb1.toString().equals(sb2.toString())); // Converts to String and compares

        // 15. StringBuffer: capacity() method
        System.out.println("StringBuffer capacity: " + sb1.capacity()); // Returns the capacity of the StringBuffer
    }
}
//Output:
//Concatenated String (concat()): Hello World!
//str3 equals str4? true
//String in lowercase: hello world
//String in uppercase: HELLO WORLD
//Substring (substring(6, 16)): Beautiful
//Character at index 6: B
//Appended StringBuffer (append()): Hello World!
//StringBuffer after insert() at index 6: Hello  BeautifulWorld!
//StringBuffer after setLength(13): Hello  Beauti
//StringBuffer after setCharAt(6, 'B'): Hello BBeauti
//Reversed StringBuffer (reverse()): ituaeBB olleH
//StringBuffer after delete(0, 6): B olleH
//StringBuffer after deleteCharAt(0):  olleH
//sb1 equals sb2? false
//StringBuffer capacity: 44