/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocontarpalabras;

/**
 *
 * @author Sergio
 */
public class ImprimirPantalla {
    /**
     * Recibe la cantidad total de caracteres desde el main y devuelve el 
     * String que sera impreso desde el main otra vez.
     * @param total
     * @return 
     */
    public String textoCaracteresTotal(int total){
        return "El numero total de caracteres sin contar espacios es: " + total;
    }
    /**
     * Recibe el numero de palabras desde el main y devuelve el String que sera
     * impreso desde el main otra vez. 
     * @param total
     * @return 
     */
    public String textoNumeroPalabras(int total){
        return "El numero total de palabras es: " + total;
    }
    /**
     * Recibe del main el array de repeticiones y el de las letras para formar
     * el String que sera impreso desde el main, comprobando si hay solamente 
     * una repeticion para enviar el texto en singular o si hay mas de 1 para 
     * mostrar el texto en plural.
     * @param total
     * @param letra
     * @return 
     */
    public String textoTodosCaracteres(int[]total, char[] letra){
        String resultado="";
        for (int i = 0; i < total.length; i++) {
            if (total[i]>1){
                resultado += "El caracter " + letra[i] + " se repite " + total[i] + " veces.\n";
            }else if(total[i]==1){
                resultado += "El caracter " + letra[i] + " se repite " + total[i] + " vez.\n";
            }
        }    
            return resultado;
    } 
}

