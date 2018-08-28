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
        Values val = Values.getInstance();
        int i = val.Mlenght;
        int C = 0;
        int B = 0;
        int p = 0;

        while (p < i) {
            val.vcolors[p] = 0;
            val.bpos[p] = 0;
            p++;
        }
        p = 0;

        if (l != i) {
            Output = ("Proposition invalid it should be ") + i + (" numbers long");
            return (Output);
        } else if ((Input).equals(solution) == true) {
            Output = "Congratulation ! You found the solution";
            return (Output);
        } else if (val.MastermindActualNbfT > val.MNbfT) {
            Output = "Sorry you loose because you couldn't found the solution in less than " + val.MNbfT + "turns";
            return (Output);
        } else {
            while (p != i) {
                int m = 0;
                while (m < i) {
                    if (solution.charAt(m) == Input.charAt(p)) {
                        val.vcolors[p] = 1;
                    }
                    m++;
                }
                if (solution.charAt(p) == Input.charAt(p)) {
                    val.bpos[p] = 1;

                }
                p++;

            }
            int c = 0;
            while (c < i) {
                if (val.vcolors[c] == 1 && val.bpos[c] == 1) {
                    B = B + 1;

                } else if (val.vcolors[c] == 1 && val.bpos[c] != 1) {
                    C = C + 1;

                }
                c++;
            }
            val.MastermindActualNbfT++;
            val.VersusA++;
            Output = C + " Good Colors and " + B + " Good Position";

            return (Output);
        }

    }
}
