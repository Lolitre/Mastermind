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
public class CombinationCompareA {

    /**
     * @param args the command line arguments 
     */
    
    public static String Compare(String Input, String solution){
        String Output= "";
        int l = Input.length();
        int i = Values.Clenght;
        String datai = Input;
        String datas = solution;
        
        
       
        if(l != i){
            Output = ("Proposition invalid it should be ") + i + (" numbers long");
            return (Output);
        }
        
        else if((Input).equals(solution) == true){
            Output = "Congratulation ! You found the solution" + Values.restart;
            return(Output);
        }
        else{
             Values.CompareAcutalNbft = Values.CompareAcutalNbft +1;
            int p = 0;
            while(p < i){
               
                char in = datai.charAt(p);
                char sol = datas.charAt(p);
                if(in == sol){
                    
                    Output = Output += "= ";
                    p= p + 1;

                }
                else if(in > sol){
                   
                    Output = Output += "- ";
                    p= p + 1;

                }
                else{
                    
                    Output = Output += "+ ";
                    p= p + 1;

                }
            }
        }
            Output = Output += "Your last guess was " + Input;
            return(Output);   
 
     
    }
}
