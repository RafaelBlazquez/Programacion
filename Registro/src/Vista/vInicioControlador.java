/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import ModeloBD.PersonaDAO;
import UML.Persona;
import java.sql.SQLException;
import javax.swing.JFrame;
import org.apache.commons.codec.digest.DigestUtils;
import registro.*;


/**
 *
 * @author leora
 */

public class vInicioControlador {
    
    public static String mensajeError;
    public static int contador=0;
    public static void acceder(String usuario, String contrasena) throws SQLException{
        
        if (usuario.equals("")||contrasena.equals("")){
            mensajeError = "Debes rellenar los dos campos";
            Controlador.excepcionVista(mensajeError);
        }
        else{
             
            String contrasenaCodif = DigestUtils.md5Hex(contrasena);
            Persona p = PersonaDAO.buscarPersona(usuario);
            if (p != null)
                if (p.getContrasena().equals(contrasenaCodif)){
                    System.out.println("registro completo");
                }
                else
                    usuarioIncorrecto();
            else
                usuarioIncorrecto();
        }
    }      
        
    
    public static void usuarioIncorrecto(){
        contador +=1;
        mensajeError = "Los datos introducidos no son correctos";
        Controlador.excepcionVista(mensajeError);
        if (contador!=3){
            Ventanas.limpiarContrasena("v1");
        }
        else {
            Ventanas.limpiarVentana("v1");
            contador=0;
        } 
    }
    public static void crearPersona(String nombre, String apellido,String email, String usuario, String contrasena) throws SQLException, Exception{
        if (nombre.equals("")||apellido.equals("")||email.equals("")||contrasena.equals("")||usuario.equals("")){
            mensajeError = "Debes rellenar todos los campos";
            Controlador.excepcionVista(mensajeError);
        }
        else{
            String contrasenaCodif = DigestUtils.md5Hex(contrasena);
            Persona p = new Persona(nombre,apellido,email,usuario,contrasenaCodif);
            PersonaDAO.anadirPersona(p);
            System.out.println("registro completo");
        }
    }
    public static void usuarioFalso(){
        mensajeError = "Este usuario ha sido bloqueado";
            Controlador.excepcionVista(mensajeError);
            Ventanas.limpiarVentana("v1");
    }
    public static void noCuenta(){
        Ventanas.moverVentana("v1",-200,0);
        Ventanas.bloquearVentana("v1");
        Ventanas.abrirVentana("v3");
        Ventanas.moverVentana("v3",+200,0);
    }
    
    public static void olvidadoContrasena(){
        Ventanas.abrirVentana("v4");
    }
    
    public static void salir(){
        System.exit(0);
    }
    
    /*--------------------------------------------------------------------------------*/
    public static void cerrar(String ventanaString){
        Ventanas.borrarVentana(ventanaString);       
    }
}
