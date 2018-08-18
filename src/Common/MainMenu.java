/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import combination.CombinationMainf;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import mastermind.MasterMindMainf;

/**
 *
 * @author lolit
 */
public class MainMenu extends javax.swing.JFrame {
    
    
    Values val = Values.getInstance();
    public JPanel pan = new JPanel();
    public JButton combination = new JButton("Combination");
    public JButton mastermind = new JButton("MasterMind");
    public JCheckBox devmod = new JCheckBox("DevMod", false);

    private void combinationMouseClicked(MouseEvent evt) {
        new CombinationMainf();
        this.setVisible(false);
    }

    private void mastermindMouseClicked(MouseEvent evt) {
        new MasterMindMainf();
        this.setVisible(false);
    }

    public MainMenu() {
        this.setTitle("MainMenu");
        
        if(val.DevEnable == 1){
            devmod.setSelected(true);
        }

        pan.add(combination);
        pan.add(mastermind);
        pan.add(devmod);
        this.setContentPane(pan);
        pack();
        this.setVisible(true);

        combination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combinationMouseClicked(evt);
            }

        });

        mastermind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mastermindMouseClicked(evt);
            }

        });
        devmod.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    
                    val.DevEnable = 1;
                } else {
                    val.DevEnable = 0;
                }
            }
        });

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
