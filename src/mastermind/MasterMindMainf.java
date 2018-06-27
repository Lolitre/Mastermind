/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import Common.MainMenu;

/**
 *
 * @author Lescoffit
 */
public class MasterMindMainf extends javax.swing.JFrame {

    /**
     * Creates new form MasterMindMainf
     */
    public MasterMindMainf() {
        this.setVisible(true);
        setTitle("MasterMind");
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AttackButtonMM = new javax.swing.JButton();
        DefendButtonMM = new javax.swing.JButton();
        VersusButtonMM = new javax.swing.JButton();
        MainMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AttackButtonMM.setText("Attack");
        AttackButtonMM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AttackButtonMMMouseClicked(evt);
            }
        });

        DefendButtonMM.setText("Defend");
        DefendButtonMM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefendButtonMMMouseClicked(evt);
            }
        });

        VersusButtonMM.setText("Versus");

        MainMenuButton.setText("MainMenu");
        MainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMenuButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AttackButtonMM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DefendButtonMM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(VersusButtonMM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(AttackButtonMM)
                .addGap(61, 61, 61)
                .addComponent(DefendButtonMM)
                .addGap(77, 77, 77)
                .addComponent(VersusButtonMM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(MainMenuButton)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMenuButtonMouseClicked
        this.setVisible(false);
        new MainMenu();
    }//GEN-LAST:event_MainMenuButtonMouseClicked

    private void AttackButtonMMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttackButtonMMMouseClicked
        this.setVisible(false);
        new MasterMindAttack();
    }//GEN-LAST:event_AttackButtonMMMouseClicked

    private void DefendButtonMMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefendButtonMMMouseClicked
       this.setVisible(false);
       new MasterMindDefend();
    }//GEN-LAST:event_DefendButtonMMMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttackButtonMM;
    private javax.swing.JButton DefendButtonMM;
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JButton VersusButtonMM;
    // End of variables declaration//GEN-END:variables
}
