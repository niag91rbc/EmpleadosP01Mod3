package cl.duoc;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BussEmpleadoTest {
    
    public BussEmpleadoTest() {
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

    @Test
    public void testBuscar(){ 
        System.out.println("Empleado Buscado.");
        Empleado empleado = new Empleado("234", "dfgfdg", 23, 432); 
        BussEmpleado instance = new BussEmpleado(); 
        boolean esperado=true; 
        boolean obtenido=instance.Modificar(empleado); 
        Assert.assertEquals(esperado, obtenido);
    }
        /*
        System.out.println("Buscar");
        String rut = "";
        BussEmpleado instance = new BussEmpleado();
        Empleado expResult = null;
        Empleado result = instance.Buscar(rut);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
        */       
    
    @Test
    public void testCrear(){
        System.out.println("Empleado Agregadado.");
        Empleado empleado = new Empleado("58056877", "Celeste", 29, 5); 
        BussEmpleado instance = new BussEmpleado(); 
        boolean esperado=true; 
        boolean obtenido=instance.Crear(empleado); 
        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void testModificar(){
        System.out.println("Empleado Modificado.");
        Empleado empleado = new Empleado("234", "dfgfdg", 23, 432); 
        BussEmpleado instance = new BussEmpleado(); 
        instance.Crear(empleado);
        boolean esperado=true; 
        boolean obtenido=instance.Modificar(empleado); 
        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void testEliminar(){ 
        System.out.println("Venta Eliminada.");
        String codigo="123";
        Empleado empleado = new Empleado("957", "Anthony", 54, 63); 
        BussEmpleado instance = new BussEmpleado(); 
        instance.Crear(empleado);
        boolean esperado=true; 
        boolean obtenido=instance.Eliminar(codigo); 
        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void testMontoBono(){
        System.out.println("Monto del Empleado.");
        Empleado empleado = new Empleado("88888888", "Nelson", 45, 10); 
        BussEmpleado instance = new BussEmpleado(); 
        boolean esperado=true; 
        boolean obtenido=instance.Crear(empleado); 
        Assert.assertEquals(esperado, obtenido);
        /*
        System.out.println("montoBono");
        BussEmpleado instance = new BussEmpleado();
        boolean expResult = false;
        boolean result = instance.montoBono();
        assertEquals(expResult, result);
        */
    }    
}
