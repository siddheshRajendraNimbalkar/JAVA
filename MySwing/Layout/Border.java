import java.awt.*;
import javax.swing.*;

public class Border {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BORDER LAYOUT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(550, 550);
        frame.setVisible(true);

        // Create panels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel(new GridLayout(5, 3, 5, 5));

        // Set properties for panel1
        panel1.setBackground(Color.red);
        panel1.setPreferredSize(new Dimension(450, 50));

        // Create a TextField and set its size
        TextField text = new TextField();
        text.setPreferredSize(new Dimension(450, 50));

        // Add text field to panel1
        panel1.add(text);

        // Add panel1 to the frame
        frame.add(panel1, BorderLayout.NORTH);

        // Set properties for panel2
        panel2.setBackground(Color.blue);

        // Create buttons
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn0 = new JButton("0");
        JButton fun = new JButton(".");
        JButton funA = new JButton("+");
        JButton funS = new JButton("-");
        JButton funM = new JButton("*");
        JButton funE = new JButton("=");
        JButton funD = new JButton("/");

        // Add buttons to panel2 in the grid layout
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btn0);
        panel2.add(fun);
        panel2.add(funA);
        panel2.add(funS);
        panel2.add(funM);
        panel2.add(funE);
        panel2.add(funD);

        // Add panel2 to the frame
        frame.add(panel2, BorderLayout.CENTER);
    }
}
