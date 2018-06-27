/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import combination.CombinationMainf;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import mastermind.MasterMindMainf;

/**
 *
 * @author Lescoffit
 */
public class MainMenu extends javax.swing.JFrame {

    private CombinationMainf instanceCM;

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        setVisible(true);
        setTitle("MainMenu");
        initComponents();
        Values.Framestate=0;

        DevMod.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                   Values.DevEnable = 1;
                } else {
                   Values.DevEnable = 2;
                };
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CombiantionButton = new javax.swing.JButton();
        MasterMindButton = new javax.swing.JButton();
        DevMod = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CombiantionButton.setText("Combination");
        CombiantionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CombiantionButtonMouseClicked(evt);
            }
        });

        MasterMindButton.setText("MasterMind");
        MasterMindButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MasterMindButtonMouseClicked(evt);
            }
        });

        DevMod.setText("DevMod");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(CombiantionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(MasterMindButton)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(DevMod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CombiantionButton)
                    .addComponent(MasterMindButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(DevMod)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CombiantionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CombiantionButtonMouseClicked
        new CombinationMainf();
        this.setVisible(false);
    }//GEN-LAST:event_CombiantionButtonMouseClicked

    private void MasterMindButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MasterMindButtonMouseClicked
        new MasterMindMainf();
        this.setVisible(false);
    }//GEN-LAST:event_MasterMindButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CombiantionButton;
    private javax.swing.JCheckBox DevMod;
    private javax.swing.JButton MasterMindButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
