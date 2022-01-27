/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.DatosAtributos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ignacio Andreu
 */
public class AjusteFP extends javax.swing.JFrame {

    private int resultado = 0;
    
    //VARIABLES DE DISEÑO
    DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return true;
        }
    };    
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

    public AjusteFP() {
        initComponents();
        
        setResizable(false);
        for (int i = 0; i < 15; i++) {            
            jtbtabla.isCellEditable(i, 1);
        }
        this.drawTable();
        this.drawDataRegistros();        
        this.setTitle("Ajuste de PF con características generales del sistema ");
    }

    private void drawTable() {
        jtbtabla.setModel(modeloTabla);
        String[] columnasTabla = {"ATRIBUTOS", "INFLUENCIA"};
        modeloTabla.setColumnIdentifiers(columnasTabla);

        jtbtabla.getTableHeader().setResizingAllowed(true);

        jtbtabla.getColumnModel().getColumn(0).setPreferredWidth(180); 
        jtbtabla.getColumnModel().getColumn(1).setPreferredWidth(10); 
    }    
    
      private void drawDataRegistros() {    
        //IGNA
        Object[] columna = new Object[2];
       
        for (int i = 0; i < DatosAtributos.descripcion.length; i++) {
            columna[0] = DatosAtributos.descripcion[i];
            columna[1] = "0";
            modeloTabla.addRow(columna);  
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbtabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtbtabla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtbtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbtabla.setEditingColumn(1);
        jScrollPane1.setViewportView(jtbtabla);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Sumar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int total = 0;
        for (int i = 0; i < 14; i++) {
           total += Integer.parseInt((String.valueOf(modeloTabla.getValueAt(i,1))));
        }
        JOptionPane.showMessageDialog(this, "La suma total es " + total,"Resultado", 1);    
        resultado = total;
    }//GEN-LAST:event_jButton1ActionPerformed

    public int getResultadoFA(){
        boolean fallo = false;
        for (int i = 0; i < 14; i++) {
           if(Integer.parseInt((String.valueOf(modeloTabla.getValueAt(i,1)))) > 5 ||  Integer.parseInt((String.valueOf(modeloTabla.getValueAt(i,1)))) < 0 )
               fallo = true;
        }
        if(fallo){              
            return -1;
        }else
            return this.resultado;
    }
    
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
            java.util.logging.Logger.getLogger(AjusteFP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjusteFP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjusteFP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjusteFP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjusteFP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbtabla;
    // End of variables declaration//GEN-END:variables
}
