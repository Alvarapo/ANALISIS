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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        grDatosInternosRegistro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        grDatosInternosDatos = new javax.swing.JTextField();
        añadirDatosInternos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        grDatosInterfazRegistro = new javax.swing.JTextField();
        grDatosInterfazDatos = new javax.swing.JTextField();
        entradasExternasRegistros = new javax.swing.JTextField();
        entradasExternasDatos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        añadirDatosInterfaz = new javax.swing.JButton();
        añadirEntradasExternas = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        salidasExternasRegistros = new javax.swing.JTextField();
        salidasExternasDatos = new javax.swing.JTextField();
        añadirSalidasExternas = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        consultasExternasRegistrosSALIDA = new javax.swing.JTextField();
        consultasExternasDatosSALIDA = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        consultasExternasRegistrosENTRADA = new javax.swing.JTextField();
        consultasExternasDatosENTRADA = new javax.swing.JTextField();
        añadirConsultasExternas = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        generarAnalisis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Grupo Lógicos de datos internos: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Grupo Lógicos de datos de interfaz: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("EntradasExternas: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Salidas Externas: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Consultas Externas: ");

        jLabel6.setText("Tipo de Reg: ");

        jLabel7.setText("Tipo de Datos: ");

        añadirDatosInternos.setText("Añadir");
        añadirDatosInternos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirDatosInternosActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de Reg: ");

        jLabel9.setText("Tipo de Datos: ");

        jLabel10.setText("Tipo de Reg: ");

        jLabel11.setText("Tipo de Datos: ");

        añadirDatosInterfaz.setText("Añadir");
        añadirDatosInterfaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirDatosInterfazActionPerformed(evt);
            }
        });

        añadirEntradasExternas.setText("Añadir");
        añadirEntradasExternas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirEntradasExternasActionPerformed(evt);
            }
        });

        jLabel12.setText("Tipo de Reg: ");

        jLabel13.setText("Tipo de Datos: ");

        añadirSalidasExternas.setText("Añadir");
        añadirSalidasExternas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirSalidasExternasActionPerformed(evt);
            }
        });

        jLabel16.setText("Tipo de Reg: ");

        jLabel17.setText("Tipo de Datos: ");

        jLabel18.setText("Salidas Externas: ");

        jLabel19.setText("Tipo de Reg: ");

        jLabel20.setText("Tipo de Datos: ");

        añadirConsultasExternas.setText("Añadir");
        añadirConsultasExternas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirConsultasExternasActionPerformed(evt);
            }
        });

        jLabel21.setText("EntradasExternas: ");

        generarAnalisis.setText("Generar Análisis");
        generarAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarAnalisisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel7)
                                        .addGap(6, 6, 6)
                                        .addComponent(grDatosInternosDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(añadirDatosInternos)))
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(grDatosInterfazRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(grDatosInterfazDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(añadirDatosInterfaz))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grDatosInternosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entradasExternasRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(entradasExternasDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(añadirEntradasExternas)))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salidasExternasRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salidasExternasDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4))
                            .addComponent(añadirSalidasExternas))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel19))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(consultasExternasRegistrosENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(consultasExternasDatosENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel21))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(consultasExternasRegistrosSALIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(consultasExternasDatosSALIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel18)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(añadirConsultasExternas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(45, 45, 45)))
                        .addContainerGap(29, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(generarAnalisis)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(grDatosInternosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grDatosInternosDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(añadirDatosInternos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(salidasExternasRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(salidasExternasDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(añadirSalidasExternas)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(grDatosInterfazRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(grDatosInterfazDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(añadirDatosInterfaz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(entradasExternasRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(entradasExternasDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(añadirEntradasExternas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(consultasExternasRegistrosSALIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(consultasExternasDatosSALIDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(consultasExternasRegistrosENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(consultasExternasDatosENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(añadirConsultasExternas)))
                .addGap(33, 33, 33)
                .addComponent(generarAnalisis))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirDatosInternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirDatosInternosActionPerformed
        if(grDatosInternosRegistro.getText().equals("") || grDatosInternosDatos.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Introduce datos válidos","Error", 0);
        }else{
            try {
                grupoLogicoDatosInternosList.add(new GrupoLogicoDatosInternos(Integer.parseInt(grDatosInternosRegistro.getText()), Integer.parseInt(grDatosInternosDatos.getText())));
                JOptionPane.showMessageDialog(this, "Dato Añadido con éxito","Añadido", 1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Introduce datos válidos","Error", 0);
            }finally{
                grDatosInternosRegistro.setText("");
                grDatosInternosDatos.setText("");                
            }
        }
        
    }//GEN-LAST:event_añadirDatosInternosActionPerformed

    private void añadirDatosInterfazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirDatosInterfazActionPerformed
        if(grDatosInterfazRegistro.getText().equals("") || grDatosInterfazDatos.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Introduce datos válidos","Error", 0);
        }else{
            try {
                grupoLogicoDatosInterfazList.add(new GrupoLogicoDatosInterfaz(Integer.parseInt(grDatosInterfazRegistro.getText()), Integer.parseInt(grDatosInterfazDatos.getText())));
                JOptionPane.showMessageDialog(this, "Dato Añadido con éxito","Añadido", 1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Introduce datos válidos","Error", 0);
            }finally{
                grDatosInterfazRegistro.setText("");
                grDatosInterfazDatos.setText("");               
            }
        }
    }//GEN-LAST:event_añadirDatosInterfazActionPerformed

    private void añadirEntradasExternasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirEntradasExternasActionPerformed
        if(entradasExternasRegistros.getText().equals("") || entradasExternasDatos.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Introduce datos válidos","Error", 0);
        }else{
            try {
                entradasExternasList.add(new EntradasExternas(Integer.parseInt(entradasExternasRegistros.getText()), Integer.parseInt(entradasExternasDatos.getText())));
                JOptionPane.showMessageDialog(this, "Dato Añadido con éxito","Añadido", 1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Introduce datos válidos","Error", 0);
            }finally{
                entradasExternasRegistros.setText("");
                entradasExternasDatos.setText("");
                
            }
        }       // TODO add your handling code here:
    }//GEN-LAST:event_añadirEntradasExternasActionPerformed

    private void añadirSalidasExternasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirSalidasExternasActionPerformed
        if(salidasExternasRegistros.getText().equals("") || salidasExternasDatos.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Introduce datos válidos","Error", 0);
        }else{
            try {
                salidasExternasList.add(new SalidasExternas(Integer.parseInt(salidasExternasRegistros.getText()), Integer.parseInt(salidasExternasDatos.getText())));
                JOptionPane.showMessageDialog(this, "Dato Añadido con éxito","Añadido", 1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Introduce datos válidos","Error", 0);
            }finally{
                salidasExternasRegistros.setText("");
                salidasExternasDatos.setText("");
            }
        }  
    }//GEN-LAST:event_añadirSalidasExternasActionPerformed

    private void añadirConsultasExternasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirConsultasExternasActionPerformed
        if(consultasExternasRegistrosENTRADA.getText().equals("") || consultasExternasRegistrosSALIDA.getText().equals("") || 
           consultasExternasDatosENTRADA.getText().equals("") || consultasExternasDatosSALIDA.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Introduce datos válidos","Error", 0);
        }else{
            try {
                SalidasExternas salida = new SalidasExternas(Integer.parseInt(consultasExternasRegistrosSALIDA.getText()), Integer.parseInt(consultasExternasDatosSALIDA.getText()));
                EntradasExternas entrada = new EntradasExternas(Integer.parseInt(consultasExternasRegistrosENTRADA.getText()), Integer.parseInt(consultasExternasDatosENTRADA.getText()));
                
                consultasExternasList.add(new ConsultasExternas(salida, entrada));
                JOptionPane.showMessageDialog(this, "Dato Añadido con éxito","Añadido", 1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Introduce datos válidos","Error", 0);
            }finally{
                consultasExternasRegistrosSALIDA.setText("");
                consultasExternasDatosSALIDA.setText("");
                consultasExternasRegistrosENTRADA.setText("");
                consultasExternasDatosENTRADA.setText("");
            }
        }  
    }//GEN-LAST:event_añadirConsultasExternasActionPerformed

    private void generarAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarAnalisisActionPerformed
        this.pfna = new PFNA(grupoLogicoDatosInterfazList, grupoLogicoDatosInternosList, entradasExternasList, salidasExternasList, consultasExternasList);
    }//GEN-LAST:event_generarAnalisisActionPerformed

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
    private javax.swing.JButton añadirConsultasExternas;
    private javax.swing.JButton añadirDatosInterfaz;
    private javax.swing.JButton añadirDatosInternos;
    private javax.swing.JButton añadirEntradasExternas;
    private javax.swing.JButton añadirSalidasExternas;
    private javax.swing.JTextField consultasExternasDatosENTRADA;
    private javax.swing.JTextField consultasExternasDatosSALIDA;
    private javax.swing.JTextField consultasExternasRegistrosENTRADA;
    private javax.swing.JTextField consultasExternasRegistrosSALIDA;
    private javax.swing.JTextField entradasExternasDatos;
    private javax.swing.JTextField entradasExternasRegistros;
    private javax.swing.JButton generarAnalisis;
    private javax.swing.JTextField grDatosInterfazDatos;
    private javax.swing.JTextField grDatosInterfazRegistro;
    private javax.swing.JTextField grDatosInternosDatos;
    private javax.swing.JTextField grDatosInternosRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField salidasExternasDatos;
    private javax.swing.JTextField salidasExternasRegistros;
    // End of variables declaration//GEN-END:variables
}
