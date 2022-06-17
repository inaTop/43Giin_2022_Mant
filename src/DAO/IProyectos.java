package DAO;


import java.util.List;
import Modelo.ProyectosM;

/**
 *
 * @author InaRu
 *//**
 * Interfaz que registra los métodos CRUD de Usuarios
 * @author InaRu
 */
public interface IProyectos {
    public boolean anyadirProyectos(ProyectosM proyecto);
    public List<ProyectosM> obtenerPR();
    public boolean modificarPR(ProyectosM usuario);
    public boolean eliminarPR(ProyectosM usuario);
    
    
}
