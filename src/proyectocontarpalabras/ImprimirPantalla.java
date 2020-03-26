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
    
    public String textoCaracteresTotal(int total){
        return "El numero total de caracteres sin contar espacios es: " + total;
    }
    
    public String textoNumeroPalabras(int total){
        return "El numero total de palabras es: " + total;
    }
    
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

