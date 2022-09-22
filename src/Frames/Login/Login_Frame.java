package Frames.Login;

import Frames.Administracion.MenuAdministracion;
import Frames.Cliente.MenuCliente;
import Frames.Cliente.CambioClave;
import Main.DbHandler;
import Modelos.Cuenta_Usuario;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/* Authors:
    José Carlos Paniagua Morales
    Aisler Moreno Pérez
    Juan Carlos Morales Jiménez
*/

public class Login_Frame extends javax.swing.JFrame {
    
    public static MenuCliente Menu = new MenuCliente();  
    public static Cuenta_Usuario cuentaConectada;
    public DbHandler dbHandler = new DbHandler();

    public Login_Frame() {
        initComponents(); 
        this.setSize(1280, 820);
        this.setLocationRelativeTo(null);
        this.setTitle("FirstBank | Inicio");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        loginUsername = new javax.swing.JTextField();
        loginPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(250, 150));
        setName("loginWindow"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FBIMG/Logo Main.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 13, -1, 83));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FBIMG/FondoLogin.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 27, 1102, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 920, 620));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginUsername.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        loginUsername.setBorder(null);
        loginUsername.setSelectionColor(new java.awt.Color(255, 255, 255));
        loginUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginUsernameMousePressed(evt);
            }
        });
        loginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameActionPerformed(evt);
            }
        });
        jPanel4.add(loginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 20));

        loginPassword.setBorder(null);
        loginPassword.setSelectionColor(new java.awt.Color(255, 255, 255));
        loginPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginPasswordMousePressed(evt);
            }
        });
        loginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordActionPerformed(evt);
            }
        });
        jPanel4.add(loginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 30));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 10));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 20));

        btnSalir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusable(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel4.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 110, 40));

        btnLogin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnLogin.setText("Ingresar");
        btnLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnLogin.setContentAreaFilled(false);
        btnLogin.setFocusable(false);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Usuario:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("Contraseña:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, 310));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FBIMG/Java1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginUsernameMousePressed
   

    }//GEN-LAST:event_loginUsernameMousePressed

    private void loginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUsernameActionPerformed

    private void loginPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPasswordMousePressed
   

    }//GEN-LAST:event_loginPasswordMousePressed

    private void loginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPasswordActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
   

    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked

    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        CambioClave ventanaCambiarClave = new CambioClave();
        
        if (loginUsername.getText().isEmpty() || loginPassword.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Los campos son obligatorios");
        else {   
            try {
                switch (dbHandler.login(loginUsername.getText(), loginPassword.getText())) {
                    case 1:
                        dispose();
                        MenuAdministracion ventanaAdmin = new MenuAdministracion();
                        ventanaAdmin.setVisible(true);   
                    break;
                    case 2:       
                        cuentaConectada = new Cuenta_Usuario(loginUsername.getText(), loginPassword.getText(), "cliente", "0",
                                                dbHandler.getClienteId("Cuenta_Usuario", "usuario", loginUsername.getText()));
                        
                        if (dbHandler.getFechaModificacion(cuentaConectada.getUsuario()).equals("0")) {
                            dispose();
                            JOptionPane.showMessageDialog(null, "Debe cambiar la contraseña");
                            ventanaCambiarClave.btnSalir.setVisible(false);
                            ventanaCambiarClave.setVisible(true);
                        }
                        else {
                            dispose(); 
                            MenuCliente ventanaCliente = new MenuCliente();
                            ventanaCliente.setVisible(true); 
                            
                        }
                    break;
                    default:
                        loginUsername.setText("");
                        loginPassword.setText("");
                        JOptionPane.showMessageDialog(null, "Usuario o Password incorrectas");
                    break;
                }
            }
        catch (HeadlessException err) {
            JOptionPane.showMessageDialog(null, err);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUsername;
    // End of variables declaration//GEN-END:variables
}
