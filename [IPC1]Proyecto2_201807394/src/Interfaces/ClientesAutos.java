
package Interfaces;

import Clases.imgTabla;
import Nodos.NodoAutos;
import Nodos.NodoClientes;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaClientes;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ClientesAutos extends javax.swing.JFrame {

    public ClientesAutos() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        //Colocar llenado de cmbID
        NodoClientes aux = listaClientes.getCabeza();
        if(aux != null){
            do{
                cmbID.addItem(aux.cliente.getId());
                aux = aux.getSiguiente();
            }while(aux != listaClientes.getCabeza());
        }            
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAutos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes y Automoviles");
        setBackground(java.awt.Color.lightGray);
        setMaximumSize(new java.awt.Dimension(420, 480));
        setMinimumSize(new java.awt.Dimension(420, 480));
        setPreferredSize(new java.awt.Dimension(420, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Autos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 150, -1));

        cmbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDActionPerformed(evt);
            }
        });
        getContentPane().add(cmbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 150, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Tipo"
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
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 360, 120));

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
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 90, 50));

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
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 90, 50));

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
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 90, 50));

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
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 90, 50));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Nombre:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        tablaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaAutos);
        if (tablaAutos.getColumnModel().getColumnCount() > 0) {
            tablaAutos.getColumnModel().getColumn(1).setResizable(false);
            tablaAutos.getColumnModel().getColumn(2).setResizable(false);
            tablaAutos.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 70));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Usuario:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtUser.setEnabled(false);
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 150, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Contraseña:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtPass.setEnabled(false);
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 150, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Tipo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Oro" }));
        cmbTipo.setSelectedIndex(-1);
        cmbTipo.setEnabled(false);
        getContentPane().add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 150, -1));

        btnRegresar.setBackground(new java.awt.Color(204, 0, 0));
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
        CargaClientesAutos carga = new CargaClientesAutos();
        carga.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    int p = 0;
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    if(p==0){
        txtNombre.setEnabled(true);
        txtUser.setEnabled(true);
        txtPass.setEnabled(true);
        cmbTipo.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);        
        p=1;
    }else{
        //Modificacion del elemento de la lista seleccionado
        int id = Integer.parseInt(cmbID.getSelectedItem().toString());
        String nombre = txtNombre.getText(), user = txtUser.getText(), pass = txtPass.getText(), tipo;
        if(cmbTipo.getSelectedIndex()==0){
            tipo = "normal";
        }else{
            tipo = "oro";
        }
        
        if(nombre.equals("") || user.equals("") || pass.equals("")){
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "Taller", JOptionPane.WARNING_MESSAGE);
        }else{
            listaClientes.buscar(id).cliente.setNombre(nombre);
            listaClientes.buscar(id).cliente.setUser(user);
            listaClientes.buscar(id).cliente.setPass(pass);
            listaClientes.buscar(id).cliente.setTipo(tipo);
        }
        
        txtNombre.setText("");
        txtUser.setText("");
        txtPass.setText("");
        
        txtNombre.setEnabled(false);
        txtUser.setEnabled(false);
        txtPass.setEnabled(false);
        cmbTipo.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnEliminar.setEnabled(true);
        p=0;
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(cmbID.getSelectedItem().toString());
        listaClientes.eliminar(id);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        String titulos[] = {"ID", "Nombre", "Tipo"};
        DefaultTableModel tm = new DefaultTableModel(null, titulos);
        NodoClientes aux = listaClientes.getCabeza();
        
        do{
            tm.addRow(new Object[]{aux.cliente.getId(), aux.cliente.getNombre(), aux.cliente.getTipo()});
            aux = aux.getSiguiente();
        }while(aux != listaClientes.getCabeza());
        tabla.setModel(tm);
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        Administrador a = new Administrador();
        a.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIDActionPerformed
        int id = Integer.parseInt(cmbID.getSelectedItem().toString());
        String nombre = listaClientes.buscar(id).cliente.getNombre(), user = listaClientes.buscar(id).cliente.getUser(), pass = listaClientes.buscar(id).cliente.getPass();
        txtNombre.setText(nombre);
        txtUser.setText(user);
        txtPass.setText(pass);
        if(listaClientes.buscar(id).cliente.getTipo().equals("oro")){
            cmbTipo.setSelectedIndex(1);
        }else{
            cmbTipo.setSelectedIndex(0);
        }
        
        //Llenado de tablaAutos
        
        tablaAutos.setDefaultRenderer(Object.class, new imgTabla());
        String titulos[] = {"Placa", "Marca", "Modelo", "Foto"};
        DefaultTableModel tm = new DefaultTableModel(null, titulos);
        NodoAutos aux = listaClientes.buscar(id).cliente.lista.getCabeza();
        if(aux != null){
            do{
                Image img = new ImageIcon(aux.auto.getRutaImagen()).getImage();
                ImageIcon imgi = new ImageIcon(img.getScaledInstance(80, 50, Image.SCALE_SMOOTH));
                JLabel imga = new JLabel();
                imga.setIcon(imgi);
                tm.addRow(new Object[]{aux.auto.getPlaca(), aux.auto.getMarca(), aux.auto.getModelo(), imga});
                aux = aux.getSiguiente();
            }while(aux != listaClientes.buscar(id).cliente.lista.getCabeza()); 
        }
        tablaAutos.setRowHeight(60);
        tablaAutos.setModel(tm);                
    }//GEN-LAST:event_cmbIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cmbID;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaAutos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
