/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p1_darielsevilla;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Cadenas {
    private String word;
    ArrayList<Character> chars = new ArrayList<>();
    
    public Cadenas(String word){
        this.word = word;
    }
    
    public String getWord(){
        return word;
    }
    
    public char repeticion(String par){
        int cont = 0;
        int cont2 = 0;
        char temp = '0';
        for(int i = 0; i < par.length(); i++){
            cont2 = 0;
            for(int j = 0; j < par.length(); j++){
                if(par.charAt(i) == par.charAt(j)){
                    cont2++;
                }
            }
            if(cont2 > cont){
                cont = cont2;
                temp = par.charAt(i);
            }
        }
        return temp;
    }
    
    public String returnLista(String cad){
        for(int i = 0; i < cad.length(); i++){
            chars.add(cad.charAt(i));
        }
        
        String resp = "";
        for(int i = 0; i < chars.size(); i++){
            resp +=  "[" + Character.toString(chars.get(i)) + "]";
        }
        return resp;
    }
    
    
}
