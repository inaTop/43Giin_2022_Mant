/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import Modelo.RolesM;

/**
 *
 * @author InaRu
 */
public interface IRoles {
    public boolean anyadirRol(RolesM rol);
    public List<RolesM> obtenerRol();
    public boolean modificarRol(RolesM rol);
    public boolean eliminarRol(RolesM rol);
    
    
    
}
