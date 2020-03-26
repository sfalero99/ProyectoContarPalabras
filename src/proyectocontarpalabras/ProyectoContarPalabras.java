/*
Una vez que todo funcione,
1.Separa el método contarPalabras en tres métodos diferentes.
int contarCaracteresTotal(String cadena) :  devuelve el número total de caracteres dada una determinada cadena.
int contarNumeroPalabras(String cadena) : cuenta el número de palabras introducido.
int[ ] contarTodosCaracteres(String cadena) : devuelve la cantidad de caracteres de cada tipo.
2. Separa el método mostrarResultados en tres:
String textoCaracteresTotal (int total)
String textoNumeroPalabras (int total)
String textoTodosCaracteres (int [])
3. Cambia en el main la lógica, para invocar de manera correcta y ordenada cada uno de estos métodos.
 */
package proyectocontarpalabras;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class ProyectoContarPalabras {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        
        inicioApp llamada = new inicioApp();
               
        System.out.print("Introduce una cadena de caracteres: ");
        String chain_recived = sc.nextLine();
        String chain = chain_recived.toLowerCase();
        
        int caracteresTotales=llamada.contarCaracteresTotal(chain);
        int numPalabras = llamada.contarNumeroPalabras(chain);        
        int[] CaracteresXTipo = llamada.contarTodosCaracteres(chain);        
        
        System.out.println(llamada.textoCaracteresTotal(caracteresTotales));
        System.out.println(llamada.textoNumeroPalabras(numPalabras));
        System.out.println(llamada.textoTodosCaracteres(CaracteresXTipo));                     
    }    
}
