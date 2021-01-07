/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_6_02;

import Clases.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author blagon
 */
public class Tema_6_02 {


    public static ArrayList<Alumno> agenda = new ArrayList();
    
    public static void main(String[] args) {
        try{
            int continuar;
                do{
                    /*AnadirAlumno1();*/        //Función con constructor vacío
                    /*AnadirAlumno2();*/        //Función con constructor con ("codigo","nombre","domicilio","telefono")
                    AnadirAlumno3();            //Función CORREGIDA con constructor con ("codigo","nombre","domicilio","telefono")
                    continuar = JOptionPane.showConfirmDialog(null,"¿Quieres continuar?");
                }
                while(continuar==0);
        
            int otro;
                do{
                    BuscarMostrar();
                    otro= JOptionPane.showConfirmDialog(null, "¿Quieres buscar otro alumno");
                }
                while(otro==0);
            CrearLista();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getClass());
        }
    }
     
    //Constructor vacío
    
    public static void AnadirAlumno1() throws Exception{
        boolean error=true;
        try{
            do{
            agenda.add(new Alumno());
            AsignarCodigo();
            AsignarNombre();
            AsignarDomicilio();
            AsignarTelefono();
            error=false;
            }
            while(error);
        }
        catch(NumberFormatException | NullPointerException e){
            JOptionPane.showMessageDialog(null,"El código debe ser numérico");
            error=true;
        }
       
    }

// Constructor con(codigo,nombre,domicilio,telefono)
    
    /*public static void AnadirAlumno2() throws Exception{
        boolean error=true;       
            try{
                do{
                agenda.add(new Alumno(AsignarCodigo(),AsignarNombre(),AsignarDomicilio(),AsignarTelefono()));
---------------------------------------------------------------------------------------------------------------------------------------

                El orden en el que se ejecuta una línea es primero las parentesis
                   --> En este caso, desde las funciones estoy intentado acceder a una posicion del array que aun no he creado

---------------------------------------------------------------------------------------------------------------------------------------
                error=false; 
                }
                while(error);
            }
            catch(NumberFormatException | NullPointerException e){
                JOptionPane.showMessageDialog(null,"El código debe ser numérico");
                error=true;
            }
       
    }
    */
    public static void AnadirAlumno3() throws Exception{
        boolean error=true;       
            try{
                do{
                String codigo = Asignar("codigo");
                String nombre = Asignar("nombre");
                String domicilio = Asignar("domicilio");
                String telefono = Asignar("telefono");
                agenda.add(new Alumno(codigo,nombre,domicilio,telefono));

                error=false; 
                }
                while(error);
            }
            catch(NumberFormatException | NullPointerException e){
                JOptionPane.showMessageDialog(null,"El código debe ser numérico");
                error=true;
            }
       
    }
    public static String AsignarCodigo() throws Exception{
        String codigo;
        agenda.get(agenda.size()-1).setCodigo(JOptionPane.showInputDialog("Introduce el codigo del alumno"));
        codigo= agenda.get(agenda.size()-1).getCodigo();
        return codigo;
    }
    
    public static String AsignarNombre(){
        agenda.get(agenda.size()-1).setNombre(JOptionPane.showInputDialog("Introduce el nombre del alumno"));
        String nombre= agenda.get(agenda.size()-1).getNombre();
        return nombre;
    }
    
    public static String AsignarDomicilio(){
        agenda.get(agenda.size()-1).setDomicilio(JOptionPane.showInputDialog("Introduce el domicilio del alumno"));
        String domicilio= agenda.get(agenda.size()-1).getDomicilio();
        return domicilio;
    }
    
    public static String AsignarTelefono(){
        agenda.get(agenda.size()-1).setTelefono(JOptionPane.showInputDialog("Introduce el teléfono del alumno"));
        String telefono = agenda.get(agenda.size()-1).getTelefono();
        return telefono;
    }
    public static String Asignar(String tipo) throws Exception{
        String codigo=(JOptionPane.showInputDialog("Introduce el "+tipo+" del alumno"));
        return codigo;
    }
    
    public static void CrearLista(){
        String codigo="";
        String nombre="";
        String domicilio="";
        String telefono="";
        String cadena="Agenda de alumnos:\n";
        for(int x=0;x<agenda.size();x++){
            codigo =agenda.get(x).getCodigo();
            nombre =agenda.get(x).getNombre();
            domicilio= agenda.get(x).getDomicilio();
            telefono= agenda.get(x).getTelefono();
            cadena+= codigo +"\n--> Nombre del alumno: "+nombre+"\n-->Domicilio: "+domicilio+"\n-->Telefono: "+telefono+"\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    public static void BuscarMostrar(){
        String nombre;
        String domicilio;
        String telefono;
        String codigo = JOptionPane.showInputDialog("Introduce el codigo del alumno a buscar");
        int x;
        for(x=0;x<agenda.size() && codigo.equals(agenda.get(x).getCodigo());x++){}
        if (codigo.equals(agenda.get(x-1).getCodigo())){
            JOptionPane.showMessageDialog(null, "El alumno ha sido encontrado");
            nombre =agenda.get(x-1).getNombre();
            domicilio= agenda.get(x-1).getDomicilio();
            telefono= agenda.get(x-1).getTelefono();
            JOptionPane.showMessageDialog(null, "Codigo del alumno: "+codigo+"\n--> Nombre del alumno: "+nombre+"\n--> Domicilio: "+domicilio+"\n--> Telefono: "+telefono);
        }
        else
            JOptionPane.showMessageDialog(null, "El alumno no ha sido encontrado");
        
    }
}
