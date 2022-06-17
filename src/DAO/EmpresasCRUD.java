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
import Modelo.EmpresaM;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author InaRu
 */
public class EmpresasCRUD implements IEmpresas {
    
    
    
    
    @Override
    public boolean anyadirEmpresa(EmpresaM empresa){
      boolean anyadir=false; 
      Statement st=null; 
      Connection con=null; 
      
      String sql="INSERT INTO empresa VALUES (NULL,'"+ empresa.getNom_empresa()+"','"+ empresa.getDescr_empresa()+" ')";
     
       System.out.println("Añadimos el registro " + empresa.getNom_empresa());
        try {
          con=Conexion.conectarBD();
          st=con.createStatement();
          st.execute(sql);
          anyadir=true;
          st.close();
          con.close();
        } catch (SQLException ex) {
            System.out.println("Error al añadir una nueva empresa");
            return false;
            
        }
        
        return anyadir; 
        
        
        
    }
    
    
    @Override
    public List<EmpresaM> obtenerEmpresa(){
        
        Connection co=null;
        Statement stm=null; 
        ResultSet rs=null; 
        
        String sql="SELECT * FROM empresa ORDER BY IdEmpresa";
        
        List<EmpresaM> listaEmpresas=new ArrayList<>(); 
        
        try {			
			co= Conexion.conectarBD();
			stm=co.createStatement();
			rs= stm.executeQuery(sql);
			while (rs.next()) {
				EmpresaM em=new EmpresaM();
				em.setID_empresa(rs.getInt(1));
				em.setNom_empresa(rs.getString(2));
				em.setDescr(rs.getString(3));
				listaEmpresas.add(em);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase EmpresasCRUD, método obtener");
			
		}
		
		return listaEmpresas;   
        
        
        
    }
    
    
    @Override
    public boolean modificarEmpresa(EmpresaM empresa){
        
        Connection connect=null;
        Statement stm=null;
        boolean modificar=false;
        
        String sql="UPDATE empresa SET nom_empresa='"+empresa.getNom_empresa()+"', descripcion='"+empresa.getDescr_empresa()+"'" +" WHERE IdEmpresa="+empresa.getID_empresa();
                  
        
        try {
            connect=Conexion.conectarBD();
            stm=connect.createStatement();
            stm.execute(sql);
            modificar=true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase EmpresasCRUD - método modificar empresa");
           // Logger.getLogger(UsuariosParaBororrar.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        return modificar;     
         
    }
    
    @Override
    public boolean eliminarEmpresa(EmpresaM empresa){
       
        Connection conn=null;
        Statement stm=null; 
        
        boolean eliminar=false; 
        
        String sql="DELETE FROM empresa WHERE idEmpresa="+empresa.getID_empresa();
        //String sql="DELETE FROM empresa WHERE nom_empresa="+empresa.getNom_empresa();
        
       

        try {
            conn=Conexion.conectarBD();
            stm=conn.createStatement();
            stm.execute(sql);
            eliminar=true;
            
        } catch (SQLException ex) {
            System.out.println("Error: Clase EmpresaCRUD - método eliminar");
            //Logger.getLogger(UsuariosParaBororrar.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        
        return eliminar;
        
    }
    
    
    public DefaultTableModel mostrar(String buscar)
    {
        
    Connection conn=null;
    Statement stm=null; 
        
    DefaultTableModel modelo;
    String [] titulos={"Codigo","Nombre","Descripción"};
    String [] registro=new String [8];
    
    modelo=new DefaultTableModel(null,titulos);
    
    String sSQL="select * from empresa where nom_empresa like '%"+buscar+"%' order by idempresa";
    try{
        
        conn=Conexion.conectarBD();
        //Declaro variable de tipo Statement 
        stm=conn.createStatement();
        //stm.execute(sSQL);
 
    //crear variable tipo resultset ejecuta la consulta de arriba
    ResultSet rs=stm.executeQuery(sSQL);
    
    while(rs.next())
    {
       registro [0]=rs.getString("idempresa");
       registro [1]=rs.getString("nom_empresa");
       registro [2]=rs.getString("descripcion");
       modelo.addRow(registro);
    }
    return modelo;
    }catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
        return null;
    }
    }
    
    
    
    
    
    
    
    
    
}
