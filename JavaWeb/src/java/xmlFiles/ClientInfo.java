/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlFiles;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author riku
 */
public class ClientInfo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    public int insert(String nam, String add, String des, String dep){
        try{
            String url="jdbc:mysql://localhost:3306/job";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","");
            if(con!=null){
                String sql="Insert into employee values('"+nam+"','"+add+"','"+des+"','"+dep+"')";
                Statement stmt=con.createStatement();
                int res=stmt.executeUpdate(sql);
                con.close();
                stmt.close();
                if(res!=-1){
                    return 1;
                }else{
                    return 0;
                }
            }else{
                return 0;
            }
            
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int rep=insert(request.getParameter("name"), request.getParameter("address"), request.getParameter("des"), request.getParameter("dep"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClientInfo</title>");            
            out.println("</head>");
            out.println("<body>");
            if(rep==1){
                out.println("Data:<br>"+request.getParameter("name")+"<br>"+request.getParameter("address")+"<br>"+request.getParameter("des")+"<br>"+request.getParameter("dep"));
            }else{
                out.println("Couldn't save data");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
