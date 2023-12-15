/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
/**
 *
 * @author riku
 */
public class InsertingForm extends JFrame{
    JLabel l1,l2,l3,l4,l5,l6=l5=l4=l3=l2=l1=null;
    JTextField t1,t2,t3,t4,t5=t4=t3=t2=t1=null;
    public InsertingForm(){
        setSize(500,400);
        setLayout(new GridLayout(6,2));
        setTitle("Form for inserting data");
        l1= new JLabel("ID",SwingConstants.CENTER);
        l2=new JLabel("Name",SwingConstants.CENTER);
        l3=new JLabel("Age",SwingConstants.CENTER);
        l4=new JLabel("Phone no.",SwingConstants.CENTER);
        l5=new JLabel("Address",SwingConstants.CENTER);
        l6=new JLabel("Result:",SwingConstants.CENTER);
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        JButton b1=new JButton("Submit");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(b1);
        setVisible(true);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                l6.setText("Result:");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/db_test";
                    Connection con=DriverManager.getConnection(url,"root","");
                    if(con!=null){
                        l6.setText(l6.getText()+"Database Connected.");
                        Statement stmt=con.createStatement();
                        String sql="Insert into user values("+t1.getText()+",'"+t2.getText()+"',"+t3.getText()+",'"+t4.getText()+"','"+t5.getText()+"')";
                        int result=stmt.executeUpdate(sql);
                        if(result!=-1){
                            l6.setText(l6.getText()+" Data inserted");
                        }else{
                            l6.setText(l6.getText()+"Couldn't insert data");
                        }
                        stmt.close();
                        con.close();
                    }else{
                        l6.setText(l6.getText()+"Database Not Connected.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        });
    }
    public static void main(String[] args) {
        new InsertingForm();
    }
}
