/*
 * Q29. Create a multi-file program where in one file a string message is taken as input from the user,
 * and the function to display the message on the screen is given in another file (make use of the Scanner package in this program).
 */

package org.AnkitaK65.lab.multifile;

public class MessageDisplay {
    // Function to display the message passed from the MessageInput class
    public void displayMessage(String message) {
        System.out.println("Your message is: " + message);
    }
}
