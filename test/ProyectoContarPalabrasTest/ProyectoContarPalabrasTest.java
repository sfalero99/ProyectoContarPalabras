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
import proyectocontarpalabras.ImprimirPantalla;

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
    /**
     * Se realiza el test del primer metodo de la clase ContarPalabras 
     * comprobando si el resultado es correcto, y si no es mayor o menor que dicho
     * resultado correcto.
     */
    @Test
    public void contarCaracteresTotalTest() {
        ContarPalabras contarPalabrasTest = new ContarPalabras("Hola que tal", letra, repeat);
        int respuesta = contarPalabrasTest.contarCaracteresTotal();
        assertTrue(respuesta == 10);
        assertFalse(respuesta > 10);
        assertFalse(respuesta < 10);        
    }
    
    /**
     * Se realiza el test del segundo metodo de la clase contarPalabras comprobando
     * si el resultado que da es el real, si no comete el fallo de contar la 'y' ya
     * que no esta considerado como palabra y si no es mayor o menor que
     * el resultado correcto.
     */
    @Test
    public void contarNumeroPalabrasTest(){
        ContarPalabras contarPalabrasTest = new ContarPalabras("Bien y tu que tal estas", letra, repeat);
        int respuesta = contarPalabrasTest.contarNumeroPalabras();
        assertTrue(respuesta == 5);
        assertFalse(respuesta == 6);
        assertFalse(respuesta > 6);
        assertFalse(respuesta < 5);
    }
    
    /**
     * Se realiza el test del tercer metodo de la clase ContarPalabras 
     * comprobando si algunas de las posiciones del array son correcto si por
     * ejemplo uno de las posiciones no esta null y contiene algun tipo de 
     * informacion y por ultimo si alguno de los campos de caracteres no 
     * repetidos es igual a 0.
     */
    @Test
    public void contarTodosCaracteresTest(){
        ContarPalabras contarPalabrasTest = new ContarPalabras("Bien, Me alegro mucho", letra, repeat);
        repeat = contarPalabrasTest.contarTodosCaracteres();
        assertTrue(repeat[0] == 1);
        assertTrue(repeat[4] == 3);
        assertTrue(repeat[5] == 0);
        assertNotNull(repeat[13]);        
    }
    
    /**
     * Se realiza el test de los 3 metodos de la clase imprimirPantalla
     * comprobando si devuelven contenido y no devuelven valor nulo.
     */
    @Test
    public void imprimirPantallaTest(){
        ImprimirPantalla  imprimirPantallaTest = new ImprimirPantalla();
        assertNotNull(imprimirPantallaTest.textoCaracteresTotal(5));
        assertNotNull(imprimirPantallaTest.textoNumeroPalabras(3));
        assertNotNull(imprimirPantallaTest.textoTodosCaracteres(repeat, letra));
    }
}
