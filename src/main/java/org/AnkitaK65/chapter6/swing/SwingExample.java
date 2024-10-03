package org.AnkitaK65.chapter6.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The SwingExample class demonstrates a basic Swing application
public class SwingExample {
    public static void main(String[] args) {
        // Create a new JFrame (window) with a title
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit application on close
        frame.setSize(1300, 200); // Set the size of the window

        // Create a JPanel to hold the button
        JPanel panel = new JPanel();

        // Create a button and add action listener to it
        JButton button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show a message dialog when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
