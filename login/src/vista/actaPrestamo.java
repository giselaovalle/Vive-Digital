
package vista;



import controlador.ControladorPrestamo;
import modelo.Prestamo;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author KIM YISO
 */
public class actaPrestamo extends javax.swing.JInternalFrame{

     ControladorPrestamo ControladorPrestamoController = new ControladorPrestamo();
     
    public actaPrestamo() {
        initComponents();
        TXTIdPrestamo.setValue(0);
        TXTIdPrestamo.setVisible(false); 
        limpiarFormulario();
       
   
    }

        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendarBeanInfo1 = new com.toedter.calendar.JCalendarBeanInfo();
        jCalendarBeanInfo2 = new com.toedter.calendar.JCalendarBeanInfo();
        jCalendarBeanInfo3 = new com.toedter.calendar.JCalendarBeanInfo();
        jCalendarBeanInfo4 = new com.toedter.calendar.JCalendarBeanInfo();
        jCalendarBeanInfo5 = new com.toedter.calendar.JCalendarBeanInfo();
        jCalendarBeanInfo6 = new com.toedter.calendar.JCalendarBeanInfo();
        jCalendarDemo1 = new com.toedter.calendar.JCalendarDemo();
        jCalendarDemo2 = new com.toedter.calendar.JCalendarDemo();
        jCalendarBeanInfo7 = new com.toedter.calendar.JCalendarBeanInfo();
        jCalendarDemo3 = new com.toedter.calendar.JCalendarDemo();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TXTMotivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TXTNombre = new javax.swing.JTextField();
        TXTCargo = new javax.swing.JTextField();
        TXTCedula = new javax.swing.JTextField();
        TXTCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TXTHora = new javax.swing.JTextField();
        TXTIdPrestamo = new javax.swing.JFormattedTextField();
        Fecha = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TXTBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BTNGuardar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNLimpiar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        BTNCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLPrestamo = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 153));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Acta de Prestamo");
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(null);
        setVisible(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("cargo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("cedula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(TXTMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 338, 101));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("MOTIVO O ACTIVIDAD EN EL ESTABLECIMIENTO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        TXTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TXTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 166, -1));
        getContentPane().add(TXTCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 166, -1));
        getContentPane().add(TXTCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 166, -1));
        getContentPane().add(TXTCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 166, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Fecha");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Hora:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        TXTHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTHoraActionPerformed(evt);
            }
        });
        getContentPane().add(TXTHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 70, -1));
        getContentPane().add(TXTIdPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 30, -1));
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 170, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Buscador");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

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
        jPanel1.add(TXTBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 123, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Buscador");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton1FocusLost(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        BTNGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNGuardar.setText("Guardar");
        BTNGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(BTNGuardar);

        BTNModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNModificar.setText("Modificar");
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });
        jPanel3.add(BTNModificar);

        BTNLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNLimpiar.setText("Limpiar");
        BTNLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(BTNLimpiar);

        BTNEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(BTNEliminar);

        BTNCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNCerrar.setText("Cerrar");
        BTNCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCerrarActionPerformed(evt);
            }
        });
        jPanel3.add(BTNCerrar);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 380, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 510));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS PRESTAMOS"));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLPrestamo.setBackground(new java.awt.Color(153, 204, 255));
        TBLPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Cargo", "Cedula", "Correo", "Actividad", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLPrestamoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLPrestamo);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 860, 440));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 880, 500));

        getAccessibleContext().setAccessibleName("Acta Prestamo");
        getAccessibleContext().setAccessibleDescription("Acta Prestamo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCerrarActionPerformed
        doDefaultCloseAction();
    }//GEN-LAST:event_BTNCerrarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
       ControladorPrestamoController.controlarAccion(evt,obtenerPrestamo());
        limpiarFormulario();
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void BTNGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGuardarActionPerformed
        ControladorPrestamoController.controlarAccion(evt, obtenerPrestamo());
       limpiarFormulario();
       llenarTabla();
    }//GEN-LAST:event_BTNGuardarActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        ControladorPrestamoController.controlarAccion(evt,obtenerPrestamo());
        limpiarFormulario();
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLimpiarActionPerformed
     limpiarFormulario();
    }//GEN-LAST:event_BTNLimpiarActionPerformed

    private void TXTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreActionPerformed
    
    }//GEN-LAST:event_TXTNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarTablaConBusqueda(TXTBuscar.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TBLPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLPrestamoMouseClicked
       if (evt.getClickCount()==1) {
            int fila = TBLPrestamo.rowAtPoint(evt.getPoint());
            if (fila>- 1) {
                 
                TXTIdPrestamo.setValue((Integer)  TBLPrestamo.getValueAt(fila, 0));
                TXTNombre.setText((String)  TBLPrestamo.getValueAt(fila, 1));
                TXTCargo.setText((String) TBLPrestamo.getValueAt(fila, 2));
                TXTCedula.setText((String)TBLPrestamo.getValueAt(fila, 3));
                TXTCorreo.setText((String)  TBLPrestamo.getValueAt(fila, 4));
                TXTMotivo.setText((String) TBLPrestamo.getValueAt(fila,5));
                Fecha.setText((String) TBLPrestamo.getValueAt(fila,6));
                TXTHora.setText((String) TBLPrestamo.getValueAt(fila,7));
                BTNEliminar.setEnabled(true);
                BTNModificar.setEnabled(true);

            }

        }
    }//GEN-LAST:event_TBLPrestamoMouseClicked

    private void TXTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarActionPerformed

    private void jButton1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusLost
        if (TXTBuscar.getText().equals("Escriba texto a buscar")) {
            TXTBuscar.setText("");
        }
    }//GEN-LAST:event_jButton1FocusLost

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
       if (TXTBuscar.getText().isEmpty()) {
            TXTBuscar.setText("Escriba texto a buscar");
        }
    }//GEN-LAST:event_jButton1FocusGained

    private void TXTBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarFocusGained
     if (TXTBuscar.getText().isEmpty()) {
            TXTBuscar.setText("Escriba texto a buscar");
        }
    }//GEN-LAST:event_TXTBuscarFocusGained

    private void TXTBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarFocusLost
      if (TXTBuscar.getText().equals("Escriba texto a buscar")) {
            TXTBuscar.setText("");
        }   
    }//GEN-LAST:event_TXTBuscarFocusLost

    private void TXTHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTHoraActionPerformed

  //LIMPIAR EL FORMULARIO
     private void limpiarFormulario()
    {
    TXTIdPrestamo.setValue(0);
    TXTNombre.setText("");
    TXTCargo.setText("");
    TXTCedula.setText("");
    TXTCorreo.setText("");
    TXTMotivo.setText("");
    Fecha.setText("");
    TXTHora.setText("");
    TXTBuscar.setText("Escriba texto a buscar");
    
    BTNModificar.setEnabled(false);
    BTNEliminar.setEnabled(false);
    llenarTabla();
    }
    
       //LLENAR TABLA
      public void llenarTabla()
    {
    Prestamo unPrestamo = new Prestamo();
     DefaultTableModel tabla = (DefaultTableModel)TBLPrestamo.getModel();
     Iterator<Prestamo> itPrestamo= unPrestamo.listar();
     Object[] filaPrestamo = new Object[TBLPrestamo.getColumnCount()];
     tabla.setRowCount(0);//limpiar la tabla
      while (itPrestamo.hasNext()) {   
             unPrestamo = itPrestamo.next();
            filaPrestamo[0] = unPrestamo.getID();
            filaPrestamo[1] = unPrestamo.getNombre();
            filaPrestamo[2] = unPrestamo.getCargo();
            filaPrestamo[3] = unPrestamo.getCedula();
            filaPrestamo[4] = unPrestamo.getCorreo();
            filaPrestamo[5] = unPrestamo.getActividad();
            filaPrestamo[6] = unPrestamo.getFecha();
            filaPrestamo[7] = unPrestamo.getHora();
            tabla.addRow(filaPrestamo);
     }
    }
     //LLENAR TABLA CON BUSQUEDA
        private void llenarTablaConBusqueda(String busqueda)
    {
     Prestamo unPrestamo = new Prestamo();
     DefaultTableModel tabla = (DefaultTableModel)TBLPrestamo.getModel();
     Iterator<Prestamo> itPrestamo = unPrestamo.buscar(busqueda);
     Object[] filaPrestamo = new Object[TBLPrestamo.getColumnCount()];
     tabla.setRowCount(0);//limpiar la tabla
        while (itPrestamo.hasNext()) {   
             unPrestamo = itPrestamo.next();
            filaPrestamo[0] = unPrestamo.getID();
            filaPrestamo[1] = unPrestamo.getNombre();
            filaPrestamo[2] = unPrestamo.getCargo();
            filaPrestamo[3] = unPrestamo.getCedula();
            filaPrestamo[4] = unPrestamo.getCorreo();
            filaPrestamo[5] = unPrestamo.getActividad();
            filaPrestamo[6] = unPrestamo.getFecha();
            filaPrestamo[7] = unPrestamo.getHora();
            ((DefaultTableModel)TBLPrestamo.getModel()).addRow(filaPrestamo);
     }
    }
        
        //OBTENER EL EMPLEADO 
         private Prestamo obtenerPrestamo()
    {
    
    Prestamo elPrestamo= new Prestamo();
    
    elPrestamo.setID((Integer)TXTIdPrestamo.getValue());
    elPrestamo.setNombre(TXTNombre.getText());
    elPrestamo.setCargo(TXTCargo.getText());
    elPrestamo.setCedula(TXTCedula.getText());
    elPrestamo.setCorreo(TXTCorreo.getText());  
    elPrestamo.setActividad(TXTMotivo.getText());
    elPrestamo.setFecha(Fecha.getText());
    elPrestamo.setHora(TXTHora.getText());
   
    
    return elPrestamo;
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTNCerrar;
    public javax.swing.JButton BTNEliminar;
    public javax.swing.JButton BTNGuardar;
    public javax.swing.JButton BTNLimpiar;
    public javax.swing.JButton BTNModificar;
    private javax.swing.JTextField Fecha;
    private javax.swing.JTable TBLPrestamo;
    public javax.swing.JTextField TXTBuscar;
    public javax.swing.JTextField TXTCargo;
    public javax.swing.JTextField TXTCedula;
    public javax.swing.JTextField TXTCorreo;
    public javax.swing.JTextField TXTHora;
    public javax.swing.JFormattedTextField TXTIdPrestamo;
    public javax.swing.JTextField TXTMotivo;
    public javax.swing.JTextField TXTNombre;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendarBeanInfo jCalendarBeanInfo1;
    private com.toedter.calendar.JCalendarBeanInfo jCalendarBeanInfo2;
    private com.toedter.calendar.JCalendarBeanInfo jCalendarBeanInfo3;
    private com.toedter.calendar.JCalendarBeanInfo jCalendarBeanInfo4;
    private com.toedter.calendar.JCalendarBeanInfo jCalendarBeanInfo5;
    private com.toedter.calendar.JCalendarBeanInfo jCalendarBeanInfo6;
    private com.toedter.calendar.JCalendarBeanInfo jCalendarBeanInfo7;
    private com.toedter.calendar.JCalendarDemo jCalendarDemo1;
    private com.toedter.calendar.JCalendarDemo jCalendarDemo2;
    private com.toedter.calendar.JCalendarDemo jCalendarDemo3;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
