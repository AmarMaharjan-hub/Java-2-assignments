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
public class InsertAndFetch {
    Connection con=null;
    Statement stmt=null;
    public void insertIntoDatabase(){
        String sql="Insert into user values(964,'Dup',1,'32','dup')";
        try{
            int result=stmt.executeUpdate(sql);
            if(result!=-1){
                System.out.println("Insert succesful");
            }else{
                System.out.println("Insert unsuccessful");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void getFromDatabase(){
        String sql="Select * from user";
        try{
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id")+", Name: "+rs.getString("name")+", Age: "+rs.getInt("age")+", Phone: "+rs.getString("phone_number")+", Address: "+rs.getString("address"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {    
        InsertAndFetch obj1=new InsertAndFetch();
        try {
                Class.forName("com.mysql.jdbc.Driver");
                String dbURL="jdbc:mysql://localhost:3306/db_test",username="root",password="";
                obj1.con=DriverManager.getConnection(dbURL,username,password);
                if(obj1.con!=null){
                    obj1.stmt=obj1.con.createStatement();
                    obj1.insertIntoDatabase();
                    obj1.getFromDatabase();
                    obj1.con.close();
                    obj1.stmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
