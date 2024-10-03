package org.AnkitaK65.chapter6.applet;

import java.applet.Applet;
import java.awt.Graphics;

/*
   <applet code="Example1_AppletBasics" width=300 height=300>
   </applet>
*/

public class Example1_AppletBasics extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Welcome to Applet!", 50, 150);
    }
}
