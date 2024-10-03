package org.AnkitaK65.chapter6.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

// Implementing Runnable for thread-based animation
public class AnimationApplet extends Applet implements Runnable {
    private int x = 50; // Initial x-coordinate of the rectangle
    private int direction = 1; // Direction of movement (1 for right, -1 for left)
    private Thread animator; // Thread for running the animation
    private final int WIDTH = 400; // Width of the applet

    @Override
    public void init() {
        // Set the background color of the applet
        setBackground(Color.WHITE);
        // Start the animation thread
        animator = new Thread(this);
        animator.start();
    }

    @Override
    public void run() {
        while (true) {
            // Update the x-coordinate for animation
            x += direction * 5; // Move the rectangle by 5 pixels

            // Change direction when hitting the borders
            if (x > WIDTH - 50 || x < 0) {
                direction = -direction; // Reverse direction
            }

            // Repaint the applet to update the position of the rectangle
            repaint();

            // Sleep for a while to control the animation speed
            try {
                Thread.sleep(50); // Delay for 50 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        // Draw the moving rectangle
        g.setColor(Color.BLUE);
        g.fillRect(x, 100, 50, 50); // Draws a rectangle at (x, 100) with width and height of 50
    }

    @Override
    public void stop() {
        // Stop the animator thread when the applet is stopped
        animator = null;
    }
}
