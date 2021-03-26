/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import tema_8_03.Controlador;

/**
 *
 * @author leora
 */
 
public final class VCliente extends javax.swing.JFrame {
    int posicion;
    int posicionUno;
    int cuantos;
    String posicionString;
    String palabra;
    String tema;
    int contador;
    int contadorUno;
    ArrayList<String> datoseis;
    int cantidad;
    public VCliente() {
        initComponents();
        lCual.setVisible(false);
    }
    
    public VCliente(int accion) {
        contador=0;
        initComponents();
        lCual.setVisible(false);
        bAurreko.setVisible(false);
        bHurrengo.setVisible(false);
        switch (accion){
            case 1:
                tema = "Alta";
                enableTodos();
                disableBotones();
                bBuscar.setEnabled(false);
                bBuscar.setVisible(false);
                break;
            case 2:
                tema = "Baja";
                bAceptar.setText("Borrar");
                bAceptar.setEnabled(false);
                break;
            case 3:
                tema = "Modificacion";
                bAceptar.setText("Modificar");
                bAceptar.setEnabled(false);
                break;
            case 4:
                tema = "Consulta";
                disableBotones();
                datoseis = Controlador.rellenarDatos(contador);
                tfDni.setText(datoseis.get(0));
                tfNombre.setText(datoseis.get(1));
                tfApellidos.setText(datoseis.get(2));
                tfDireccion.setText(datoseis.get(3));
                tfTelefono.setText(datoseis.get(4));
                tfEmail.setText(datoseis.get(5));
                bBuscar.setText("Anterior");
                bBuscar.setEnabled(false);
                bAceptar.setText("Siguiente");
                bCancelar.setText("Atrás");
                break;
        }
        lTitulo.setText("Clientes : "+tema);
    }
    
    public void enableTodos(){
        tfDni.setEnabled(true);
        tfNombre.setEnabled(true);
        tfApellidos.setEnabled(true);
        tfDireccion.setEnabled(true);
        tfTelefono.setEnabled(true);
        tfEmail.setEnabled(true);
    }
    
    public void disableTodos(){
        tfDni.setEnabled(false);
        tfDni.setText("");
        tfNombre.setEnabled(false);
        tfNombre.setText("");
        tfApellidos.setEnabled(false);
        tfApellidos.setText("");
        tfDireccion.setEnabled(false);
        tfDireccion.setText("");
        tfTelefono.setEnabled(false);
        tfTelefono.setText("");
        tfEmail.setEnabled(false);
        tfEmail.setText("");
    }
    
    public void enableBotones(){
        bDni.setEnabled(true);
        bNombre.setEnabled(true);
        bApellidos.setEnabled(true);
        bDireccion.setEnabled(true);
        bTelefono.setEnabled(true);
        bEmail.setEnabled(true);
    }
    
    public void disableBotones(){
        bDni.setEnabled(false);
        bNombre.setEnabled(false);
        bApellidos.setEnabled(false);
        bDireccion.setEnabled(false);
        bTelefono.setEnabled(false);
        bEmail.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        tfDni = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        bDni = new javax.swing.JButton();
        bNombre = new javax.swing.JButton();
        bApellidos = new javax.swing.JButton();
        bDireccion = new javax.swing.JButton();
        bTelefono = new javax.swing.JButton();
        bEmail = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        lCual = new javax.swing.JLabel();
        bAurreko = new javax.swing.JButton();
        bHurrengo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("DNI :");

        jLabel2.setText("Nombre :");

        jLabel3.setText("Apellidos :");

        jLabel4.setText("Dirección :");

        jLabel5.setText("Teléfono :");

        jLabel6.setText("E-mail :");

        bAceptar.setText("Aceptar");
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

        tfDni.setEnabled(false);
        tfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDniActionPerformed(evt);
            }
        });

        tfNombre.setEnabled(false);

        tfApellidos.setEnabled(false);

        tfDireccion.setEnabled(false);

        tfTelefono.setEnabled(false);

        tfEmail.setEnabled(false);

        bDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDniActionPerformed(evt);
            }
        });

        bNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNombreActionPerformed(evt);
            }
        });

        bApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bApellidosActionPerformed(evt);
            }
        });

        bDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDireccionActionPerformed(evt);
            }
        });

        bTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTelefonoActionPerformed(evt);
            }
        });

        bEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmailActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        lCual.setText("1/2");

        bAurreko.setText("<");
        bAurreko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAurrekoActionPerformed(evt);
            }
        });

        bHurrengo.setText(">");
        bHurrengo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHurrengoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAurreko)
                        .addGap(18, 18, 18)
                        .addComponent(bHurrengo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lCual)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(bBuscar))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(bCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDni)
                            .addComponent(tfNombre)
                            .addComponent(tfApellidos)
                            .addComponent(tfDireccion)
                            .addComponent(tfTelefono)
                            .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bDireccion)
                                .addComponent(bTelefono))
                            .addComponent(bEmail))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lCual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAurreko)
                            .addComponent(bHurrengo))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bAceptar)
                    .addComponent(bBuscar))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        if (!tema.equals("Consulta")){
            boolean seguro=false;
            try {
                if(tema.equals("Baja")){
                     int numero=JOptionPane.showConfirmDialog( null,"Quieres eliminar el cliente con dni "+ tfDni.getText());
                     if (numero==0)
                         seguro = true;
                }
                else{
                    Controlador.datosCliente(tfDni.getText(),tfNombre.getText(),tfApellidos.getText(),tfDireccion.getText(),tfTelefono.getText(),tfEmail.getText());  
                }
                if (seguro)
                    Controlador.datosCliente(tfDni.getText(),tfNombre.getText(),tfApellidos.getText(),tfDireccion.getText(),tfTelefono.getText(),tfEmail.getText());
                
            } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }     
        }
        else{
            if (contador<cantidad-1){
            contador += 1;
            datoseis = Controlador.rellenarDatos(contador);
            rellenarTf(); 
            bBuscar.setEnabled(true);
                if (contador==cantidad-1)
                    bAceptar.setEnabled(false);
            }
            
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        Controlador.cancelar();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDniActionPerformed

    private void bDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDniActionPerformed
        buscarPor(1);
        tfDni.requestFocus();
    }//GEN-LAST:event_bDniActionPerformed

    private void bApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bApellidosActionPerformed
        buscarPor(3);
        tfApellidos.requestFocus();
    }//GEN-LAST:event_bApellidosActionPerformed

    private void bTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTelefonoActionPerformed
        buscarPor(5);
        tfTelefono.requestFocus();
    }//GEN-LAST:event_bTelefonoActionPerformed

    private void bNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNombreActionPerformed
        buscarPor(2);
        tfNombre.requestFocus();
    }//GEN-LAST:event_bNombreActionPerformed

    private void bDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDireccionActionPerformed
        buscarPor(4);
        tfDireccion.requestFocus();
    }//GEN-LAST:event_bDireccionActionPerformed

    private void bEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEmailActionPerformed
        buscarPor(6);
        tfEmail.requestFocus();
    }//GEN-LAST:event_bEmailActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        if (!tema.equals("Consulta")){
            switch(posicion){
                case 1:
                    posicionString= "dni";
                    palabra = tfDni.getText();
                    break;
                case 2:
                    posicionString= "nombre";
                    palabra = tfNombre.getText();
                    break;
                case 3:
                    posicionString= "apellidos";
                    palabra = tfApellidos.getText();
                    break;
                case 4:
                    posicionString= "direccion";
                    palabra = tfDireccion.getText();
                    break;
                case 5:
                    posicionString= "telefono";
                    palabra = tfTelefono.getText();
                    break;
                case 6:
                    posicionString= "email";
                    palabra = tfEmail.getText();
                    break;               
            }
            try {
                boolean encontrado = Controlador.buscaUno(posicionString,palabra);
                if (encontrado){
                    bBuscar.setEnabled(false);
                    bAceptar.setEnabled(true);
                    disableBotones();
                    posicionUno = 0;
                    contadorUno = 0;
                    lCual.setText((posicionUno+1)+"/"+cuantos);
                    lCual.setVisible(true);
                    bAurreko.setVisible(true);
                    bHurrengo.setVisible(true);
                    bAurreko.setEnabled(false);
                    if (cuantos ==1){
                        bHurrengo.setEnabled(false); 
                    }
                    if (tema.equals("Modificacion")){
                enableTodos();
                switch(posicion){
                    case 1:
                        tfDni.setEnabled(false);
                        break;
                    case 2:
                        tfNombre.setEnabled(false);
                        break;
                    case 3:
                        tfApellidos.setEnabled(false);
                        break;
                    case 4:
                       tfDireccion.setEnabled(false);
                        break;
                    case 5:
                        tfTelefono.setEnabled(false);
                        break;
                    case 6:
                        tfEmail.setEnabled(false);
                        break;               
                }
            }
                }
                else{
                    JOptionPane.showMessageDialog(null,"El cliente solicitado no esta registrado");
                    disableTodos();
                    enableBotones();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        else{
            if (contador!=0){
            contador -= 1;
            datoseis =Controlador.rellenarDatos(contador);
            rellenarTf();
            bAceptar.setEnabled(true);
                if (contador==0)
                    bBuscar.setEnabled(false);
            }
        }
        
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bAurrekoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAurrekoActionPerformed
        if (posicionUno!=0){
            posicionUno -= 1;
            datoseis =Controlador.rellenarDatos(posicionUno);
            rellenarTf();
            bHurrengo.setEnabled(true);
                if (posicionUno==0)
                    bAurreko.setEnabled(false);
            }
    }//GEN-LAST:event_bAurrekoActionPerformed

    private void bHurrengoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHurrengoActionPerformed
        if (posicionUno<cuantos){
            posicionUno += 1;
            datoseis = Controlador.rellenarDatos(posicionUno);
            rellenarTf(); 
            bAurreko.setEnabled(true);
                if (posicionUno==cuantos-1)
                    bHurrengo.setEnabled(false);
            }
    }//GEN-LAST:event_bHurrengoActionPerformed

    
    public void ten (int numero){
    cantidad = numero;
    }
    public void rellenarTf(){
            tfDni.setText(datoseis.get(0));
            tfNombre.setText(datoseis.get(1));
            tfApellidos.setText(datoseis.get(2));
            tfDireccion.setText(datoseis.get(3));
            tfTelefono.setText(datoseis.get(4));
            tfEmail.setText(datoseis.get(5));     
    }
    public void dameDatos(int cantidad,String dni, String nombre, String apellidos, String direccion, String telefono, String email){
        cuantos= cantidad;
        tfDni.setText(dni);
        tfNombre.setText(nombre);
        tfApellidos.setText(apellidos);
        tfDireccion.setText(direccion);
        tfTelefono.setText(telefono);
        tfEmail.setText(email);
    }
    
    public void buscarPor(int numero){
        posicion=numero;
        
        disableTodos();
        enableBotones();
        switch (numero){
            case 1:
                bDni.setEnabled(false);
                tfDni.setEnabled(true);
                
                break;
            case 2:
                bNombre.setEnabled(false);
                tfNombre.setEnabled(true);
                break;
            case 3:
                bApellidos.setEnabled(false);
                tfApellidos.setEnabled(true);
                break;
            case 4:
                bDireccion.setEnabled(false);
                tfDireccion.setEnabled(true);
                break;
            case 5:
                bTelefono.setEnabled(false);
                tfTelefono.setEnabled(true);
                break;
            case 6:
                bEmail.setEnabled(false);
                tfEmail.setEnabled(true);
                break;
        }
    }
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
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bApellidos;
    private javax.swing.JButton bAurreko;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bDireccion;
    private javax.swing.JButton bDni;
    private javax.swing.JButton bEmail;
    private javax.swing.JButton bHurrengo;
    private javax.swing.JButton bNombre;
    private javax.swing.JButton bTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lCual;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
