/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DAO;

import Modelo.EmpresaM;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author InaRu
 */
public class EmpresasCRUDTest {
    
    public EmpresasCRUDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of anyadirEmpresa method, of class EmpresasCRUD.
     */
    @Test
    public void testAnyadirEmpresa() {
        System.out.println("anyadirEmpresa");
        EmpresaM empresa = new EmpresaM();
        
        empresa.setNom_empresa("Ejemplo2");
        empresa.setDescr("funciona");
        
        EmpresasCRUD instance = new EmpresasCRUD();
        boolean expResult = true;
        boolean result = instance.anyadirEmpresa(empresa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerEmpresa method, of class EmpresasCRUD.
     */
    @Test
    public void testObtenerEmpresa() {
        System.out.println("obtenerEmpresa");
        EmpresasCRUD instance = new EmpresasCRUD();
        List<EmpresaM> expResult = null ;
        List<EmpresaM> result = instance.obtenerEmpresa();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEmpresa method, of class EmpresasCRUD.
     */
    @Test
    public void testModificarEmpresa() {
        System.out.println("modificarEmpresa");
        EmpresaM empresa = new EmpresaM();
      
        empresa.setNom_empresa("43Giin");
        empresa.setDescr("");
        
        EmpresasCRUD empresaC = new EmpresasCRUD();
        //boolean expResult = false;
        //boolean result = empresaC.modificarEmpresa(empresa);
        assertTrue(empresaC.modificarEmpresa(empresa));
        //assertEquals(expResult, result);

    }

    /**
     * Test of eliminarEmpresa method, of class EmpresasCRUD.
     */
    @Test
    public void testEliminarEmpresa() {
        System.out.println("eliminarEmpresa");
        EmpresaM empresa = new EmpresaM();
        
        int idEmpresa = empresa.getID_empresa();
        
        empresa.setID_empresa(idEmpresa);
        
        EmpresasCRUD empresaC = new EmpresasCRUD();
        boolean expResult = true;
        boolean result = empresaC.eliminarEmpresa(empresa);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class EmpresasCRUD.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        String buscar = "11";
        EmpresasCRUD instance = new EmpresasCRUD();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.mostrar(buscar);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
