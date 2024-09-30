// import java.awt.*;
// import java.awt.event.*;
// import java.sql.*;
// import javax.swing.*;

// public class Main {
//     public static Connection con;
//     public static void main(String[] args)throws Exception{
//         JFrame frame1 = new JFrame("Top 10");
//         frame1.setSize(1920,2000);
//         frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         JLabel label1 = new JLabel("Top 10 in CodeminD");
//         label1.setBounds(550, 20, 350, 70);
//         label1.setFont(new Font("Italian",Font.BOLD,35));

//         JTextArea textArea1 = new JTextArea();
//         textArea1.setBounds(110, 200, 1315, 500);
//         textArea1.setBackground(Color.GRAY);
//         textArea1.setFont(new Font("Italian",Font.BOLD,27));
//         String str = "   ID\tNAME\tCOLLEGE\tBRANCH\tAGE\tCODEMIND\n";
//         textArea1.append(str);

//         JButton button1 = new JButton("AEC");
//         button1.setBounds(210,100,175,70);
//         button1.setFont(new Font("Italian",Font.BOLD,30));
//         button1.setFocusable(false);

//         button1.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){
//                 textArea1.setText(null);
//                 String head = "   ID\tNAME\tCOLLEGE\tBRANCH\tAGE\tCODEMIND\n";
//                 textArea1.append(head);

//                 String dbURL = "jdbc:mysql://localhost:3306/database1";
//                 String dbUser = "root";
//                 String dbPassword = "CharanRaju@2012";
//                 try {
//                     con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
//                 } catch (SQLException e1) {
//                     e1.printStackTrace();
//                 }
//                 String sql = "SELECT * FROM CODEMINDLIST WHERE COLLEGE='AEC' ORDER BY CODEMIND DESC";
//                 try (Statement st = con.createStatement()) {
//                     ResultSet rs = st.executeQuery(sql);
//                     int i=1;
//                     while(rs.next()){
//                         String id = rs.getString("id");
//                         String name = rs.getString("name");
//                         String clg = rs.getString("college");
//                         String branch = rs.getString("branch");
//                         String age = rs.getString("age");
//                         String codes = rs.getString("codemind");

//                         String str = String.format("   %s\t%s\t%s\t%s\t%s\t%s\n",id,name,clg,branch,age,codes);
//                         if(i<=10)
//                         {
//                             textArea1.append(str);
//                             i++;
//                         }else{
//                             break;
//                         }
//                     }
//                 } catch (SQLException e1) {
//                     e1.printStackTrace();
//                 }
//             }
//         });

//         JButton button2 = new JButton("ACET");
//         button2.setBounds(520,100,175,70);
//         button2.setFont(new Font("Italian",Font.BOLD,30));
//         button2.setFocusable(false);

//         button2.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){
//                 textArea1.setText(null);
//                 String head = "   ID\tNAME\tCOLLEGE\tBRANCH\tAGE\tCODEMIND\n";
//                 textArea1.append(head);
//                 String dbURL = "jdbc:mysql://localhost:3306/database1";
//                 String dbUser = "root";
//                 String dbPassword = "CharanRaju@2012";
//                 try {
//                     con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
//                 } catch (SQLException e1) {
//                     e1.printStackTrace();
//                 }
//                 String sql = "SELECT * FROM CODEMINDLIST WHERE COLLEGE='ACET' ORDER BY CODEMIND DESC";
//                 try (Statement st = con.createStatement()) {
//                     ResultSet rs = st.executeQuery(sql);
//                     int i=1;
//                     while(rs.next()){
//                         String id = rs.getString("id");
//                         String name = rs.getString("name");
//                         String clg = rs.getString("college");
//                         String branch = rs.getString("branch");
//                         String age = rs.getString("age");
//                         String codes = rs.getString("codemind");

//                         String str = String.format("   %s\t%s\t%s\t%s\t%s\t%s\n",id,name,clg,branch,age,codes);
//                         if(i<=10)
//                         {
//                             textArea1.append(str);
//                             i++;
//                         }else{
//                             break;
//                         }
//                     }
//                 } catch (SQLException e1) {
//                     e1.printStackTrace();
//                 }
//             }
//         });

//         JButton button3 = new JButton("ACOE");
//         button3.setBounds(830,100,175,70);
//         button3.setFont(new Font("Italian",Font.BOLD,30));
//         button3.setFocusable(false);

//         button3.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){
//                 textArea1.setText(null);
//                 String head = "   ID\tNAME\tCOLLEGE\tBRANCH\tAGE\tCODEMIND\n";
//                 textArea1.append(head);
//                 String dbURL = "jdbc:mysql://localhost:3306/database1";
//                 String dbUser = "root";
//                 String dbPassword = "CharanRaju@2012";
//                 try {
//                     con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
//                 } catch (SQLException e1) {
//                     e1.printStackTrace();
//                 }
//                 String sql = "SELECT * FROM CODEMINDLIST WHERE COLLEGE='ACOE' ORDER BY CODEMIND DESC";
//                 try (Statement st = con.createStatement()) {
//                     ResultSet rs = st.executeQuery(sql);
//                     int i=1;
//                     while(rs.next()){
//                         String id = rs.getString("id");
//                         String name = rs.getString("name");
//                         String clg = rs.getString("college");
//                         String branch = rs.getString("branch");
//                         String age = rs.getString("age");
//                         String codes = rs.getString("codemind");

//                         String str = String.format("   %s\t%s\t%s\t%s\t%s\t%s\n",id,name,clg,branch,age,codes);
//                         if(i<=10)
//                         {
//                             textArea1.append(str);
//                             i++;
//                         }else{
//                             break;
//                         }
//                     }
//                 } catch (SQLException e1) {
//                     e1.printStackTrace();
//                 }
//             }
//         });

//         JButton button4 = new JButton("ALL");
//         button4.setBounds(1140,100,175,70);
//         button4.setFont(new Font("Italian",Font.BOLD,30));
//         button4.setFocusable(false);

//         button4.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e){
//                 textArea1.setText(null);
//                 String head = "   ID\tNAME\tCOLLEGE\tBRANCH\tAGE\tCODEMIND\n";
//                 textArea1.append(head);
//                 String dbURL = "jdbc:mysql://localhost:3306/database1";
//                 String dbUser = "root";
//                 String dbPassword = "CharanRaju@2012";
//                 try {
//                     con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
//                 } catch (SQLException e1) {
//                     e1.printStackTrace();
//                 }
//                 String sql = "SELECT * FROM CODEMINDLIST ORDER BY CODEMIND DESC";
//                 try (Statement st = con.createStatement()) {
//                     ResultSet rs = st.executeQuery(sql);
//                     int i=1;
//                     while(rs.next()){
//                         String id = rs.getString("id");
//                         String name = rs.getString("name");
//                         String clg = rs.getString("college");
//                         String branch = rs.getString("branch");
//                         String age = rs.getString("age");
//                         String codes = rs.getString("codemind");

//                         String str = String.format("   %s\t%s\t%s\t%s\t%s\t%s\n",id,name,clg,branch,age,codes);
//                         if(i<=10)
//                         {
//                             textArea1.append(str);
//                             i++;
//                         }else{
//                             break;
//                         }
//                     }
//                 } catch (SQLException e1) {
//                     e1.printStackTrace();
//                 }
//             }
//         });
        
        

//         frame1.add(textArea1);
//         frame1.add(label1);
//         frame1.add(button1);
//         frame1.add(button2);
//         frame1.add(button3);
//         frame1.add(button4);
//         frame1.setLayout(null);
//         frame1.setVisible(true);
//     }
// }