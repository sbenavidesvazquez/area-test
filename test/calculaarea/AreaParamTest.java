/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculaarea;

import java.util.Arrays;
import java.util.Collection;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author sbenavidesvazquez
 */

@RunWith(Parameterized.class)
public class AreaParamTest {
    private Metodo mo;
    private float result;
    private CalculaArea calculo;
    
    
   @Before
   public void initialize() {
      calculo = new CalculaArea();
   }
   
   public AreaParamTest(Metodo m,float resul) {
      this.mo=m;
      this.result=resul;
   }
   
   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         {new Metodo("cuadrado",5,6,0),25},
         {new Metodo ("rectangulo",5,6,0), 30},
         {new Metodo ("triangulo",5,6,0),15 },
         {new Metodo ("circulo",0,0,2),6.28 }
      });
   }
   
   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + result);
      assertEquals(result, 
      calculo.calArea(mo),2.0);
   }
}
