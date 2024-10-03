package org.AnkitaK65.chapter6.applet;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
   <applet code="Example4_MouseEventDemo" width=300 height=300>
   </applet>
*/

public class Example4_MouseEventDemo extends Applet implements MouseListener {
    String msg = "";

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        msg = "Mouse clicked!";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "Mouse entered!";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "Mouse exited!";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        msg = "Mouse pressed!";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        msg = "Mouse released!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 150);
    }
}
