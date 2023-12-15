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
public class JobDB {
    Connection con=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    public void createDBTable(){
        String sql="Create database job";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306";
            con=DriverManager.getConnection(url,"root","");
            pstmt=con.prepareStatement(sql);
            int res=pstmt.executeUpdate();
            if(res!=-1){
                System.out.println("DB connected");
            }else{
                System.out.println("DB not connected");
            }
            url="jdbc:mysql://localhost:3306/job";
            con=DriverManager.getConnection(url,"root","");
            sql="Create table jobs(job_id int(10), job_title varchar(50), salary int(10), department varchar(50))";
            pstmt=con.prepareStatement(sql);
            res=pstmt.executeUpdate();
            if(res!=-1){
                System.out.println("Table created");
            }else{
                System.out.println("Table not created");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertData(int id, String title, int salary, String dep){
        try {
            String sql="Insert into jobs values(?,?,?,?)";
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.setString(2, title);
            pstmt.setInt(3,salary);
            pstmt.setString(4, dep);
            int res=pstmt.executeUpdate();
            if(res!=-1){
                System.out.println("Job id: "+id+", Job title: "+title+", Salary: "+salary+", Department: "+dep);
            }else{
                System.out.println("sql error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        JobDB obj1=new JobDB();
        obj1.createDBTable();
        obj1.insertData(1,"Manager",20000000,"HR");
        obj1.insertData(2,"Employee",20000000,"HR");
        obj1.insertData(3,"Entrepreneur",20000000,"HR");
    }
}
