/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import javax.swing.JFrame;


/**
 *
 * @author Lescoffit
 */
public class Launch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ReadF.ReadProperties();
        ReadLog4j read = new ReadLog4j();
        read.TestLog();
        MainMenu Mainemenu = new MainMenu();

        
    }
    
}
