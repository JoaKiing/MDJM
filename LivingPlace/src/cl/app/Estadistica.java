
package cl.app;

import cl.model.Data;
import cl.model.Estadisticas;
import cl.model.TopVendedores;
import cl.model.Vivienda;
import java.sql.Date;
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
        
        cargarFechas();
        
        d = new Data();
        
        cargarEstadisticas(d.getListaViviendas());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEstadisticas2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        rbUsadas = new javax.swing.JRadioButton();
        rbVArrendadas = new javax.swing.JRadioButton();
        rbVVendidas = new javax.swing.JRadioButton();
        btnVolver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cboMes = new javax.swing.JComboBox<>();
        cboAño = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbCasas = new javax.swing.JRadioButton();
        RbDppto = new javax.swing.JRadioButton();
        btnCantidades = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        txtLimite = new javax.swing.JTextField();

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

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/image/back.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad De Ventas"));

        jLabel2.setText("Mes: ");

        jLabel3.setText("Año:");

        buttonGroup2.add(rbCasas);
        rbCasas.setText("Casas");

        buttonGroup2.add(RbDppto);
        RbDppto.setText("Departamentos");

        btnCantidades.setText("Buscar");
        btnCantidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadesActionPerformed(evt);
            }
        });

        btnTop.setText("Top");
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLimite)
                    .addComponent(cboAño, 0, 101, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTop)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbCasas)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RbDppto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCantidades, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbDppto)
                    .addComponent(btnCantidades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCasas)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTop)
                    .addComponent(txtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Administrador a = new Administrador();
        a.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCantidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadesActionPerformed
        int cantidad;
        try {
            if (rbCasas.isSelected()) {
                switch (cboMes.getSelectedIndex()) {
                    case 0:
                        cantidad = d.getCantidadViviendas("2018-01-01", "2018-01-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 1:
                        cantidad = d.getCantidadViviendas("2018-02-01", "2018-02-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 2:
                        cantidad = d.getCantidadViviendas("2018-03-01", "2018-03-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 3:
                        cantidad = d.getCantidadViviendas("2018-04-01", "2018-04-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 4:
                        cantidad = d.getCantidadViviendas("2018-05-01", "2018-05-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 5:
                        cantidad = d.getCantidadViviendas("2018-06-01", "2018-06-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 6:
                        cantidad = d.getCantidadViviendas("2018-07-01", "2018-07-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 7:
                        cantidad = d.getCantidadViviendas("2018-08-01", "2018-08-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 8:
                        cantidad = d.getCantidadViviendas("2018-09-01", "2018-09-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 9:
                        cantidad = d.getCantidadViviendas("2018-10-01", "2018-10-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 10:
                        cantidad = d.getCantidadViviendas("2018-11-01", "2018-11-30", 1);
                        cargarCantidad(cantidad);
                        break;
                    case 11:
                        cantidad = d.getCantidadViviendas("2018-12-01", "2018-12-30", 1);
                        cargarCantidad(cantidad);
                        break;
                }
            }else{
                if (RbDppto.isSelected()) {
                    switch (cboMes.getSelectedIndex()) {
                    case 0:
                        cantidad = d.getCantidadViviendas("2018-01-01", "2018-01-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 1:
                        cantidad = d.getCantidadViviendas("2018-02-01", "2018-02-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 2:
                        cantidad = d.getCantidadViviendas("2018-03-01", "2018-03-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 3:
                        cantidad = d.getCantidadViviendas("2018-04-01", "2018-04-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 4:
                        cantidad = d.getCantidadViviendas("2018-05-01", "2018-05-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 5:
                        cantidad = d.getCantidadViviendas("2018-06-01", "2018-06-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 6:
                        cantidad = d.getCantidadViviendas("2018-07-01", "2018-07-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 7:
                        cantidad = d.getCantidadViviendas("2018-08-01", "2018-08-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 8:
                        cantidad = d.getCantidadViviendas("2018-09-01", "2018-09-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 9:
                        cantidad = d.getCantidadViviendas("2018-10-01", "2018-10-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 10:
                        cantidad = d.getCantidadViviendas("2018-11-01", "2018-11-30", 2);
                        cargarCantidad(cantidad);
                        break;
                    case 11:
                        cantidad = d.getCantidadViviendas("2018-12-01", "2018-12-30", 2);
                        cargarCantidad(cantidad);
                        break;
                }
            }
            }
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnCantidadesActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        int limite = Integer.parseInt(txtLimite.getText());
        
        try {
            switch (cboMes.getSelectedIndex()) {
                case 0:
                    cargarTop(d.getTopVendedores("2018-01-01", "2018-01-30", limite));
                    break;
                case 1:
                    cargarTop(d.getTopVendedores("2018-02-01", "2018-02-30", limite));
                    break;
                case 2:
                    cargarTop(d.getTopVendedores("2018-03-01", "2018-03-30", limite));
                    break;
                case 3:
                    cargarTop(d.getTopVendedores("2018-04-01", "2018-04-30", limite));
                    break;
                case 4:
                    cargarTop(d.getTopVendedores("2018-05-01", "2018-05-30", limite));
                    break;
                case 5:
                    cargarTop(d.getTopVendedores("2018-06-01", "2018-06-30", limite));
                    break;
                case 6:
                    cargarTop(d.getTopVendedores("2018-07-01", "2018-07-30", limite));
                    break;
                case 7:
                    cargarTop(d.getTopVendedores("2018-08-01", "2018-08-30", limite));
                    break;
                case 8:
                    cargarTop(d.getTopVendedores("2018-09-01", "2018-09-30", limite));
                    break;
                case 9:
                    cargarTop(d.getTopVendedores("2018-10-01", "2018-10-30", limite));
                    break;
                case 10:
                    cargarTop(d.getTopVendedores("2018-11-01", "2018-11-30", limite));
                    break;
                case 11:
                    cargarTop(d.getTopVendedores("2018-12-01", "2018-12-30", limite));
                    break;
            }
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnTopActionPerformed

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
    
    private void cargarFechas(){
        cboMes.addItem("Enero");
        cboMes.addItem("Febrero");
        cboMes.addItem("Marzo");
        cboMes.addItem("Abril");
        cboMes.addItem("Mayo");
        cboMes.addItem("Junio");
        cboMes.addItem("Julio");
        cboMes.addItem("Agosto");
        cboMes.addItem("Septiembre");
        cboMes.addItem("Octubre");
        cboMes.addItem("Noviembre");
        cboMes.addItem("Diciembre");
        
        
        cboAño.addItem("2018");
    }
    
    private void cargarCantidad(int cantidad){
        String[] titulos = {"Cantidad"};
        Object[] fila = new Object[titulos.length];

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(titulos);
        
        fila[0] = cantidad;
        
        model.addRow(fila);
        tablaEstadisticas2.setModel(model);
    }
    
    private void cargarTop(List<TopVendedores> lista){
        String[] titulos = {"Nombre", "Run", "Cantidad Viviendas Vendidas/Arrendadas"};
        Object[] fila = new Object[titulos.length];

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(titulos);

        for (TopVendedores v : lista) {
            fila[0] = v.getNombre();
            fila[1] = v.getRut();
            fila[2] = v.getCantidadVentas();

            model.addRow(fila);
        }

        tablaEstadisticas2.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbDppto;
    private javax.swing.JButton btnCantidades;
    private javax.swing.JButton btnTop;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboAño;
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbCasas;
    private javax.swing.JRadioButton rbUsadas;
    private javax.swing.JRadioButton rbVArrendadas;
    private javax.swing.JRadioButton rbVVendidas;
    private javax.swing.JTable tablaEstadisticas2;
    private javax.swing.JTextField txtLimite;
    // End of variables declaration//GEN-END:variables
}
