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
        Values val = Values.getInstance();
        System.out.print("  " + val.Stack.size());
        System.out.println(val.Stack.size());
        Resolve solve = new Resolve();
        if (Bposition == val.Mlenght) {
            Output = "The solution is " + Manipulation.GuesstToOut();

            return (Output);
        }
        if (val.MastermindActualNbfT > val.MNbfT) {
            Output = "You won, the coumputer loose";
            return (Output);
        } else {
            List<char[]> stack = new ArrayList<>(val.Stack.size());
            for (char[] check : val.Stack) {

                if (solve.fits(check, val.guess, colors, Bposition)) {
                    stack.add(check);
                }
                val.Stack = stack;

            }
            System.out.println(val.Stack.size());
            val.guess = val.Stack.get(rand.nextInt(val.Stack.size()));
            int c = 0;
            String temp = "";
            while (c < val.Mlenght) {
                temp = temp + Character.toString(val.guess[c]);
                c++;
            }
            Output = temp;
        }
        if (val.Framestate == 22) {
            val.MastermindActualNbfT++;
        }
        val.VersusD++;
        return (Output);
    }

}
