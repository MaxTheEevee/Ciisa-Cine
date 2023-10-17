/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Erik
 */
public class DAOpelicula {
    private String VCH_NOMBRE_PELICULA;

    public String getVCH_NOMBRE_PELICULA() {
        return VCH_NOMBRE_PELICULA;
    }

    public void setVCH_NOMBRE_PELICULA(String VCH_NOMBRE_PELICULA) {
        this.VCH_NOMBRE_PELICULA = VCH_NOMBRE_PELICULA;
    }
     public DAOpelicula(){
     
     }

    public DAOpelicula(String VCH_NOMBRE_PELICULA) {
        this.VCH_NOMBRE_PELICULA = VCH_NOMBRE_PELICULA;
    }

    public boolean ValidaSubida(String pelicula) {
        Boolean flag = true;
        if(!pelicula.isEmpty()){setVCH_NOMBRE_PELICULA (pelicula);   } else{return false;}
        
        return flag;
        }
    
}
