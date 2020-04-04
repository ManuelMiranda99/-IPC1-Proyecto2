
package Interfaces;

import Nodos.NodoAutos;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaClientes;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Cliente extends javax.swing.JFrame {

    String idCliente;
    public Cliente(String idCliente) {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.idCliente = idCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresarAuto = new javax.swing.JButton();
        btnPagarFacturas = new javax.swing.JButton();
        btnVerProgreso = new javax.swing.JButton();
        btnVerAutos = new javax.swing.JButton();
        btnRegistrarAuto = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresarAuto.setBackground(new java.awt.Color(0, 51, 204));
        btnIngresarAuto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIngresarAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarAuto.setText("Ingresar Automovil");
        btnIngresarAuto.setBorder(null);
        btnIngresarAuto.setFocusable(false);
        btnIngresarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 70));

        btnPagarFacturas.setBackground(new java.awt.Color(0, 51, 204));
        btnPagarFacturas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPagarFacturas.setForeground(new java.awt.Color(255, 255, 255));
        btnPagarFacturas.setText("Pagar Facturas");
        btnPagarFacturas.setBorder(null);
        btnPagarFacturas.setFocusable(false);
        btnPagarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarFacturasActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagarFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 190, 70));

        btnVerProgreso.setBackground(new java.awt.Color(0, 51, 204));
        btnVerProgreso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVerProgreso.setForeground(new java.awt.Color(255, 255, 255));
        btnVerProgreso.setText("Ver Progreso");
        btnVerProgreso.setBorder(null);
        btnVerProgreso.setFocusable(false);
        btnVerProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProgresoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 190, 70));

        btnVerAutos.setBackground(new java.awt.Color(0, 51, 204));
        btnVerAutos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVerAutos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerAutos.setText("Ver Automoviles");
        btnVerAutos.setBorder(null);
        btnVerAutos.setFocusable(false);
        btnVerAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerAutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 190, 70));

        btnRegistrarAuto.setBackground(new java.awt.Color(0, 51, 204));
        btnRegistrarAuto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarAuto.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAuto.setText("Registrar Automovil");
        btnRegistrarAuto.setBorder(null);
        btnRegistrarAuto.setFocusable(false);
        btnRegistrarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 190, 70));

        btnCerrarSesion.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setFocusable(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRegistrarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutoActionPerformed
        dispose();
        RegistrarAuto reau = new RegistrarAuto(idCliente);
        reau.setVisible(true);
    }//GEN-LAST:event_btnRegistrarAutoActionPerformed

    private void btnVerAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAutosActionPerformed
        NodoAutos aux = listaClientes.buscar(Integer.parseInt(idCliente)).cliente.lista.getCabeza();
        if(aux == null){
            JOptionPane.showMessageDialog(null, "El cliente no posee autos para mostrar", "Taller", JOptionPane.WARNING_MESSAGE);
        }else{
            dispose();
            VerAutosCliente ver = new VerAutosCliente(idCliente);
            ver.setVisible(true);
        }
    }//GEN-LAST:event_btnVerAutosActionPerformed

    private void btnVerProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProgresoActionPerformed
        dispose();
        ProgresoAutosCliente pro = new ProgresoAutosCliente(idCliente);
        pro.setVisible(true);
    }//GEN-LAST:event_btnVerProgresoActionPerformed

    private void btnIngresarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAutoActionPerformed
        NodoAutos aux = listaClientes.buscar(Integer.parseInt(idCliente)).cliente.lista.getCabeza();
        if(aux == null){
            JOptionPane.showMessageDialog(null, "El cliente no posee autos para ingresar", "Taller", JOptionPane.WARNING_MESSAGE);
        }else{
            dispose();
            IngresarAutomovil in = new IngresarAutomovil(idCliente);
            in.setVisible(true);
        }            
    }//GEN-LAST:event_btnIngresarAutoActionPerformed

    private void btnPagarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarFacturasActionPerformed
        dispose();
        PagarFacturas pa = new PagarFacturas(idCliente);
        pa.setVisible(true);
    }//GEN-LAST:event_btnPagarFacturasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnIngresarAuto;
    private javax.swing.JButton btnPagarFacturas;
    private javax.swing.JButton btnRegistrarAuto;
    private javax.swing.JButton btnVerAutos;
    private javax.swing.JButton btnVerProgreso;
    // End of variables declaration//GEN-END:variables
}
