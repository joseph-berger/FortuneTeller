import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class FortuneTellerViewer {
    public static void main(String[] args) {
        // Create an array list of fortunes
        ArrayList<String> fortunes = new ArrayList<>();
        fortunes.add("You will find a hidden treasure.");
        fortunes.add("A surprise awaits you tomorrow.");
        fortunes.add("You will make a new friend soon.");
        fortunes.add("Expect great things to happen.");
        fortunes.add("A journey will bring you good fortune.");
        fortunes.add("You will receive unexpected news.");
        fortunes.add("Happiness will find you soon.");
        fortunes.add("Your creativity will bring you success.");
        fortunes.add("A lucky opportunity is coming your way.");
        fortunes.add("You will overcome a challenge with ease.");
        fortunes.add("A new romance will blossom in your life.");
        fortunes.add("Good luck will follow you today.");

        FortuneTellerFrame fortuneTellerFrame = new FortuneTellerFrame(fortunes);
        fortuneTellerFrame.setSize((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() * 0.75), 400);
        fortuneTellerFrame.setLocationRelativeTo(null); // Center the frame
        fortuneTellerFrame.setVisible(true);
    }
}
