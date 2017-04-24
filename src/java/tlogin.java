/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mahe
 */
public class tlogin extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet tlogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method= \"post\" action= \"makeq\"> "
                    + "<h3> Question genre: </h3>"
                    + " <input type=\"radio\" name=\"subject\" value=\"maths\">MATHS<br>"
                    + "<input type=\"radio\" name=\"subject\" value=\"english\"> English<br>"
                    + "<input type=\"radio\" name=\"subject\" value=\"science\"> Science<br>"
                    +"<h3> Question: </h3>"
                    + "<input type=\"text\" name=\"ques\" <br>"
                    + "<h3> Answer: </h3>"
                    +"<input type=\"text\" name=\"ans\" <br>"
                    + "<h3> Option: </h3>"
                    +"<input type=\"text\" name=\"op1\" <br>"
                    +"<h3> Option: </h3>"
                    +"<input type=\"text\" name=\"op2\" <br>"
                    +"<br> <input type=\"submit\" value=\"Create\" </form>");
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
