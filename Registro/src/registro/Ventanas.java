/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import Vista.*;

import java.awt.Container;
import java.awt.Point;
import java.util.HashSet;
import javax.swing.JFrame;
import org.apache.commons.codec.digest.DigestUtils;
import static registro.Controlador.*;

/**
 *
 * @author leora
 */
public class Ventanas {
    public static void generarVentanas(){
        v1 = new vInicio();
        v2 = new vExcepcionVista();
        v3 = new vNoCuenta();
    }
    public static void abrirVentana(JFrame nombre){
      
        nombre.setVisible(true);
    }
    public static void abrirVentana(JFrame nombre,String mensajeError){
        
        v2.recibirMensaje(mensajeError);
        nombre.setVisible(true);
    }
    public static void abrirVentana(String ventanaString){
         JFrame nombre = dameJFrame(ventanaString);
                nombre.setVisible(true);
        
    }
    public static void ocultarVentana(JFrame nombre){
      
        nombre.setVisible(false);
    }
    public static void borrarVentana(JFrame nombre){
        
        nombre.dispose();
    }
    public static void borrarVentana(String ventanaString){
        JFrame nombre = dameJFrame(ventanaString);
                nombre.dispose();
                
    } 

    private static JFrame dameJFrame(String ventanaString) {
        JFrame ventana=null;
        switch (ventanaString){
            case "v1":
                ventana = v1;
                break;
            case "v2":
                ventana = v2;
                break;
            case "v3":
                ventana = v3;
                break;
        }
        return ventana;
        
    
    }
    public static void moverVentana(String ventanaString,int xx,int xy){
        JFrame nombre = dameJFrame(ventanaString);
        int x;
        int y;
        Point point;
                point = nombre.getLocationOnScreen();
        x= (int)point.getX()+xx;
        y= (int)point.getY()+xy;
        nombre.setLocation(x,y);
        
                
        } 
    public static void bloquearVentana(String ventanaString){
        if (ventanaString.equals("v1")){
            v1.bloquearVentana();
        }
    }
    public static void desbloquearVentana(String ventanaString){
        if (ventanaString.equals("v1")){
            v1.desbloquearVentana();
        }
    }
    public static void limpiarContrasena(String ventanaString){
        if (ventanaString.equals("v1")){
            v1.limpiarContrasena();
        }
    }
    public static void limpiarVentana(String ventanaString){
        if (ventanaString.equals("v1")){
            v1.limpiar();
        }
    }
     public static void mensajeV1(String usuario,char[] contrasena){
          String contrasenaString= String.valueOf(contrasena);
            String contrasenaCodif = DigestUtils.md5Hex(contrasenaString);
           //anadirUsuario(usuario,contrasena);
            v1.mensajeV1(usuario);
             
                
    } 
}
