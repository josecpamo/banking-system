package Frames.Cliente;

import Frames.Login.Login_Frame;
import Main.DbHandler;
import Modelos.Cuenta;
import Modelos.Movimiento;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/* Authors:
    José Carlos Paniagua Morales
    Aisler Moreno Pérez
    Juan Carlos Morales Jiménez
*/

public class Retiro extends javax.swing.JFrame {

    public DbHandler dbHandler = new DbHandler();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
    
    public Retiro() {
        initComponents();
        this.setSize(420, 420);
        this.setLocationRelativeTo(null);
        this.setTitle("First Bank | Retiro");
        monto.setEnabled(false);
        btnRetirar.setEnabled(false);   
        
        try {
            if (dbHandler.existeCuentaBancaria(Login_Frame.cuentaConectada.getClienteId(), "CRC", "and estado='Activo'"))
                cuentas.addItem("CRC");
            if (dbHandler.existeCuentaBancaria(Login_Frame.cuentaConectada.getClienteId(), "USD", "and estado='Activo'"))
                cuentas.addItem("USD");
       
            cuentas.addActionListener((ActionEvent e) -> {
                if (!cuentas.getItemAt(cuentas.getSelectedIndex()).equals("Elegir cuenta")) {
                    labelSaldo.setText("Saldo actual: "+dbHandler.getSaldo(dbHandler.getCuentaId(Login_Frame.cuentaConectada.getClienteId(), cuentas.getItemAt(cuentas.getSelectedIndex()))));
                    monto.setEnabled(true);
                    btnRetirar.setEnabled(true);
            }
                else {
                    labelSaldo.setText("Saldo actual: ");
                    monto.setEnabled(false);
                    btnRetirar.setEnabled(false);
            } 
        });
            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error | Formato invalido");
        }
        
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
        pane = new javax.swing.JPanel();
        labelSaldo = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        monto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cuentas = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pane.setOpaque(false);

        labelSaldo.setBackground(new java.awt.Color(255, 255, 255));
        labelSaldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSaldo.setForeground(new java.awt.Color(0, 102, 102));
        labelSaldo.setText("Saldo actual:");

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRetirar.setBackground(new java.awt.Color(102, 102, 102));
        btnRetirar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(0, 255, 255));
        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        monto.setBackground(new java.awt.Color(153, 153, 153));
        monto.setForeground(new java.awt.Color(0, 255, 255));
        monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Digite Monto:");

        cuentas.setBackground(new java.awt.Color(102, 102, 102));
        cuentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cuentas.setForeground(new java.awt.Color(0, 255, 255));
        cuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir cuenta" }));

        btnSalir.setBackground(new java.awt.Color(0, 102, 102));
        btnSalir.setForeground(new java.awt.Color(153, 153, 153));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FBIMG/volver-flecha.jpg"))); // NOI18N
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLayout.createSequentialGroup()
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneLayout.createSequentialGroup()
                                .addComponent(btnRetirar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar))
                            .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cuentas, 0, 130, Short.MAX_VALUE)))
                    .addGroup(paneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(698, Short.MAX_VALUE))
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(cuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneLayout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addGap(824, 824, 824))
        );

        jPanel1.add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FBIMG/Fondo1-Recuperado.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cuentas.setSelectedIndex(0);
        monto.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        try {
            if (monto.getText().isEmpty() || cuentas.getSelectedIndex()==0)
                JOptionPane.showMessageDialog(null, "Error | Rellene los campos");
            else if ((dbHandler.getSaldo(dbHandler.getCuentaId(Login_Frame.cuentaConectada.getClienteId(), cuentas.getItemAt(cuentas.getSelectedIndex()))) - Float.parseFloat(monto.getText())) < 0)
                JOptionPane.showMessageDialog(null, "Error | Cantidad no puede superar al saldo actual");
        else {
                   
            Movimiento mov = new Movimiento(0, "0", "0", 0, 
                    dbHandler.getSaldo(dbHandler.getCuentaId(Login_Frame.cuentaConectada.getClienteId(), cuentas.getItemAt(cuentas.getSelectedIndex()))), 0);
            
            Cuenta cuentaActual = new Cuenta(0, 
                    dbHandler.getSaldo(dbHandler.getCuentaId(Login_Frame.cuentaConectada.getClienteId(), cuentas.getItemAt(cuentas.getSelectedIndex()))),
                    cuentas.getItemAt(cuentas.getSelectedIndex()), "Activo");

            dbHandler.updateSaldo(cuentaActual.ejecutarRetiro(Float.parseFloat(monto.getText())), dbHandler.getCuentaId(Login_Frame.cuentaConectada.getClienteId(), cuentas.getItemAt(cuentas.getSelectedIndex())));

            dbHandler.insertMovimiento(formatoFecha.format(new Date()), "Retiro de dinero", Float.parseFloat(monto.getText()),
                (mov.getSaldoAnterior() - Float.parseFloat(monto.getText())),
                dbHandler.getCuentaId(Login_Frame.cuentaConectada.getClienteId(), cuentas.getItemAt(cuentas.getSelectedIndex())));
            
            labelSaldo.setText("Saldo actual: "+dbHandler.getSaldo(dbHandler.getCuentaId(Login_Frame.cuentaConectada.getClienteId(), cuentas.getItemAt(cuentas.getSelectedIndex()))));
            JOptionPane.showMessageDialog(null, "Retiro realizado con exito");
            
            dispose();
            MenuCliente ventanaCliente = new MenuCliente();
            ventanaCliente.setVisible(true);
            }
        } 
        catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error | Formato invalido");}
        
        
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        MenuCliente ventanaCliente = new MenuCliente();
        ventanaCliente.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRetirar;
    public javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cuentas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JTextField monto;
    private javax.swing.JPanel pane;
    // End of variables declaration//GEN-END:variables
}
