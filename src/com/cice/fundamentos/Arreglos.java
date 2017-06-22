/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fundamentos;

/**
 *
 * @author Manu
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Declaraciones de arrays
        int[] numeros={1,2};
        int otrosNumeros[];
        
        int[][] bidi={{1,2},{3,4}};
        
        int [][][] tridi={{{1,2},{3,4}},{{5,6},{7,8}},{{9,10},{11,12}}};
            int prueba=tridi[2][1][0];
            int[]edades[]=new int [2][2];
            String[] tipos[][]=new String[2][2][2];
            tipos[0][0][1]="25";
            
           
             
            
             for (String[][] c:tipos){
                for(String[] d:c){
                    for (String v:d){
                        System.out.println(v);
                        
                    }
                }
                
            }
            
            
       System.out.println(prueba);
    }
    
    
}
