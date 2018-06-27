/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

/**
 *
 * @author lolit
 */
public class MasterMindRandomSol {

    public static String Randomsol(String solution) {
        String Output = "";
        Manipulation.CreateList();
        Output = Manipulation.firstguess();
        return (Output);

    }
}
