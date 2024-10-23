import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame f = new JFrame("Java Swing Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450, 550);
        
        // Set FlowLayout for the frame
        f.setLayout(new FlowLayout());

        // Create buttons
        JButton b = new JButton("HELLO");
        JButton c = new JButton("HELLO");
        JButton d = new JButton("HELLO");
        JButton e = new JButton("HELLO");
        
        // Set preferred size for the buttons
        b.setPreferredSize(new Dimension(100, 100));
        c.setPreferredSize(new Dimension(100, 100));
        d.setPreferredSize(new Dimension(100, 100));
        e.setPreferredSize(new Dimension(100, 100));

        // Add buttons to the frame
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(e);
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(e);
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(e);

        // Set the frame's visibility to true
        f.setVisible(true);
    }
}
