/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package CMSC122Project;

import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JLevelTwo extends javax.swing.JFrame {
    /**
     * Creates new form JigsawPuzzle
     */
    
    public JLevelTwo() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNumofClicks = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonSolvePuzzle = new javax.swing.JButton();
        jButtonReshufflePuzzle = new javax.swing.JButton();
        jButtonLeavePuzzle = new javax.swing.JButton();
        jButtonHint = new javax.swing.JButton();
        jButtonRequestSolution = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("No. of Clicks:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));

        jLabelNumofClicks.setFont(new java.awt.Font("Trebuchet MS", 1, 80)); // NOI18N
        jLabelNumofClicks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumofClicks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNumofClicks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNumofClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 75)); // NOI18N
        jLabel1.setText("   Level Two: Jigsaw Puzzle");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.Color.lightGray);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));

        jButtonSolvePuzzle.setFont(new java.awt.Font("Tahoma", 1, 29)); // NOI18N
        jButtonSolvePuzzle.setText("Display Solved Puzzle");
        jButtonSolvePuzzle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jButtonSolvePuzzle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolvePuzzleActionPerformed(evt);
            }
        });

        jButtonReshufflePuzzle.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jButtonReshufflePuzzle.setText("Reshuffle Puzzle");
        jButtonReshufflePuzzle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jButtonReshufflePuzzle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReshufflePuzzleActionPerformed(evt);
            }
        });

        jButtonLeavePuzzle.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jButtonLeavePuzzle.setText("Leave Game");
        jButtonLeavePuzzle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jButtonLeavePuzzle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeavePuzzleActionPerformed(evt);
            }
        });

        jButtonHint.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jButtonHint.setText("Hint for Solving");
        jButtonHint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jButtonHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHintActionPerformed(evt);
            }
        });

        jButtonRequestSolution.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jButtonRequestSolution.setText("Request Solution");
        jButtonRequestSolution.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jButtonRequestSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRequestSolutionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSolvePuzzle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReshufflePuzzle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLeavePuzzle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRequestSolution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonHint, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSolvePuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonReshufflePuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButtonRequestSolution, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButtonLeavePuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    int CountInc;
    Stack <JButton> butnum = new Stack <> ();
    public boolean ValidMoveCheck (JButton b1, JButton b2) {
        String ReshuffleNum = b2.getText();
        
        if ("".equals(ReshuffleNum)) {
            b2.setText(b1.getText());
            b1.setText("");
            return true;
        }
        return false;
    }
    //==========================================================================
    public void FixedShuffle() {
        jButton1.setText(Integer.toString(1));
        jButton2.setText(Integer.toString(6));
        jButton3.setText(Integer.toString(2));
        jButton4.setText(Integer.toString(4));
        jButton5.setText(Integer.toString(5));
        jButton6.setText(Integer.toString(8));
        jButton7.setText(Integer.toString(3));
        jButton8.setText(Integer.toString(7));
        jButton16.setText("");
    }
    //==========================================================================
    public void DisplaySolution() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        
        if ("1".equals(b1) && "2".equals(b2) && "3".equals(b3) && "4".equals(b4) && "5".equals(b5) && "6".equals(b6)
                && "7".equals(b7) && "8".equals(b8)) {
            JOptionPane.showMessageDialog(this, "Congratulations, you won the game! ", "Jigsaw Puzzle Number Game", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            new JLevelThree().setVisible(true);
        }    
        
        CountInc += 1;
        jLabelNumofClicks.setText(Integer.toString(CountInc));
    }
    //==========================================================================
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (ValidMoveCheck(jButton2, jButton1) == true) {
            butnum.push(jButton2);
            butnum.push(jButton1);
        }
        
        else if (ValidMoveCheck(jButton2, jButton3) == true) {
            butnum.push(jButton2);
            butnum.push(jButton3);
        }
        
        else if (ValidMoveCheck(jButton2, jButton5) == true) {
            butnum.push(jButton2);
            butnum.push(jButton5);
        }
        
        else {
            JOptionPane.showMessageDialog(this, "You are attempting to make an invalid move! ", "Jigsaw Puzzle Number Game", JOptionPane.WARNING_MESSAGE);
        }
        DisplaySolution();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (ValidMoveCheck(jButton1, jButton2) == true) {
            butnum.push(jButton1);
            butnum.push(jButton2);
        }
        
        else if (ValidMoveCheck(jButton1, jButton4) == true) {
            butnum.push(jButton1);
            butnum.push(jButton4);
        }
        
        else {
            JOptionPane.showMessageDialog(this, "You are attempting to make an invalid move! ", "Jigsaw Puzzle Number Game", JOptionPane.WARNING_MESSAGE);
        }
        DisplaySolution();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (ValidMoveCheck(jButton3, jButton2) == true) {
            butnum.push(jButton3);
            butnum.push(jButton2);
        }
        
        else if (ValidMoveCheck(jButton3, jButton6) == true) {
            butnum.push(jButton3);
            butnum.push(jButton6);
        }
        
        else {
            JOptionPane.showMessageDialog(this, "You are attempting to make an invalid move! ", "Jigsaw Puzzle Number Game", JOptionPane.WARNING_MESSAGE);
        }
        DisplaySolution();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (ValidMoveCheck(jButton4, jButton1)== true) {
            butnum.push(jButton4);
            butnum.push(jButton1);
        }
        
        else if (ValidMoveCheck(jButton4, jButton5) == true){
            butnum.push(jButton4);
            butnum.push(jButton5);
        }
        
        else if (ValidMoveCheck(jButton4, jButton7) == true){
            butnum.push(jButton4);
            butnum.push(jButton7);
        }
        
        else {
            JOptionPane.showMessageDialog(this, "You are attempting to make an invalid move! ", "Jigsaw Puzzle Number Game", JOptionPane.WARNING_MESSAGE);
        }
        DisplaySolution();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (ValidMoveCheck(jButton5, jButton2) == true) {
            butnum.push(jButton5);
            butnum.push(jButton2);
        }
        
        else if (ValidMoveCheck(jButton5, jButton4) == true) {
            butnum.push(jButton5);
            butnum.push(jButton4);
        }
        
        else if (ValidMoveCheck(jButton5, jButton6) == true) {
            butnum.push(jButton5);
            butnum.push(jButton6);
        }
        
        else if (ValidMoveCheck(jButton5, jButton8) == true) {
            butnum.push(jButton5);
            butnum.push(jButton8);
        }
        
        else {
            JOptionPane.showMessageDialog(this, "You are attempting to make an invalid move! ", "Jigsaw Puzzle Number Game", JOptionPane.WARNING_MESSAGE);
        }
        DisplaySolution();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (ValidMoveCheck(jButton6, jButton3) == true) {
            butnum.push(jButton6);
            butnum.push(jButton3);
        }
        
        else if (ValidMoveCheck(jButton6, jButton5) == true) {
            butnum.push(jButton6);
            butnum.push(jButton5);
        }
        
        else if (ValidMoveCheck(jButton6, jButton16) == true) {
            butnum.push(jButton6);
            butnum.push(jButton16);
        }
       
        else {
            JOptionPane.showMessageDialog(this, "You are attempting to make an invalid move! ", "Jigsaw Puzzle Number Game", JOptionPane.WARNING_MESSAGE);
        }
        DisplaySolution();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (ValidMoveCheck(jButton7, jButton4) == true) {
            butnum.push(jButton7);
            butnum.push(jButton4);
        }
        
        else if (ValidMoveCheck(jButton7, jButton8) == true) {
            butnum.push(jButton7);
            butnum.push(jButton8);
        }
        
        else {
            JOptionPane.showMessageDialog(this, "You are attempting to make an invalid move! ", "Jigsaw Puzzle Number Game", JOptionPane.WARNING_MESSAGE);
        }
        DisplaySolution();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (ValidMoveCheck(jButton8, jButton5) == true) {
            butnum.push(jButton8);
            butnum.push(jButton5);
        }
        
        else if (ValidMoveCheck(jButton8, jButton7) == true) {
            butnum.push(jButton8);
            butnum.push(jButton7);
        }
        
        else if (ValidMoveCheck(jButton8, jButton16) == true) {
            butnum.push(jButton8);
            butnum.push(jButton16);
        }
        
        else {
            JOptionPane.showMessageDialog(this, "You are attempting to make an invalid move! ", "Jigsaw Puzzle Number Game", JOptionPane.WARNING_MESSAGE);
        }
        DisplaySolution();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        
        if ("1".equals(b1) && "2".equals(b2) && "3".equals(b3) && "4".equals(b4) && "5".equals(b5) && "6".equals(b6)
                && "7".equals(b7) && "8".equals(b8)) {
            JOptionPane.showMessageDialog(this, """
                                            Hello there, welcome to the Jigsaw Puzzle Number Game!
                                            
                                            The puzzle will now be shuffled and your job is to solve it
                                            in the proper ascending order.
                                            
                                            Also, don't worry you have the option to click helpful buttons 
                                            on the right side to guide you in solving the puzzle!    
                                            
                                            Good Luck! """, "Jigsaw Puzzle Number Game", JOptionPane.INFORMATION_MESSAGE);
            FixedShuffle();
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButtonSolvePuzzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolvePuzzleActionPerformed
        jButton1.setText("1");
        jButton2.setText("2");
        jButton3.setText("3");
        jButton4.setText("4");
        jButton5.setText("5");
        jButton6.setText("6");
        jButton7.setText("7");
        jButton8.setText("8");
        jButton16.setText("");
    }//GEN-LAST:event_jButtonSolvePuzzleActionPerformed

    private void jButtonReshufflePuzzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReshufflePuzzleActionPerformed
        FixedShuffle();
    }//GEN-LAST:event_jButtonReshufflePuzzleActionPerformed
    private JFrame frame;
    
    private void jButtonLeavePuzzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeavePuzzleActionPerformed
        frame = new JFrame("Leave");
        
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to leave the game? ", "Jigsaw Puzzle Number Game", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonLeavePuzzleActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        JOptionPane.showMessageDialog(this, "You are not clicking within the puzzle! ", "Jigsaw Puzzle Number Game", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_formMouseClicked

    private void jButtonHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHintActionPerformed
        JOptionPane.showMessageDialog(this, """
                                            Hint: Use Divide and Conquer (Try
                                            solving the corners first so that a 
                                            4x4 puzzle becomes a 3x3 and so 
                                            on.) If all else fails, click the 
                                            (Display Solved Puzzle) button to display the 
                                            correct solution.""", "Jigsaw Puzzle Number Game", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonHintActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (ValidMoveCheck(jButton16, jButton6) == true) {
            butnum.push(jButton16);
            butnum.push(jButton6);
        }
        
        else if (ValidMoveCheck(jButton16, jButton8) == true) {
            butnum.push(jButton16);
            butnum.push(jButton8);
        }
        
        else {
            JOptionPane.showMessageDialog(this, "You are attempting to make an invalid move! ", "Jigsaw Puzzle Number Game", JOptionPane.WARNING_MESSAGE);
        }
        DisplaySolution();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButtonRequestSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRequestSolutionActionPerformed
        for (;!butnum.isEmpty();) {
            JButton b1 = butnum.pop();
            JButton b2 = butnum.pop();
            ValidMoveCheck(b1, b2);
            
            if (JOptionPane.showConfirmDialog(frame, "Would you want some more hints in solving the puzzle? ", "Jigsaw Puzzle Number Game", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                return;
            }
        }
        
        ValidMoveCheck(jButton2, jButton3);
        if (JOptionPane.showConfirmDialog(frame, "Would you want some more hints in solving the puzzle?", "Jigsaw Puzzle Number Game", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        
        ValidMoveCheck(jButton1, jButton2);
        if (JOptionPane.showConfirmDialog(frame, "Would you want some more hints in solving the puzzle?", "Jigsaw Puzzle Number Game", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        
        ValidMoveCheck(jButton3, jButton2);
        if (JOptionPane.showConfirmDialog(frame, "Would you want some more hints in solving the puzzle? ", "Jigsaw Puzzle Number Game", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        
        ValidMoveCheck(jButton7, jButton3);
        if (JOptionPane.showConfirmDialog(frame, "Would you want some more hints in solving the puzzle? ", "Jigsaw Puzzle Number Game", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        
        ValidMoveCheck(jButton8, jButton7);
        if (JOptionPane.showConfirmDialog(frame, "Would you want some more hints in solving the puzzle? ", "Jigsaw Puzzle Number Game", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        
        DisplaySolution();
    }//GEN-LAST:event_jButtonRequestSolutionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JLevelTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLevelTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLevelTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLevelTwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        // Changed Anonymous inner class to another expression.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonHint;
    private javax.swing.JButton jButtonLeavePuzzle;
    private javax.swing.JButton jButtonRequestSolution;
    private javax.swing.JButton jButtonReshufflePuzzle;
    private javax.swing.JButton jButtonSolvePuzzle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNumofClicks;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
