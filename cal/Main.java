
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements ActionListener{

    JFrame frame;
    JTextField textArea;
    JPanel panel;
    JButton btn[] = new JButton[10];
    JButton funcBtn[] = new JButton[8];
    JButton addButton,subButton,mulButton,divButton;
    JButton delButton,equButton,clrButton,decButton;
    Main(){
        frame = new JFrame("Calculater");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,550);
        textArea = new JTextField("ksfklkfmkldsnm");
        textArea.setBounds(10,25, 300, 50);
        
        textArea.setEditable(false);



        frame.add(textArea);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Main Cal = new Main();
    }

    public void actionPerformed(ActionEvent e){

    }

}