import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class check {
    public static void main(String[] args) {
        JFrame f = new JFrame("RADIO BUTTON");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,200);
        f.setLayout(new FlowLayout());

        JCheckBox box = new JCheckBox("box1");

        box.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Option 2: " + box.isSelected());
            }
        });

        f.add(box);
        f.setVisible(true);
    }
}
