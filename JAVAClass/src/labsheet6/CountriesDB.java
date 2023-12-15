/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet6;
//import java.sql.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author riku
 */
public class CountriesDB extends JFrame{
    Connection con=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3;
    String op="";
    public void createDatabaseAndTable(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url1="jdbc:mysql://localhost:3306";
            con=DriverManager.getConnection(url1,"root","");
            String query1="create database countries";
            pstmt=con.prepareStatement(query1);
            int result=pstmt.executeUpdate();
            if(result!=-1){
                op=op+"Database created successfully\n";
            }else{
                op=op+"Couldn't create database\n";
            }
            String url2="jdbc:mysql://localhost:3306/countries";
            con=DriverManager.getConnection(url2,"root","");
            String query2="create table countries(country_id int(10), country_name varchar(50), continent varchar(50))";
            pstmt=con.prepareStatement(query2);
            result=pstmt.executeUpdate();
            if(result!=-1){
                op=op+"Table created successfully\n";
            }else{
                op=op+"Couldn't create table\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertData(int id, String name, String bigName){
        String query="INSERT INTO countries VALUES(?,?,?)";
        try {
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1,id);
            pstmt.setString(2,name);
            pstmt.setString(3,bigName);
            int result=pstmt.executeUpdate();
            if(result!=-1){
                op=op+"Data saved.\n";
            }else{
                op=op+"Couldn't save data.\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void retriveInfo(int id){
        String query="select * from countries where country_id=?";
        try {
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1, id);
            rs=pstmt.executeQuery();
            while(rs.next()){
                op=op+("id: "+rs.getInt("country_id")+", name: "+rs.getString("country_name")+", continent: "+rs.getString("continent")+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void display(){
        setSize(200,300);
        setLayout(new FlowLayout());
        Panel p1=new Panel(new GridLayout(4,2));
        l1=new JLabel("Country ID");
        l2=new JLabel("Country Name");
        l3=new JLabel("Continent");
        l4=new JLabel("");
        l5=new JLabel("Output:");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        JButton b1=new JButton("Submit");
        JTextArea ta1=new JTextArea(5,1);
        ta1.setEnabled(false);
        JScrollPane sp=new JScrollPane(ta1);
        sp.setPreferredSize(new Dimension(150,100));
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(b1);
        add(p1);
        add(l5);
        add(sp);
        ta1.setText(op);
        setVisible(true);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                insertData(Integer.parseInt(t1.getText()),t2.getText(),t3.getText());
                retriveInfo(Integer.parseInt(t1.getText()));
                t1.setText("");
                t2.setText("");
                t3.setText("");
                ta1.setText(op);
            }
        });
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                try {
                    con.close();
                    pstmt.close();
                } catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args) {
        CountriesDB obj1=new CountriesDB();
        obj1.createDatabaseAndTable();
        obj1.display();
    }
}