/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import Common.Values;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author lolit
 */
public class MasterMindCompareD {

    public static String Compare(int colors, int Bposition) {
        String Output = "";
        Random rand = new Random();
        System.out.print("  " + Values.Stack.size());

        if (Bposition == Values.Mlenght) {
            Output = "The solution is " + Manipulation.GuesstToOut();

            return (Output);
        }
        if (Values.MastermindActualNbfT > Values.MNbfT) {
            Output = "You won, the coumputer loose";
            return (Output);
        } else {
            List<char[]> stack = new ArrayList<>(Values.Stack.size());
            for (char[] check : Values.Stack) {
                if (Resolve.fits(check, Values.guess, colors, Bposition)) {
                    stack.add(check);
                }
                Values.Stack = stack;
            }
            Values.guess = Values.Stack.get(rand.nextInt(Values.Stack.size()));
            int c = 0;
            String temp = "";
            while (c < Values.Mlenght) {
                temp = temp + Character.toString(Values.guess[c]);
                c++;
            }
            Output = temp;
        }
        if (Values.Framestate == 22) {
            Values.MastermindActualNbfT++;
        }
        Values.VersusD++;
        return (Output);
    }

}
