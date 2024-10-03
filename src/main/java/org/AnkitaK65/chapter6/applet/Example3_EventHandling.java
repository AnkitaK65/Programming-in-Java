package org.AnkitaK65.chapter6.applet;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
   <applet code="Example3_EventHandling" width=300 height=300>
   </applet>
*/

//Basic Event Handling (Button Click)
public class Example3_EventHandling extends Applet implements ActionListener {
    Button btnClickMe;
    String msg = "";

    public void init() {
        btnClickMe = new Button("Click Me!");
        add(btnClickMe);
        btnClickMe.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        msg = "Button was clicked!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 150);
    }
}
