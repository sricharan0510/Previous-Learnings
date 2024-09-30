import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Mouse {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");

        JLabel label = new JLabel();
        label.setBounds(100,100,300,300);
        label.setBackground(Color.black);
        label.setOpaque(true);

        label.addMouseListener(new MouseListener(){
            public void mouseEntered(MouseEvent e){
                label.setBackground(Color.GREEN);
            }
            public void mouseExited(MouseEvent e){
                label.setBackground(Color.black);
            }
            public void mousePressed(MouseEvent e){
                label.setBackground(Color.YELLOW);
            }
            public void mouseReleased(MouseEvent e){
                label.setBackground(Color.BLUE);
            }
            public void mouseClicked(MouseEvent e){
                label.setBackground(Color.RED);
            }
        });

        frame.add(label);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}