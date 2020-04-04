
package Interfaces;

import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaRepuestos;
import java.awt.Color;
import javax.swing.JOptionPane;



public class Administrador extends javax.swing.JFrame {

    int p=0;
    public Administrador() {
        initComponents();
        setLocationRelativeTo(null);
        jPanel1.setBackground(Color.LIGHT_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnRepuestos = new javax.swing.JButton();
        btnClientesAutos = new javax.swing.JButton();
        btnProgreso = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setBackground(new java.awt.Color(51, 204, 255));
        setMaximumSize(new java.awt.Dimension(600, 300));
        setMinimumSize(new java.awt.Dimension(600, 300));
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        btnServicios.setBackground(new java.awt.Color(0, 51, 204));
        btnServicios.setForeground(new java.awt.Color(255, 255, 255));
        btnServicios.setText("Servicios");
        btnServicios.setBorder(null);
        btnServicios.setFocusable(false);
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        jPanel1.add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 120, 70));

        btnEmpleados.setBackground(new java.awt.Color(0, 51, 204));
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorder(null);
        btnEmpleados.setFocusable(false);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, 70));

        btnRepuestos.setBackground(new java.awt.Color(0, 51, 204));
        btnRepuestos.setForeground(new java.awt.Color(255, 255, 255));
        btnRepuestos.setText("Repuestos");
        btnRepuestos.setBorder(null);
        btnRepuestos.setFocusable(false);
        btnRepuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepuestosActionPerformed(evt);
            }
        });
        jPanel1.add(btnRepuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 120, 70));

        btnClientesAutos.setBackground(new java.awt.Color(0, 51, 204));
        btnClientesAutos.setForeground(new java.awt.Color(255, 255, 255));
        btnClientesAutos.setText("<html>\nClientes y <br> Automoviles\n</html>");
        btnClientesAutos.setBorder(null);
        btnClientesAutos.setFocusable(false);
        btnClientesAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesAutosActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientesAutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, 70));

        btnProgreso.setBackground(new java.awt.Color(0, 51, 204));
        btnProgreso.setForeground(new java.awt.Color(255, 255, 255));
        btnProgreso.setText("Progreso Autos");
        btnProgreso.setBorder(null);
        btnProgreso.setFocusable(false);
        btnProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProgresoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 120, 70));

        btnReportes.setBackground(new java.awt.Color(0, 51, 204));
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes");
        btnReportes.setBorder(null);
        btnReportes.setFocusable(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 120, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        dispose();
        Empleados e = new Empleados();
        e.setVisible(true);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnRepuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepuestosActionPerformed
        dispose();
        Repuestos r = new Repuestos();
        r.setVisible(true);
    }//GEN-LAST:event_btnRepuestosActionPerformed

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        if(listaRepuestos.getCabeza()==null){
            JOptionPane.showMessageDialog(null, "Llene los Repuestos antes", "Taller", JOptionPane.WARNING_MESSAGE);
        }else{
            dispose();
            Servicios s = new Servicios();
            s.setVisible(true);
        }   
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnClientesAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesAutosActionPerformed
        dispose();
        ClientesAutos ca = new ClientesAutos();
        ca.setVisible(true);
    }//GEN-LAST:event_btnClientesAutosActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        dispose();
        Reportes re = new Reportes();
        re.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgresoActionPerformed
        dispose();
        ProgresoAutosAdmin pro = new ProgresoAutosAdmin();
        pro.setVisible(true);
    }//GEN-LAST:event_btnProgresoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientesAutos;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnProgreso;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnRepuestos;
    private javax.swing.JButton btnServicios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
