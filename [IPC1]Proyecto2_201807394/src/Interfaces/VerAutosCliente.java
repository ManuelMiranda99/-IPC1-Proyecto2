
package Interfaces;

import Clases.imgTabla;
import Nodos.NodoAutos;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaClientes;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class VerAutosCliente extends javax.swing.JFrame {

    String idCliente;
    int contador = 1;
    public VerAutosCliente(String idCliente) {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.idCliente = idCliente;
        NodoAutos aux = listaClientes.buscar(Integer.parseInt(idCliente)).cliente.lista.getCabeza();       
        LlenarTabla();
    }
    
    public void LlenarTabla(){
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        String titulos[] = {"Placa", "Marca", "Modelo", "Foto"};
        DefaultTableModel tm = new DefaultTableModel(null, titulos);
        NodoAutos aux = listaClientes.buscar(Integer.parseInt(idCliente)).cliente.lista.getCabeza();
        do{
            Image img = new ImageIcon(aux.auto.getRutaImagen()).getImage();
            ImageIcon imgi = new ImageIcon(img.getScaledInstance(100, 50, Image.SCALE_SMOOTH));
            JLabel imga = new JLabel();
            imga.setIcon(imgi);
            tm.addRow(new Object[]{aux.auto.getPlaca(), aux.auto.getMarca(), aux.auto.getModelo(), imga});
            aux = aux.getSiguiente();
        }while(aux != listaClientes.buscar(Integer.parseInt(idCliente)).cliente.lista.getCabeza());        
        tabla.setRowHeight(70);
        tabla.setModel(tm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ver Autos");
        setMaximumSize(new java.awt.Dimension(510, 365));
        setMinimumSize(new java.awt.Dimension(510, 365));
        setPreferredSize(new java.awt.Dimension(510, 365));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Marca", "Modelo", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 460, 270));

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
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        Cliente c = new Cliente(idCliente);
        c.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
