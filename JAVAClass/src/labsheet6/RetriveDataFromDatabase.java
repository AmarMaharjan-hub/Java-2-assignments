/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet6;
import java.sql.*;
/**
 *
 * @author riku
 */
public class RetriveDataFromDatabase {
    public RetriveDataFromDatabase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/db_test";
            Connection con=DriverManager.getConnection(url,"root","");
            if(con!=null){
                System.out.println("Database connected");
                Statement stmt=con.createStatement();
                String sql="Select * from user";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next()){
                    System.out.println("ID: "+rs.getInt("id")+", Name: "+rs.getString("name")+", Age: "+rs.getInt("age")+", Phone: "+rs.getString("phone_number")+", Address: "+rs.getString("address"));
                }
                stmt.close();
                con.close();
            }else{
                System.out.println("Couldn't connect to the database.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new RetriveDataFromDatabase();
    }
}
