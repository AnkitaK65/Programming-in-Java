/*
 * Q29. Create a multi-file program where in one file a string message is taken as input from the user,
 * and the function to display the message on the screen is given in another file (make use of the Scanner package in this program).
 */

package org.AnkitaK65.lab.multifile;

import java.util.Scanner;

public class MessageInput {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a message
        System.out.println("Please enter a message:");

        // Take the user input and store it in a variable
        String message = scanner.nextLine();

        // Create an instance of the MessageDisplay class
        MessageDisplay display = new MessageDisplay();

        // Pass the message to the displayMessage function to show it
        display.displayMessage(message);

        // Close the scanner
        scanner.close();
    }
}

//Output:
//Please enter a message:
//Hello, Java World!
//Your message is: Hello, Java World!