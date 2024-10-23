import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class slip8 {
    
    public static void main(String[] args) {
        
        JFrame f = new JFrame("MOUSE EVENT HANDELER");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,750);
        JTextField area = new JTextField();
        area.setEditable(false);
        area.setPreferredSize(new Dimension(150, 30));
        JPanel pl = new JPanel();
        pl.setBackground(Color.gray);
        pl.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                area.setText("click at "+e.getX()+" "+e.getY());
            }
        });

        pl.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e){
                f.setTitle("Mouse Moved: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        pl.addMouseMotionListener(new MouseAdapter(){
            
        });

        f.add(pl, BorderLayout.CENTER);
        f.add(area,BorderLayout.SOUTH);

        f.setVisible(true);
    }

}
