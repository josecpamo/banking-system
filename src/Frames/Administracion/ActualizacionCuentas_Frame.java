package Frames.Administracion;

import Main.DbHandler;
import Modelos.Cuenta;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/* Authors:
    José Carlos Paniagua Morales
    Aisler Moreno Pérez
    Juan Carlos Morales Jiménez
*/

public class ActualizacionCuentas_Frame extends javax.swing.JFrame {

    MenuAdministracion ventanaAdmin = new MenuAdministracion();
    DbHandler dbHandler = new DbHandler();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

    public ActualizacionCuentas_Frame() {
        initComponents();
        this.setSize(620,400);
        this.setLocationRelativeTo(null);
        
        cambioMonetario.addActionListener((ActionEvent e) -> { 
        try {
            if (dbHandler.existeCuentaBancaria(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex()), "")) {
                labelClienteId.setText("Id del cliente: "+dbHandler.getClienteId("Cliente", "clienteId" ,clienteId.getText()));
                labelMoneda.setText("Moneda de la cuenta: "+dbHandler.getMoneda(dbHandler.getCuentaId(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex()))));
                labelEstado.setText("Estado de la cuenta: "+dbHandler.getEstado(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex())));
                labelSaldo.setText("Saldo actual de la cuenta: "+dbHandler.getSaldo(dbHandler.getCuentaId(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex()))));
                
            }
                else {
                    labelSaldo.setText("Saldo actual: ");
                    labelClienteId.setText("Id del cliente: ");
                    labelMoneda.setText("Moneda de la cuenta: ");
                    labelEstado.setText("Estado de la cuenta: ");
                    labelSaldo.setText("Saldo actual de la cuenta: ");
                } 
            }
        
        catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Error | Rellene los campos");
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        Label_ID = new javax.swing.JLabel();
        clienteId = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        cambioMonetario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        saldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        labelClienteId = new javax.swing.JLabel();
        labelMoneda = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(420, 420));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        Label_ID.setForeground(new java.awt.Color(0, 255, 255));
        Label_ID.setText("Ingrese número de identificación");

        clienteId.setBackground(new java.awt.Color(153, 153, 153));
        clienteId.setForeground(new java.awt.Color(0, 255, 255));
        clienteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteIdActionPerformed(evt);
            }
        });

        Limpiar.setBackground(new java.awt.Color(102, 102, 102));
        Limpiar.setForeground(new java.awt.Color(0, 255, 255));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        cambioMonetario.setBackground(new java.awt.Color(102, 102, 102));
        cambioMonetario.setForeground(new java.awt.Color(0, 255, 255));
        cambioMonetario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CRC", "USD" }));

        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Saldo");

        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Estado");

        Atras.setBackground(new java.awt.Color(102, 102, 102));
        Atras.setForeground(new java.awt.Color(0, 255, 255));
        Atras.setText("Atrás");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        saldo.setBackground(new java.awt.Color(153, 153, 153));
        saldo.setForeground(new java.awt.Color(0, 255, 255));
        saldo.setEnabled(false);
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Moneda");

        estado.setBackground(new java.awt.Color(102, 102, 102));
        estado.setForeground(new java.awt.Color(0, 255, 255));
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inactivo", "Activo" }));
        estado.setEnabled(false);
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        labelClienteId.setForeground(new java.awt.Color(0, 255, 255));
        labelClienteId.setText("Id del cliente:");

        labelMoneda.setForeground(new java.awt.Color(0, 255, 255));
        labelMoneda.setText("Moneda de la cuenta:");

        labelEstado.setForeground(new java.awt.Color(0, 255, 255));
        labelEstado.setText("Estado de la cuenta:");

        labelSaldo.setForeground(new java.awt.Color(0, 255, 255));
        labelSaldo.setText("Saldo actual de la cuenta:");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCambiar.setBackground(new java.awt.Color(102, 102, 102));
        btnCambiar.setForeground(new java.awt.Color(0, 255, 255));
        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Atras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(Label_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cambioMonetario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clienteId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(labelClienteId))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(labelMoneda)
                            .addComponent(labelEstado)
                            .addComponent(labelSaldo))))
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Atras)
                .addGap(16, 16, 16)
                .addComponent(Label_ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelClienteId)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cambioMonetario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMoneda))
                .addGap(18, 18, 18)
                .addComponent(labelEstado)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSaldo)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCambiar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        clienteId.setText("");
        cambioMonetario.setSelectedIndex(0);
        estado.setSelectedIndex(0);
        saldo.setText("");
        labelClienteId.setText("Id del cliente: ");
        labelMoneda.setText("Moneda de la cuenta: ");
        labelEstado.setText("Estado de la cuenta: ");
        labelSaldo.setText("Saldo actual de la cuenta: ");
        estado.setEnabled(false);
        saldo.setEnabled(false);
        btnCambiar.setEnabled(false);
        
    }//GEN-LAST:event_LimpiarActionPerformed

    private void clienteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteIdActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        dispose();
        ventanaAdmin.setVisible(true);    
    }//GEN-LAST:event_AtrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (clienteId.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Error | Rellene los campos");
        else
            if (dbHandler.existeCuentaBancaria(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex()), "")) {
                labelClienteId.setText("Id del cliente: "+dbHandler.getClienteId("Cliente", "clienteId" ,clienteId.getText()));
                labelMoneda.setText("Moneda de la cuenta: "+dbHandler.getMoneda(dbHandler.getCuentaId(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex()))));
                labelEstado.setText("Estado de la cuenta: "+dbHandler.getEstado(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex())));
                labelSaldo.setText("Saldo actual de la cuenta: "+dbHandler.getSaldo(dbHandler.getCuentaId(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex()))));
                estado.setEnabled(true);
                saldo.setEnabled(true);
                btnCambiar.setEnabled(true);
            }
            else
                JOptionPane.showMessageDialog(null, "Error | No existe la cuenta bancaria");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        try {
            Cuenta nuevaCuenta = new Cuenta(0, Float.parseFloat(saldo.getText()), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex()), estado.getItemAt(estado.getSelectedIndex()));    
        
        if (clienteId.getText().isEmpty() || saldo.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Error | Rellene los campos");
        else { 
            nuevaCuenta.setClienteId(clienteId.getText());
            
            if (nuevaCuenta.validarSaldo(nuevaCuenta.getSaldo()) && nuevaCuenta.validarClienteId(nuevaCuenta.getClienteId())) {
                dbHandler.updateCuentaBancaria(nuevaCuenta.getClienteId(), nuevaCuenta.getSaldo(), nuevaCuenta.getMoneda(), nuevaCuenta.getEstado());
                
                dbHandler.insertMovimiento(formatoFecha.format(new Date()), "Dinero de modificacion", Float.parseFloat(saldo.getText()), nuevaCuenta.getSaldo(), 
                                          dbHandler.getCuentaId(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex())));

                JOptionPane.showMessageDialog(null, "Cambio realizado exitosamente");
                labelClienteId.setText("Id del cliente: "+dbHandler.getClienteId("Cliente", "clienteId" ,clienteId.getText()));
                labelMoneda.setText("Moneda de la cuenta: "+dbHandler.getMoneda(dbHandler.getCuentaId(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex()))));
                labelEstado.setText("Estado de la cuenta: "+dbHandler.getEstado(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex())));
                labelSaldo.setText("Saldo actual de la cuenta: "+dbHandler.getSaldo(dbHandler.getCuentaId(clienteId.getText(), cambioMonetario.getItemAt(cambioMonetario.getSelectedIndex()))));
                }
            }  
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error | Formato invalido");
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    
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
            java.util.logging.Logger.getLogger(ActualizacionCuentas_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizacionCuentas_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizacionCuentas_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizacionCuentas_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizacionCuentas_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JLabel Label_ID;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JComboBox<String> cambioMonetario;
    private javax.swing.JTextField clienteId;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelClienteId;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelMoneda;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JTextField saldo;
    // End of variables declaration//GEN-END:variables
}
