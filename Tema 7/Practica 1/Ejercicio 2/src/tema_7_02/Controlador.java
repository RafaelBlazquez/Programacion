/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_7_02;

import Excepciones.DanoniNoValido;
import Modelo.Persona;
import Vista.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controlador {

    private static V1 v1;
    private static V2 v2;
    public static ArrayList<Persona> listaPersonas = new ArrayList();
    public static void main(String[] args) {
        v1 = new V1();
        v1.setVisible(true);  
    }
    public static void tenControlador(String dni, String nombre, String apellidos){
     
        Persona p1 = new Persona(dni,nombre,apellidos);
        if (ValidarDNI(dni))
            listaPersonas.add(p1);
    }
    public static void salir(){
        String listadoFinal="";
        for(int x=0; x<listaPersonas.size(); x++){
            listadoFinal+= listaPersonas.get(x).toString()+ "\n";
        }
        v2 = new V2(listadoFinal);
        v2.setVisible(true);  
        v1.dispose();
    }
    public static void salirDefinitivo(){
        v2.dispose();
        System.exit(0);
    }

    private static boolean ValidarDNI(String dni) {
        boolean correcto=true;
        try{
        Pattern p = Pattern.compile("^[0-9]{8}[A-Z]$");
        Matcher m =p.matcher(dni);
        if (!m.matches()){
            throw new DanoniNoValido();
        }
        else{
        correcto = true;
        }
        }
        catch (DanoniNoValido e){
            v1.datoNoValido();
            correcto = false;
                }
        catch (Exception e){
            correcto = false;
                }
        finally{
        return correcto;
        }
    }
        
    }

