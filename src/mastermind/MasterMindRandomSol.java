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
public class MasterMindRandomSol {

    public static String Randomsol(String solution) {
        int i = 0;
        Values val = Values.getInstance();
        String Output = "";
        Manipulation.CreateList();
        if (val.Numberfcolor != 10) {
            Verification Color = new Verification();
            Color.RemoveIColors();
        }
        Output = Manipulation.firstguess();
        return (Output);

    }
}
