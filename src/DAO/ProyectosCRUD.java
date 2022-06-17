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
import Modelo.ProyectosM;

/**
 *
 * @author InaRu
 */
public class ProyectosCRUD implements IProyectos
{

    @Override
    public boolean anyadirProyectos(ProyectosM proyecto) {
      boolean anyadir=false; 
      Statement st=null; 
      Connection con=null; 
      
      String sql="INSERT INTO proyectos VALUES (NULL,'"+ proyecto.getNom_pr() +"','"+ proyecto.getTipo_pr()+"', '"+proyecto.getCliente()+"',' "+proyecto.getFecha_ini()+"','"+proyecto.getFecha_entrega()+"','"+proyecto.getEstadoPR()+"','"+proyecto.getDescripcion()+" ')";
      
       System.out.println("Añadimos el proyecto " + proyecto.getNom_pr());
        try {
          con=Conexion.conectarBD();
          st=con.createStatement();
          st.execute(sql);
          anyadir=true;
          st.close();
          con.close();
        } catch (SQLException ex) {
            System.out.println("Error al crear un nuevo proyecto");
            return false;
        }
        
        return anyadir; 
        
         
    }

    @Override
    public List<ProyectosM> obtenerPR() {
        Connection co=null;
        Statement stm=null; 
        ResultSet rs=null; 
        
        String sql="SELECT * FROM proyectos ORDER BY idproyectos";
        
        List<ProyectosM> listaProyectos=new ArrayList<ProyectosM>(); 
        
        try {			
			co= Conexion.conectarBD();
			stm=co.createStatement();
			rs= stm.executeQuery(sql);
			while (rs.next()) {
				ProyectosM p=new ProyectosM();
				p.setCodigo_pr(rs.getInt(1));
				p.setNom_pr(rs.getString(2));
				p.setTipo_pr(rs.getString(3));
				p.setFecha_ini(rs.getDate(4));
                                p.setFecha_entrega(rs.getDate(5));
                                p.setDescripcion(rs.getString(6));
				listaProyectos.add(p);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase ProyectosCRUD, método obtener proyecto");
			
		}
		
		return listaProyectos;   
        
    }

    @Override
    public boolean modificarPR(ProyectosM proyecto) {
        Connection connect=null;
        Statement stm=null;
        boolean modificar=false;
        
        String sql="UPDATE proyectos SET nom_proyecto='"+proyecto.getNom_pr()+"', descripcion='"+proyecto.getDescripcion()+"', fechaIN='"+proyecto.getFecha_ini()+"', fechaEntrega='"+proyecto.getFecha_entrega()+"',cliente='"+proyecto.getCliente()+"', estado='"+proyecto.getEstadoPR()+"'" +" WHERE idproyectos="+proyecto.getCodigo_pr();
               
        
        try {
            connect=Conexion.conectarBD();
            stm=connect.createStatement();
            stm.execute(sql);
            modificar=true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase ProyectosCRUD - método modificar proyecto");
            
            return false;
        }
        
        
        return modificar;     
    }

    @Override
    public boolean eliminarPR(ProyectosM proyecto) {
       Connection conn=null;
        Statement stm=null; 
        
        boolean eliminar=false; 
        
        String sql="DELETE FROM proyectos WHERE idproyectos="+proyecto.getCodigo_pr();
        String sql2="DELETE FROM proyectos WHERE nom_proyecto="+proyecto.getNom_pr();
       
       

        try {
            conn=Conexion.conectarBD();
            stm=conn.createStatement();
            stm.execute(sql);
            eliminar=true;
            
        } catch (SQLException ex) {
            System.out.println("Error: Clase ProyectosCRUD - método eliminar proyecto");
            //Logger.getLogger(UsuariosParaBororrar.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        return eliminar;
    }
    
}
