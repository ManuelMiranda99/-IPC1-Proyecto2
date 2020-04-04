
package Interfaces;

import LogicaReportes.*;
import Nodos.*;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.*;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;





public class Reportes extends javax.swing.JFrame {

    private String ruta;
    public Reportes() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        JOptionPane.showMessageDialog(null, "Seleccione la carpeta donde guardara los reportes", "Taller", JOptionPane.INFORMATION_MESSAGE);
        
        JFileChooser dlg = new JFileChooser();        
        dlg.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int opt = dlg.showSaveDialog(this);
        if(opt == JFileChooser.APPROVE_OPTION){
            ruta = dlg.getSelectedFile().toString();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnAutos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnRepuestosU = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnRepuestosC = new javax.swing.JButton();

        jButton4.setText("Clientes");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reportes");
        setBackground(java.awt.Color.lightGray);
        setMaximumSize(new java.awt.Dimension(500, 330));
        setMinimumSize(new java.awt.Dimension(500, 330));
        setPreferredSize(new java.awt.Dimension(500, 330));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnAutos.setBackground(new java.awt.Color(0, 51, 204));
        btnAutos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAutos.setForeground(new java.awt.Color(255, 255, 255));
        btnAutos.setText("<html>\nAutos más <br>Repetidos\n</html>");
        btnAutos.setBorder(null);
        btnAutos.setFocusable(false);
        btnAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, 70));

        btnClientes.setBackground(new java.awt.Color(0, 51, 204));
        btnClientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.setFocusable(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 160, 70));

        btnRepuestosU.setBackground(new java.awt.Color(0, 51, 204));
        btnRepuestosU.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRepuestosU.setForeground(new java.awt.Color(255, 255, 255));
        btnRepuestosU.setText("<html>\nRepuestos más <br> Usados\n</html>");
        btnRepuestosU.setBorder(null);
        btnRepuestosU.setFocusable(false);
        btnRepuestosU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepuestosUActionPerformed(evt);
            }
        });
        getContentPane().add(btnRepuestosU, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 160, 70));

        btnServicios.setBackground(new java.awt.Color(0, 51, 204));
        btnServicios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(255, 255, 255));
        btnServicios.setText("<html>\nServicios más <br>Usados\n</html>");
        btnServicios.setBorder(null);
        btnServicios.setFocusable(false);
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        getContentPane().add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 160, 70));

        btnRepuestosC.setBackground(new java.awt.Color(0, 51, 204));
        btnRepuestosC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRepuestosC.setForeground(new java.awt.Color(255, 255, 255));
        btnRepuestosC.setText("<html>\nRepuestos más <br>Caros\n</html>");
        btnRepuestosC.setBorder(null);
        btnRepuestosC.setFocusable(false);
        btnRepuestosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepuestosCActionPerformed(evt);
            }
        });
        getContentPane().add(btnRepuestosC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 160, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        Administrador a = new Administrador();
        a.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        
        ReporteClientes r1 = new ReporteClientes();
        r1.generarHTML(ruta);
        
        try {
            
            File o = new File(r1.ruta);
            Desktop.getDesktop().open(o);
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnRepuestosUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepuestosUActionPerformed
        
        ReporteRepuestosMU r2 = new ReporteRepuestosMU();                
        r2.generarPDF(generarBarrasR(), ruta);
        
        try {
            
            File o = new File(r2.ruta);
            Desktop.getDesktop().open(o);
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnRepuestosUActionPerformed

    public static JFreeChart generarBarrasR(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();        
        listaRepuestos.OrdenarMU();
        NodoRepuestos aux = listaRepuestos.listaMU.getCabeza();
        for(int i=0;i<10;i++){
            if(aux == null){
                break;
            }else{
                dataSet.setValue(aux.repuesto.getUsos(), "Usos", aux.repuesto.getNombre());
            }
            aux = aux.getSiguiente();
        }
        JFreeChart chart = ChartFactory.createBarChart("Repuestos mas usados", "Repuestos", "Usos", dataSet, PlotOrientation.VERTICAL, false, true, false);
        
        return chart;
        
    }    
    
    private void btnRepuestosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepuestosCActionPerformed
        
        ReportesRepuestosMC r3 = new ReportesRepuestosMC();        
        listaRepuestos.OrdenarMC();
        r3.generarHTML(ruta);
        
        try {
            
            File o = new File(r3.ruta);
            Desktop.getDesktop().open(o);
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnRepuestosCActionPerformed

    public static JFreeChart generarBarrasS(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        listaServicios.OrdenarMU();
        NodoServicios aux = listaServicios.listaMU.getCabeza();
        for(int i=0;i<10;i++){
            if(aux == null){
                break;
            }else{
                dataSet.setValue(aux.servicios.getUsos(), "Usos", aux.servicios.getNombre());
            }
            aux = aux.getSiguiente();
        }
        JFreeChart chart = ChartFactory.createBarChart("Servicios mas usados", "Servicios", "Usos", dataSet, PlotOrientation.VERTICAL, false, true, false);
        
        return chart;
        
    }
    
    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        
        ReportesServiciosMU r4 = new ReportesServiciosMU();        
        r4.generarPDF(generarBarrasS(), ruta);
        
        try {
            
            File o = new File(r4.ruta);
            Desktop.getDesktop().open(o);
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnServiciosActionPerformed

    private void btnAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutosActionPerformed
        
        ReportesAutosMR r5 = new ReportesAutosMR();
        r5.generarHTML(ruta);
        
        /*try {
            
            File o = new File(r5.ruta);
            Desktop.getDesktop().open(o);
            
        } catch (Exception e) {
        }*/
        
    }//GEN-LAST:event_btnAutosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutos;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRepuestosC;
    private javax.swing.JButton btnRepuestosU;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
