package org.AnkitaK65.chapter6.swing;

import javax.swing.*;
import java.awt.*;

// The SwingLayoutExample class demonstrates various Swing layout managers
public class SwingLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame with the title "Swing Layout Managers"
        JFrame frame = new JFrame("Swing Layout Managers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create a JTabbedPane to hold different layout examples
        JTabbedPane tabbedPane = new JTabbedPane();

        // Add panels demonstrating different layout managers
        tabbedPane.addTab("FlowLayout", createFlowLayoutPanel());
        tabbedPane.addTab("BorderLayout", createBorderLayoutPanel());
        tabbedPane.addTab("GridLayout", createGridLayoutPanel());
        tabbedPane.addTab("BoxLayout", createBoxLayoutPanel());
        tabbedPane.addTab("GridBagLayout", createGridBagLayoutPanel());

        // Add the tabbedPane to the frame
        frame.add(tabbedPane);
        frame.setVisible(true);
    }

    // Method to create a panel using FlowLayout
    private static JPanel createFlowLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // Set layout manager to FlowLayout

        // Add some buttons to the panel
        for (int i = 1; i <= 5; i++) {
            panel.add(new JButton("Button " + i));
        }
        return panel;
    }

    // Method to create a panel using BorderLayout
    private static JPanel createBorderLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout()); // Set layout manager to BorderLayout

        // Add components to different regions of BorderLayout
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);
        panel.add(new JButton("East"), BorderLayout.EAST);
        panel.add(new JButton("West"), BorderLayout.WEST);
        panel.add(new JButton("Center"), BorderLayout.CENTER);

        return panel;
    }

    // Method to create a panel using GridLayout
    private static JPanel createGridLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2)); // Set layout manager to GridLayout (3 rows, 2 columns)

        // Add buttons to the GridLayout panel
        for (int i = 1; i <= 6; i++) {
            panel.add(new JButton("Button " + i));
        }
        return panel;
    }

    // Method to create a panel using BoxLayout
    private static JPanel createBoxLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Set layout manager to BoxLayout (Y_AXIS)

        // Add buttons to the BoxLayout panel
        for (int i = 1; i <= 5; i++) {
            panel.add(new JButton("Button " + i));
            panel.add(Box.createRigidArea(new Dimension(0, 5))); // Add space between buttons
        }
        return panel;
    }

    // Method to create a panel using GridBagLayout
    private static JPanel createGridBagLayoutPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // Set layout manager to GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();

        // Add buttons to the GridBagLayout panel with different constraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JButton("Button 1"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JButton("Button 2"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(new JButton("Button 3"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        panel.add(new JButton("Button 4"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(new JButton("Button 5"), gbc);

        return panel;
    }
}
