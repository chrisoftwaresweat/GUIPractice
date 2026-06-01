import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        /*
        just uncomment this to check if both frames are similar
        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("rex.jpg"); //create image icon

        frame.setVisible(true); //make frame visible
        frame.setIconImage(image.getImage()); //customizes the image icon
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when exited
        frame.setSize(550, 550); //fixed frame size; square
        frame.setTitle("JFrame Practice"); //title
        frame.setResizable(false); //prevents the user on resizing the frame
        frame.getContentPane().setBackground(Color.DARK_GRAY); //changes the bg color
         */

        //let's call the child class
        new ExtendJFrame(); //do this if you're simply calling it
    }
}