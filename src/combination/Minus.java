/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combination;

/**
 *
 * @author lolit
 */
public class Minus {
        
    public static int Compare(int In){
            int out = 0;
            if(In == 9){
                out = 8;     
            }
            else if(In == 8){
                out = 7; 
            }
            else if(In == 7){
                out = 5; 
            }
            else if(In == 6){
                out = 3; 
            }
            else if(In == 5){
                out = 4; 
            }
            else if(In == 4){
                out = 2;
            }
            else if(In == 3){
                out = 1; 
            }
            else if(In == 2){
                out = 1; 
            }
            
            return(out);
        }
}
