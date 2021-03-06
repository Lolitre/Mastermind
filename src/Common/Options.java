/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author lolit
 */
public class Options extends javax.swing.JFrame {

    /**
     * Creates new form Options
     */
    public Options() {
        this.setVisible(true);
        this.setTitle("Options");
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

        Restart = new javax.swing.JButton();
        Mainmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Restart.setText("Restart");
        Restart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestartMouseClicked(evt);
            }
        });

        Mainmenu.setText("MainMenu");
        Mainmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainmenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Restart)
                .addGap(18, 18, 18)
                .addComponent(Mainmenu)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Restart)
                    .addComponent(Mainmenu))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestartMouseClicked
        Values val = Values.getInstance();
        if (val.Framestate == 11) {
            new combination.CombinationAttack();
            this.setVisible(false);
        }
        if (val.Framestate == 12) {
            new combination.CombinationDefend();
            this.setVisible(false);

        }
        if (val.Framestate == 13) {
            new combination.CombinationVersus();
            this.setVisible(false);

        }
        if (val.Framestate == 21) {
            new mastermind.MasterMindAttack();
            this.setVisible(false);

        }
        if (val.Framestate == 22) {
            new mastermind.MasterMindDefend();
            this.setVisible(false);

        }
        if (val.Framestate == 23) {
            new mastermind.MasterMindVersus();
            this.setVisible(false);

        }
    }//GEN-LAST:event_RestartMouseClicked

    private void MainmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainmenuMouseClicked
        new MainMenu();
        this.setVisible(false);
    }//GEN-LAST:event_MainmenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mainmenu;
    private javax.swing.JButton Restart;
    // End of variables declaration//GEN-END:variables
}
