/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import Common.Values;

/**
 *
 * @author lolit
 */
public class Verification {
    
    Values val = Values.getInstance();
    public void RemoveIColors() {
        char[] check = new char[val.Mlenght];
        int i = 0;
        int size = val.Stack.size();
        while (i < size) {
            check = val.Stack.get(i);
            int p = 0;
            int v = 0;
            while (p < val.Mlenght) {
                if (check[p] >= Character.forDigit((val.Numberfcolor), 10)) {
                    v = 1;
                }
                p++;
            }
            if (v == 1) {
                
                val.Stack.remove(i);
                size = size - 1;
                i--;
            }
            i++;
        }
       

    }
}
