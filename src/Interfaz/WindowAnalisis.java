/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import PFNA.PFNA;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Álvaro Rofa Aranda
 */
public class WindowAnalisis extends JFrame {

    private final PFNA pfna;
    private final AjusteFP FrameAjuste = new AjusteFP();
    
    public WindowAnalisis(PFNA pfna) {
        initComponents();        
        this.pfna = pfna;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonPFNA = new javax.swing.JButton();
        BotonPFc = new javax.swing.JButton();
        botonFP = new javax.swing.JButton();
        botonFN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botonPFNA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonPFNA.setText("Mostrar PFNA");
        botonPFNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPFNAActionPerformed(evt);
            }
        });

        BotonPFc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonPFc.setText("Ajuste de PF características generales ");
        BotonPFc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPFcActionPerformed(evt);
            }
        });

        botonFP.setText("Resultado FP");
        botonFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFPActionPerformed(evt);
            }
        });

        botonFN.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        botonFN.setText("Ajuste Final de PF");
        botonFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonPFNA)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonPFc, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonFP))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(botonFN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(botonPFNA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonFP, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonPFc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonFN)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        BotonPFc.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPFNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPFNAActionPerformed
        new PFNATabla(pfna).setVisible(true);
    }//GEN-LAST:event_botonPFNAActionPerformed

    private void BotonPFcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPFcActionPerformed
        FrameAjuste.setVisible(true);
    }//GEN-LAST:event_BotonPFcActionPerformed

    private void botonFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFPActionPerformed
        if(this.FrameAjuste.getResultadoFA() == -1 ){
            JOptionPane.showMessageDialog(this, "Los datos son incorrectos, resuerda que todos los\nvalores deben estar comprendido\nentre 0 & 5 ","Error", 0);             
        }else if((this.FrameAjuste.getResultadoFA() < 0 && this.FrameAjuste.getResultadoFA() != -1) || this.FrameAjuste.getResultadoFA() > 70){
            JOptionPane.showMessageDialog(this, "La suma total es incorrecta" , "Resultado", 1);    
        }else{
            JOptionPane.showMessageDialog(this, "La suma total es " + FrameAjuste.getResultadoFA(), "Resultado", 1); 
        }
    }//GEN-LAST:event_botonFPActionPerformed

    private void botonFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFNActionPerformed
        if (FrameAjuste.getResultadoFA() != -1) {
            JOptionPane.showMessageDialog(this, "El resultado vendré regido de esta fórmula: PFA = PFNA * FA\n"
                    + "Siendo:\n"
                    + "\t-PFA: Puntos de función ajustados\n"
                    + "\t-PFNA: Puntos Función no ajustado\n"
                    + "\t-FA: Factor de ajuste\n"
                    + "\t-SVA: Suma de los valores de los atributos.\n"
                    + "En este caso: PFA=" + this.pfna.getTotal() + "+" + "(0.01*" + FrameAjuste.getResultadoFA() + ")=" + (this.pfna.getTotal() + (0.01 * FrameAjuste.getResultadoFA())), "Resultado PFA", 1);

        }else{
            JOptionPane.showMessageDialog(this, "El Resultado FA es incorrecto, revisa la tabla.", "Error", 0); 
        }       
    }//GEN-LAST:event_botonFNActionPerformed

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
            java.util.logging.Logger.getLogger(WindowAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowAnalisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowAnalisis(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPFc;
    private javax.swing.JButton botonFN;
    private javax.swing.JButton botonFP;
    private javax.swing.JButton botonPFNA;
    // End of variables declaration//GEN-END:variables
}
