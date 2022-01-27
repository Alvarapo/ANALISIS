/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.DatosPFNA;
import PFNA.PFNA;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class PFNATabla extends javax.swing.JFrame {

    private final PFNA pfna;
    
    //VARIABLES DE DISEÑO
    DefaultTableModel modeloTabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };    
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

    
    public PFNATabla(PFNA pfna) {
        initComponents();
        
        this.pfna = pfna;
        setResizable(false);
        this.drawTable();
        this.drawDataRegistros();        
        this.setTitle("TABLA PFNA");
    }

    private void drawTable() {
        jtbtabla.setModel(modeloTabla);
        String[] columnasTabla = {"DESCRIPCION", "SENCILLA", "MEDIA", "COMPLEJA", "TOTAL P.F"};
        modeloTabla.setColumnIdentifiers(columnasTabla);

        jtbtabla.getTableHeader().setResizingAllowed(true);

        jtbtabla.getColumnModel().getColumn(0).setPreferredWidth(150); 
        jtbtabla.getColumnModel().getColumn(1).setPreferredWidth(40);   
        jtbtabla.getColumnModel().getColumn(2).setPreferredWidth(40);  
        jtbtabla.getColumnModel().getColumn(3).setPreferredWidth(40);  
        jtbtabla.getColumnModel().getColumn(4).setPreferredWidth(40);   
    }    
    
    private void drawDataRegistros() {    
        Object[] columna = new Object[5];

        //ENTRADAS EXTERNAS
        columna[0] = DatosPFNA.descripcion[0];
        columna[1] = pfna.getDatosEntradasExternasList()[0] + " x 3";
        columna[2] = pfna.getDatosEntradasExternasList()[1] + " x 4";
        columna[3] = pfna.getDatosEntradasExternasList()[2] + " x 6";
        columna[4] = pfna.getTotalPFEntradasExternas();
        modeloTabla.addRow(columna);
        
        //SALIDAS EXTERNAS
        columna[0] = DatosPFNA.descripcion[1];
        columna[1] = pfna.getDatosSalidasExternasList()[0] + " x 4";
        columna[2] = pfna.getDatosSalidasExternasList()[1] + " x 5";
        columna[3] = pfna.getDatosSalidasExternasList()[2] + " x 7";
        columna[4] = pfna.getTotalPFSalidasExternas();
        modeloTabla.addRow(columna);
        
        //SALIDAS DATOS INTERNOS
        columna[0] = DatosPFNA.descripcion[2];
        columna[1] = pfna.getDatosGrupoLogicoDatosInternosList()[0] + " x 7";
        columna[2] = pfna.getDatosGrupoLogicoDatosInternosList()[1] + " x 10";
        columna[3] = pfna.getDatosGrupoLogicoDatosInternosList()[2] + " x 15";
        columna[4] = pfna.getTotalPFDatosInternos();
        modeloTabla.addRow(columna);
        
        //SALIDAS DATOS INTERFAZ
        columna[0] = DatosPFNA.descripcion[3];
        columna[1] = pfna.getDatosGrupoLogicoDatosInterfazList()[0] + " x 5";
        columna[2] = pfna.getDatosGrupoLogicoDatosInterfazList()[1] + " x 7";
        columna[3] = pfna.getDatosGrupoLogicoDatosInterfazList()[2] + " x 10";
        columna[4] = pfna.getTotalPFDatosInterfaz();
        modeloTabla.addRow(columna);
        
        //SALIDAS CONSULTAS EXTERNAS
        columna[0] = DatosPFNA.descripcion[4];
        columna[1] = pfna.getDatosConsultasExternasList()[0] + " x 3";
        columna[2] = pfna.getDatosConsultasExternasList()[1] + " x 4";
        columna[3] = pfna.getDatosConsultasExternasList()[2] + " x 6";
        columna[4] = pfna.getTotalPFConsultasExternas();
        modeloTabla.addRow(columna);

        //TOTAL
        columna[0] = "";
        columna[1] = "";
        columna[2] = "";
        columna[3] = "TOTAL: ";
        columna[4] = pfna.getTotal();
        modeloTabla.addRow(columna);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbtabla = new javax.swing.JTable();

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
        jtbtabla.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jScrollPane1.setViewportView(jtbtabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PFNATabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PFNATabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PFNATabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PFNATabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PFNATabla(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbtabla;
    // End of variables declaration//GEN-END:variables
}
