
package Interfaces;

import Clases.COrdenDeTrabajo;
import Nodos.*;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.*;
import java.awt.Color;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class OrdenDePago extends javax.swing.JFrame {

    String tipoC, idCliente, Placa, Mecanico = "En Espera", Fecha = "", ServicioT, Cliente, estado="ColaDeEspera";
    int Precio = 0, Servicio, idMecanico = -1;
    public OrdenDePago(String idCliente, String Placa, int Servicio, String tipo) {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.idCliente = idCliente;
        this.Placa = Placa;
        this.Servicio = Servicio;
        Date date = new Date();
        this.tipoC = tipo;
        
        //Llenado de todos los labels
        Precio = listaServicios.buscar(Servicio).servicios.getPrecioTotal();
        ServicioT = listaServicios.buscar(Servicio).servicios.getNombre();
        Fecha = new SimpleDateFormat("dd/MM/yyyy").format(date);
        Cliente = listaClientes.buscar(Integer.parseInt(idCliente)).cliente.getNombre();
        NodoEmpleados aux = listaEmpleados.getCabeza();
        while(aux != null){
            
            if(aux.empleado.getRol().equals("mecanico")){
                if(aux.empleado.getOcupado().equals("NO")){
                    Mecanico = aux.empleado.getNombre();
                    aux.empleado.setOcupado();
                    estado = "EnServicio";
                    idMecanico = aux.empleado.getId();
                    break;
                }
            }
            
            aux = aux.getSiguiente();
        }
        
        lblPrecio.setText(String.valueOf(Precio));
        lblPlaca.setText(this.Placa);
        lblCliente.setText(Cliente);
        lblServicio.setText(ServicioT);
        lblFecha.setText(Fecha);
        lblMecanico.setText(Mecanico);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblMecanico = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblServicio = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso Automovil");
        setMaximumSize(new java.awt.Dimension(694, 325));
        setMinimumSize(new java.awt.Dimension(694, 325));
        setPreferredSize(new java.awt.Dimension(694, 325));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Precio: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Auto (Placa):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Cliente: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Servicio:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fecha: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Mecanico: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Orden de Pago");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 220, -1));

        lblPlaca.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, 20));

        lblCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 160, 20));

        lblMecanico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 200, 20));

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 230, 20));

        lblServicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 310, 20));

        lblPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 160, 20));

        btnAceptar.setBackground(new java.awt.Color(0, 204, 0));
        btnAceptar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setFocusable(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 290, 50));

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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 290, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        COrdenDeTrabajo Norden = new COrdenDeTrabajo(orden, Precio, Placa, Cliente, ServicioT, Fecha, Mecanico, estado, tipoC, idCliente, idMecanico, Servicio);
        listaOrdenes.insertar(Norden);
        orden += 1;
        JOptionPane.showMessageDialog(null, "Orden Ingresada con Exito", "Taller", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        Cliente c = new Cliente(idCliente);
        c.setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        IngresarAutomovil in = new IngresarAutomovil(idCliente);
        in.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMecanico;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblServicio;
    // End of variables declaration//GEN-END:variables
}
