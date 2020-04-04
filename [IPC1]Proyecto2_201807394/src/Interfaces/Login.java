
package Interfaces;

import Nodos.*;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/*
    Intentar "refrescar" las listas de ordenes y mecanicos cada vez que ingresa al login una persona
*/

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(java.awt.Color.gray);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        btnRegistro.setBackground(new java.awt.Color(0, 204, 0));
        btnRegistro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("Registrarse");
        btnRegistro.setBorder(null);
        btnRegistro.setFocusPainted(false);
        btnRegistro.setFocusable(false);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña:");

        btnLogin.setBackground(new java.awt.Color(0, 51, 204));
        btnLogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(txtUser)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //Verificaion de usuarios para Login
        
        String user, pass, userC, passC, eA = "", eC = "";
        user = txtUser.getText();
        pass = txtPass.getText();
        
        NodoEmpleados aux = listaEmpleados.getCabeza();
        OUTER:
        while (aux != null) {
            userC = aux.empleado.getUser();
            passC = aux.empleado.getPass();
            if (user.equals(userC) && pass.equals(passC)) {
                switch (aux.empleado.getRol()) {
                    case "Administrador":
                        eA = "C";
                        dispose();
                        Administrador a = new Administrador();
                        a.setVisible(true);
                        break OUTER;
                    case "mecanico":
                        eA = "C";
                        dispose();
                        Mecanico m = new Mecanico(aux.empleado.getId());
                        m.setVisible(true);
                        break OUTER;
                }
            }else{
                eA = "E";
            }
            aux = aux.getSiguiente();
        }
        
        NodoClientes aux1 = listaClientes.getCabeza();
        do{
            userC = aux1.cliente.getUser();
            passC = aux1.cliente.getPass();
            if(user.equals(userC) && pass.equals(passC)){
                eC = "C";
                dispose();
                Cliente c = new Cliente(aux1.cliente.getId());
                c.setVisible(true);
                break;
            }else{
                eC = "E";
            }
            aux1 = aux1.getSiguiente();
        }while(aux1 != listaClientes.getCabeza());
        
        if(eA.equals("E") && eC.equals("E")){
            JOptionPane.showMessageDialog(null, "Usuario o Contraseña inexistentes", "Taller",JOptionPane.OK_OPTION);
            txtUser.setText("");
            txtPass.setText("");
        }                        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        dispose();
        Registro re = new Registro();
        re.setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
