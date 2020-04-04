
package Interfaces;

import Clases.CEmpleados;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.*;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class CargaEmpleados extends javax.swing.JFrame {


    public CargaEmpleados() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".tme","tme");
        jFileChooser1.setFileFilter(filtro);
        jFileChooser1.setAcceptAllFileFilterUsed(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carga Empleados");
        setBackground(java.awt.Color.lightGray);
        setResizable(false);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        String comando = evt.getActionCommand();        
        if(comando.equals(JFileChooser.APPROVE_SELECTION)){
            File ar = jFileChooser1.getSelectedFile();
            try{
                BufferedReader leer = new BufferedReader(new FileReader(ar.getAbsolutePath()));
                
                String linea = leer.readLine();
                while(linea != null){
                    
                    String[] partes = linea.split("-");
                                        
                    String nombre = partes[0], rol = partes[1], user = partes[2], pass = partes[3];
                    
                    CEmpleados e = new CEmpleados(empleados, nombre, rol, user, pass);
                    empleados +=1;
                    listaEmpleados.insertar(e);
                    
                    linea = leer.readLine();
                    
                }
                JOptionPane.showMessageDialog(null, "Llenado de Empleados Exitoso", "Taller",JOptionPane.INFORMATION_MESSAGE);
                dispose();
                Empleados e = new Empleados();
                e.setVisible(true);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else if(comando.equals(JFileChooser.CANCEL_SELECTION)){
            dispose();
            Empleados e = new Empleados();
            e.setVisible(true);
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
