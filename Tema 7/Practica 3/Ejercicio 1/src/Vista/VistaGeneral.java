/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.util.ArrayList;
import tema_7_3_01.Controlador;

/**
 *
 * @author 1gdaw01
 */
public class VistaGeneral extends javax.swing.JFrame {

    /**
     * Creates new form VistaGeneral
     */
    public VistaGeneral() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNombreProducto = new javax.swing.JTextField();
        tfUnidades = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbCompra = new javax.swing.JRadioButton();
        rbVenta = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfPrecioCompra = new javax.swing.JTextField();
        cbProveedor = new javax.swing.JComboBox<>();
        tfImporteCompra = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfPrecioVenta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cbPorVolumen = new javax.swing.JCheckBox();
        cbProntoPago = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        tfImporteVenta = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALMACEN");

        jLabel2.setText("Nombre del Producto:");

        jLabel3.setText("Unidades:");

        tfNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreProductoActionPerformed(evt);
            }
        });

        tfUnidades.setEnabled(false);
        tfUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnidadesActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Operación a contabilizar"));

        buttonGroup1.add(rbCompra);
        rbCompra.setText("Compra");
        rbCompra.setEnabled(false);
        rbCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rbCompraFocusLost(evt);
            }
        });
        rbCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCompraActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbVenta);
        rbVenta.setText("Venta");
        rbVenta.setEnabled(false);
        rbVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rbVentaFocusLost(evt);
            }
        });
        rbVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(rbCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(rbVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCompra)
                    .addComponent(rbVenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos sobre la compra"));

        jLabel4.setText("Precio");

        jLabel5.setText("Proveedor");

        jLabel6.setText("Importe de la compra");

        tfPrecioCompra.setEnabled(false);
        tfPrecioCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrecioCompraFocusLost(evt);
            }
        });
        tfPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioCompraActionPerformed(evt);
            }
        });

        cbProveedor.setEnabled(false);
        cbProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbProveedorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbProveedorFocusLost(evt);
            }
        });
        cbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProveedorActionPerformed(evt);
            }
        });

        tfImporteCompra.setEnabled(false);
        tfImporteCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfImporteCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(tfImporteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfImporteCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos sobre la venta"));

        jLabel7.setText("Precio");

        tfPrecioVenta.setEnabled(false);
        tfPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioVentaActionPerformed(evt);
            }
        });

        jLabel8.setText("Cliente");

        tfCliente.setEnabled(false);
        tfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClienteActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuentos"));

        cbPorVolumen.setText("Por volumen");
        cbPorVolumen.setEnabled(false);
        cbPorVolumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPorVolumenActionPerformed(evt);
            }
        });

        cbProntoPago.setText("Por pronto pago");
        cbProntoPago.setEnabled(false);
        cbProntoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProntoPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(cbPorVolumen)
                .addGap(50, 50, 50)
                .addComponent(cbProntoPago)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPorVolumen)
                    .addComponent(cbProntoPago))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel9.setText("Importe de la venta");

        tfImporteVenta.setEnabled(false);
        tfImporteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfImporteVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(tfImporteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(tfImporteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bAceptar.setText("Aceptar");
        bAceptar.setEnabled(false);
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreProductoActionPerformed
        boolean continuar = Controlador.ValidarProducto(tfNombreProducto.getText());
        if (continuar){
            tfNombreProducto.setEnabled(false);
            tfUnidades.setEnabled(true); 
            tfUnidades.requestFocus();
        }
        else{
            tfNombreProducto.setText(""); 
        }
    }//GEN-LAST:event_tfNombreProductoActionPerformed

    private void tfImporteCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfImporteCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfImporteCompraActionPerformed

    private void tfUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnidadesActionPerformed
        tfUnidades.setEnabled(false);
        rbCompra.setEnabled(true);
        rbVenta.setEnabled(true);
    }//GEN-LAST:event_tfUnidadesActionPerformed

    private void rbCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbCompraFocusLost
       
    }//GEN-LAST:event_rbCompraFocusLost

    private void rbVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rbVentaFocusLost
        
    }//GEN-LAST:event_rbVentaFocusLost

    private void tfImporteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfImporteVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfImporteVentaActionPerformed

    private void rbCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCompraActionPerformed
        if (rbCompra.isSelected()){
            tfPrecioCompra.setEnabled(true);
            cbProveedor.setEnabled(false);
            tfCliente.setText("");
            tfCliente.setEnabled(false);
            cbPorVolumen.setSelected(false);
            cbPorVolumen.setEnabled(false);
            cbProntoPago.setSelected(false);
            cbProntoPago.setEnabled(false);
            tfImporteCompra.setText("");
            tfImporteVenta.setEnabled(false);
            ArrayList<String> nombres = Controlador.DameProveedores();
            RellenarComboBox(nombres,true);
            bAceptar.setEnabled(false);
        }
        else{
            tfPrecioCompra.setText("");
            tfPrecioCompra.setEnabled(false);
            cbProveedor.setEnabled(false);
            tfCliente.setEnabled(true);
            cbPorVolumen.setEnabled(true);
            cbProntoPago.setEnabled(true);
            tfImporteVenta.setEnabled(true);
            tfImporteCompra.setText("");
            RellenarComboBox(false);
             bAceptar.setEnabled(false);
        }
    }//GEN-LAST:event_rbCompraActionPerformed

    private void rbVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVentaActionPerformed
        double precio;
        precio =Controlador.damePrecio();
        if (rbCompra.isSelected()){
            tfPrecioCompra.setEnabled(true);
            cbProveedor.setEnabled(false);
            tfCliente.setText("");
            tfCliente.setEnabled(false);
            cbPorVolumen.setSelected(false);
            cbPorVolumen.setEnabled(false);
            cbProntoPago.setSelected(false);
            cbProntoPago.setEnabled(false);
            tfImporteVenta.setText("");
            tfImporteVenta.setEnabled(false);
            tfImporteCompra.setText("");
            ArrayList<String> nombres = Controlador.DameProveedores();
            RellenarComboBox(nombres,true);
            bAceptar.setEnabled(false);
        }
        else{
            tfPrecioCompra.setText("");
            tfPrecioVenta.setText(""+precio);
            tfPrecioCompra.setEnabled(false);
            cbProveedor.setEnabled(false);
            tfCliente.setEnabled(true);
            cbPorVolumen.setEnabled(true);
            cbProntoPago.setEnabled(true);
            tfImporteVenta.setEnabled(true);
            tfImporteVenta.setText(""+precio*Integer.parseInt(tfUnidades.getText()));
            tfImporteCompra.setText("");
            RellenarComboBox(false);
             bAceptar.setEnabled(false);
        }
    }//GEN-LAST:event_rbVentaActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
       Controlador.salir();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void tfPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioVentaActionPerformed
        
    }//GEN-LAST:event_tfPrecioVentaActionPerformed

    private void tfPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioCompraActionPerformed
        tfPrecioCompra.setEnabled(false);
        cbProveedor.setEnabled(true);
        
    }//GEN-LAST:event_tfPrecioCompraActionPerformed

    private void cbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProveedorActionPerformed
                
    }//GEN-LAST:event_cbProveedorActionPerformed

    private void tfPrecioCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioCompraFocusLost
        double importe= Integer.parseInt(tfUnidades.getText())*Double.parseDouble(tfPrecioCompra.getText());
        tfImporteCompra.setText(""+importe);
    }//GEN-LAST:event_tfPrecioCompraFocusLost

    private void tfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClienteActionPerformed
        bAceptar.setEnabled(true);
    }//GEN-LAST:event_tfClienteActionPerformed

    private void cbProveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbProveedorFocusLost
        
    }//GEN-LAST:event_cbProveedorFocusLost

    private void cbProveedorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbProveedorFocusGained
        bAceptar.setEnabled(true);
    }//GEN-LAST:event_cbProveedorFocusGained

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        Controlador.aceptar();
    }//GEN-LAST:event_bAceptarActionPerformed

    private void cbPorVolumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPorVolumenActionPerformed
        if(cbPorVolumen.isSelected()){
            tfImporteVenta.setText(""+(0.98)*Double.parseDouble(tfImporteVenta.getText()));
        }
        else{
            tfImporteVenta.setText(""+100*Double.parseDouble(tfImporteVenta.getText())/98);
        }
    }//GEN-LAST:event_cbPorVolumenActionPerformed

    private void cbProntoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProntoPagoActionPerformed
        if(cbProntoPago.isSelected()){
            tfImporteVenta.setText(""+(0.97)*Double.parseDouble(tfImporteVenta.getText()));
        }
        else{
            tfImporteVenta.setText(""+100*Double.parseDouble(tfImporteVenta.getText())/97);
        }
    }//GEN-LAST:event_cbProntoPagoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VistaGeneral().setVisible(true);
        });
    }
    public void RellenarComboBox(boolean anadir){
        if (!anadir){
           cbProveedor.removeAllItems();
        }
    }
    public void RellenarComboBox(ArrayList<String> nombres,boolean anadir){
        if (anadir){
            int x;
            cbProveedor.addItem("");
            for (x=0 ; x<nombres.size();x++){
                cbProveedor.addItem(nombres.get(x));
            }
        }
        else{
            cbProveedor.removeAllItems();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbPorVolumen;
    private javax.swing.JCheckBox cbProntoPago;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton rbCompra;
    private javax.swing.JRadioButton rbVenta;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfImporteCompra;
    private javax.swing.JTextField tfImporteVenta;
    private javax.swing.JTextField tfNombreProducto;
    private javax.swing.JTextField tfPrecioCompra;
    private javax.swing.JTextField tfPrecioVenta;
    private javax.swing.JTextField tfUnidades;
    // End of variables declaration//GEN-END:variables
}
