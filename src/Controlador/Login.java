/**
*
* Clase que implementa el control de Autenticación
* @author: ç Inés Topalli
* @version: v0.1 24/03/2022
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/
package Controlador;

import Modelo.UsuariosM;




/**
 * Clase controlAutenticacion 
 * @author:Inés Topalli
 */
public class Login {
    private final String nom;
    private final String pass;

    
    /**
    * Constructor de la clase controlAutenticación
    * @param nom Nombre del usuario
    * @param pass Password del Usuario
    */
    public Login(String nom, String pass){
        this.nom=nom;
        this.pass=pass;
    }

    Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
    * Función autenticar
    * @return Devuelve el resultado de la consulta sobre el nombre del usuario. Permite saber si el usuario es válido 
    */

}
