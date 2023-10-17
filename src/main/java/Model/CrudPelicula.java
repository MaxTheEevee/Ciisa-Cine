/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DAO.DAOpelicula;

/**
 *
 * @author Erik
 */
public class CrudPelicula {
    Conexion conexion = new Conexion();
    public String Create(Object obj){
    DAOpelicula pelicula = (DAOpelicula) obj;
    Connection connection;
    PreparedStatement pst;
    String query = "INSERT INTO TBL_PELICULA VALUES (?)";
    String respuesta;
    
    try{
        Class.forName(conexion.getDriver());
        connection = (Connection) DriverManager.getConnection(conexion.getUrl(), conexion.getUsuario(), conexion.getPassword());
        
        pst = (PreparedStatement) connection.prepareStatement(query);
        pst.setString(1, pelicula.getVCH_NOMBRE_PELICULA());
        respuesta = Integer.toString(pst.executeUpdate());
    }
    catch(ClassNotFoundException | SQLException ex){
        respuesta = ex.getMessage();
    }
    return respuesta;
    }
}
    