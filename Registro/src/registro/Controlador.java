/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import ModeloBD.BaseDatos;
import ModeloBD.PersonaDAO;
import Vista.*;
import java.awt.Container;
import javax.swing.JFrame;
/**
 *
 * @author leora
 */
public class Controlador {

    /**
     */
    private static BaseDatos bd;
    private static PersonaDAO pDao;
    
    public static vInicio v1;
    public static vExcepcionVista v2;
    public static vNoCuenta v3;
    
    
    public static void main(String[] args) {
        try{
        bd = new BaseDatos();
        bd.conectar();
        
        pDao=new PersonaDAO(bd.getCon());
        
        Ventanas.generarVentanas();
        Ventanas.abrirVentana(v1);
        }
        catch(Exception e){
            Ventanas.abrirVentana(v2);
        }
    }
    public static void excepcionVista(String mensaje){
        Ventanas.abrirVentana(v2,mensaje);
    }
    
    
}