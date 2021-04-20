/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_8_02;



import ModeloBD.*;
import ModeloUML.*;
import Vista.*;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;
import javax.persistence.Persistence;
import javax.swing.JComboBox;

/**
 *
 * @author leora
 */
public class Controlador {

    /**
     */
        public static VMenu v1; 
        public static VEvento v2; 
        public static VEleccion v3;
        public static VInscliente v4;
        public static AcontecimientoJpaController acontecimientosbd;
        private static List<Acontecimiento> acontecimientos;
        public static PersonaJpaController personasbd;
        public static EmpresaJpaController empresasbd;
        public static Date fechaD;
        public static Acontecimiento ac;
    public static void main(String[] args) {
        try{
            acontecimientosbd = new AcontecimientoJpaController(Persistence.createEntityManagerFactory("Tema_8_02_v3PU"));
            personasbd = new PersonaJpaController(Persistence.createEntityManagerFactory("Tema_8_02_v3PU"));
            empresasbd = new EmpresaJpaController(Persistence.createEntityManagerFactory("Tema_8_02_v3PU"));
            v1= new VMenu();
            v1.setVisible(true);
        }
        catch (Exception e){
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
    public static void acabar(){
        v1.dispose();
        System.exit(0);
    }
    public static void Inscliente() throws Exception {
        v1.setVisible(false);
        v4 =new VInscliente();
        v4.setVisible(true);
    }
     public static void tenCB(JComboBox cb) throws Exception{
        acontecimientos =  acontecimientosbd.findAcontecimientoEntities();
        for (int x = 0 ; x< acontecimientos.size(); x++){
            String nombre = acontecimientos.get(x).getNombre();
            cb.addItem(nombre);
        }
        
    }
     public static void modificarEvento(String elegido) throws Exception{
        v3.dispose();
        String nombre = acontecimientosbd.findAcontecimiento(elegido).getNombre();
        String lugar = acontecimientosbd.findAcontecimiento(elegido).getLugar();
        Date fecha =  acontecimientosbd.findAcontecimiento(elegido).getFecha();
        int invitados = acontecimientosbd.findAcontecimiento(elegido).getAsistentes();
        LocalDate fechaLD = convertToLocalDateViaInstant(fecha);
        v2 = new VEvento(nombre,lugar,fechaLD,invitados);
        v2.setVisible(true);
        
    }
     public static void cancelarEvento(String elegido) throws Exception{
        v3.dispose();
        acontecimientosbd.destroy(elegido);
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
        
        fechaD = convertToDateViaSqlDate(fecha);
        ac = new Acontecimiento( nombre, lugar, fechaD,horaInicio ,horaFin, aforo);
        acontecimientosbd.create(ac);
        v2.dispose();
        v1.setVisible(true);
    }
    public static void controladorEvento1(String nombre,int intLugar,LocalDate fecha,Time horaInicio, Time horaFin, int aforo) throws Exception{
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
        
        fechaD = convertToDateViaSqlDate(fecha);
        ac = new Acontecimiento( nombre, lugar, fechaD,horaInicio ,horaFin, aforo);
        acontecimientosbd.edit(ac);
        v2.dispose();
        v1.setVisible(true);
    }
    public static Date convertToDateViaSqlDate(LocalDate dateToConvert) {
    return java.sql.Date.valueOf(dateToConvert);
}   
    public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
    return dateToConvert.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
     }
    public static void confirmarModificacion() throws SQLException, Exception {
        
        v2.dispose();
        v1.setVisible(true);
    }
    public static void tenPersona(String dni, String nombre, String empresa, int idEmpresa, String evento) throws Exception{
        Persona p = new Persona(dni,nombre);
        Empresa e = new Empresa(idEmpresa, empresa);
        p.setIdempresa(e);
        acontecimientos.add(ac);
        p.setAcontecimientoList(acontecimientos);
        empresasbd.create(e);
        personasbd.create(p);        
        v4.dispose();
        v1.setVisible(true);
    }
    public static void cancelarv2(){
        v2.dispose();
        v1.setVisible(true);
    }
     public static void cancelarv3(){
        v3.dispose();
        v1.setVisible(true);
    }
      public static void cancelarv4(){
        v4.dispose();
        v1.setVisible(true);
    }
}
