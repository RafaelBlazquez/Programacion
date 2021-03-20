/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_8_02;

import ModeloBD.AcontecimientoDAO;
import ModeloBD.BaseDatos;
import ModeloBD.PersonaDAO;
import UML.*;

import Vista.*;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author leora
 */
public class Controlador {
    public static BaseDatos bd;
    public static AcontecimientoDAO acDAO;
    public static PersonaDAO pDAO;
    private static Acontecimiento ac;
    public static VMenu v1; 
    public static VEvento v2; 
    public static VEleccion v3;
    public static VInscliente v4;
   
    
    public static void main(String[] args) {
        try{
            
            bd = new BaseDatos();
            bd.conectar();
            acDAO=new AcontecimientoDAO(bd.getCon());
            pDAO=new PersonaDAO(bd.getCon());
            v1 = new VMenu();
            v1.setVisible(true);}
        catch (Exception e){
            e.getClass();
        }
    }
    
    public static void guardar(){
        v1.setVisible(false);
        v2 = new VEvento();
        v2.setVisible(true);
    }
    
    public static void accion(String accion) throws Exception{
        v1.setVisible(false);
        v3 = new VEleccion(accion);
        v3.setVisible(true);
    }
    public static void cancelarv2(){
        v2.dispose();
        v1.setVisible(true);
    }
     public static void cancelarv3(){
        v3.dispose();
        v1.setVisible(true);
    }
    public static void controladorEvento(String nombre,int intLugar,LocalDate fecha,Time horaInicio, Time horaFin, int aforo) throws Exception{
        String lugar="";
        switch (intLugar){
            case 1:
                lugar = "Teatro";
            case 2:
                lugar = "Salón";
                break;
            case 3:
                lugar = "Parque";
                break;
            case 4:
                lugar = "Igelsia";
                break;
        }
        String horaInicioString = horaInicio.toString();
        String horaFinString = horaFin.toString();
        ac = new Acontecimiento( nombre, lugar, fecha,horaInicioString ,horaFinString, aforo);
        AcontecimientoDAO.anadirAcontecimiento(ac);
        v2.dispose();
        v1.setVisible(true);
    }
    public static void tenCB(JComboBox cb) throws Exception{
        ArrayList<String> nombres;
        nombres = AcontecimientoDAO.dameTodos();
        for (int x = 0 ; x< nombres.size(); x++){
            String nombre = nombres.get(x);
            cb.addItem(nombre);
        }
        
    }
    public static void modificarEvento(String elegido) throws Exception{
        v3.dispose();
        ac = AcontecimientoDAO.dameUno(elegido);
        String nombre = ac.getNombre();
        String lugar = ac.getLugar();
        LocalDate fecha = ac.getFecha();
        int invitados = ac.getInvitados();
        v2 = new VEvento(nombre,lugar,fecha,invitados);
        v2.setVisible(true);
        
    }
    public static void cancelarEvento(String elegido) throws Exception{
        v3.dispose();
        AcontecimientoDAO.borraUno(elegido);
        v1.setVisible(true);
    }
    public static void acabar(){
        v1.dispose();
        System.exit(0);
    }

    public static void confirmarModificacion() throws SQLException {
        AcontecimientoDAO.actualizarUno(ac);
        v2.dispose();
        v1.setVisible(true);
    }

    public static void confirmarCancelacion() {
       v2.dispose();
       v1.setVisible(true);
    }

    public static void controladorEvento(String nombre, int aforo) {
       ac.setInvitados(aforo);
    }

    public static void Inscliente() throws Exception {
        v1.setVisible(false);
        v4 =new VInscliente();
        v4.setVisible(true);
    }
    public static void tenPersona(String dni, String nombre) throws Exception{
        PersonaDAO.anadirUno(dni, nombre);
        v4.dispose();
        v1.setVisible(true);
    }
}
