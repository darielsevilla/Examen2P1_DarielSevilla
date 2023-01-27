
package examen2p1_darielsevilla;

import java.security.SecureRandom;
import javax.swing.JOptionPane;


public class Examen2P1_DarielSevilla {
    static SecureRandom random = new SecureRandom();
    
    public static int[][] lectura(int x){
        int[][] temp = new int[x][x];
        for(int i =0; i < temp.length; i++){
            for(int j = 0; j < temp[i].length; j++){
                temp[i][j] = random.nextInt(10) + 1;
            }
        }
        
        return temp;
    }
    
    
    public static boolean checkInt(String par){
        try{
            Integer.parseInt(par);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        
       
        Menu menu = new Menu();
        
       
    }
    
    
}
