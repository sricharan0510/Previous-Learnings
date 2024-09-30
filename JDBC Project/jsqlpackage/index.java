package jsqlpackage;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
public class index {
    public static Connection con;
    public static void main(String[] args) throws Exception {

        JFrame f = new JFrame();
        f.setTitle("Top Coders!");
        f.setResizable(false);
        f.setSize(800,800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setBackground(Color.BLACK);

        JButton b1 = new JButton("ALL");
        b1.setBounds(100, 140, 100, 50);
        b1.setFont(new Font("Lucida Fax", Font.BOLD , 20));
        b1.setFocusable(false);
        b1.setBackground(Color.MAGENTA);

        JButton b2 = new JButton("AEC");
        b2.setBounds(250, 140, 100, 50);
        b2.setFont(new Font("Lucida Fax", Font.BOLD , 20));
        b2.setFocusable(false);
        b2.setBackground(Color.MAGENTA);

        JButton b3 = new JButton("ACET");
        b3.setBounds(400, 140, 100, 50);
        b3.setFont(new Font("Lucida Fax", Font.BOLD , 20));
        b3.setFocusable(false);
        b3.setBackground(Color.MAGENTA);

        JButton b4 = new JButton("ACOE");
        b4.setBounds(550, 140, 100, 50);
        b4.setFont(new Font("Lucida Fax", Font.BOLD , 20));
        b4.setFocusable(false);
        b4.setBackground(Color.MAGENTA);

        f.add(b1);
        f.add(b2);
        f.setLayout(null);
        f.add(b3);
        f.add(b4);
    
        JTextArea t = new JTextArea();
        t.setBounds(100, 200, 550, 200);
        t.setBackground(Color.yellow);
        t.setText(null);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(null);
                String h = "   ID\tNAME\tCOLLEGE\tBRANCH\tAGE\tCODEMIND\n";
                t.append(h);
                String dbURL = "jdbc:mysql://localhost:3306/codemind";
                String dbUser = "root";
                String dbpassword = "Sricharan@05";
                try {
                    con = DriverManager.getConnection(dbURL, dbUser, dbpassword);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                if(con!=null){
                    System.out.println("Connected Successfully");
                }
                String sql = "select * from student";
                try {
                    Statement st = con.createStatement();                    
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next()){
                        String id = rs.getString("id");
                        String name = rs.getString("name");
                        String college = rs.getString("college");
                        String branch = rs.getString("branch");
                        String age = rs.getString("age");
                        String codemind = rs.getString("codemind");
                        String str = String.format("   %s\t%s\t%s\t%s\t%s\t%s\n",id,name,college,branch,age,codemind);
                        t.append(str);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(null);
                String h = "   ID\tNAME\tCOLLEGE\tBRANCH\tAGE\tCODEMIND\n";
                t.append(h);
                String dbURL = "jdbc:mysql://localhost:3306/codemind";
                String dbUser = "root";
                String dbpassword = "Sricharan@05";
                try {
                    con = DriverManager.getConnection(dbURL, dbUser, dbpassword);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                if(con!=null){
                    System.out.println("Connected Successfully");
                }
                String sql = "select * from student where college='AEC'";
                try {
                    Statement st = con.createStatement();                    
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next()){
                        String id = rs.getString("id");
                        String name = rs.getString("name");
                        String college = rs.getString("college");
                        String branch = rs.getString("branch");
                        String age = rs.getString("age");
                        String codemind = rs.getString("codemind");
                        String str = String.format("   %s\t%s\t%s\t%s\t%s\t%s\n",id,name,college,branch,age,codemind);
                        t.append(str);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(null);
                String h = "   ID\tNAME\tCOLLEGE\tBRANCH\tAGE\tCODEMIND\n";
                t.append(h);
                String dbURL = "jdbc:mysql://localhost:3306/codemind";
                String dbUser = "root";
                String dbpassword = "Sricharan@05";
                try {
                    con = DriverManager.getConnection(dbURL, dbUser, dbpassword);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                if(con!=null){
                    System.out.println("Connected Successfully");
                }
                String sql = "select * from student where college='ACET'";
                try {
                    Statement st = con.createStatement();                    
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next()){
                        String id = rs.getString("id");
                        String name = rs.getString("name");
                        String college = rs.getString("college");
                        String branch = rs.getString("branch");
                        String age = rs.getString("age");
                        String codemind = rs.getString("codemind");
                        String str = String.format("   %s\t%s\t%s\t%s\t%s\t%s\n",id,name,college,branch,age,codemind);
                        t.append(str);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(null);
                String h = "   ID\tNAME\tCOLLEGE\tBRANCH\tAGE\tCODEMIND\n";
                t.append(h);
                String dbURL = "jdbc:mysql://localhost:3306/codemind";
                String dbUser = "root";
                String dbpassword = "Sricharan@05";
                try {
                    con = DriverManager.getConnection(dbURL, dbUser, dbpassword);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                if(con!=null){
                    System.out.println("Connected Successfully");
                }
                String sql = "select * from student where college='ACOE'";
                try {
                    Statement st = con.createStatement();                    
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next()){
                        String id = rs.getString("id");
                        String name = rs.getString("name");
                        String college = rs.getString("college");
                        String branch = rs.getString("branch");
                        String age = rs.getString("age");
                        String codemind = rs.getString("codemind");
                        String str = String.format("   %s\t%s\t%s\t%s\t%s\t%s\n",id,name,college,branch,age,codemind);
                        t.append(str);
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        f.add(t);
    }
}