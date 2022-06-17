package DAO;


import java.util.List;
import Modelo.UsuariosM;

/**
 *
 * @author InaRu
 *//**
 * Interfaz que registra los métodos CRUD de Usuarios
 * @author InaRu
 */
public interface IUsuarios {
    public boolean anyadirUsuario(UsuariosM usuario);
    public List<UsuariosM> obtener();
    public boolean modificar(UsuariosM usuario);
    public boolean eliminar(UsuariosM usuario);
    
    
}
