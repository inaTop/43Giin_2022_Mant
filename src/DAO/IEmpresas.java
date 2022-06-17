/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import Modelo.EmpresaM;

/**
 *
 * @author InaRu
 */
public interface IEmpresas {
    public boolean anyadirEmpresa(EmpresaM empresa);
    public List<EmpresaM> obtenerEmpresa();
    public boolean modificarEmpresa(EmpresaM empresa);
    public boolean eliminarEmpresa(EmpresaM empresa);
    
    
    
}
