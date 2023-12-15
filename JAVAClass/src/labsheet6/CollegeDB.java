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
public class CollegeDB {
    Connection con=null;
    Statement stmt=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    public void display(int id){
        try {
            String sql="Select * from student";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("id: "+rs.getInt("s_id")+", name: "+rs.getString("name")+", address: "+rs.getString("address")+", gender: "+rs.getString("gender")+", program: "+rs.getString("program"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insert(int id, String name, String address, String gender, String program){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/college";
            con=DriverManager.getConnection(url,"root","");
            String sql="insert into student values(?,?,?,?,?)";
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, address);
            pstmt.setString(4, gender);
            pstmt.setString(5, program);
            int res=pstmt.executeUpdate();
            if(res!=-1){
                display(id);
            }else{
                System.out.println("couldn't insert data");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void update(int id,String prog){
        try {
            String sql="Update student set  program='"+prog+"' where s_id='"+id+"'";
            stmt=con.createStatement();
            int res=stmt.executeUpdate(sql);
            if(res!=-1){
                display(id);
            }else{
                System.out.println("update failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(int id){
        try {
            String sql="Delete from student where s_id=?";
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1,id);
            int res=pstmt.executeUpdate();
            if(res!=-1){
                display(id);
            }else{
                System.out.println("couldn't delete data");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void endCon(){
        try {
            con.close();
            stmt.close();
            pstmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        CollegeDB obj1=new CollegeDB();
        obj1.insert(1, "Sam", "Kathmandu", "male", "BCIS");
        obj1.update(1, "BBA");
        obj1.delete(1);
        obj1.endCon();
    }
}
