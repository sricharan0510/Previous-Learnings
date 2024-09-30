import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

public class JCombo{
    public static void main(String[] args) {

       // JComboBox
       String[] boxItems = {"RED","GREEN","BLACK","BLUE"};
       JComboBox box = new JComboBox(boxItems);
       box.setBounds(50,100,150,50);
       box.setFont(new Font("Agency FB",Font.ITALIC,20));
       box.setSelectedItem(null);

        //JLabel
        JLabel label = new JLabel();
        label.setBounds(50,160,300,150);
        label.setBackground(Color.lightGray);
        label.setOpaque(true);

       //JButton
        JButton button = new JButton("Click me");
        button.setBounds(260,100,100,50);
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("You picked: "+box.getSelectedItem());
                //JOptionPane.showMessageDialog(null,"You picked: "+box.getSelectedItem(),"Message",JOptionPane.INFORMATION_MESSAGE);
                if(box.getSelectedItem().equals("RED"))
                label.setBackground(Color.RED);
                if(box.getSelectedItem().equals("GREEN"))
                    label.setBackground(Color.GREEN);
                if(box.getSelectedItem().equals("BLACK"))
                    label.setBackground(Color.BLACK);
                if(box.getSelectedItem().equals("BLUE"))
                    label.setBackground(Color.BLUE);
            }
        });



       //JFrame
       JFrame frame = new JFrame("Combo Example");
       frame.add(box);
       frame.add(button);
       frame.add(label);
       frame.setSize(400,400);
       frame.setResizable(false);
       frame.setLayout(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
}