/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_8_02;

import Vista.*;
import java.sql.Time;
import java.time.LocalDate;

/**
 *
 * @author leora
 */
public class Controlador {

  
    public static VMenu v1; 
    public static VEvento v2; 
    public static VEleccion v3;
    public static void main(String[] args) {
       v1 = new VMenu();
       v1.setVisible(true);
    }
    public static void guardar(){
        v1.setVisible(false);
        v2 = new VEvento();
        v2.setVisible(true);
    }
    
    public static void accion(String accion){
        v1.setVisible(false);
        v3 = new VEleccion(accion);
        v3.setVisible(true);
    }
    public static void anadirEvento(String nombre,int intLugar,LocalDate fecha,Time horaInicio, Time horaFin, int aforo){
        String lugar;
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
        
    }
    public static void modificarEvento(){
        
    }
    public static void cancelarEvento(){
        
    }
}
