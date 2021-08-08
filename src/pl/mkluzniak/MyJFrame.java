package pl.mkluzniak;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

MyJFrame(){


    this.setTitle("JFrame title goes here"); //sets title of frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
    this.setResizable(false); //prevent frame from being resized
    this.setSize(420,420); //sets the x-dimension, and y-dimension of frame
    this.setVisible(true); //make frame visible

    ImageIcon image = new ImageIcon("s-l400.jpg"); //create an ImageIcon
    this.setIconImage(image.getImage()); //change icon of frame
    this.getContentPane().setBackground(new Color(0x123456)); //change color of background




}


}
