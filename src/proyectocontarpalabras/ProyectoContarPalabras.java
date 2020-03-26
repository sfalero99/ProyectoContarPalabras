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
 * @version 26/03/2020
 */
public class ProyectoContarPalabras {

    static Scanner sc = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Array de los caracteres posibles y las repeticiones de cada uno 
         * dependiendo del tamaño del primero.
         */
        char[] letra = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
        'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y','z','0','1','2','3','4','5','6','7','8','9',',','.',';',':','-','_',
        '[',']','{','}','!','¡','?','¿','=',')','(','/','&','%','$','"'};
        int[] repeat =  new int [letra.length]; 
        /**
         * Se recoge la frase escrita por el usuario.
         */
        System.out.print("Introduce una cadena de caracteres: ");
        String chain = sc.nextLine();
        
        /**
         * Se llama a los constructores enviando en el caso del primero la frase,
         * y los arrays de las letras y las repeticiones.
         * En el caso de imprimirPantalla se llama al constructor sin ningun
         * parametro.
         */
        ContarPalabras contarPalabras = new ContarPalabras(chain, letra, repeat);
        ImprimirPantalla imprimirPantalla = new ImprimirPantalla();                     
        
        /**
         * Se guarda en las siguientes variables el resultados de los metodos 
         * de la clase ContarPalabras
         */
        int caracteresTotales=contarPalabras.contarCaracteresTotal();
        int numPalabras = contarPalabras.contarNumeroPalabras();        
        int[] CaracteresXTipo = contarPalabras.contarTodosCaracteres();        
        
        /**
         * Se imprime por pantalla el resultado que devuelven los metodos
         * de la clase ImprimirPantalla a las cuales enviamos las variables
         * que necesitan de los metodos anteriores.
         */
        System.out.println(imprimirPantalla.textoCaracteresTotal(caracteresTotales));
        System.out.println(imprimirPantalla.textoNumeroPalabras(numPalabras));
        System.out.println(imprimirPantalla.textoTodosCaracteres(CaracteresXTipo, letra));                     
    }    
}
