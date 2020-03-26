/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoContarPalabrasTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import proyectocontarpalabras.ContarPalabras;

/**
 *
 * @author Sergio
 */
public class ProyectoContarPalabrasTest {
    
    char[] letra = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
        'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y','z','0','1','2','3','4','5','6','7','8','9',',','.',';',':','-','_',
        '[',']','{','}','!','¡','?','¿','=',')','(','/','&','%','$','"'};
    int[] repeat =  new int [letra.length]; 
    
    public ProyectoContarPalabrasTest() {
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
    public void contarCaracteresTotalTest() {
        ContarPalabras contarPalabrasTest = new ContarPalabras("Hola que tal", letra, repeat);
        int respuesta = contarPalabrasTest.contarCaracteresTotal();
        assertTrue(respuesta == 10);
        assertFalse(respuesta > 10);
        assertFalse(respuesta < 10);        
    }
    
    @Test
    public void contarNumeroPalabrasTest(){
        ContarPalabras contarPalabrasTest = new ContarPalabras("Bien y tu que tal estas", letra, repeat);
        int respuesta = contarPalabrasTest.contarNumeroPalabras();
        assertTrue(respuesta == 5);
        assertFalse(respuesta == 6);
        assertFalse(respuesta > 6);
        assertFalse(respuesta < 5);
    }
}
