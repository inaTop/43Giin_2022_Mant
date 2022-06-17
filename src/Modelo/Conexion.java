package Modelo;
/**
*
* Clase que implementa la Conexion a la base de datos
* @author:  Ines Topalli
* @version: v0.1 24/03/2022
* @see <a href="https://www.universidadviu.com/"> VIU </a>
*/

import java.sql.*;


/**
 *
 * @author: Ines Topalli
 */
public class Conexion {
    
     Connection con;
    // String driver="com.mysql.jdbc.Driver";        
   
    /**
     * Funci�n que permite conectar a la base de datos 
     * @return con
     */
    public static Connection conectarBD() {
         
        Connection con = null;
        String password = "";
	String usuario = "root";
	String url = "jdbc:mysql://localhost:3306/mps?user=" + usuario
				+ "&password=" + password;
		try {
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado a la base de datos");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
		}
		return con;
	}   
    



    /**
     * Consulta la conexi�n a la base de datos
     * @return Devuelve la conexi�n a la base de datos
     */
    
    public Connection getConnection(){
        return con;
    }
      
    /**
     * Aplica la conexi�n a la base de datos
     * @param conexion
     */
    public void setConnection(Connection conexion){
        con=conexion;
    }
    
     
        
    
   /*public ResultSet consultar(String sql) {
        ResultSet resultado;
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }        return resultado;
    }*/
                                             
}