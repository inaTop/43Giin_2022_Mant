/**
*
* Clase que implementa cada Usuario
* @author:  Inés Topalli
* @version: v0.1 24/03/2022
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/
package Controlador;


import java.util.ArrayList;
import java.util.List;

import DAO.IUsuarios;
import DAO.UsuariosCRUD;
import Modelo.UsuariosM;
import Vista.UsuariosView;


/**
 * Clase Usuarios 
 * @author:  Inés Topalli
 */
public class Usuarios {
    
    private UsuariosView vistaUsuario= new UsuariosView();
    
    
    public Usuarios(){
        
    }
    
    // método que llama al DAO para guardar un usuario
    public void anyadirUsuario(UsuariosM usuario){
        IUsuarios userDAO=new UsuariosCRUD();
        userDAO.anyadirUsuario(usuario);    
        
    }

    // método que llama al DAO para modificar un usuario
    public void modificar(UsuariosM usuario){
        IUsuarios userDAO=new UsuariosCRUD();
        userDAO.modificar(usuario);  
    
    }
    
    
    // método que llama al DAO para eliminar un usuario
    public void eliminar(UsuariosM usuario){
        IUsuarios userDAO=new UsuariosCRUD();
        userDAO.eliminar(usuario); 
    }
    
    // método que llama al DAO para obtener todos los usuarios
    public void verUsuarios(){
        List<UsuariosM> usuarios=new ArrayList<UsuariosM>();
        IUsuarios userDAO=new UsuariosCRUD();
        usuarios=userDAO.obtener();
        vistaUsuario.verUsuarios(usuarios);
        
        
    }

    
    
}
