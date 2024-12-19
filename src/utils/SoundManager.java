package utils; // Replace with your package name if applicable

import javax.sound.sampled.*;
import javax.swing.*;

public class SoundManager {

    private static Clip backgroundClip; // Used for background music

    // Private constructor to prevent instantiation
    private SoundManager() {
        throw new UnsupportedOperationException("Utility class");
    }

    // Method to play background music
    public static void playBackgroundMusic(String filePath) {
        try {
            if (backgroundClip != null && backgroundClip.isRunning()) {
                return; // Ensure only one instance of background music plays
            }
            backgroundClip = AudioSystem.getClip();
            // Use getResource() for accessing resources inside the JAR
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(
                    SoundManager.class.getResource(filePath)
            );
            backgroundClip.open(audioStream);
            backgroundClip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the music
            backgroundClip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error playing background music: " + ex.getMessage());
        }
    }

    // Method to stop background music
    public static void stopBackgroundMusic() {
        if (backgroundClip != null && backgroundClip.isRunning()) {
            backgroundClip.stop();
            backgroundClip.close();
        }
    }

    // Method to play sound effects
    public static void playSoundEffect(String filePath) {
        try {
            Clip clip = AudioSystem.getClip();
            // Use getResource() for accessing resources inside the JAR
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(
                    SoundManager.class.getResource(filePath)
            );
            clip.open(audioStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error playing sound effect: " + ex.getMessage());
        }
    }
}
