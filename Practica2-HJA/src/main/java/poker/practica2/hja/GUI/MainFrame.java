/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poker.practica2.hja.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import poker.practica2.hja.ap1.Ap1;
import poker.practica2.hja.ap1.Ap2;
import poker.practica2.hja.ap1.Ap3;
import poker.practica2.hja.ap1.Ranking;
import poker.practica2.hja.ap1.output;

/**
 *
 * @author jjcar
 */
public class MainFrame extends javax.swing.JFrame {
    
    protected static ArrayList<JLabel> board;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initBoard();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RangeGrid = new poker.practica2.hja.GUI.RangeGrid();
        ButtonPanel = new javax.swing.JPanel();
        Get_Range_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        rep_range_button = new javax.swing.JButton();
        SliderPanel = new javax.swing.JPanel();
        SliderNumber = new javax.swing.JLabel();
        RangeSlider = new javax.swing.JSlider();
        RangeTextPanel = new javax.swing.JPanel();
        RangeText = new javax.swing.JTextField();
        CombPanel = new javax.swing.JPanel();
        CombGrid = new poker.practica2.hja.GUI.CombGrid();
        ClearCombButton = new javax.swing.JButton();
        Ap3OutPanel = new javax.swing.JPanel();
        FlopPanel = new javax.swing.JPanel();
        Flop1 = new javax.swing.JLabel();
        Flop2 = new javax.swing.JLabel();
        Flop3 = new javax.swing.JLabel();
        TurnPanel = new javax.swing.JPanel();
        Turn = new javax.swing.JLabel();
        RiverPanel = new javax.swing.JPanel();
        River = new javax.swing.JLabel();
        CalcCombs = new javax.swing.JButton();
        Ap3OutScroll = new javax.swing.JScrollPane();
        Ap3Out = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practica 2");
        setResizable(false);

        Get_Range_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\jjcar\\OneDrive\\Documentos\\!Universidad\\POK\\Practicas\\Practica 2\\Practica2_HJA\\Practica2-HJA\\icons\\Icon input 3.png")); // NOI18N
        Get_Range_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Get_Range_buttonActionPerformed(evt);
            }
        });

        clear_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\jjcar\\OneDrive\\Documentos\\!Universidad\\POK\\Practicas\\Practica 2\\Practica2_HJA\\Practica2-HJA\\icons\\clear_icon.png")); // NOI18N
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        rep_range_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\jjcar\\OneDrive\\Documentos\\!Universidad\\POK\\Practicas\\Practica 2\\Practica2_HJA\\Practica2-HJA\\icons\\Icon output 3.png")); // NOI18N
        rep_range_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep_range_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addComponent(rep_range_button, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Get_Range_button, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clear_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rep_range_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Get_Range_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        SliderNumber.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        SliderNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SliderNumber.setText("0 %");

        RangeSlider.setMajorTickSpacing(10);
        RangeSlider.setMinorTickSpacing(1);
        RangeSlider.setPaintLabels(true);
        RangeSlider.setPaintTicks(true);
        RangeSlider.setSnapToTicks(true);
        RangeSlider.setValue(0);
        RangeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RangeSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout SliderPanelLayout = new javax.swing.GroupLayout(SliderPanel);
        SliderPanel.setLayout(SliderPanelLayout);
        SliderPanelLayout.setHorizontalGroup(
            SliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SliderPanelLayout.createSequentialGroup()
                .addComponent(RangeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SliderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SliderPanelLayout.setVerticalGroup(
            SliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SliderPanelLayout.createSequentialGroup()
                .addGroup(SliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SliderPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SliderNumber)
                        .addGap(12, 12, 12))
                    .addGroup(SliderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RangeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        RangeTextPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RangeTextPanel.setAutoscrolls(true);

        RangeText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        javax.swing.GroupLayout RangeTextPanelLayout = new javax.swing.GroupLayout(RangeTextPanel);
        RangeTextPanel.setLayout(RangeTextPanelLayout);
        RangeTextPanelLayout.setHorizontalGroup(
            RangeTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RangeTextPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RangeTextPanelLayout.setVerticalGroup(
            RangeTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RangeTextPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RangeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CombGrid.setLayout(new java.awt.GridLayout(4, 13));

        ClearCombButton.setText("Clear Combination");
        ClearCombButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearCombButtonActionPerformed(evt);
            }
        });

        Ap3OutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        FlopPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Flop"));

        Flop1.setBackground(new java.awt.Color(255, 255, 255));
        Flop1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Flop1.setBorder(null);

        Flop2.setBackground(new java.awt.Color(255, 255, 255));
        Flop2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Flop2.setBorder(null);

        Flop3.setBackground(new java.awt.Color(255, 255, 255));
        Flop3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Flop3.setBorder(null);

        javax.swing.GroupLayout FlopPanelLayout = new javax.swing.GroupLayout(FlopPanel);
        FlopPanel.setLayout(FlopPanelLayout);
        FlopPanelLayout.setHorizontalGroup(
            FlopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FlopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Flop1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Flop2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Flop3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FlopPanelLayout.setVerticalGroup(
            FlopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Flop1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(Flop2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Flop3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TurnPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Turn"));

        Turn.setBackground(new java.awt.Color(255, 255, 255));
        Turn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Turn.setBorder(null);

        javax.swing.GroupLayout TurnPanelLayout = new javax.swing.GroupLayout(TurnPanel);
        TurnPanel.setLayout(TurnPanelLayout);
        TurnPanelLayout.setHorizontalGroup(
            TurnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TurnPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Turn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TurnPanelLayout.setVerticalGroup(
            TurnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Turn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        RiverPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("River"));

        River.setBackground(new java.awt.Color(255, 255, 255));
        River.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        River.setBorder(null);

        javax.swing.GroupLayout RiverPanelLayout = new javax.swing.GroupLayout(RiverPanel);
        RiverPanel.setLayout(RiverPanelLayout);
        RiverPanelLayout.setHorizontalGroup(
            RiverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RiverPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(River, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        RiverPanelLayout.setVerticalGroup(
            RiverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(River, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        CalcCombs.setIcon(new javax.swing.ImageIcon("C:\\Users\\jjcar\\OneDrive\\Documentos\\!Universidad\\POK\\Practicas\\Practica 2\\Imagenes Iconos\\poker-cards(2).png")); // NOI18N
        CalcCombs.setBorder(null);
        CalcCombs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcCombsActionPerformed(evt);
            }
        });

        Ap3Out.setEditable(false);
        Ap3Out.setColumns(20);
        Ap3Out.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Ap3Out.setRows(5);
        Ap3OutScroll.setViewportView(Ap3Out);

        javax.swing.GroupLayout Ap3OutPanelLayout = new javax.swing.GroupLayout(Ap3OutPanel);
        Ap3OutPanel.setLayout(Ap3OutPanelLayout);
        Ap3OutPanelLayout.setHorizontalGroup(
            Ap3OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ap3OutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ap3OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ap3OutScroll)
                    .addGroup(Ap3OutPanelLayout.createSequentialGroup()
                        .addComponent(FlopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TurnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RiverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CalcCombs, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Ap3OutPanelLayout.setVerticalGroup(
            Ap3OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Ap3OutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Ap3OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FlopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RiverPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CalcCombs, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(TurnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(Ap3OutScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CombPanelLayout = new javax.swing.GroupLayout(CombPanel);
        CombPanel.setLayout(CombPanelLayout);
        CombPanelLayout.setHorizontalGroup(
            CombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CombPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClearCombButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CombGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addComponent(Ap3OutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CombPanelLayout.setVerticalGroup(
            CombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(CombPanelLayout.createSequentialGroup()
                .addComponent(Ap3OutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CombGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClearCombButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RangeGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(RangeTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(SliderPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CombPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CombPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RangeGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RangeTextPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(SliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rep_range_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep_range_buttonActionPerformed
        // TODO add your handling code here:
        Text2Range();
    }//GEN-LAST:event_rep_range_buttonActionPerformed

    private void Get_Range_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Get_Range_buttonActionPerformed
        // TODO add your handling code here:
        Range2Text();
    }//GEN-LAST:event_Get_Range_buttonActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void RangeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RangeSliderStateChanged
        // TODO add your handling code here:
        moveSlider();
    }//GEN-LAST:event_RangeSliderStateChanged

    private void ClearCombButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCombButtonActionPerformed
        // TODO add your handling code here:
        CombGrid.clear();
        BoardButton.sel_cards.clear();
        Flop1.setText("");
        Flop2.setText("");
        Flop3.setText("");
        Turn.setText("");
        River.setText("");
        Ap3Out.setText("");
    }//GEN-LAST:event_ClearCombButtonActionPerformed

    private void CalcCombsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcCombsActionPerformed
        // TODO add your handling code here:
        calcCombs();
    }//GEN-LAST:event_CalcCombsActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Ap3Out;
    private javax.swing.JPanel Ap3OutPanel;
    private javax.swing.JScrollPane Ap3OutScroll;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton CalcCombs;
    private javax.swing.JButton ClearCombButton;
    private poker.practica2.hja.GUI.CombGrid CombGrid;
    private javax.swing.JPanel CombPanel;
    private static javax.swing.JLabel Flop1;
    private static javax.swing.JLabel Flop2;
    private static javax.swing.JLabel Flop3;
    private javax.swing.JPanel FlopPanel;
    private javax.swing.JButton Get_Range_button;
    private poker.practica2.hja.GUI.RangeGrid RangeGrid;
    private javax.swing.JSlider RangeSlider;
    private javax.swing.JTextField RangeText;
    private javax.swing.JPanel RangeTextPanel;
    private static javax.swing.JLabel River;
    private javax.swing.JPanel RiverPanel;
    private javax.swing.JLabel SliderNumber;
    private javax.swing.JPanel SliderPanel;
    private static javax.swing.JLabel Turn;
    private javax.swing.JPanel TurnPanel;
    private javax.swing.JButton clear_button;
    private javax.swing.JButton rep_range_button;
    // End of variables declaration//GEN-END:variables

    
    /**
     * Funcion para el ActionListener del boton Text2Range. 
     * Marca en la tabla el rango especificado en el campo de texto.
     */
    private void Text2Range(){
        
        RangeGrid.clear();
        
        Ap1 logic = new Ap1(RangeText.getText());
        
        for(String text : logic.rangos){
            RangeGrid.searchButton(text,true);
        }
    }
    
    /**
     * Funcion para el ActionListener del boton Range2Text
     * Coge el Rango seleccionado y lo convierte a texto.
     */
    private void Range2Text(){
        
        RangeGrid.checkSelected();
        
        //DEBUG--------------------------------------
        ArrayList<String> test = new ArrayList<>();
        test = RangeGrid.getSelButtonTextList();
        
        for( String s : test){
            System.out.println(s);
        }
        //--------------------------------------
        
        Ap1 logic = new Ap1(RangeGrid.getSelButtonTextList());
        
        logic.fillRange2Text(RangeGrid.getSelButtonTextList());
       
        RangeText.setText(logic.texfield);
    }
    
    /**
     * Funcion para el ActionListener del boton de clear. 
     * Limpia la tabla de rangos, el slider, y el campo de texto.
     */
    private void clear(){
        RangeGrid.clear();
        RangeText.setText("");
        RangeSlider.setValue(0);
    }
    
    /**
     * Funcion para el ActionListener del slider. Representa el rango segun el valor del slider
     * y el ranking dado por un archivo de texto.
     */
    private void moveSlider(){
        int slider_value = RangeSlider.getValue();
        ArrayList<String> percent_range = new ArrayList<>();
        String file="rangos"+".txt";
        
        SliderNumber.setText(Integer.toString(slider_value) + " %");
        
        RangeGrid.clear();
        readFile(file,percent_range);

        Ap2 logic = new Ap2(percent_range, slider_value);
        
        RangeGrid.selectSliderRange(logic.result);
        
        Ap1 logic2 = new Ap1(RangeGrid.getSelButtonTextList());
        
        logic2.fillRange2Text(RangeGrid.getSelButtonTextList());
       
        Range2Text(); 
    }
    
    /**
     * Lee el fichero de texto con el rango y lo parsea
     * @param file: El archivo de texto
     * @param aux: Ls lista con el ranking parseado si exito
     */
    private void readFile(String file,ArrayList<String> aux){
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
           while ((line = br.readLine()) != null) {
              aux.add(line);
              
           }   
        }
        
        catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * SIN USAR
     * Metodo auxiliar que pinta el board. Hay que cambiarlo para que se pinten las
     * cartas con colores.
     * 
     * Para que se pinten los colores posible solucion:
     *  - Hacer los labels del board ==estaticos== y modificarlos en el listener del boton.
     *      - Esto se hace desde el design -> properties -> code o algo asi.
     *  - Meter los labels en un ArrayList estatico y modificarlos en el listener del boton.
     *  - En el listener del boton:
     *      - Segun el array estatico de botones seleccionados de Boardbutton,
     *          Asignar texto y el color del boton para cada caso.
     *      - Pintar solo el flop cuando hay tres, pero asignar color y texto cuando haya menos
     *      - Turn y river en el momento, no pasas nada.
     * 
     * Esta solucion hacede esta funcion y el actionListener de esta clase obsoletos y habria que quitarlos,
     * Creo. 
     * xD
     * 
     * SIN USAR
     * 
     * @param b 
     */
    /*
    private void boardFiller(BoardButton b){
        
        switch(BoardButton.sel_cards.size()){ 
            case 3:
                Flop1.setText(BoardButton.sel_cards.get(0).getText());
                
                Flop2.setText(BoardButton.sel_cards.get(1).getText());
                
                Flop3.setText(BoardButton.sel_cards.get(2).getText());
                
                Turn.setText("");
                River.setText("");
                break;
            case 4:
                Flop1.setText(BoardButton.sel_cards.get(0).getText());
                
                Flop2.setText(BoardButton.sel_cards.get(1).getText());
                
                Flop3.setText(BoardButton.sel_cards.get(2).getText());
                
                Turn.setText(BoardButton.sel_cards.get(3).getText());
                
                River.setText("");
                break;
            case 5:
                Flop1.setText(BoardButton.sel_cards.get(0).getText());
                
                Flop2.setText(BoardButton.sel_cards.get(1).getText());
                
                Flop3.setText(BoardButton.sel_cards.get(2).getText());
                
                Turn.setText(BoardButton.sel_cards.get(3).getText());
                
                River.setText(BoardButton.sel_cards.get(4).getText());
                
                break;
            default:
                Flop1.setText("");
                Flop2.setText("");
                Flop3.setText("");
                Turn.setText("");
                River.setText("");
                break;
        }
        
    }*/
    
    /**
     * NOT USED -Listener para pintar el board cuando se aprietna botones. Se ejecuta cada vex que se le hace
     * algo al boton. 
     */
    /*
    private void CombGridActionListener(){
        
        for(BoardButton b : CombGrid.getButtonList()){
            b.addChangeListener(new javax.swing.event.ChangeListener() {
                public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    //boardFiller(b);
                }
            });
        }
    }*/
    
    private void initBoard(){
        board= new ArrayList<>();
        
        board.add(Flop1);
        board.add(Flop2);
        board.add(Flop3);
        board.add(Turn);
        board.add(River);
    }
    
    /**
     * Action Listener del boton de calcular combinaciones
     */
    private void calcCombs(){
        
        int total;
        RangeGrid.checkSelected();
        CombGrid.checkSelected();
       

        if(CombGrid.getSelectedCards().size() >= 3 && RangeGrid.getSelButtonList().size()>=1){
            
            String text = "";
            Ap3Out.setText(text);
            output.totalisimo = 0;

            text = text.concat("The total number of combos pre-flop is:" + "\n"
                    + Integer.toString(PairButton.comb_sum) + "\n");

            Ap3Out.setText(text);

            Ap3 logic = new Ap3(RangeGrid.getSelButtonList(), CombGrid.getButtonList());

           total= Ap3.calcular(RangeGrid.getSelButtonList(), CombGrid.getSelectedCards());
            
           total=0;
            for(output o : Ap3.result){
                //DRAWFLUSH(1),DRAWOPENENDED(2),DRAWGUSTSHOT(69)
                if (o.ranking != Ranking.DRAWFLUSH &&
                        o.ranking != Ranking.DRAWOPENENDED &&
                        o.ranking != Ranking.DRAWGUSTSHOT){
                    total += o.jugadas;
                }
                
            }
            
            
            output.totalisimo = total;
            
            //text = text.concat("Total es: " + output.totalisimo);
            
            for(output o : Ap3.result){
                text = text.concat(o.toString());
            }

            Ap3Out.setText(text);
            

        }
        
        
        
    }
        
}

/**
for(PairButton p : RangeGrid.getSelButtonList()){
            
            int FC_rep_count = 0;
            int SC_rep_count = 0;
            
            ArrayList<Suit> FC_suits = new ArrayList<>();
            ArrayList<Suit> SC_suits = new ArrayList<>();
           
            for(BoardButton b : CombGrid.getSelectedCards()){
                switch (p.getType()){
                    case PAIR:
                        if(p.getFirstCard() == b.getValor()){
                            FC_rep_count++;
                        }
                        break;
                    default:
                        if(p.getFirstCard() == b.getValor()){
                            FC_suits.add(b.getSuit());
                            FC_rep_count++;
                        }else if (p.getSecondCard() == b.getValor()){
                            SC_suits.add(b.getSuit());
                            SC_rep_count++;
                        }
                        break;
                    }
                
            }
            
            switch (p.getType()){
                case PAIR:
                    if(FC_rep_count == 4 || SC_rep_count == 4){
                        p.substractCombs(p.getCombs());
                    }
                    if ( FC_rep_count == 1){ p.substractCombs(3); }
                    else if( FC_rep_count == 2){ p.substractCombs(5); }
                    
                    break;
                case OFF_SUIT:
                    if(FC_rep_count == 4 || SC_rep_count == 4){
                        p.substractCombs(p.getCombs());
                    }else{
                        if(FC_rep_count > SC_rep_count){
                            for(int i = 0; i < FC_rep_count; i++){
                                p.substractCombs(3);
                            }
                            p.substractCombs(SC_rep_count);
                        }
                        else if(SC_rep_count > FC_rep_count){
                            for(int i = 0; i < SC_rep_count; i++){
                                p.substractCombs(3);
                            }
                            p.substractCombs(FC_rep_count);
                        }else{
                            p.substractCombs(5);
                        }
                    }
                    
                    break;
                case SUITED:
                    if(FC_rep_count == 4 || SC_rep_count == 4){
                        p.substractCombs(p.getCombs());
                    }else{
                        for(Suit s1 : FC_suits){
                            for(Suit s2 : SC_suits){
                                if (s1 == s2){
                                    p.substractCombs(1);
                                    FC_rep_count--;
                                    SC_rep_count--;
                                }
                            }
                        }
                        p.substractCombs(FC_rep_count + SC_rep_count);
                    }
                    
                    break;
            }
            
            comb_sum += p.getCombs();
            p.setCombs(p.getType());
        }
        
        PairButton.comb_sum = comb_sum;
        
        text = text.concat("\n" + "The total number of combos post-Flop is: " + "\n" + 
                Integer.toString(PairButton.comb_sum));
        
        Ap3Out.setText(text);

*/