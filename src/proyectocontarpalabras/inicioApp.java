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
public class inicioApp {
 
    private final char[] letra = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
        'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y','z','0','1','2','3','4','5','6','7','8','9',',','.',';',':','-','_',
        '[',']','{','}','!','¡','?','¿','=',')','(','/','&','%','$','"'};
    private  int[] repeat =  new int [letra.length];  
    
    
    int contarCaracteresTotal(String cadena){
        int count_caracters = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra_cadena = cadena.charAt(i);
            if (letra_cadena != ' '){
                for (int j = 0; j < letra.length; j++) {            
                    if (letra[j] == letra_cadena){
                        count_caracters++;
                    }   
                }
            }
        }
        return count_caracters;
    }
    
    int contarNumeroPalabras(String cadena){
        int count_words = 0;
        int dosChars  = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            char letra_cadena = cadena.charAt(i);
            if (letra_cadena != ' '){
                for (int j = 0; j < letra.length; j++) {            
                    if (letra[j] == letra_cadena){
                        dosChars++;
                    }   
                }
            }else{
                if (dosChars>=2){
                    count_words++;
                    dosChars = 0;
                }
            }
        }
        if (dosChars>=2){
            count_words++;            
        }
        return count_words;
    }
    
    int[] contarTodosCaracteres(String cadena){
        for (int i = 0; i < cadena.length(); i++) {
            char letra_cadena = cadena.charAt(i);
            if (letra_cadena != ' '){
                for (int j = 0; j < letra.length; j++) {            
                    if (letra[j] == letra_cadena){
                        repeat[j]++;
                    }   
                }
            }
        }        
        return repeat;
    }
    
    String textoCaracteresTotal(int total){
        return "El numero total de caracteres sin contar espacios es: " + total;
    }
    
    String textoNumeroPalabras(int total){
        return "El numero total de palabras es: " + total;
    }
    
    String textoTodosCaracteres(int[]total){
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