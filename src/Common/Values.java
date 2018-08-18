/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.List;

/**
 *
 * @author lolit
 */
public class Values {
    
    private static Values instance = new Values();
    
    private Values(){

        
    }
    
    public int DevEnable;
    public int Clenght = 10;
    public int[] CompareLast = new int[Clenght];
    public char[] CompareIn = new char[Clenght];
    public int CompareNbT = 100;
    public int CompareAcutalNbft =0;
    public String restart = "You can restart or chosse another game by pressing the menu button on the top left";
    public int Mlenght = 4;
    public int Numberfcolor = 10;
    public char[] Parts = new char[Mlenght];
    public int MNbfT = 20;
    public int MastermindActualNbfT;
    public List<char[]> Stack;
    public String colors;
    public String positions;
    public int valid1 = 0;
    public int valid2 = 0;
    public int[] vcolors = new int[Mlenght];
    public int[] bpos = new int[Mlenght];
    public char[] fguess = new char[Mlenght];
    public char[] guess = new char[Mlenght];
    public int Framestate = 0;
    public int VersusA;
    public int VersusD;
    
    public static Values getInstance(){
        if (instance == null){
            instance = new Values();
        }
        return instance;
    }

}
