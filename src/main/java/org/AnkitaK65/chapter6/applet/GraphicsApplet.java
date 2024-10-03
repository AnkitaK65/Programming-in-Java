package org.AnkitaK65.chapter6.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*
   <applet code="GraphicsApplet" width=400 height=400>
   </applet>
*/

public class GraphicsApplet extends Applet {

    // The paint method is overridden to handle all drawing operations
    @Override
    public void paint(Graphics g) {
        // Set the color to blue and draw a rectangle
        g.setColor(Color.BLUE);
        // Draws a rectangle with top-left corner at (50, 50) and dimensions 100x100
        g.drawRect(50, 50, 100, 100);

        // Set the color to red and draw a filled oval
        g.setColor(Color.RED);
        // Fills an oval inside a rectangle with top-left corner at (200, 50) and dimensions 100x100
        g.fillOval(200, 50, 100, 100);

        // Set the color to green and draw a line
        g.setColor(Color.GREEN);
        // Draws a line from point (50, 200) to (300, 200)
        g.drawLine(50, 200, 300, 200);

        // Set a specific font for drawing text
        Font customFont = new Font("Arial", Font.BOLD, 24);
        // Set the current font to the custom font
        g.setFont(customFont);

        // Set the color to black and draw a string (text)
        g.setColor(Color.BLACK);
        // Draws the string at position (50, 300)
        g.drawString("Drawing Shapes in Applet!", 50, 300);

        // Fill a small rectangle with the default color (current color is black)
        // Fills a rectangle at (170, 100) with width and height 30x30
        g.fillRect(170, 100, 30, 30);

        // Draw an oval with the current color (black)
        // Draws an oval inside a bounding box at (70, 200) with dimensions 30x30
        g.drawOval(70, 200, 30, 30);

        // Draw an arc with the current color (black)
        // Starts at angle 30 degrees and spans 27 degrees, with the arc inside a rectangle of size 30x30
        // Draws a part of an oval (arc)
        g.drawArc(90, 150, 30, 30, 30, 27);
    }
}
