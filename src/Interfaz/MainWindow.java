/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import IFPUG.ConsultasExternas;
import IFPUG.EntradasExternas;
import IFPUG.GrupoLogicoDatosInterfaz;
import IFPUG.GrupoLogicoDatosInternos;
import IFPUG.SalidasExternas;
import PFNA.PFNA;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class MainWindow extends javax.swing.JFrame {

    private PFNA pfna;
    ArrayList<GrupoLogicoDatosInterfaz> grupoLogicoDatosInterfazList;
    ArrayList<GrupoLogicoDatosInternos> grupoLogicoDatosInternosList;
    ArrayList<EntradasExternas> entradasExternasList;
    ArrayList<SalidasExternas> salidasExternasList;
    ArrayList<ConsultasExternas> consultasExternasList;
    
    public MainWindow() {
        initComponents();
        grupoLogicoDatosInterfazList = new ArrayList<>();
        grupoLogicoDatosInternosList = new ArrayList<>();
        entradasExternasList = new ArrayList<>();
        salidasExternasList = new ArrayList<>();
        consultasExternasList = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtGenerarPFNA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtGenerarPFNA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtGenerarPFNA.setText("Generar PFNA");
        jbtGenerarPFNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGenerarPFNAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jbtGenerarPFNA)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jbtGenerarPFNA)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtGenerarPFNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGenerarPFNAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtGenerarPFNAActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtGenerarPFNA;
    // End of variables declaration//GEN-END:variables
}