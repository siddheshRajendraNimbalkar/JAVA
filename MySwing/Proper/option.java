import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class option {
    public static void main(String[] args) {
        JFrame f = new JFrame("RADIO BUTTON");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,200);
        f.setLayout(new FlowLayout());
        
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("op1");
        comboBox.addItem("op2");
        comboBox.addItem("op3");

        comboBox.addActionListener(new ActionListener() {
            public void  actionPerformed(ActionEvent e){
                String str =(String) comboBox.getSelectedItem();
                System.out.println(str);
            }
        });

        f.add(comboBox);

        f.setVisible(true);
    }
}
