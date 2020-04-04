
package Interfaces;

import Nodos.NodoAutos;
import Nodos.NodoServicios;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.*;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class IngresarAutomovil extends javax.swing.JFrame {

    String idCliente;
    public IngresarAutomovil(String idCliente) {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.idCliente = idCliente;
        
        //Llenado de ComboBox
        NodoServicios aux = listaServicios.getCabeza();
        while(aux != null){
            cmbServicio.addItem(String.valueOf(aux.servicios.getId()));
            aux = aux.getSiguiente();
        }
        
        NodoAutos aux1 = listaClientes.buscar(Integer.parseInt(idCliente)).cliente.lista.getCabeza();
        do{
            cmbPlaca.addItem(aux1.auto.getPlaca());
            aux1 = aux1.getSiguiente();
        }
        while(aux1 != listaClientes.buscar(Integer.parseInt(idCliente)).cliente.lista.getCabeza());                    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbServicio = new javax.swing.JComboBox<>();
        cmbPlaca = new javax.swing.JComboBox<>();
        img = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtServicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar Automovil");
        setMaximumSize(new java.awt.Dimension(400, 275));
        setMinimumSize(new java.awt.Dimension(400, 275));
        setPreferredSize(new java.awt.Dimension(400, 275));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Placa:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Servicio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        cmbServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbServicioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 230, -1));

        cmbPlaca.setFocusable(false);
        cmbPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 230, -1));
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 230, 70));

        btnIngresar.setBackground(new java.awt.Color(0, 204, 0));
        btnIngresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(null);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 40));

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 150, 40));
        getContentPane().add(txtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 166, 230, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String placa, tipo;
        int servicio;
        placa = cmbPlaca.getSelectedItem().toString();
        servicio = Integer.parseInt(cmbServicio.getSelectedItem().toString());
        tipo = listaClientes.buscar(Integer.parseInt(idCliente)).cliente.getTipo();
        dispose();
        OrdenDePago orden = new OrdenDePago(idCliente, placa, servicio, tipo);
        orden.setVisible(true);
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        Cliente c = new Cliente(idCliente);
        c.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlacaActionPerformed
        String placa = cmbPlaca.getSelectedItem().toString();
        String ruta = listaClientes.buscar(Integer.parseInt(idCliente)).cliente.lista.buscar(placa).auto.getRutaImagen();
        Image imgI = new ImageIcon(ruta).getImage();
        ImageIcon imig = new ImageIcon(imgI.getScaledInstance(230 , 70, Image.SCALE_SMOOTH));
        img.setIcon(imig);
    }//GEN-LAST:event_cmbPlacaActionPerformed

    private void cmbServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbServicioActionPerformed
        txtServicio.setText(listaServicios.buscar(Integer.parseInt(cmbServicio.getSelectedItem().toString())).servicios.getNombre());
    }//GEN-LAST:event_cmbServicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> cmbPlaca;
    private javax.swing.JComboBox<String> cmbServicio;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtServicio;
    // End of variables declaration//GEN-END:variables
}
