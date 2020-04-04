
package Interfaces;

import Nodos.NodoOrdenDeTrabajo;
import static ipc1.proyecto2_201807394.IPC1Proyecto2_201807394.listaOrdenes;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class ProgresoAutosAdmin extends javax.swing.JFrame {


    public ProgresoAutosAdmin(){
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        NodoOrdenDeTrabajo aux = listaOrdenes.getCabeza();
        if(aux != null){
            LlenarTablas(aux);
        }
    }
    
    public void LlenarTablas(NodoOrdenDeTrabajo aux){
        String tC[] = {"Orden", "Auto", "Cliente"};
        String tA[] = {"Orden", "Auto", "Cliente", "Mecanico"};
        String tL[] = {"Orden", "Auto", "Cliente", "Servicio", "Total"};
        DefaultTableModel tm1 = new DefaultTableModel(null, tC);
        DefaultTableModel tm2 = new DefaultTableModel(null, tA);
        DefaultTableModel tm3 = new DefaultTableModel(null, tL);
        while(aux != null){
            if(aux.orden.getEstado().equals("ColaDeEspera")){
                if(aux.orden.getTipoC().equals("oro")){
                    tm1.addRow(new Object[]{aux.orden.getId(), aux.orden.getAuto(), aux.orden.getCliente()});
                }                
            }else if(aux.orden.getEstado().equals("EnServicio")){
                tm2.addRow(new Object[]{aux.orden.getId(), aux.orden.getAuto(), aux.orden.getCliente(), aux.orden.getEmpleado()});
            }else if(aux.orden.getEstado().equals("Listo")){
                tm3.addRow(new Object[]{aux.orden.getId(), aux.orden.getAuto(), aux.orden.getCliente(), aux.orden.getServicio(), aux.orden.getPrecioT()});
            }
            aux = aux.getSiguiente();
        }
        aux = listaOrdenes.getCabeza();
        while(aux != null){
            if(aux.orden.getEstado().equals("ColaDeEspera")){
                if(aux.orden.getTipoC().equals("normal")){
                    tm1.addRow(new Object[]{aux.orden.getId(), aux.orden.getAuto(), aux.orden.getCliente()});
                }
            }
            aux = aux.getSiguiente();
        }
        
        tablaColaEspera.setModel(tm1);
        tablaAtendiendo.setModel(tm2);
        tablaListos.setModel(tm3);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaColaEspera = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAtendiendo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaListos = new javax.swing.JTable();
        btnRegresar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Progreso de Automoviles");
        setBackground(java.awt.Color.gray);
        setMaximumSize(new java.awt.Dimension(550, 370));
        setMinimumSize(new java.awt.Dimension(550, 370));
        setPreferredSize(new java.awt.Dimension(550, 370));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cola de Espera");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Carros Atendiendo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Carros Listos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        tablaColaEspera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orden", "Auto", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaColaEspera);
        if (tablaColaEspera.getColumnModel().getColumnCount() > 0) {
            tablaColaEspera.getColumnModel().getColumn(0).setResizable(false);
            tablaColaEspera.getColumnModel().getColumn(1).setResizable(false);
            tablaColaEspera.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 110));

        tablaAtendiendo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orden", "Auto", "Cliente", "Mecanico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaAtendiendo);
        if (tablaAtendiendo.getColumnModel().getColumnCount() > 0) {
            tablaAtendiendo.getColumnModel().getColumn(0).setResizable(false);
            tablaAtendiendo.getColumnModel().getColumn(1).setResizable(false);
            tablaAtendiendo.getColumnModel().getColumn(2).setResizable(false);
            tablaAtendiendo.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 260, 110));

        tablaListos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orden", "Auto", "Cliente", "Servicio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaListos);
        if (tablaListos.getColumnModel().getColumnCount() > 0) {
            tablaListos.getColumnModel().getColumn(0).setResizable(false);
            tablaListos.getColumnModel().getColumn(1).setResizable(false);
            tablaListos.getColumnModel().getColumn(2).setResizable(false);
            tablaListos.getColumnModel().getColumn(3).setResizable(false);
            tablaListos.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 530, 110));

        btnRegresar2.setBackground(new java.awt.Color(204, 0, 0));
        btnRegresar2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar2.setText("Regresar");
        btnRegresar2.setBorder(null);
        btnRegresar2.setFocusable(false);
        btnRegresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar2ActionPerformed
        dispose();
        Administrador a = new Administrador();
        a.setVisible(true);
    }//GEN-LAST:event_btnRegresar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaAtendiendo;
    private javax.swing.JTable tablaColaEspera;
    private javax.swing.JTable tablaListos;
    // End of variables declaration//GEN-END:variables
}
