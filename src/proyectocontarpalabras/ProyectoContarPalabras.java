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

    static Scanner sc = new Scanner (System.in);   
    public static final char[] letra = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
        'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y','z','0','1','2','3','4','5','6','7','8','9',',','.',';',':','-','_',
        '[',']','{','}','!','¡','?','¿','=',')','(','/','&','%','$','"'};
    public static int[] repeat =  new int [letra.length];
    public static int caracteresTotales;   
    public static int numPalabras;
    public static int[] CaracteresXTipo;
     /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
             
        System.out.print("Introduce una cadena de caracteres: ");
        String chain_recived = sc.nextLine();        
        contarPalabras(chain_recived);
        imprimirPantalla();
                          
    }    
    
    public static void contarPalabras(String chain_recived){
        String chain = chain_recived.toLowerCase();
        ContarPalabras contarPalabras = new ContarPalabras();
        caracteresTotales=contarPalabras.contarCaracteresTotal(chain, letra);
        numPalabras = contarPalabras.contarNumeroPalabras(chain,letra);        
        CaracteresXTipo = contarPalabras.contarTodosCaracteres(chain,letra,repeat);    
    }
    
    public static void imprimirPantalla(){
        ImprimirPantalla imprimirPantalla = new ImprimirPantalla();
        System.out.println(imprimirPantalla.textoCaracteresTotal(caracteresTotales));
        System.out.println(imprimirPantalla.textoNumeroPalabras(numPalabras));
        System.out.println(imprimirPantalla.textoTodosCaracteres(CaracteresXTipo, letra));   
    }
        
}
