package org.AnkitaK65.chapter6.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIComponentsExample extends JFrame implements ActionListener {

    // Declaring the components
    private JLabel label;
    private JTextField textField;
    private JTextArea textArea;
    private JCheckBox checkBox1, checkBox2;
    private JRadioButton radioButton1, radioButton2;
    private JComboBox<String> comboBox;
    private JButton button;

    public GUIComponentsExample() {
        // Set the title and layout of the JFrame
        setTitle("Java GUI Components Example");
        setLayout(new FlowLayout());
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize and add a JLabel
        label = new JLabel("Enter text: ");
        add(label);

        // Initialize and add a JTextField
        textField = new JTextField(20);
        add(textField);

        // Initialize and add a JTextArea with a scroll pane
        textArea = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        // Initialize and add JCheckBox components
        checkBox1 = new JCheckBox("Option 1");
        checkBox2 = new JCheckBox("Option 2");
        add(checkBox1);
        add(checkBox2);

        // Initialize and add JRadioButton components with a ButtonGroup
        radioButton1 = new JRadioButton("Choice A");
        radioButton2 = new JRadioButton("Choice B");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        add(radioButton1);
        add(radioButton2);

        // Initialize and add JComboBox (Dropdown menu)
        String[] options = {"Select an option", "Option 1", "Option 2", "Option 3"};
        comboBox = new JComboBox<>(options);
        add(comboBox);

        // Initialize and add a JButton
        button = new JButton("Submit");
        button.addActionListener(this);
        add(button);

        // Creating a JMenuBar with menus and menu items
        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));  // Add action to exit menu item
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();  // Adds a separator line
        fileMenu.add(exitItem);

        // Edit Menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Adding menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar to the frame
        setJMenuBar(menuBar);

        // Make the JFrame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the text from the text field and append it to the text area
        String inputText = textField.getText();
        textArea.append("Input Text: " + inputText + "\n");

        // Check which checkboxes are selected
        if (checkBox1.isSelected()) {
            textArea.append("Option 1 selected\n");
        }
        if (checkBox2.isSelected()) {
            textArea.append("Option 2 selected\n");
        }

        // Check which radio button is selected
        if (radioButton1.isSelected()) {
            textArea.append("Choice A selected\n");
        } else if (radioButton2.isSelected()) {
            textArea.append("Choice B selected\n");
        }

        // Display selected item from the JComboBox
        String selectedOption = (String) comboBox.getSelectedItem();
        textArea.append("Selected ComboBox Option: " + selectedOption + "\n");

        // Clear the text field for new input
        textField.setText("");
    }

    public static void main(String[] args) {
        // Run the GUI application
        new GUIComponentsExample();
    }
}
