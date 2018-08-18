/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combination;

import Common.Values;

/**
 *
 * @author Lescoffit
 */
public class CombinationRandomSol {
    
    public static String Randomsol(String solution){
        Values val = Values.getInstance();
        int rand =0;
        int i = 0;
                
        while(i !=  val.Clenght){
         rand = rand *10;
         rand = rand + (1 + (int)(Math.random()* ((9 - 1) +1)));
         i= i+1;
         
        }
           
    solution = String.valueOf(rand);
    return(solution);
    
}
}
