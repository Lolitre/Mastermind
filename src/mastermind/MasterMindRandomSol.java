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
        
        String Output = "";
        Manipulation.CreateList();
        Verification.RemoveIColors();
        Output = Manipulation.firstguess();
        return (Output);

    }
}
