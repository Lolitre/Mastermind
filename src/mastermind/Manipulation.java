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
public class Manipulation {

    public static int sure;

    public static void CreateList() {
        int t = 2;
        Manipulation.sure = 1;
        while (t <= Values.Mlenght) {
            Manipulation.sure = Manipulation.sure * 10;
            Manipulation.sure = Manipulation.sure + 1;
            t++;
        }
        List<char[]> stack = new ArrayList<char[]>();
        for (int i = 0; i <= (9 * Manipulation.sure); i++) {

            String i_s = Integer.toString(i);
            while (i_s.length() != 4) {
                i_s = "0" + i_s;
            }

            char[] i_ia = i_s.toCharArray();
            stack.add(i_ia);

        }
        Values.Stack = stack;
    }

    public static String firstguess() {
        Random rand = new Random();
        String Output = "";

        Values.guess = null;
        Values.fguess = Values.Stack.get(rand.nextInt(Values.Stack.size()));
        Values.MastermindActualNbfT = 1;
        int c = 0;
        String temp = "";
        while (c < Values.Mlenght) {
            temp = temp + Character.toString(Values.fguess[c]);
            c++;
        }
        Output = temp;

        return (Output);

    }

    public static String GuesstToOut() {
        int c = 0;
        String temp = "";
        String Output = "";
        while (c < Values.Mlenght) {
            temp = temp + Character.toString(Values.guess[c]);
            c++;
        }
        Output = temp;

        return (Output);
    }

}
