/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p1_darielsevilla;

/**
 *
 * @author HP
 */
public class Matrices {
    private int num;
    private int[][] mat;
    private int[][] matResp;
    private int[] arrayResp;
    
    
    public Matrices(int Numeros_B, int[][] par){
        this.mat = par;
        this.num = Numeros_B;
        
        
        if(checkMat(mat)){
            matResp = matResp(num, mat);
        }else{
            matResp = matResp(-1, mat);
        }
        
    }
    
    public int[][] getMatResp(){
        return matResp;
    }
    
    public int[] getArrayResp(){
        return arrayResp;
    }
    
    public int[][] getMat(){
        return mat;
    }
    
    public boolean checkMat(int[][] par){
        boolean check = false;
        
        for(int i = 0; i < par.length; i++){
            for(int j = 0; j < par[i].length; j++){
                if(par[i][j] == num){
                    check = true;
                }
            }
        }
        
        return check;
    }
    
    public int[][] matResp(int x, int[][] par){
        int arrSize = 0;
        int[][] temp = par;
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[0].length; j++){
                if(i == j || i + j == temp[0].length-1){
                    temp[i][j] = x;
                }else{
                    arrSize++;
                }
            }
        }
        
        arrayResp = new int[arrSize];
        int cont = 0;
        
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[0].length; j++){
                if(i != j && i + j != temp[0].length-1){
                    arrayResp[cont] = temp[i][j];
                    cont++;
                }
            }
            
        }
        
        arrayResp = ordenar(arrayResp);
        return temp;
    }
    
    public int[] ordenar(int[] par){
        
        int temp = 0;
        for(int i = 0; i < par.length; i++){
            
            for(int j = i; j < par.length; j++){
                
                if(par[j] < par[i]){
                    temp = par[i];
                    par[i] = par[j];
                    par[j] = temp;
                }
            }
            
        }   
        
        
        /*for(int i = 0; i < resp.length; i++){
            trueResp[i] = resp[resp.length - (i+1)];
        }*/
        
        return par;
    }
    
    
    
}
