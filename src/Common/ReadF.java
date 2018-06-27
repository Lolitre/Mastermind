/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author lolit
 */
public class ReadF {

    public static void ReadProperties(){

        final Properties prop = new Properties();

        try {

            FileInputStream input = new FileInputStream("src\\Ressources\\config.properties");

            prop.load(input);

            Values.Clenght = (Integer.parseInt(prop.getProperty("Lenght")));
            Values.CompareNbT = (Integer.parseInt(prop.getProperty("CombinationTry")));  
            Values.MNbfT = (Integer.parseInt(prop.getProperty("MasterTry")));
            Values.Numberfcolor = (Integer.parseInt(prop.getProperty("MasterMindNumberofcolors")));

        } catch (Exception e) {
           System.out.println(e.getMessage());

        }

    }

}
