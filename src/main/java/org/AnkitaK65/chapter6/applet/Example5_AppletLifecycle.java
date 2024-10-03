package org.AnkitaK65.chapter6.applet;

import java.applet.Applet;
import java.awt.Graphics;

/*
   <applet code="Example5_AppletLifecycle" width=300 height=300>
   </applet>
*/

public class Example5_AppletLifecycle extends Applet {

    // Called when the applet is loaded into the browser
    public void init() {
        System.out.println("Applet initialized!");
    }

    // Called each time the applet starts or becomes active
    public void start() {
        System.out.println("Applet started!");
    }

    // Called when the applet is stopped or becomes inactive
    public void stop() {
        System.out.println("Applet stopped!");
    }

    // Called when the applet is about to be destroyed
    public void destroy() {
        System.out.println("Applet destroyed!");
    }

    // Paint method to display lifecycle messages on the screen
    public void paint(Graphics g) {
        g.drawString("Applet Lifecycle Demo", 50, 150);
    }
}
