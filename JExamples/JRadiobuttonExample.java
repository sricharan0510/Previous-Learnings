import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class JRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");

        JLabel label = new JLabel();
        label.setBounds(100,100,300,300);
        label.setOpaque(true);

        JRadioButton rb1 = new JRadioButton("Red");
        JRadioButton rb2 = new JRadioButton("Green");
        JRadioButton rb3 = new JRadioButton("Orange");
        rb1.setBounds(50, 70, 100, 100);
        rb2.setBounds(150, 70, 100, 100);
        rb3.setBounds(250, 70, 100, 100);
        // rb1.setFocusable(false);
        // rb2.setFocusable(false);
        // rb3.setFocusable(false);

        //  JTextArea area = new JTextArea();
        //  area.setBounds(100, 100, 400, 400);
        //  area.setFont(new Font("MV Boli", Font.BOLD, 30));
        //  String s1 = "STOP";
        //  Strict s2 = "GO";
        //  String s3 = "READY";
        rb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("STOP");
                label.setForeground(Color.RED);
            }
        });
        rb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("GO");
                label.setForeground(Color.GREEN);
            }
        });
        rb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("READY");
                label.setForeground(Color.orange);
            }
        });

        frame.add(label);
        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);
        // frame.add(area);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}