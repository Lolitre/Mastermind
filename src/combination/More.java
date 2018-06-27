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
public class More {
        
    public static int Compare(int In){
        int out = 0;
            if(In == 8){
                out = 9;     
            }
            else if(In == 7){
                out = 8; 
            }
            else if(In == 6){
                out = 8; 
            }
            else if(In == 5){
                out = 6; 
            }
            else if(In == 4){
                out = 5; 
            }
            else if(In == 3){
                out = 4;
            }
            else if(In == 2){
                out = 3; 
            }
            else if(In == 1){
                out = 2; 
            }
            
            
            return(out);
     }
        
    
}
