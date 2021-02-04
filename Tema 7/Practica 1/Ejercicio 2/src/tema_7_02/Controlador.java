/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_7_02;

import Modelo.Persona;
import Vista.*;
import java.util.ArrayList;

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
}
