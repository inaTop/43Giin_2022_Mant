/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author InaRu
 */
public class EmpresaM {
    
    private int idempresa;
    private String nom_empresa;
    private String descripcion; 

    public EmpresaM() {
        
       //JOptionPane.showMessageDialog(null,"Empresa creada con éxito");
        
    }

   
    
      /**
     * Constructor de la clase empresa
     * @param nom_empresa Nombre de la empresa
     * @param idempresa identificador de la empresa
     * @param descripcion 
     */
    public EmpresaM(int idempresa, String nom_empresa, String descripcion) {
        this.idempresa = idempresa;
        this.nom_empresa= nom_empresa;
        this.descripcion = descripcion;
    }

    
        
      /**
     * Constructor de la clase empresa
     * @param nom_empresa Nombre de la empresa
     * @param descripcion 
     */
    public EmpresaM(String nom_empresa, String descripcion) {
        this.nom_empresa= nom_empresa;
        this.descripcion = descripcion;
    }
    
    
    
/**
     * Consulta el id de la empresa
     * @return Devuelve el id de la empresa
     */
    public int getID_empresa() {
        return idempresa;
    }


    /**
     * Consulta el nombre de la empresa
     * @return Devuelve nombre de la empresa
     */
    public String getNom_empresa() {
        return nom_empresa;
    }
    
    /**
     * Consulta la descripción de la empresa
     * @return Devuelve la descripción de la empresa
     */
    public String getDescr_empresa() {
        return descripcion;
    }
    
    
    /**
     * Modifica el id de la empresa
     * @param idempresa 
     */
    public void setID_empresa(int idempresa) {
        this.idempresa = idempresa;
    }
    
     /**
     * Modifica el nombre de la empresa
     * @param nom_empresa 
     */
    public void setNom_empresa(String nom_empresa) {
        this.nom_empresa = nom_empresa;
    }
    
    /**
     * Modifica la descripcion de la empresa
     * @param descripcion 
     */
    public void setDescr(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
