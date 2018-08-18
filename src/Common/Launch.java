/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author Lescoffit
 */
public class Launch {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Values val = Values.getInstance();
        
        if (args.length != 0) {
            if (args[0] != null) {
                if (args[0].equals("devmod")) {
                    val.DevEnable = 1;
                }
            }
        }
        ReadF.ReadProperties();

        MainMenu Mainemenu = new MainMenu();

    }

}
