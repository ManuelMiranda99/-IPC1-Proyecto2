
package Interfaces;

import Nodos.NodoEmpleados;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaEmpleados;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Empleados extends javax.swing.JFrame {

    public Empleados() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        //Colocar llenado de cmbID
        NodoEmpleados aux = listaEmpleados.getCabeza();
        while(aux != null){
            cmbID.addItem(String.valueOf(aux.empleado.getId()));
            aux = aux.getSiguiente();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cmbID = new javax.swing.JComboBox<>();
        cmbRol = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleados");
        setBackground(java.awt.Color.gray);
        setMaximumSize(new java.awt.Dimension(420, 480));
        setMinimumSize(new java.awt.Dimension(420, 480));
        setPreferredSize(new java.awt.Dimension(420, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Rol: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Usuario: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtPass.setEnabled(false);
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 150, -1));

        txtUser.setEnabled(false);
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 150, -1));

        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, -1));

        cmbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDActionPerformed(evt);
            }
        });
        getContentPane().add(cmbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 150, -1));

        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "mecanico", "receptorPagador" }));
        cmbRol.setSelectedIndex(-1);
        cmbRol.setToolTipText("");
        cmbRol.setEnabled(false);
        cmbRol.setFocusable(false);
        getContentPane().add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 360, 140));

        btnAgregar.setBackground(new java.awt.Color(0, 51, 204));
        btnAgregar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setFocusable(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 90, 50));

        btnModificar.setBackground(new java.awt.Color(0, 51, 204));
        btnModificar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setFocusable(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 90, 50));

        btnEliminar.setBackground(new java.awt.Color(0, 51, 204));
        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 90, 50));

        btnVer.setBackground(new java.awt.Color(0, 51, 204));
        btnVer.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnVer.setForeground(new java.awt.Color(255, 255, 255));
        btnVer.setText("Ver");
        btnVer.setBorder(null);
        btnVer.setFocusable(false);
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 90, 50));

        btnRegresar.setBackground(new java.awt.Color(204, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setFocusable(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        dispose();
        CargaEmpleados carga = new CargaEmpleados();
        carga.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    int p = 0;
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    if(p==0){
        txtNombre.setEnabled(true);
        cmbRol.setEnabled(true);
        txtUser.setEnabled(true);
        txtPass.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);        
        p=1;
    }else{
        //Modificacion del elemento de la lista seleccionado
        
        int id = Integer.parseInt(cmbID.getSelectedItem().toString());
        String nombre = txtNombre.getText(), rol = cmbRol.getSelectedItem().toString(), user = txtUser.getText(), pass = txtPass.getText();
        
        if(nombre.equals("") || rol.equals("") || user.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "Taller", JOptionPane.WARNING_MESSAGE);
        }else{
            listaEmpleados.buscar(id).empleado.setNombre(nombre);
            listaEmpleados.buscar(id).empleado.setRol(rol);
            listaEmpleados.buscar(id).empleado.setUser(user);
            listaEmpleados.buscar(id).empleado.setPass(pass);
        }
        
        txtNombre.setText("");
        txtUser.setText("");
        txtPass.setText("");
        
        txtNombre.setEnabled(false);
        cmbRol.setEnabled(false);
        txtUser.setEnabled(false);
        txtPass.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnEliminar.setEnabled(true);
        p=0;
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(cmbID.getSelectedItem().toString());
        listaEmpleados.eliminar(id);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        String titulos[] = {"ID", "Nombre", "Rol"};
        DefaultTableModel tm = new DefaultTableModel(null, titulos);
        NodoEmpleados aux = listaEmpleados.getCabeza();
        while(aux != null){
            tm.addRow(new Object[]{aux.empleado.getId(), aux.empleado.getNombre(), aux.empleado.getRol()});
            aux = aux.getSiguiente();
        }
        
        tabla.setModel(tm);
        
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        Administrador a = new Administrador();
        a.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIDActionPerformed
        int id = Integer.parseInt(cmbID.getSelectedItem().toString());
        
        txtNombre.setText(listaEmpleados.buscar(id).empleado.getNombre());
        if(listaEmpleados.buscar(id).empleado.getRol().equals("Administrador")){
            cmbRol.setSelectedIndex(0);
        }else if(listaEmpleados.buscar(id).empleado.getRol().equals("mecanico")){
            cmbRol.setSelectedIndex(1);
        }else{
            cmbRol.setSelectedIndex(2);
        }
        txtUser.setText(listaEmpleados.buscar(id).empleado.getUser());
        txtPass.setText(listaEmpleados.buscar(id).empleado.getPass());
    }//GEN-LAST:event_cmbIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cmbID;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
