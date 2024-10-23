import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class radio {
    public static void main(String[] args) {
        JFrame f = new JFrame("RADIO BUTTON");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,200);
        f.setLayout(new FlowLayout());
        
        JRadioButton op1 = new JRadioButton("op1");
        JRadioButton op2 = new JRadioButton("op2");
        JRadioButton op3 = new JRadioButton("op3");

        ButtonGroup gb = new ButtonGroup();
        gb.add(op1);
        gb.add(op2);
        gb.add(op3);

        op1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("op1");
            }   
        });
        op2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.err.println("op2");
            }
        });
        op3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("op3");
            }
        });
        
        f.add(op1);
        f.add(op2);
        f.add(op3);


        f.setVisible(true);
    }
}