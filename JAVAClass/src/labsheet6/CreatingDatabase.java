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
public class CreatingDatabase {
    public static void main(String[] args) {
        try{
            String sql="create database db_test";
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306";
            Connection con=DriverManager.getConnection(url,"root","");
            if(con!=null){
                Statement stmt=con.createStatement();
                int result=stmt.executeUpdate(sql);
                if(result!=-1){
                    System.out.println("Database created successfully");
                }else{
                    System.out.println("Failed to create database");
                }
                stmt.close();
                con.close();
            }else{
                System.out.println("Fail to connect");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
