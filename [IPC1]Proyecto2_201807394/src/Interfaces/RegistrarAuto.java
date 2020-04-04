
package Interfaces;

import Clases.CAutos;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaClientes;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RegistrarAuto extends javax.swing.JFrame {

    String idCliente;
    public RegistrarAuto(String idCliente) {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.idCliente = idCliente;
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG & JPEG", "jpg", "jpeg");
        fc.setFileFilter(filtro);
        fc.setAcceptAllFileFilterUsed(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtFoto = new javax.swing.JTextField();
        fc = new javax.swing.JFileChooser();
        btnMostrar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        timg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Automovil");
        setMaximumSize(new java.awt.Dimension(620, 500));
        setMinimumSize(new java.awt.Dimension(620, 500));
        setPreferredSize(new java.awt.Dimension(620, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Placa:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Marca:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Modelo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Foto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 180, -1));
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 180, -1));
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 180, -1));

        txtFoto.setEnabled(false);
        getContentPane().add(txtFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 180, -1));

        fc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcActionPerformed(evt);
            }
        });
        getContentPane().add(fc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 580, 280));

        btnMostrar.setBackground(new java.awt.Color(0, 51, 204));
        btnMostrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrar.setText("Mostrar");
        btnMostrar.setBorder(null);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 165, 90, 30));

        btnRegistrar.setBackground(new java.awt.Color(0, 204, 0));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 110, 60));

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
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 110, 60));
        getContentPane().add(timg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 190, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String placa = txtPlaca.getText(), marca = txtMarca.getText(), modelo = txtModelo.getText(), foto = txtFoto.getText();
        if(placa.equals("") || marca.equals("") || modelo.equals("") || foto.equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los campos", "Taller", JOptionPane.WARNING_MESSAGE);
        }else{
            CAutos auto = new CAutos(placa, marca, modelo, foto);
            listaClientes.buscar(Integer.parseInt(idCliente)).cliente.lista.insertar(auto);
            JOptionPane.showMessageDialog(null, "Auto registrado con exito", "Taller", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            Cliente c = new Cliente(idCliente);
            c.setVisible(true);
        }            
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        Cliente c = new Cliente(idCliente);
        c.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void fcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcActionPerformed
        String comando = evt.getActionCommand();
        if(comando.equals(JFileChooser.APPROVE_SELECTION)){
            File ar = fc.getSelectedFile();
            txtFoto.setText(ar.toString());
        }else{
            dispose();
            Cliente c = new Cliente(idCliente);
            c.setVisible(true);
        }
    }//GEN-LAST:event_fcActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Image img = new ImageIcon(txtFoto.getText()).getImage();
        ImageIcon imgi = new ImageIcon(img.getScaledInstance(190, 140, Image.SCALE_SMOOTH));
        timg.setIcon(imgi);
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JFileChooser fc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel timg;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
