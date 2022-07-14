
package vista;

import controlador.controladorEntrega;
import modelo.entrega;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author KIM YISO
 */
public class actaEntrega extends javax.swing.JInternalFrame {

    controladorEntrega controladorEntregaCotroller = new controladorEntrega(); 
    
    public actaEntrega() {
        initComponents();
        
        TXTIdEntrega.setValue(0);
        TXTIdEntrega.setVisible(false); 
        limpiarFormulario();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TXTAsignado = new javax.swing.JTextField();
        TXTCargo = new javax.swing.JTextField();
        TXTCorreo = new javax.swing.JTextField();
        TXTCedula = new javax.swing.JTextField();
        TXTFecha = new javax.swing.JTextField();
        TXTtelefono = new javax.swing.JTextField();
        TXTtipo = new javax.swing.JTextField();
        TXTEntrega = new javax.swing.JTextField();
        TXTIdEntrega = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        TXTObservacion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BTNGuardar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        BTNLimpiar = new javax.swing.JButton();
        BTNCerrar = new javax.swing.JButton();
        TXTBuscar = new javax.swing.JTextField();
        BTNBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLEntrega = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Acta de Entrega");
        setAutoscrolls(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Asignado a:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cargo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cedula:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Correo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tipo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Fecha:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Entrega:");

        TXTCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCargoActionPerformed(evt);
            }
        });

        TXTtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTtelefonoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Observacion:");

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        BTNGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNGuardar.setText("Guardar");
        BTNGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGuardarActionPerformed(evt);
            }
        });

        BTNModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNModificar.setText("Modificar");
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });

        BTNEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        BTNLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNLimpiar.setText("Limpiar");
        BTNLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiarActionPerformed(evt);
            }
        });

        BTNCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNCerrar.setText("Cerrar");
        BTNCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNModificar)
                .addGap(18, 18, 18)
                .addComponent(BTNEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNCerrar)
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNGuardar)
                    .addComponent(BTNModificar)
                    .addComponent(BTNEliminar)
                    .addComponent(BTNLimpiar)
                    .addComponent(BTNCerrar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        TXTBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        BTNBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNBuscar.setText("Buscar");
        BTNBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BTNBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BTNBuscarFocusLost(evt);
            }
        });
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Buscar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11))
                                        .addGap(7, 7, 7)))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TXTtelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(TXTFecha, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TXTCedula, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TXTCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXTAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(TXTIdEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BTNBuscar)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTNBuscar))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TXTAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TXTIdEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(TXTCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TXTCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TXTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TXTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TXTObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DE ENTREGA"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLEntrega.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TBLEntrega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdEntrega", "Asignado", "Cedula", "Cargo", "Correo", "Fecha", "Telefono", "Tipo", "Observacion", "Entrega"
            }
        ));
        TBLEntrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLEntregaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLEntrega);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 748, 159));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 770, 315));
        jPanel3.getAccessibleContext().setAccessibleName("DATOS");
        jPanel3.getAccessibleContext().setAccessibleDescription("DATOS");

        getAccessibleContext().setAccessibleDescription("Acta De Entrega");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGuardarActionPerformed
        controladorEntregaCotroller.controlarAccion(evt, obtenerentrega());
         limpiarFormulario();
         llenarTabla();
         
    }//GEN-LAST:event_BTNGuardarActionPerformed

    private void BTNCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCerrarActionPerformed
          doDefaultCloseAction();
    }//GEN-LAST:event_BTNCerrarActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        controladorEntregaCotroller.controlarAccion(evt, obtenerentrega());
         limpiarFormulario();
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
         controladorEntregaCotroller.controlarAccion(evt, obtenerentrega());
         limpiarFormulario();
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void BTNLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiarActionPerformed
       limpiarFormulario();
    }//GEN-LAST:event_BTNLimpiarActionPerformed

    private void TBLEntregaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLEntregaMouseClicked
      if (evt.getClickCount()==1) {
                int fila = TBLEntrega.rowAtPoint(evt.getPoint());
                if (fila>-1) {
                    TXTIdEntrega.setValue((Integer)  TBLEntrega.getValueAt(fila, 0));
                    TXTAsignado.setText((String)TBLEntrega.getValueAt(fila, 1));
                    TXTCedula.setText((String)TBLEntrega.getValueAt(fila, 2));
                    TXTCargo.setText((String)TBLEntrega.getValueAt(fila, 3));
                    TXTCorreo.setText((String)TBLEntrega.getValueAt(fila, 4));
                    TXTFecha.setText((String)TBLEntrega.getValueAt(fila, 5));
                    TXTtelefono.setText((String)TBLEntrega.getValueAt(fila, 6));
                    TXTtipo.setText((String)TBLEntrega.getValueAt(fila, 7));
                    TXTObservacion.setText((String)TBLEntrega.getValueAt(fila, 8));
                    TXTEntrega.setText((String)  TBLEntrega.getValueAt(fila, 9)); 
                    
                    BTNEliminar.setEnabled(true);
                    BTNModificar.setEnabled(true);

                }
            }
    }//GEN-LAST:event_TBLEntregaMouseClicked

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        llenarTablaConBusqueda(TXTBuscar.getText());
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void BTNBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BTNBuscarFocusGained
      if (TXTBuscar.getText().equals("Escriba texto a buscar")) {
            TXTBuscar.setText("");
        }  
    }//GEN-LAST:event_BTNBuscarFocusGained

    private void BTNBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BTNBuscarFocusLost
        if (TXTBuscar.getText().isEmpty()) {
            TXTBuscar.setText("Escriba texto a buscar");
        }
    }//GEN-LAST:event_BTNBuscarFocusLost

    private void TXTtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTtelefonoActionPerformed

    private void TXTCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCargoActionPerformed
 //LIMPIAR EL FORMULARIO
     private void limpiarFormulario()
    {
    TXTIdEntrega.setValue(0);
    TXTAsignado.setText("");
    TXTCedula.setText("");
    TXTCargo.setText("");
    TXTCorreo.setText("");
    TXTFecha.setText("");
    TXTtelefono.setText("");
    TXTtipo.setText("");
    TXTObservacion.setText("");
    TXTEntrega.setText("");
    TXTBuscar.setText("Escriba texto a buscar");
    BTNModificar.setEnabled(false);
    BTNEliminar.setEnabled(false);
    llenarTabla();
   
    }
    
       //LLENAR TABLA
      public void llenarTabla()
    {
    modelo.entrega unaentrega = new modelo.entrega();
     DefaultTableModel tabla = (DefaultTableModel)TBLEntrega.getModel();
     Iterator<modelo.entrega> itentrega= unaentrega.listar();
     Object[] filaentrega = new Object[TBLEntrega.getColumnCount()];
     tabla.setRowCount(0);//limpiar la tabla
      while (itentrega.hasNext()) {   
             unaentrega = itentrega.next();
            filaentrega[0] = unaentrega.getIdEntrega();
            filaentrega[1] = unaentrega.getAsignado();
            filaentrega[2] = unaentrega.getCedula();
            filaentrega[3] = unaentrega.getCargo();
            filaentrega[4] = unaentrega.getCorreo();
            filaentrega[5] = unaentrega.getFecha();
            filaentrega[6] = unaentrega.getTelefono();
            filaentrega[7] = unaentrega.getTipo();
            filaentrega[8] = unaentrega.getObservacion();
            filaentrega[9] = unaentrega.getEntrega();
            tabla.addRow(filaentrega);
     }
    }
     //LLENAR TABLA CON BUSQUEDA
        private void llenarTablaConBusqueda(String busqueda)
    {
     modelo.entrega unaentrega = new modelo.entrega();
     DefaultTableModel tabla = (DefaultTableModel)TBLEntrega.getModel();
     Iterator<modelo.entrega> itentrega = unaentrega.buscar(busqueda);
     Object[] filaentrega = new Object[TBLEntrega.getColumnCount()];
     tabla.setRowCount(0);//limpiar la tabla
        while (itentrega.hasNext()) {   
             unaentrega = itentrega.next();
            filaentrega[0] = unaentrega.getIdEntrega();
            filaentrega[1] = unaentrega.getAsignado();
            filaentrega[2] = unaentrega.getCedula();
            filaentrega[3] = unaentrega.getCargo();
            filaentrega[4] = unaentrega.getCorreo();
            filaentrega[5] = unaentrega.getFecha();
            filaentrega[6] = unaentrega.getTelefono();
            filaentrega[7] = unaentrega.getTipo();
            filaentrega[8] = unaentrega.getObservacion();
            filaentrega[9] = unaentrega.getEntrega();
            ((DefaultTableModel)TBLEntrega.getModel()).addRow(filaentrega);
     }
    }
        
        //OBTENER EL EMPLEADO 
          private entrega obtenerentrega()
    {
    entrega laentrega= new entrega();
    
    laentrega.setIdEntrega((Integer)TXTIdEntrega.getValue());
    laentrega.setAsignado(TXTAsignado.getText());
    laentrega.setCedula(TXTCedula.getText());
    laentrega.setCargo(TXTCargo.getText());
    laentrega.setCorreo(TXTCorreo.getText());
    laentrega.setFecha(TXTFecha.getText());
    laentrega.setTelefono(TXTtelefono.getText());
    laentrega.setTipo(TXTtipo.getText());
    laentrega.setObservacion(TXTObservacion.getText());
    laentrega.setEntrega(TXTEntrega.getText()); 
    
    return laentrega;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNCerrar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNGuardar;
    private javax.swing.JButton BTNLimpiar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JTable TBLEntrega;
    private javax.swing.JTextField TXTAsignado;
    private javax.swing.JTextField TXTBuscar;
    private javax.swing.JTextField TXTCargo;
    private javax.swing.JTextField TXTCedula;
    private javax.swing.JTextField TXTCorreo;
    private javax.swing.JTextField TXTEntrega;
    private javax.swing.JTextField TXTFecha;
    private javax.swing.JFormattedTextField TXTIdEntrega;
    private javax.swing.JTextField TXTObservacion;
    private javax.swing.JTextField TXTtelefono;
    private javax.swing.JTextField TXTtipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
