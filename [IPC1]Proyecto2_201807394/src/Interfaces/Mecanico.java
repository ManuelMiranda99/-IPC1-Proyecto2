
package Interfaces;

import Nodos.*;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/*
    Colocar antes de salir del formulario una logica para que el mecanico se ocupe de nuevo si hay clientes oro o 
    normales en la cola de espera. De preferencia si son oro, entonces seran 2 while
*/

public class Mecanico extends javax.swing.JFrame {

    int idMecanico, idServicio, idOrden;
    public Mecanico(int idMecanico) {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.idMecanico = idMecanico;
        
        NodoOrdenDeTrabajo aux = listaOrdenes.getCabeza();
        
        if(aux != null){
            while(aux != null){
                if(aux.orden.getIdMecanico() == idMecanico && aux.orden.getEstado().equals("EnServicio")){
                    idServicio = aux.orden.getIdServicio();
                    idOrden = aux.orden.getId();
                    lblCliente.setText(aux.orden.getCliente());
                    lblAuto.setText(aux.orden.getAuto());
                    lblServicio.setText(aux.orden.getServicio());
                    break;
                }
                aux = aux.getSiguiente();
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblAuto = new javax.swing.JLabel();
        lblServicio = new javax.swing.JLabel();
        btnServicio = new javax.swing.JButton();
        cmbServicios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cliente Atendiendo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Auto Atendiendo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Servicio que se brinda:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lblCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 240, 20));

        lblAuto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 240, 20));

        lblServicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 240, 20));

        btnServicio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnServicio.setText("Dar Servicio");
        btnServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 40));

        cmbServicios.setEnabled(false);
        cmbServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbServiciosActionPerformed(evt);
            }
        });
        getContentPane().add(cmbServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 190, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicioActionPerformed
        String v="";
        
        if(lblServicio.getText().equals("Diagnostico") || lblServicio.getText().equals("DIAGNOSTICO") || lblServicio.getText().equals("diagnostico")){
            NodoServicios aux = listaServicios.getCabeza();
            while(aux != null){
                cmbServicios.addItem(aux.servicios.getNombre());
                aux = aux.getSiguiente();
            }
            listaServicios.buscar(idServicio).servicios.setUsos();
            cmbServicios.enable(true);
            btnServicio.enable(false);
        }else{
            
            NodoOrdenDeTrabajo aux = listaOrdenes.getCabeza();
        
            if(aux != null){
                while(aux != null){
                    if(aux.orden.getIdMecanico() == idMecanico){
                        aux.orden.setEstado("Listo");
                        aux.orden.setPrecioT(precioN + aux.orden.getPrecioT());
                        listaEmpleados.buscar(idMecanico).empleado.setOcupado();
                        
                        NodoRepuestos auxR = listaServicios.buscar(aux.orden.getIdServicio()).servicios.lista.getCabeza();
                        while(auxR != null){
                            auxR.repuesto.setExistencias();
                            auxR.repuesto.setUsos();
                            auxR = auxR.getSiguiente();
                        }
                        listaServicios.buscar(idServicio).servicios.setUsos();
                        
                        JOptionPane.showMessageDialog(null, "Servicio brindado con exito", "Taller", JOptionPane.INFORMATION_MESSAGE);
                        
                        //Logica para asignarle nuevo trabajo al mecanico
                        NodoOrdenDeTrabajo auxN = listaOrdenes.getCabeza();
                        while(auxN != null){
                            if(auxN.orden.getEstado().equals("ColaDeEspera") && auxN.orden.getTipoC().equals("oro")){
                                auxN.orden.setIdMecanico(idMecanico);
                                auxN.orden.setEmpleado(listaEmpleados.buscar(idMecanico).empleado.getNombre());
                                auxN.orden.setEstado("EnServicio");
                                v="Y";
                                break;
                            }
                            auxN = auxN.getSiguiente();
                        }
                        if(v.equals("")){
                            auxN = listaOrdenes.getCabeza();
                            while(auxN != null){
                                if(auxN.orden.getEstado().equals("ColaDeEspera") && auxN.orden.getTipoC().equals("normal")){
                                    auxN.orden.setIdMecanico(idMecanico);
                                    auxN.orden.setEmpleado(listaEmpleados.buscar(idMecanico).empleado.getNombre());
                                    auxN.orden.setEstado("EnServicio");
                                    break;
                                }
                                auxN = auxN.getSiguiente();
                            }
                        }                                                                            
                        dispose();
                        Login l = new Login();
                        l.setVisible(true);
                        break;
                    }
                    aux = aux.getSiguiente();
                }
            }
            
        }
    }//GEN-LAST:event_btnServicioActionPerformed

    int precioN=0;
    private void cmbServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbServiciosActionPerformed
        String servicio = cmbServicios.getSelectedItem().toString();
        lblServicio.setText(servicio);
        
        NodoServicios aux = listaServicios.getCabeza();
        while(aux != null){
            if(aux.servicios.getNombre().equals(servicio)){
                precioN = aux.servicios.getPrecioTotal();
                idServicio = aux.servicios.getId();
                break;
            }
            aux = aux.getSiguiente();
        }
        
        btnServicio.enable(true);
        
        int msj = JOptionPane.showConfirmDialog(null, "Cliente: Desea recibir el servicio " + servicio + "con un costo de " + precioN, "Taller", JOptionPane.YES_NO_OPTION);
        if(msj != JOptionPane.YES_OPTION){
            listaOrdenes.eliminar(idOrden);
            dispose();
            Login l = new Login();
            l.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "De acuerdo", "Taller", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_cmbServiciosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnServicio;
    private javax.swing.JComboBox<String> cmbServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAuto;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblServicio;
    // End of variables declaration//GEN-END:variables
}
