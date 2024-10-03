package org.AnkitaK65.chapter6.applet;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SoundApplet extends Applet implements ActionListener {
    private AudioClip sound; // Variable to hold the audio clip
    private Button playButton; // Button to play the sound
    private Button stopButton; // Button to stop the sound

    @Override
    public void init() {
        // Load the sound file from the URL specified in the HTML
        sound = getAudioClip(getCodeBase(), "sound.wav"); // Replace with your sound file name

        // Create buttons to control the sound
        playButton = new Button("Play Sound");
        stopButton = new Button("Stop Sound");

        // Add action listeners to buttons
        playButton.addActionListener(this);
        stopButton.addActionListener(this);

        // Add buttons to the applet
        add(playButton);
        add(stopButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Determine which button was clicked
        if (e.getSource() == playButton) {
            sound.play(); // Play the sound
        } else if (e.getSource() == stopButton) {
            sound.stop(); // Stop the sound
        }
    }
}
