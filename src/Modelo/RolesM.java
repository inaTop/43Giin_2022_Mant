/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author InaRu
 */
public class RolesM {
    
    private int idroles;
    private String nom_rol;
     

    public RolesM() {
        
       //JOptionPane.showMessageDialog(null,"Empresa creada con éxito");
        
    }

   
    
      /**
     * Constructor de la clase empresa
     * @param nom_rol Nombre del rol de un usuario
     * @param idroles 
     */
    public RolesM(int idroles, String nom_rol) {
        this.idroles = idroles;
        this.nom_rol= nom_rol;
       
    }

    
        
      /**
     * Constructor de la clase empresa
     * @param nom_rol
     */
    public RolesM(String nom_rol) {
        this.nom_rol= nom_rol;
   
    }
    
    
    
/**
     * Consulta el id de la empresa
     * @return Devuelve el id de la empresa
     */
    public int getID_rol() {
        return idroles;
    }


    /**
     * Consulta el nombre del rol
     * @return Devuelve nombre del rol
     */
    public String getNom_rol() {
        return nom_rol;
    }
    
    
    /**
     * Modifica el id del rol
     * @param idroles
     */
    public void setID_rol(int idroles) {
        this.idroles= idroles;
    }
    
     /**
     * Modifica el nombre del rol
     * @param nom_rol
     */
    public void setNom_rol(String nom_rol) {
        this.nom_rol = nom_rol;
    }
    
    
    
}
