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
public class Resolve {

    static boolean fits(char[] cc1, char[] cc2, int Colors, int Position) {

        int position = 0;
        int colors = 0;
        for (int i = 0; i < Values.Mlenght; i++) {
            if (cc1[i] == cc2[i]) {
                position++;
            } else {
                for (int j = 0; j < Values.Mlenght; j++) {
                    if (i != j && cc1[j] == cc2[i] && cc1[j] != cc2[j]) {
                        colors++;
                        break;
                    }
                }
            }
        }

        return Position == position && colors == Colors;
    }
}
