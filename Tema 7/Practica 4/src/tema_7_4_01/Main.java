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
    public static void main(String[] args) {
       v1= new VistaGeneral();
       v1.setVisible(true);
       
        
    }
    public static void InicioSesion(){
    v1.dispose();
    v2= new vInicioSesion();
    vInicioSesion.ConfigurarBotones();
    v2.setVisible(true);
    
    }
}
