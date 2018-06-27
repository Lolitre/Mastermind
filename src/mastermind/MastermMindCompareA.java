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
public class MastermMindCompareA {



    public static String Compare(String Input, String solution) {
        String Output = "";
        int l = Input.length();
        int i = Values.Mlenght;
        int C = 0;
        int B = 0;
        int p = 0;

        while (p < i) {
            Values.vcolors[p] = 0;
            Values.bpos[p] = 0;
            p++;
        }
        p = 0;

        if (l != i) {
            Output = ("Proposition invalid it should be ") + i + (" numbers long");
            return (Output);
        } else if ((Input).equals(solution) == true) {
            Output = "Congratulation ! You found the solution";
            return (Output);
        } else {
            while (p != i) {
                int m = 0;
                while (m < i) {
                    if (Values.Parts[m] == Input.charAt(p)) {
                        Values.vcolors[p] = 1;
                    }
                    m = m + 1;
                }
                if (solution.charAt(p) == Input.charAt(p)) {
                    Values.bpos[p] = 1;

                }
                p = p + 1;

            }
            int c = 0;
            while (c < i) {
                if (Values.vcolors[c] == 1 && Values.bpos[c] == 1) {
                    B = B + 1;
                } else if (Values.vcolors[c] == 1 && Values.bpos[c] != 1) {
                    C = C + 1;

                }
                c++;
            }

            Output = C + " Good Colors and " + B + " Good Position";

            return (Output);
        }

    }
}
