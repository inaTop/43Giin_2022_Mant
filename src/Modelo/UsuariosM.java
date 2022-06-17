/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author InaRu
 */
public class UsuariosM {
    
    private int idUsuario;
    private String nom_usuario;
    private String pass;
    private String email;
    private String empresa;
    private String rol;
    
    
    public UsuariosM(){
        
    }
    
       
    /**
     * Constructor de la clase usuario
     * @param idusuario identificador del usuario
     * @param nom_usuario Nombre del Usuario
     * @param password Password o contraseña del usuario
     * @param email 
     * @param empresa empresa a la que pertenece
     * @param rol
     */
    public UsuariosM(Integer idusuario,String nom_usuario, String password, String email , String empresa,String rol) {
        this.idUsuario=idusuario;
        this.nom_usuario = nom_usuario;
        this.pass = password;
        this.email = email;
        this.empresa=empresa;
        this.rol=rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
