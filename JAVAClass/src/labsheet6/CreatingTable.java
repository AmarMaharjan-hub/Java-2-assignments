/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 *
 * @author riku
 */
public class CreatingTable {
    public static void main(String[] args) {
        try{
            String sql="Create table User(id int(10), name varchar(50), age int(10), phone_number varchar(10), address varchar(50))";
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/db_test";
            Connection con=DriverManager.getConnection(url,"root","");
            if(con != null){
                Statement stmt=con.createStatement();
                int result=stmt.executeUpdate(sql);
                if(result!=-1){
                    System.out.println("Table created successfully.");
                }else{
                    System.out.println("Couldn't create table. Syntax error");
                }
                stmt.close();
                con.close();
            }else{
                System.out.println("Unable to get the connection.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
