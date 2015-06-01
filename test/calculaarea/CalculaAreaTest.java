/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculaarea;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sbenavidesvazquez
 */
public class CalculaAreaTest {
    
    public CalculaAreaTest() {
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
     * Test of calArea method, of class CalculaArea.
     */
    @Test
    public void testCalArea() {
        System.out.println("cuadrado");
        Metodo mo1 = new Metodo("cuadrado",5,6,2);
        CalculaArea.calArea(mo1);
        float expResult1 = 25.0F;
        assertEquals(expResult1, mo1.getArea(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("rectangulo");
        Metodo mo2 = new Metodo("rectangulo",5,6,2);
        CalculaArea.calArea(mo2);
        float expResult2 = 30.0F;
        assertEquals(expResult2, mo2.getArea(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("triangulo");
        Metodo mo3 = new Metodo("triangulo",5,6,2);
        CalculaArea.calArea(mo3);
        float expResult3 = 15.0F;
        assertEquals(expResult3, mo3.getArea(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("circulo");
        Metodo mo4 = new Metodo("circulo",5,6,2);
        CalculaArea.calArea(mo4);
        float expResult4 = 6.28F;
        assertEquals(expResult4, mo4.getArea(), 1.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
