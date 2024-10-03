package org.AnkitaK65.chapter6.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Main class to demonstrate various inner classes
public class InnerClassExamples {

    // Static nested class (can be used without an instance of the outer class)
    static class StaticNestedClass implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Static Nested Class: Button clicked!");
        }
    }

    // Named inner class (non-static inner class)
    static class NamedInnerClass implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Named Inner Class: Button clicked!");
        }
    }

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Inner Class Examples");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Example 1: Using Static Nested Class
        JButton staticNestedButton = new JButton("Static Nested Class");
        staticNestedButton.addActionListener(new StaticNestedClass());
        frame.add(staticNestedButton);

        // Example 2: Using Named Inner Class
        JButton namedInnerClassButton = new JButton("Named Inner Class");
        InnerClassExamples outer = new InnerClassExamples();  // Create an instance of the outer class
        namedInnerClassButton.addActionListener(new NamedInnerClass());  // Instantiate and use the named inner class
        frame.add(namedInnerClassButton);

        // Example 3: Using Anonymous Inner Class
        JButton anonymousClassButton = new JButton("Anonymous Inner Class");
        anonymousClassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Anonymous Inner Class: Button clicked!");
            }
        });
        frame.add(anonymousClassButton);

        // Example 4: Using Local Inner Class inside a method
        JButton localInnerClassButton = new JButton("Local Inner Class");
        frame.add(localInnerClassButton);

        // Register the local inner class
        outer.registerLocalInnerClass(localInnerClassButton);

        // Display the frame
        frame.setVisible(true);
    }

    // Method that contains a local inner class
    public void registerLocalInnerClass(JButton button) {
        // Local inner class defined within a method
        class LocalInnerClass implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Local Inner Class: Button clicked!");
            }
        }
        // Add the local inner class as the event handler
        button.addActionListener(new LocalInnerClass());
    }
}
