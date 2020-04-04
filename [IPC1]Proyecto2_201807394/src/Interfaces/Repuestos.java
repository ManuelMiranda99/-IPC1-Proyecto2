
package Interfaces;

import Nodos.NodoRepuestos;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaRepuestos;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Repuestos extends javax.swing.JFrame {

    public Repuestos() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        //Colocar llenado de cmbID
        NodoRepuestos aux = listaRepuestos.getCabeza();
        while(aux != null){
            cmbID.addItem(String.valueOf(aux.repuesto.getId()));
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
        txtExistencias = new javax.swing.JTextField();
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
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Repuestos");
        setBackground(java.awt.Color.lightGray);
        setMaximumSize(new java.awt.Dimension(470, 480));
        setMinimumSize(new java.awt.Dimension(470, 480));
        setPreferredSize(new java.awt.Dimension(470, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 30, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Marca:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Modelo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Existencias:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtExistencias.setEnabled(false);
        getContentPane().add(txtExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 200, -1));

        txtModelo.setEnabled(false);
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, -1));

        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, -1));

        cmbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIDActionPerformed(evt);
            }
        });
        getContentPane().add(cmbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Marca", "Modelo", "Existencias", "Precio"
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
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 420, 120));

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
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 90, 50));

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
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 90, 50));

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
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 90, 50));

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
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 90, 50));

        txtMarca.setEnabled(false);
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 200, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Precio:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtPrecio.setEnabled(false);
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 200, -1));

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
        CargaRepuestos carga = new CargaRepuestos();
        carga.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    int p = 0;
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    if(p==0){
        txtNombre.setEnabled(true);
        txtMarca.setEnabled(true);
        txtModelo.setEnabled(true);
        txtExistencias.setEnabled(true);
        txtPrecio.setEnabled(true);
        btnAgregar.setEnabled(false);
        btnEliminar.setEnabled(false);        
        p=1;
    }else{
        //Modificacion del elemento de la lista seleccionado
        int id = Integer.parseInt(cmbID.getSelectedItem().toString()), existencias, precio=0;        
        if(txtExistencias.getText().equals("")){
            existencias = 0;
            if(txtPrecio.getText().equals("")){
                precio = 0;
            }else{
                precio = Integer.parseInt(txtPrecio.getText());
            }
        }else{
            existencias = Integer.parseInt(txtExistencias.getText());
        }
        String nombre = txtNombre.getText(), marca = txtMarca.getText(), modelo = txtModelo.getText();
        
        if(nombre.equals("") || marca.equals("") || modelo.equals("")){
            JOptionPane.showMessageDialog(null, "Llene todos los campos", "Taller", JOptionPane.WARNING_MESSAGE);
        }else{
            listaRepuestos.buscar(id).repuesto.setExistencias(existencias);
            listaRepuestos.buscar(id).repuesto.setPrecio(precio);
            listaRepuestos.buscar(id).repuesto.setNombre(nombre);
            listaRepuestos.buscar(id).repuesto.setMarca(marca);
            listaRepuestos.buscar(id).repuesto.setModelo(modelo);
        }
        
        txtNombre.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtExistencias.setText("");
        txtPrecio.setText("");
        
        txtNombre.setEnabled(false);
        txtMarca.setEnabled(false);
        txtModelo.setEnabled(false);
        txtExistencias.setEnabled(false);
        txtPrecio.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnEliminar.setEnabled(true);
        p=0;
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(cmbID.getSelectedItem().toString());
        listaRepuestos.eliminar(id);                
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        String titulos[] = {"ID", "Nombre", "Marca", "Modelo", "Existencias", "Precio"};
        DefaultTableModel tm = new DefaultTableModel(null, titulos);
        NodoRepuestos aux = listaRepuestos.getCabeza();
        while(aux != null){
            tm.addRow(new Object[]{aux.repuesto.getId(), aux.repuesto.getNombre(), aux.repuesto.getMarca(), aux.repuesto.getModelo(), aux.repuesto.getExistencias(), aux.repuesto.getPrecio()});
            aux = aux.getSiguiente();
        }
        tabla.setModel(tm);
        System.out.println(listaRepuestos.t);
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        Administrador a = new Administrador();
        a.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIDActionPerformed
        int id = Integer.parseInt(cmbID.getSelectedItem().toString());
        
        txtNombre.setText(listaRepuestos.buscar(id).repuesto.getNombre());
        txtMarca.setText(listaRepuestos.buscar(id).repuesto.getMarca());
        txtModelo.setText(listaRepuestos.buscar(id).repuesto.getModelo());
        txtExistencias.setText(String.valueOf(listaRepuestos.buscar(id).repuesto.getExistencias()));
        txtPrecio.setText(String.valueOf(listaRepuestos.buscar(id).repuesto.getPrecio()));
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
