import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class combo {
    public static void main(String[] args) {
        StringBuilder Option = new StringBuilder();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,400);
        f.setLayout(new FlowLayout());
        JPanel p1 = new JPanel(new GridLayout(2,1));
        JPanel p2 = new JPanel(new GridLayout(4,3));
        p1.setPreferredSize(new Dimension(450,100));
        p2.setPreferredSize(new Dimension(450,300));
        JLabel lab = new JLabel("HELLO");
        JTextField are = new JTextField();
        p1.add(lab);
        p1.add(are);
        p1.setBackground(Color.red);
        p2.setBackground(Color.blue);

        

        for (int i = 1; i <= 12; i++) {
            JButton button = new JButton("Button " + i);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println(e.getActionCommand() + " clicked");
                    Option.append(e.getActionCommand());
                    are.setText(Option.toString());
                    System.out.println(String.valueOf(Option));
                }
            });
            p2.add(button);
        }

        f.add(p1);
        f.add(p2);
        

        f.setVisible(true);
    }
}
