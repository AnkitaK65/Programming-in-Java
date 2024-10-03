package org.AnkitaK65.chapter6.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// The AdapterExample class demonstrates MouseAdapter, KeyAdapter, and WindowAdapter

//Adapter Classes are abstract classes that provide default (empty) implementations
// for listener interfaces.
public class AdapterExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Adapter Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create a JLabel to show mouse events
        JLabel mouseLabel = new JLabel("Mouse Events");
        mouseLabel.setPreferredSize(new Dimension(350, 50));
        mouseLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        frame.add(mouseLabel);

        // Create a JTextField to show key events
        JTextField keyTextField = new JTextField(15);
        keyTextField.setPreferredSize(new Dimension(350, 50));
        frame.add(keyTextField);

        // Create a JPanel for window events
        JPanel windowPanel = new JPanel();
        windowPanel.setPreferredSize(new Dimension(350, 50));
        windowPanel.setBorder(BorderFactory.createTitledBorder("Window Events"));
        frame.add(windowPanel);

        // Add MouseAdapter to the JLabel
        mouseLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                mouseLabel.setBackground(Color.LIGHT_GRAY);
                mouseLabel.setOpaque(true); // Make the background visible
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseLabel.setBackground(Color.WHITE);
            }
        });

        // Add KeyAdapter to the JTextField
        keyTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released: " + e.getKeyChar());
            }
        });

        // Add WindowAdapter to the JFrame
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }
        });

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
