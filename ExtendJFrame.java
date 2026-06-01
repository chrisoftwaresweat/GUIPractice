import javax.swing.*;
import java.awt.*;

public class ExtendJFrame extends JFrame {
    ImageIcon image = new ImageIcon("rex.jpg"); //create image icon

    //child class frame: a similar frame like the main class
    ExtendJFrame(){
        this.setVisible(true); //make frame visible
        this.setIconImage(image.getImage()); //customizes the image icon
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when exited
        this.setSize(550, 550); //fixed frame size; square
        this.setTitle("JFrame Practice"); //title
        this.setResizable(false); //prevents the user on resizing the frame
        this.getContentPane().setBackground(Color.DARK_GRAY); //changes the bg color
    }
}
