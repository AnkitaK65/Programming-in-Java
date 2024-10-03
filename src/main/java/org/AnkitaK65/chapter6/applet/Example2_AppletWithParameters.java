package org.AnkitaK65.chapter6.applet;

import java.applet.Applet;
import java.awt.Graphics;

/*
   <applet code="Example2_AppletWithParameters" width=300 height=300>
   <param name="message" value="This is a parameterized applet!" />
   </applet>
*/

public class Example2_AppletWithParameters extends Applet {
    String message;

    public void init() {
        message = getParameter("message");
        if (message == null) {
            message = "No parameter found!";
        }
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 150);
    }
}

//This applet accepts parameters from the HTML file.
