import java.awt.*;
import javax.swing.*;

public class Flow{
    public static void main(String[] args){
        JFrame f = new JFrame("HELLO");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        JLabel lab = new JLabel("BTN-1");
        JButton btn = new JButton("1");
        btn.setPreferredSize(new Dimension(100, 50));
        JLabel lab2 = new JLabel("BTN-2");
        JButton btn2 = new JButton("2");
        JLabel lab3 = new JLabel("BTN-3");
        JButton btn3 = new JButton("3");
        f.add(lab);
        f.add(btn);
        f.add(lab2);
        f.add(btn2);
        f.add(lab3);
        f.add(btn3);

        f.setVisible(true);
    }
}