/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
import Modelo.Conexion;
import Modelo.RolesM;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author InaRu
 */
public class RolesCRUD implements IRoles {
    
    
    
    
    @Override
    public boolean anyadirRol(RolesM rol){
      boolean anyadir=false; 
      Statement st=null; 
      Connection con=null; 
      
      String sql="INSERT INTO roles VALUES (NULL,'"+ rol.getNom_rol()+" ')";
     
       System.out.println("Añadimos el rol " + rol.getNom_rol());
        try {
          con=Conexion.conectarBD();
          st=con.createStatement();
          st.execute(sql);
          anyadir=true;
          st.close();
          con.close();
        } catch (SQLException ex) {
            System.out.println("Error al añadir un nuevo rol de usuario ");
            return false;
            
        }
        
        return anyadir; 
        
        
        
    }
    
    
    @Override
    public List<RolesM> obtenerRol(){
        
        Connection co=null;
        Statement stm=null; 
        ResultSet rs=null; 
        
        String sql="SELECT * FROM roles ORDER BY idroles";
        
        List<RolesM> listaRoles=new ArrayList<>(); 
        
        try {			
			co= Conexion.conectarBD();
			stm=co.createStatement();
			rs= stm.executeQuery(sql);
			while (rs.next()) {
				RolesM rm=new RolesM();
				rm.setID_rol(rs.getInt(1));
				rm.setNom_rol(rs.getString(2));
				
				listaRoles.add(rm);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase EmpresasCRUD, método obtener");
			
		}
		
		return listaRoles;   
        
        
        
    }
    
    
    @Override
    public boolean modificarRol(RolesM rol){
        
        Connection connect=null;
        Statement stm=null;
        boolean modificar=false;
        
        String sql="UPDATE empresa SET nom_rol='"+rol.getNom_rol()+"' WHERE idroles="+rol.getID_rol();
                  
        
        try {
            connect=Conexion.conectarBD();
            stm=connect.createStatement();
            stm.execute(sql);
            modificar=true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase RolCRUD - método modificar rol");
           // Logger.getLogger(UsuariosParaBororrar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        return modificar;     
         
    }
    
    @Override
    public boolean eliminarRol(RolesM rol){
       
        Connection conn=null;
        Statement stm=null; 
        
        boolean eliminar=false; 
        
        String sql="DELETE FROM empresa WHERE idroles="+rol.getID_rol();
        
        
       

        try {
            conn=Conexion.conectarBD();
            stm=conn.createStatement();
            stm.execute(sql);
            eliminar=true;
            
        } catch (SQLException ex) {
            System.out.println("Error: Clase RolesCRUD - método eliminar");
            //Logger.getLogger(UsuariosParaBororrar.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        return eliminar;
        
    }
    
    
    public DefaultTableModel mostrar(String buscar)
    {
        
    Connection conn=null;
    Statement stm=null; 
        
    DefaultTableModel modelo;
    String [] titulos={"Codigo","Nombre","Permiso"};
    String [] registro=new String [8];
    
    modelo=new DefaultTableModel(null,titulos);
    
    String sSQL="select * from roles where nom_rol like '%"+buscar+"%' order by idempresa";
    try{
        
        conn=Conexion.conectarBD();
        //Declaro variable de tipo Statement 
        stm=conn.createStatement();
        //stm.execute(sSQL);
 
    //crear variable tipo resultset ejecuta la consulta de arriba
    ResultSet rs=stm.executeQuery(sSQL);
    
    while(rs.next())
    {
       registro [0]=rs.getString("idroles");
       registro [1]=rs.getString("nom_rol");
   
       modelo.addRow(registro);
    }
    return modelo;
    }catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
        return null;
    }
    }

 
    
    
    
    
    
    
    
    
    
}
