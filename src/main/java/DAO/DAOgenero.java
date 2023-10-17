/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Erik
 */
public class DAOgenero {
    private String VCH_NOMBRE_GENERO;

    /**
     *
     * @return
     */
    public String getVCH_NOMBRE_GENERO() {
        return VCH_NOMBRE_GENERO;
    }

    public void setVCH_NOMBRE_GENERO(String VCH_NOMBRE_GENERO) {
        this.VCH_NOMBRE_GENERO = VCH_NOMBRE_GENERO;
    }

    public DAOgenero(String VCH_NOMBRE_GENERO) {
        this.VCH_NOMBRE_GENERO = VCH_NOMBRE_GENERO;
    }

    public boolean ValidaSubida(String genero) {
        Boolean flag = true;
        if(!genero.isEmpty()){setVCH_NOMBRE_GENERO (genero);    } else{return false;}
        
        return flag;
        }
}
