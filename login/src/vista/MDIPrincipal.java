
package vista;


import modelo.Conexion;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @hp
 */
public class MDIPrincipal extends javax.swing.JFrame {
    
  
    actaPrestamo Prestamo;
    actaEntrega entrega;
    //actaDevolucion devolucion;
    actaDevolucion cliente;

    public MDIPrincipal() {
        Conexion.getInstance();
        initComponents();
        this.setLocationRelativeTo(null);
        
        Prestamo = new actaPrestamo();
        entrega= new actaEntrega();
       // devolucion= new actaDevolucion();
        cliente = new actaDevolucion();
      
        escritorio.add(Prestamo);
        escritorio.add(entrega);
       // escritorio.add(devolucion);
        escritorio.add(cliente);
        
    }


       
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        MNUAdministrar = new javax.swing.JMenuBar();
        actaPrestamo = new javax.swing.JMenu();
        itemAuditoria = new javax.swing.JCheckBoxMenuItem();
        actaEntrega = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIVE DIGITAL");
        setName("VIVE DIGITAL"); // NOI18N

        escritorio.setBackground(new java.awt.Color(51, 204, 0));
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        escritorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escritorioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        escritorio.add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 143, 69);

        MNUAdministrar.setInheritsPopupMenu(true);

        actaPrestamo.setMnemonic('f');
        actaPrestamo.setText("    Administrar   ");

        itemAuditoria.setSelected(true);
        itemAuditoria.setText("Acta Prestamo");
        itemAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAuditoriaActionPerformed(evt);
            }
        });
        actaPrestamo.add(itemAuditoria);

        actaEntrega.setSelected(true);
        actaEntrega.setText("Acta Entrega");
        actaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actaEntregaActionPerformed(evt);
            }
        });
        actaPrestamo.add(actaEntrega);

        jMenuItem2.setText("Acta Devolucion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        actaPrestamo.add(jMenuItem2);

        itemSalir.setMnemonic('x');
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        actaPrestamo.add(itemSalir);

        MNUAdministrar.add(actaPrestamo);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contactenos");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Salir");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        MNUAdministrar.add(helpMenu);

        setJMenuBar(MNUAdministrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
       Conexion.desconectar();
        try {
            Prestamo.setClosed(true);
            entrega.setClosed(true);
           // devolucion.setClosed(true);
           cliente.sedClosed(true);
           
            //FormularioLogin.setVisible(false);
        } catch (PropertyVetoException ex) {
            JOptionPane.showMessageDialog(null, "No es posible salir" + ex.getMessage());
        }
        System.exit(0);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        Conexion.desconectar();
        try {
           Prestamo.setClosed(true);
            entrega.setClosed(true);
            cliente.sedClosed(true);
         //   devolucion.setClosed(true);

            //FormularioLogin.setVisible(false);
        } catch (PropertyVetoException ex) {
            JOptionPane.showMessageDialog(null, "No es posible salir" + ex.getMessage());
        }
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void actaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actaEntregaActionPerformed
        entrega.setVisible(true);
        entrega.setLocation(150,20);
    }//GEN-LAST:event_actaEntregaActionPerformed

    private void itemAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAuditoriaActionPerformed
         Prestamo.setVisible(true);
         Prestamo.setLocation(150, 20);
    }//GEN-LAST:event_itemAuditoriaActionPerformed

    private void escritorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escritorioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_escritorioMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       cliente.setVisible(true);
       cliente.setLocation(150,20);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MNUAdministrar;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JCheckBoxMenuItem actaEntrega;
    private javax.swing.JMenu actaPrestamo;
    private javax.swing.JMenuItem contentMenuItem;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JCheckBoxMenuItem itemAuditoria;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables

}
