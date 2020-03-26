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
public class ContarPalabras {
    String cadena;
    char letra [];
    int [] repeat;
    /**
     * Constructor de contarPalabras con la frase del usuario y los arrays de las
     * letras y de las repeticiones.
     * @param frase Frase esxcrita por el usuario
     * @param ArrayLetras Array de todos los caracteres disponibles
     * @param ArrayRepeticion Array de las repeticiones de cada caracter
     */
    public ContarPalabras(String frase, char[] ArrayLetras, int[] ArrayRepeticion) {
        this.cadena=frase.toLowerCase();    
        this.letra=ArrayLetras;
        this.repeat=ArrayRepeticion;
        
    }

    /**
     * Retorna el numero total de caracteres que hay en la frase sin contar
     * los espacios.
     * @return La cuenta total de caracteres
     */
    public int contarCaracteresTotal(){
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
    /**
     * Retorna el numero de palabras que hay en la frase, yo personalmente
     * entiendo como palabra cualquier cadena de texto de 2 o mas caracteres
     * asumiendo que el usuario simpre va a introducir palabras reales.
     * @return La cuenta de palabras
     */
    public int contarNumeroPalabras(){
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
    /**
     * Retorna un Array identico al de las letras pero esta vez con la suma de la
     * repeticion de cada uno de los caracteres.
     * @return El array de repeticiones
     */
    public int[] contarTodosCaracteres(){
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
}
