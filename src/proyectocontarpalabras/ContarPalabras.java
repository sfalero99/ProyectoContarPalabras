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
    
    public ContarPalabras(String frase, char[] ArrayLetras, int[] ArrayRepeticion) {
        this.cadena=frase.toLowerCase();    
        this.letra=ArrayLetras;
        this.repeat=ArrayRepeticion;
        
    }

    public ContarPalabras() {
    
    }
    
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
