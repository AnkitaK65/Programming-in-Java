package org.AnkitaK65.chapter6.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// The ListenerExample class demonstrates various listener interfaces in Swing
//Listener interfaces in Java are used to handle various events.
public class ListenerExample {
    public static void main(String[] args) {
        // Create a JFrame with the title "Listener Example"
        JFrame frame = new JFrame("Listener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create a JButton and add an ActionListener
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Create a JCheckBox and add an ItemListener
        JCheckBox checkBox = new JCheckBox("Check Me");
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (checkBox.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Checkbox Checked!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Checkbox Unchecked!");
                }
            }
        });

        // Create a JTextField and add a KeyListener
        //When a key is pressed or released, the character is printed to the console.
        JTextField textField = new JTextField(15);
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released: " + e.getKeyChar());
            }
        });

        // Create a JPanel and add MouseListener
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 100));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(Color.LIGHT_GRAY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(Color.WHITE);
            }
        });

        // Add components to the frame
        frame.add(button);
        frame.add(checkBox);
        frame.add(textField);
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
