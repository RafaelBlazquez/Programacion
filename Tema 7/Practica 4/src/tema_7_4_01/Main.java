/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_7_4_01;

import Vista.*;

/**
 *
 * @author 1gdaw01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static VistaGeneral v1 ;
    public static vInicioSesion v2;
    public static vEleccion v3;
    public static vMovimientos v4;
    public static vConsulta v5;
    public static void main(String[] args) {
       v1= new VistaGeneral();
       v1.setVisible(true);
       
        
    }
    public static void InicioSesion(){
        v1.dispose();
        v2= new vInicioSesion();
        v2.ConfigurarBotones();
        v2.setVisible(true);
    }
    public static void tenDniContrasena(String Dni,String contrasena){
        v2.dispose();
        v3=new vEleccion();
        v3.setVisible(true);
        //validarContrasena();
    }
    public static void VentanaMovimientos(){
        if (v4==null)
        v4=new vMovimientos();
            v4.setVisible(true);
        if (v5!=null)
            v5.dispose();
        v3.dispose();
    }
    public static void VentanaConsulta(){
        if (v5==null)
            v5=new vConsulta();
        v5.setVisible(true);
        if (v4!=null)
            v4.dispose();
        v3.dispose();
    }
}
