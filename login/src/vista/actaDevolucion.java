

package vista;



import controlador.ControladorDevolucion;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import modelo.devolucion;


/**
 *
 * @hp
 */
public class actaDevolucion extends javax.swing.JInternalFrame {

    ControladorDevolucion devolucionController = new  ControladorDevolucion ();
    private Object txtcontraseña;
    private Object TXTusuario;
    
    
    public actaDevolucion() { 
        initComponents();
        TXTIdCliente.setValue(0);
        TXTIdCliente.setVisible(false);
        limpiarFormulario();
           
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LBLNombre = new javax.swing.JLabel();
        LBLDocumento = new javax.swing.JLabel();
        LBLDireccion = new javax.swing.JLabel();
        LBLCelular = new javax.swing.JLabel();
        LBLBuscar = new javax.swing.JLabel();
        TXTResive = new javax.swing.JTextField();
        TXTFecha = new javax.swing.JTextField();
        TXTTipoObjeto = new javax.swing.JTextField();
        TXTObservacion = new javax.swing.JTextField();
        TXTBuscar = new javax.swing.JTextField();
        TXTIdCliente = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        BTNIsertar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        BTNCerrar = new javax.swing.JButton();
        BTNLimpiar = new javax.swing.JButton();
        BTNBuscar = new javax.swing.JButton();
        LBLCelular1 = new javax.swing.JLabel();
        TXTEntrega = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLDevolucion = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Acta Devolucion");
        setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("LLene los campos");

        LBLNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLNombre.setText("Resive");

        LBLDocumento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLDocumento.setText("Fecha");

        LBLDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLDireccion.setText("Tipo Objeto");

        LBLCelular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLCelular.setText("Observacion");

        LBLBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLBuscar.setText("Buscar");

        TXTResive.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TXTFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TXTTipoObjeto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TXTObservacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TXTBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TXTBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTBuscarFocusLost(evt);
            }
        });
        TXTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBuscarActionPerformed(evt);
            }
        });

        TXTIdCliente.setText("0");

        BTNIsertar.setBackground(new java.awt.Color(255, 255, 255));
        BTNIsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNIsertar.setText("Guardar");
        BTNIsertar.setBorder(new javax.swing.border.MatteBorder(null));
        BTNIsertar.setBorderPainted(false);
        BTNIsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIsertarActionPerformed(evt);
            }
        });

        BTNModificar.setBackground(new java.awt.Color(255, 255, 255));
        BTNModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNModificar.setText("Modificar");
        BTNModificar.setBorder(new javax.swing.border.MatteBorder(null));
        BTNModificar.setBorderPainted(false);
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });

        BTNEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BTNEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.setBorder(new javax.swing.border.MatteBorder(null));
        BTNEliminar.setBorderPainted(false);
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        BTNCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BTNCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNCerrar.setText("Cerrar");
        BTNCerrar.setBorder(new javax.swing.border.MatteBorder(null));
        BTNCerrar.setBorderPainted(false);
        BTNCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCerrarActionPerformed(evt);
            }
        });

        BTNLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        BTNLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNLimpiar.setText("Limpiar");
        BTNLimpiar.setBorder(new javax.swing.border.MatteBorder(null));
        BTNLimpiar.setBorderPainted(false);
        BTNLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNIsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(BTNCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNIsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        BTNBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNBuscar.setText("Buscar");
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });

        LBLCelular1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LBLCelular1.setText("Entrega");

        TXTEntrega.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLDocumento)
                    .addComponent(LBLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLDireccion)
                    .addComponent(LBLCelular)
                    .addComponent(LBLCelular1))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTEntrega)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTResive)
                            .addComponent(TXTObservacion)
                            .addComponent(TXTTipoObjeto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBLBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNBuscar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLBuscar)
                    .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LBLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TXTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(TXTResive)))
                        .addGap(18, 18, 18)
                        .addComponent(TXTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLDocumento)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLDireccion)
                    .addComponent(TXTTipoObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLCelular)
                    .addComponent(TXTObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLCelular1)
                    .addComponent(TXTEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TBLDevolucion.setBackground(new java.awt.Color(204, 204, 255));
        TBLDevolucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51)));
        TBLDevolucion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                " ID", "             Resive", "              Fecha", "          Tipo Objeto", "           Observacion", "Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLDevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLDevolucionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLDevolucion);
        if (TBLDevolucion.getColumnModel().getColumnCount() > 0) {
            TBLDevolucion.getColumnModel().getColumn(0).setMinWidth(30);
            TBLDevolucion.getColumnModel().getColumn(0).setPreferredWidth(30);
            TBLDevolucion.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jLabel2.setText("Datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarActionPerformed

    private void BTNCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCerrarActionPerformed
        doDefaultCloseAction();
        limpiarFormulario();
    }//GEN-LAST:event_BTNCerrarActionPerformed

    private void BTNIsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIsertarActionPerformed
      devolucionController.controlarAccion(evt, obtenerdevolucion());
       
       System.out.println("llega hasta aqui al guardar osea al boton");
       limpiarFormulario();
       llenarTabla();
    }//GEN-LAST:event_BTNIsertarActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
       devolucionController.controlarAccion(evt, obtenerdevolucion());
       limpiarFormulario();
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
       devolucionController.controlarAccion(evt, obtenerdevolucion());
       limpiarFormulario();
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void TBLDevolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLDevolucionMouseClicked
           if (evt.getClickCount()==1) {
            int fila = TBLDevolucion.rowAtPoint(evt.getPoint());
            if (fila>- 1) {
                 
                TXTIdCliente.setValue((Integer)  TBLDevolucion.getValueAt(fila, 0));
                TXTResive.setText((String)  TBLDevolucion.getValueAt(fila, 1));
                TXTFecha.setText((String) TBLDevolucion.getValueAt(fila, 2));
                TXTTipoObjeto.setText((String) TBLDevolucion.getValueAt(fila, 3));
                TXTObservacion.setText((String)TBLDevolucion.getValueAt(fila, 4));
                TXTEntrega.setText((String) TBLDevolucion.getValueAt(fila,5));
                BTNEliminar.setEnabled(true);
                BTNModificar.setEnabled(true);

            }

        }
        
    }//GEN-LAST:event_TBLDevolucionMouseClicked

    private void TXTBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarFocusGained
        if (TXTBuscar.getText().equals("Escriba texto a buscar")) {
            TXTBuscar.setText("");
        }
    }//GEN-LAST:event_TXTBuscarFocusGained

    private void TXTBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarFocusLost
        if (TXTBuscar.getText().isEmpty()) {
            TXTBuscar.setText("Escriba texto a buscar");
        }
    }//GEN-LAST:event_TXTBuscarFocusLost

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        llenarTablaConBusqueda(TXTBuscar.getText());
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void BTNLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_BTNLimpiarActionPerformed
      private void limpiarFormulario()
    {
    TXTIdCliente.setValue(0);
    TXTResive.setText("");
    TXTFecha.setText("");
    TXTTipoObjeto.setText("");
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
    devolucion unadevolucion = new devolucion();
     DefaultTableModel tabla = (DefaultTableModel)TBLDevolucion.getModel();
     Iterator<devolucion> itdevolucion= unadevolucion.listar();
     Object[] filadevolucion = new Object[TBLDevolucion.getColumnCount()];
     tabla.setRowCount(0);//limpiar la tabla
      while (itdevolucion.hasNext()) {   
             unadevolucion = itdevolucion.next();
            filadevolucion[0] = unadevolucion.getID();
            filadevolucion[1] = unadevolucion.getResive();
            filadevolucion[2] = unadevolucion.getFecha();
            filadevolucion[3] = unadevolucion.getTipoObjeto();
            filadevolucion[4] = unadevolucion.getObservacion();
            filadevolucion[5] = unadevolucion.getEntrega();
            tabla.addRow(filadevolucion);
     }
    }
     //LLENAR TABLA CON BUSQUEDA
        private void llenarTablaConBusqueda(String busqueda)
    {
     devolucion unadevolucion = new devolucion();
     DefaultTableModel tabla = (DefaultTableModel)TBLDevolucion.getModel();
     Iterator<devolucion> itdevolucion = unadevolucion.buscar(busqueda);
     Object[] filadevolucion = new Object[TBLDevolucion.getColumnCount()];
     tabla.setRowCount(0);//limpiar la tabla
        while (itdevolucion.hasNext()) {   
             unadevolucion = itdevolucion.next();
            filadevolucion[0] = unadevolucion.getID();
            filadevolucion[1] = unadevolucion.getResive();
            filadevolucion[2] = unadevolucion.getFecha();
            filadevolucion[3] = unadevolucion.getTipoObjeto();
            filadevolucion[4] = unadevolucion.getObservacion();
            filadevolucion[5] = unadevolucion.getEntrega();
            ((DefaultTableModel)TBLDevolucion.getModel()).addRow(filadevolucion);
     }
    }
        
        //OBTENER EL EMPLEADO 
         private devolucion obtenerdevolucion()
    {
    devolucion ladevolucion= new devolucion();
    
    ladevolucion.setID((Integer)TXTIdCliente.getValue());
    ladevolucion.setResive(TXTResive.getText());
    ladevolucion.setFecha(TXTFecha.getText());
    ladevolucion.setTipoObjeto(TXTTipoObjeto.getText());
    ladevolucion.setObservacion(TXTObservacion.getText()); 
    ladevolucion.setEntrega(TXTEntrega.getText());  
    
    
    
    return ladevolucion;
    }
         
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNCerrar;
    private javax.swing.JButton BTNEliminar;
    public javax.swing.JButton BTNIsertar;
    private javax.swing.JButton BTNLimpiar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JLabel LBLBuscar;
    private javax.swing.JLabel LBLCelular;
    private javax.swing.JLabel LBLCelular1;
    private javax.swing.JLabel LBLDireccion;
    private javax.swing.JLabel LBLDocumento;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JTable TBLDevolucion;
    private javax.swing.JTextField TXTBuscar;
    private javax.swing.JTextField TXTEntrega;
    private javax.swing.JTextField TXTFecha;
    private javax.swing.JFormattedTextField TXTIdCliente;
    private javax.swing.JTextField TXTObservacion;
    private javax.swing.JTextField TXTResive;
    private javax.swing.JTextField TXTTipoObjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    void sedClosed(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}