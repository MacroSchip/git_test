package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame(); //creation of window GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //for close function
        frame.setResizable(false); //makes screen size unchangeable
        Image icon = Toolkit.getDefaultToolkit().getImage("assets\\logo.png");//creates image for window icon
        GamePanel panel = new GamePanel(); //gamepanel object creation

        frame.setTitle("MITO: Adventure Quest"); //sets window title
        frame.setIconImage(icon); //assigning image to window icon

        frame.add(panel); //adds gamepanel object to the window gui
        frame.pack(); //packs the window to fit the preferred size indicated in the gamepanel class
        frame.setLocationRelativeTo(null); //displays the window at the center of the screen
        frame.setVisible(true);// make window visible
        panel.startGameThread();// start game time or game clock

    }
}