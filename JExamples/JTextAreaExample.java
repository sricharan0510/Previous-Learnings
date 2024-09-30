import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class JTextAreaExample {
    public static void main(String[] args) {
         JTextArea area = new JTextArea();
         area.setBounds(100, 100, 400, 400);
         area.setFont(new Font("MV Boli", Font.BOLD, 30));
         String s = "This\nis\ntext\narea";
         area.setText(s);
        JFrame frame = new JFrame("GUI App");
        frame.setSize(500, 500);
        frame.add(area);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}