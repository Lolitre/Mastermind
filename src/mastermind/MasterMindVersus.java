/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import Common.Values;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author lolit
 */
public class MasterMindVersus extends javax.swing.JFrame {

    /**
     * Creates new form MasterMindVersus
     */
    public MasterMindVersus() {
        this.setVisible(true);
        setTitle("MasterMind");
        initComponents();
        Values.Framestate = 23;
        Values.VersusA = 0;
        Values.VersusD = 0;
        Values.valid1 = 0;
        Values.valid2 = 0;
        Values.MastermindActualNbfT = 0;

        String solution = MasterMindRandomSol.Randomsol("");
        if (Values.DevEnable == 1) {
            System.out.println(solution);
        }
        Manipulation.CreateList();
        Verification.RemoveIColors();
        DefenseOutput.setText(Manipulation.firstguess());
        Values.guess = Values.fguess;
        Values.VersusD =1;
        
        AttackInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();

                if (c >= '0' && c <= ('0' + Values.Numberfcolor)) {
                } else {
                    evt.consume();
                }
            }

        });

        AttackInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Values.VersusA > Values.VersusD) {
                    String last = AttackOutput.getText();
                    AttackOutput.setText("<html>You have to play the Defense part too <br>" + last);
                } else {
                    String input = AttackInput.getText();
                    String output = MastermMindCompareA.Compare(input, solution);
                    AttackOutput.setText(output);
                }
            }

        });

        Colors.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();

                if (c >= '0' && c <= ('0' + Values.Mlenght)) {
                } else {
                    evt.consume();
                }
            }

        });

        Positions.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();

                if (c >= '0' && c <= ('0' + Values.Mlenght)) {
                } else {
                    evt.consume();
                }
            }

        });

        Colors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Values.colors = Colors.getText();
                Values.valid1++;
                if (Values.valid1 >= 1 && Values.valid2 >= 1) {
                    if (Values.VersusD > Values.VersusA) {
                        String last = DefenseOutput.getText();
                        DefenseOutput.setText("<html>You have to play the Attack part too <br>" + last);
                    } else {
                        String output = MasterMindCompareD.Compare(Integer.parseInt(Values.colors), Integer.parseInt(Values.positions));
                        Values.valid1 = 0;
                        Values.valid2 = 0;
                        DefenseOutput.setText(output);
                    }
                }

            }

        });
        Positions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Values.positions = Positions.getText();
                Values.valid2++;
                if (Values.valid1 >= 1 && Values.valid2 >= 1) {
                    if (Values.VersusD > Values.VersusA) {
                        String last = DefenseOutput.getText();
                        DefenseOutput.setText("<html>You have to play the Attack part too <br>" + last);
                    } else {
                        String output = MasterMindCompareD.Compare(Integer.parseInt(Values.colors), Integer.parseInt(Values.positions));
                        Values.valid1 = 0;
                        Values.valid2 = 0;
                        DefenseOutput.setText(output);
                    }
                }
            }

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JButton();
        AttackOutput = new javax.swing.JLabel();
        DefenseOutput = new javax.swing.JLabel();
        AttackInput = new javax.swing.JTextField();
        Colors = new javax.swing.JTextField();
        Positions = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Instructions = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setText("Menu");

        Instructions.setColumns(20);
        Instructions.setRows(5);
        Instructions.setText("Enter the number of correct colors in\nleft box and the number of colors in\ngood position in the right box.");
        jScrollPane1.setViewportView(Instructions);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Use this box to note\nyour secret \ncombination");
        jScrollPane5.setViewportView(jTextArea3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AttackInput, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(AttackOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Colors, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Positions, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                    .addComponent(DefenseOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DefenseOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(AttackOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AttackInput, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Colors, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Positions, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AttackInput;
    private javax.swing.JLabel AttackOutput;
    private javax.swing.JTextField Colors;
    private javax.swing.JLabel DefenseOutput;
    private javax.swing.JTextArea Instructions;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField Positions;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
