
package Interfaces;

import Nodos.NodoRepuestos;
import Nodos.NodoServicios;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaRepuestos;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaServicios;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;



public class Servicios extends javax.swing.JFrame {
    
    public Servicios() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        //Colocar llenado de cmbID
        NodoServicios aux = listaServicios.getCabeza();
        while(aux != null){
            cmbID.addItem(String.valueOf(aux.servicios.getId()));
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
        txtModelo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cmbID = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioTotal = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servicios");
        setBackground(java.awt.Color.lightGray);
        setMaximumSize(new java.awt.Dimension(470, 480));
        setMinimumSize(new java.awt.Dimension(470, 480));
        setPreferredSize(new java.awt.Dimension(470, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Marca:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Modelo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtModelo.setEnabled(false);
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 210, -1));

        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 210, -1));

        cmbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDActionPerformed(evt);
            }
        });
        getContentPane().add(cmbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 210, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Marca", "Modelo", "Mano", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 430, 120));

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
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 90, 50));

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
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 90, 50));

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
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 90, 50));

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
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 90, 50));

        txtMarca.setEnabled(false);
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 210, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("<html>\nPrecio Mano <br> de Obra:\n</html>");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtPrecio.setEnabled(false);
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 210, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Precio Total:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtPrecioTotal.setEnabled(false);
        getContentPane().add(txtPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 210, -1));

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
        CargaServicios carga = new CargaServicios();
        carga.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    int p = 0;
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    if(p==0){
        txtNombre.setEnabled(true);
        txtMarca.setEnabled(true);
        txtModelo.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtPrecioTotal.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);        
        p=1;
    }else{
        //Modificacion del elemento de la lista seleccionado
        
        int id = Integer.parseInt(cmbID.getSelectedItem().toString());
        String nombre = txtNombre.getText(), marca = txtMarca.getText(), modelo = txtModelo.getText();
        int precio = Integer.parseInt(txtPrecio.getText()), precioTotal = Integer.parseInt(txtPrecioTotal.getText());
        
        listaServicios.buscar(id).servicios.setNombre(nombre);
        listaServicios.buscar(id).servicios.setMarca(marca);
        listaServicios.buscar(id).servicios.setModelo(modelo);
        
        listaServicios.buscar(id).servicios.setPrecioManoDeObra(precio);
        listaServicios.buscar(id).servicios.setPrecioTotal(precioTotal);
        
        txtNombre.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtPrecio.setText("");
        txtPrecioTotal.setText("");
        
        txtNombre.setEnabled(false);
        txtMarca.setEnabled(false);
        txtModelo.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtPrecioTotal.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnEliminar.setEnabled(true);
        p=0;
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(cmbID.getSelectedItem().toString());
        listaServicios.eliminar(id);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        String titulos[] = {"ID", "Nombre", "Marca", "Modelo", "Mano", "Precio"};
        DefaultTableModel tm = new DefaultTableModel(null, titulos);
        NodoServicios aux = listaServicios.getCabeza();
        while(aux != null){
            System.out.println(aux.servicios.getUsos());
            tm.addRow(new Object[]{aux.servicios.getId(), aux.servicios.getNombre(), aux.servicios.getMarca(), aux.servicios.getModelo(), aux.servicios.getPrecioManoDeObra(), aux.servicios.getPrecioTotal()});
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
        
        txtNombre.setText(listaServicios.buscar(id).servicios.getNombre());
        txtMarca.setText(listaServicios.buscar(id).servicios.getMarca());
        txtModelo.setText(listaServicios.buscar(id).servicios.getModelo());        
        txtPrecio.setText(String.valueOf(listaServicios.buscar(id).servicios.getPrecioManoDeObra()));
        txtPrecioTotal.setText(String.valueOf(listaServicios.buscar(id).servicios.getPrecioTotal()));
    }//GEN-LAST:event_cmbIDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cmbID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioTotal;
    // End of variables declaration//GEN-END:variables
}
