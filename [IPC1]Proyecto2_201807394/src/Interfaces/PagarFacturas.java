
package Interfaces;

import Nodos.NodoOrdenDeTrabajo;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class PagarFacturas extends javax.swing.JFrame {

    String idCliente;
    public PagarFacturas(String idCliente) {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.idCliente = idCliente;
        
        NodoOrdenDeTrabajo aux = listaOrdenes.getCabeza();
        if(aux != null){
            while(aux != null){
                if(aux.orden.getIdCliente().equals(idCliente) && aux.orden.getEstado().equals("Listo")){
                    cmbOrden.addItem(String.valueOf(aux.orden.getId()));
                }
                aux = aux.getSiguiente();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        cmbOrden = new javax.swing.JComboBox<>();
        btnPagar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pagar Facturas");
        setMaximumSize(new java.awt.Dimension(408, 243));
        setMinimumSize(new java.awt.Dimension(408, 243));
        setPreferredSize(new java.awt.Dimension(408, 243));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Orden:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Precio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, 20));

        cmbOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrdenActionPerformed(evt);
            }
        });
        getContentPane().add(cmbOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 200, -1));

        btnPagar.setBackground(new java.awt.Color(0, 204, 0));
        btnPagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(0, 0, 0));
        btnPagar.setText("Pagar");
        btnPagar.setBorder(null);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 40));

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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 160, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        Cliente c = new Cliente(idCliente);
        c.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        
        if(cmbOrden.getSelectedIndex()!=-1){
            int id = Integer.parseInt(cmbOrden.getSelectedItem().toString());

            listaOrdenes.buscar(id).orden.setEstado("Pagado");
            listaClientes.buscar(Integer.parseInt(idCliente)).cliente.usoCliente();

            JOptionPane.showMessageDialog(null, "Servicio Pagado", "Taller", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            Cliente c = new Cliente(idCliente);
            c.setVisible(true);
        }                    
        
    }//GEN-LAST:event_btnPagarActionPerformed

    private void cmbOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrdenActionPerformed
        int id = Integer.parseInt(cmbOrden.getSelectedItem().toString());
        lblPrecio.setText(String.valueOf(listaOrdenes.buscar(id).orden.getPrecioT()));
    }//GEN-LAST:event_cmbOrdenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cmbOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPrecio;
    // End of variables declaration//GEN-END:variables
}
