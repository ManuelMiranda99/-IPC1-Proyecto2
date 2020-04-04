
package Interfaces;

import Clases.CServicios;
import Listas.ListaRepuestos;
import Nodos.NodoRepuestos;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.*;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class CargaServicios extends javax.swing.JFrame {


    public CargaServicios() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".tms","tms");
        jFileChooser1.setFileFilter(filtro);
        jFileChooser1.setAcceptAllFileFilterUsed(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carga Servicios");
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
                                        
                    String nombre = partes[0], marca = partes[1], modelo = partes[2], listaDeRepuestos = partes[3];
                    int precioMano = Integer.parseInt(partes[4]);
                    
                    String[] listaR = listaDeRepuestos.split(";");
                    
                    ListaRepuestos lista = new ListaRepuestos();
                    for(int i=0;i<listaR.length;i++){
                        NodoRepuestos re = listaRepuestos.buscar(Integer.parseInt(listaR[i]));
                        lista.insertar(re.repuesto);
                    }
                    
                    CServicios c = new CServicios(servicios, precioMano, nombre, marca, modelo, lista);
                    servicios += 1;
                    
                    listaServicios.insertar(c);
                    
                    linea = leer.readLine();
                    
                }
                JOptionPane.showMessageDialog(null, "Llenado de Servicios Exitoso", "Taller", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                Servicios s = new Servicios();
                s.setVisible(true);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }else if(comando.equals(JFileChooser.CANCEL_SELECTION)){
            dispose();
            Servicios s = new Servicios();
            s.setVisible(true);
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
