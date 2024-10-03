package org.AnkitaK65.chapter6.applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

/*
   <applet code="ImageApplet" width=400 height=400>
   <param name="image" value="your_image.png">
   </applet>
*/

public class ImageApplet extends Applet {
    private Image image; // Variable to hold the image

    @Override
    public void init() {
        // Load the image from the URL specified in the HTML using the "image" parameter
        String imageUrl = getParameter("image");
        image = getImage(getCodeBase(), imageUrl);
    }

    @Override
    public void paint(Graphics g) {
        // Draw the image at coordinates (50, 50)
        if (image != null) {
            g.drawImage(image, 50, 50, this);
        } else {
            g.drawString("Image not found!", 50, 50);
        }
    }
}
