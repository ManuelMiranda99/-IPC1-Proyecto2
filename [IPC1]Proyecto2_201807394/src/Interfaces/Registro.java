
package Interfaces;

import Clases.CClientes;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaClientes;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setMaximumSize(new java.awt.Dimension(350, 300));
        setMinimumSize(new java.awt.Dimension(350, 300));
        setPreferredSize(new java.awt.Dimension(350, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("User:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Pass:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 180, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 180, -1));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 180, -1));

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 40));

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 204));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.setFocusable(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String id = txtID.getText(), nombre = txtNombre.getText(), user = txtUser.getText(), pass = txtPass.getText();
        CClientes c = new CClientes(id, nombre, user, pass);        
        
        if(nombre.equals("") || id.equals("") || user.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos", "Taller", JOptionPane.WARNING_MESSAGE);
        }else{
            listaClientes.insertar(c);

            JOptionPane.showMessageDialog(null, "Cliente Ingresado con Exito", "Taller", JOptionPane.INFORMATION_MESSAGE);
            dispose();        
            Login l = new Login();
            l.setVisible(true);
        }
                
    }//GEN-LAST:event_btnRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
