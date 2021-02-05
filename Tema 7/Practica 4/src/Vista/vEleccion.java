/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import tema_7_4_01.Main;

/**
 *
 * @author 1gdaw01
 */
public class vEleccion extends javax.swing.JFrame {

    /**
     * Creates new form vMovimientos
     */
    public vEleccion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        bConsulta = new javax.swing.JButton();
        bMovimiento = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        miConsulta = new javax.swing.JMenuItem();
        miMovimiento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        bConsulta.setText("Consulta");
        bConsulta.setFocusable(false);
        bConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaActionPerformed(evt);
            }
        });
        jToolBar1.add(bConsulta);

        bMovimiento.setText("Movimientos");
        bMovimiento.setFocusable(false);
        bMovimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bMovimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMovimientoActionPerformed(evt);
            }
        });
        jToolBar1.add(bMovimiento);

        jMenu1.setText("Resumen");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tarjetas");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inversiones");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Mercados");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Prestamos");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Seguros");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Servicios");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Cuentas");

        miConsulta.setText("Consulta");
        miConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaActionPerformed(evt);
            }
        });
        jMenu8.add(miConsulta);

        miMovimiento.setText("Movimiento");
        miMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMovimientoActionPerformed(evt);
            }
        });
        jMenu8.add(miMovimiento);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaActionPerformed
        Main.VentanaConsulta();
    }//GEN-LAST:event_miConsultaActionPerformed

    private void miMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMovimientoActionPerformed
        Main.VentanaMovimientos();
    }//GEN-LAST:event_miMovimientoActionPerformed

    private void bConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultaActionPerformed
        Main.VentanaConsulta();
    }//GEN-LAST:event_bConsultaActionPerformed

    private void bMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMovimientoActionPerformed
        Main.VentanaMovimientos();
    }//GEN-LAST:event_bMovimientoActionPerformed

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
            java.util.logging.Logger.getLogger(vEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vEleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConsulta;
    private javax.swing.JButton bMovimiento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem miConsulta;
    private javax.swing.JMenuItem miMovimiento;
    // End of variables declaration//GEN-END:variables
}