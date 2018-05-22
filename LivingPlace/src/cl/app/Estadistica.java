
package cl.app;

import cl.model.Data;
import cl.model.Estadisticas;
import cl.model.Vivienda;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author daisydaniela36
 */
public class Estadistica extends javax.swing.JFrame {
    private Data d;
            
    public Estadistica() throws ClassNotFoundException, SQLException {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        d = new Data();
        
        cargarEstadisticas(d.getListaViviendas());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEstadisticas2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        rbUsadas = new javax.swing.JRadioButton();
        rbVArrendadas = new javax.swing.JRadioButton();
        rbVVendidas = new javax.swing.JRadioButton();
        txtTop = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadisticas"));

        tablaEstadisticas2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaEstadisticas2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1117, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Viviendas"));

        buttonGroup1.add(rbUsadas);
        rbUsadas.setText("Usadas");
        rbUsadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUsadasActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbVArrendadas);
        rbVArrendadas.setText("Arrendadas");
        rbVArrendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVArrendadasActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbVVendidas);
        rbVVendidas.setText("Vendidas");
        rbVVendidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVVendidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbVVendidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addComponent(rbVArrendadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbUsadas)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbVArrendadas)
                    .addComponent(rbVVendidas)
                    .addComponent(rbUsadas))
                .addContainerGap())
        );

        jLabel1.setText("Top: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTop, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbVVendidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVVendidasActionPerformed
        try {
            cargarEstadisticas(d.getListaViviendasVendidas());
        } catch (SQLException ex) {
            Logger.getLogger(Estadistica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbVVendidasActionPerformed

    private void rbVArrendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVArrendadasActionPerformed
        try {
            cargarEstadisticas(d.getListaViviendasArrendadas());
        } catch (SQLException ex) {
            Logger.getLogger(Estadistica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbVArrendadasActionPerformed

    private void rbUsadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUsadasActionPerformed
        try {
            cargarTablaUsadas(d.getViviendasUsadas());
        } catch (SQLException ex) {
            Logger.getLogger(Estadistica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rbUsadasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Estadistica().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Estadistica.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    private void cargarEstadisticas(List<Estadisticas> lista) {
        String[] titulos = {"Rol", "Direccion", "Cantidad Piezas", "Cantidad Baños", "Tipo", "Precio", "Estado","Nombre Vendedor","Rut Vendedor","Nombre Cliente","Rut Cliente"};
        Object[] fila = new Object[titulos.length];

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(titulos);
        
        for (Estadisticas e : lista) {
            fila[0] = e.getRol();
            fila[1] = e.getDireccion();
            fila[2] = e.getCantPiezas();
            fila[3] = e.getCantBaños();
            
            if (e.getTipoVivienda() == 1) {
                fila[4] = "Casa";
            } else {
                fila[4] = "Departamento";
            }

            fila[5] = e.getPrecio();
            
            if (e.getEstado()== true) {
                fila[6] = "Nuevo";
            } else {
                fila[6] = "Usado";
            }
            
            fila[7] = e.getNombreVendedor();
            fila[8] = e.getRunVendedor();
            fila[9] = e.getNombreCliente();
            fila[10] = e.getRunCliente();
            
            model.addRow(fila);
        }
        tablaEstadisticas2.setModel(model);
    }
    
    private void cargarTablaUsadas(List<Vivienda> lista) {
        String[] titulos = {"Rol", "Direccion", "Cantidad Pieza", "Cantidad_baño", "Tipo", "Precio", "Estado"};
        Object[] fila = new Object[titulos.length];

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(titulos);

        for (Vivienda vi : lista) {
            fila[0] = vi.getRol();
            fila[1] = vi.getDireccion();
            fila[2] = vi.getCantPiezas();
            fila[3] = vi.getCantBaños();
            if (vi.getTipoVivienda() == 1) {
                fila[4] = "Casa";
            } else {
                fila[4] = "Departamento";
            }

            fila[5] = vi.getPrecio();
            if (vi.getEstado()== true) {
                fila[6] = "Nuevo";
            } else {
                fila[6] = "Usado";
            }

            model.addRow(fila);
        }

        tablaEstadisticas2.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbUsadas;
    private javax.swing.JRadioButton rbVArrendadas;
    private javax.swing.JRadioButton rbVVendidas;
    private javax.swing.JTable tablaEstadisticas2;
    private javax.swing.JTextField txtTop;
    // End of variables declaration//GEN-END:variables
}
