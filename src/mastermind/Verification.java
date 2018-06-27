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

    public static void RemoveIColors() {
        char[] check = new char[Values.Mlenght];
        int i = 0;
        int size = Values.Stack.size();
        while (i < size) {
            check = Values.Stack.get(i);
            int p = 0;
            int v = 0;
            while (p < Values.Mlenght) {
                if (check[p] >= Character.forDigit(Values.Numberfcolor, 10)) {
                    v = 1;
                }
                p++;
            }
            if (v == 1) {
                Values.Stack.remove(i);
                size = size - 1;
                i--;
            }
            i++;
        }

    }
}
