/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.DAOpelicula;
import Model.CrudPelicula;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Erik
 */
public class Nuevo extends HttpServlet {

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
            String mensaje = "";
            String insertaPelicula;
            try{
                    DAOpelicula pelicula = validacionUsuario(request);
                    CrudPelicula cp = new CrudPelicula();
                    insertaPelicula = cp.Create(pelicula);
                    mensaje += insertaPelicula;
                    if(Integer.parseInt(insertaPelicula) != 0){
                        mensaje = "Pelicula grabada con éxito";
                    }
            }
            catch(NumberFormatException ex){
                mensaje = ex.getMessage();
            }
 
            request.setAttribute("mensaje", mensaje);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
protected DAOpelicula validacionUsuario(HttpServletRequest request){
        DAOpelicula pelicula = new DAOpelicula();
        String nombre = request.getParameter("nombre");
        
        if(pelicula.ValidaSubida(nombre)){
            return pelicula;
        }
        else{
            return new DAOpelicula();
        }
   
}

}

