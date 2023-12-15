/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsheet6;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
/**
 *
 * @author riku
 */
public class InsertingData {
    public static void main(String[] args) {
        try{
            String sql="Insert into user values(1,'ABC',16,'9876765434','DEF')";
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/db_test";
            Connection con=DriverManager.getConnection(url,"root","");
            if(con!=null){
                Statement stmt=con.createStatement();
                int result=stmt.executeUpdate(sql);
                if(result!=-1){
                    System.out.println("Data successfully inserted into the table");
                }else{
                    System.out.println("Couldn't insert data into the table. Syntax error");
                }
                stmt.close();
                con.close();
            }else{
                System.out.println("Couldn't get the connection");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
