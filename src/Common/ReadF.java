/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.Properties;

/**
 *
 * @author lolit
 */
public class ReadF {

    public static void ReadProperties(){

        final Properties prop = new Properties();
        Values val = Values.getInstance();

        try {
            
            prop.load((ReadF.class.getResourceAsStream("/Ressources/config.properties")));

            val.Clenght = (Integer.parseInt(prop.getProperty("CL")));
            val.CompareNbT = (Integer.parseInt(prop.getProperty("CT")));  
            val.MNbfT = (Integer.parseInt(prop.getProperty("MMT")));
            val.Numberfcolor = (Integer.parseInt(prop.getProperty("MMN")));
            val.Mlenght = (Integer.parseInt(prop.getProperty("MML")));
        } catch (Exception e) {
           System.out.println("File loaded");

        }

    }

}
