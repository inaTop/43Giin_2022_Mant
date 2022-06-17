package DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import Modelo.Conexion;

import Modelo.UsuariosM;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author InaRu
 */
public class UsuariosCRUD implements IUsuarios {
    
    @Override
    public boolean anyadirUsuario(UsuariosM usuario){
      boolean anyadir=false; 
      Statement st=null; 
      Connection con=null; 
      
      String sql="INSERT INTO usuarios VALUES (NULL,'"+ usuario.getNom_usuario()+"', '"+usuario.getPass()+"',' "+usuario.getEmail()+"','"+usuario.getEmpresa()+"','"+usuario.getRol()+" ')";
      
       System.out.println("Añadimos el registro " + usuario.getNom_usuario());
        try {
          con=Conexion.conectarBD();
          st=con.createStatement();
          st.execute(sql);
          anyadir=true;
          st.close();
          con.close();
        } catch (SQLException ex) {
            System.out.println("Error al añadir un nuevo usuario");
            return false;
        }
        
        return anyadir; 
        
        
    }
    
    
    
    @Override
    public List<UsuariosM> obtener(){
        Connection co=null;
        Statement stm=null; 
        ResultSet rs=null; 
        
        String sql="SELECT * FROM USUARIOS ORDER BY IdUsuarios";
        
        List<UsuariosM> listaUsuarios=new ArrayList<UsuariosM>(); 
        
        try {			
			co= Conexion.conectarBD();
			stm=co.createStatement();
			rs= stm.executeQuery(sql);
			while (rs.next()) {
				UsuariosM u=new UsuariosM();
				u.setIdUsuario(rs.getInt(1));
				u.setNom_usuario(rs.getString(2));
				u.setPass(rs.getString(3));
				u.setEmail(rs.getString(4));
                                u.setEmpresa(rs.getString(5));
                                u.setRol(rs.getString(6));
				listaUsuarios.add(u);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase UsuariosCRUD, método obtener");
			
		}
		
		return listaUsuarios;   
        
        
    }
    
    
    //Aqui todo el codigo para modificar de la base de datos a través de sql
    @Override
    public boolean modificar(UsuariosM usuario){
        
        Connection connect=null;
        Statement stm=null;
        boolean modificar=false;
        
        String sql="UPDATE USUARIOS SET nom_Usuarios='"+usuario.getNom_usuario()+"', passw='"+usuario.getPass()+"', email='"+usuario.getEmail()+"', IdEmpresa='"+usuario.getEmpresa()+"', rol='"+usuario.getRol()+"'" +" WHERE IdUsuarios="+usuario.getIdUsuario();
                  
        
        try {
            connect=Conexion.conectarBD();
            stm=connect.createStatement();
            stm.execute(sql);
            modificar=true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase UsuariosCRUD - método modificar usuario");
            
            return false;
        }
        
        
        return modificar;     
        
    }
    
    
    
     //Aqui todo el codigo para borrar de la base de datos  a través de sql
    @Override
    public boolean eliminar(UsuariosM usuario){
        
        Connection conn=null;
        Statement stm=null; 
        
        boolean eliminar=false; 
        
        String sql="DELETE FROM usuarios WHERE idUsuarios="+usuario.getIdUsuario();
        //String sql2="DELETE FROM usuarios WHERE nom_usuarios="+usuario.getNom_usuario();
       
       

        try {
            conn=Conexion.conectarBD();
            stm=conn.createStatement();
            stm.execute(sql);
            eliminar=true;
            
        } catch (SQLException ex) {
            System.out.println("Error: Clase UsuariosCRUD - método eliminar");
            //Logger.getLogger(UsuariosParaBororrar.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        return eliminar;
        
    }
    
    /**
     * Permite seleccionar el nombre del usuario
     * @param nombre Nombre del usuario
     * @return
     */
    public String select_nom_usuario(String nombre){
        String devuelta=null;
        Statement stmt=null; 
        ResultSet rs;
        try {
            rs=stmt.executeQuery("SELECT nom_usuario FROM USUARIOS WHERE nom_usuario=" + nombre);
        } catch (SQLException ex) {
           System.out.println("Error en CRUD USUARIOS - método select_nom_usuario");
            return "-1";
        }
        try {
            devuelta=rs.getString(1);
        } catch (SQLException ex) {
           System.out.println("Error en CRUD USUARIOS - método select_nom_usuario");
        }
        return devuelta;
    }
   
    
        
    public DefaultTableModel mostrar(String buscar)
    {
        
    Connection conn=null;
    Statement stm=null; 
        
    DefaultTableModel modeloU;
    String [] titulos={"Codigo","Nombre","Contraseña","Rol","Email","Empresa"};
    String [] registro=new String [8];
    
    modeloU=new DefaultTableModel(null,titulos);
    
    String sSQL="select * from usuarios where nom_usuario like '%"+buscar+"%' order by idusuarios";
    try{
        
        conn=Conexion.conectarBD();
        //Declaro variable de tipo Statement 
        stm=conn.createStatement();
        //stm.execute(sSQL);
 
    //crear variable tipo resultset ejecuta la consulta de arriba
    ResultSet rs=stm.executeQuery(sSQL);
    
    while(rs.next())
    {
       registro [0]=rs.getString("idusuarios");
       registro [1]=rs.getString("nom_usuario");
       registro [2]=rs.getString("contrasenya");
       registro [3]=rs.getString("idRol");
       registro [4]=rs.getString("email");
       registro [5]=rs.getString("empresa");
       modeloU.addRow(registro);
    }
    return modeloU;
    }catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
        return null;
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    

