/*
 * Q29. Create a multi-file program where in one file a string message is taken as input from the user,
 * and the function to display the message on the screen is given in another file (make use of the Scanner package in this program).
 */

package org.AnkitaK65.lab.multifile;

import java.util.Scanner;

public class MultiLineMessageInput {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(); // To store multiline input

        System.out.println("Please enter a message (type 'exit' to finish):");

        // Loop to take multiple lines of input
        while (true) {
            String line = scanner.nextLine();

            // Check if the user types 'exit' to stop input
            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            // Add the current line to the message
            message.append(line).append("\n");
        }

        // Create an instance of the MessageDisplay class
        MessageDisplay display = new MessageDisplay();

        // Pass the message to the displayMessage function to show it
        display.displayMessage(message.toString());

        // Close the scanner
        scanner.close();
    }
}

//Output:
//Please enter a message (type 'exit' to finish):
//This is a multiline
//message that spans
//several lines.
//It's for testing purposes.
//exit
//Your message is: This is a multiline
//message that spans
//several lines.
//It's for testing purposes.