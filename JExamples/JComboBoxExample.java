import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JComboBoxExample {
    public static void main(String[] args) {
        String[] boxItems={"item1","item2","item3","item4"};
        JComboBox box = new JComboBox(boxItems);
        box.setBounds(100,100,150,80);
        box.setFont(new Font("Comic Sans MS",Font.BOLD,20));
        box.setBackground(Color.white);
        box.setSelectedItem(boxItems);
        JButton button = new JButton("Click Me!");
        button.setBounds(260, 100, 100, 50);
        button.setFocusable(false);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // System.out.println("You picked"+box.getSelectedItem());
                JOptionPane.showMessageDialog(null, "You Picked"+box.getSelectedItem(),"Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        JFrame frame = new JFrame("Combo Example");
        frame.add(box);
        frame.add(button);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
}
