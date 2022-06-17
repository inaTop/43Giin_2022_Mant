/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author InaRu
 */
public class ProyectosM {
    
    private int codigo_pr;
    private String nom_pr;
    private String tipo_pr;
    private String cliente;
    private Date fecha_ini;
    private Date fecha_entrega;
    private String estadoPR;
    private String descripcion;
    
    
    
    public ProyectosM() {}
    
    /**
     * Constructor de la clase Proyectos
     * @param codigo_pr identificador del proyecto
     * @param nom_pr Nombre del proyecto
     * @param tipo_pr tipo del proyecto
     * @param cliente cliente del proyecto
     * @param fecha_ini fecha que inicia el proyecto
     * @param fecha_entrega fecha que finaliza el proyecto
     * @param estadoPR estado proyecto
     * @param descripcion 
     */
    public ProyectosM(Integer codigo_pr,String nom_pr, String tipo_pr, String cliente , Date fecha_ini,Date fecha_entrega,String estadoPR,String descripcion) {
        this.codigo_pr=codigo_pr;
        this.nom_pr = nom_pr;
        this.tipo_pr = tipo_pr;
        this.cliente = cliente;
        this.fecha_ini=fecha_ini;
        this.fecha_entrega=fecha_entrega;
        this.estadoPR = estadoPR;
        this.descripcion = descripcion;
    
}

    public int getCodigo_pr() {
        return codigo_pr;
    }

    public void setCodigo_pr(int codigo_pr) {
        this.codigo_pr = codigo_pr;
    }

    public String getNom_pr() {
        return nom_pr;
    }

    public void setNom_pr(String nom_pr) {
        this.nom_pr = nom_pr;
    }

    public String getTipo_pr() {
        return tipo_pr;
    }

    public void setTipo_pr(String tipo_pr) {
        this.tipo_pr = tipo_pr;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getEstadoPR() {
        return estadoPR;
    }

    public void setEstadoPR(String estadoPR) {
        this.estadoPR = estadoPR;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   

    
    
}
