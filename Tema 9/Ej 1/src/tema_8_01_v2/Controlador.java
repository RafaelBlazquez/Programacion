/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_8_01_v2;

import ModeloBD.PersonaJpaController;
import ModeloUML.Persona;
import Vista.VMenu;
import Vista.VOpciones;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Persistence;
import javax.swing.JTextField;

/**
 *
 * @author leora
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    private static VMenu v1;
    private static VOpciones v2;
    //Facilitar la búsqueda en la base de datos
    
    
    private static int pos;
    private static Persona p;
    private static List<Persona> personas;
    private static PersonaJpaController personasbd;
    
    
    public static void main(String[] args) {
        try{
               
               personasbd = new PersonaJpaController(Persistence.createEntityManagerFactory("Tema_8_01_v2PU"));
               ventanaMenu(); 
        }
        catch(Exception e){
        
        }
    }
     public static void ventanaMenu(){
        v1 = new VMenu();
        v1.setVisible(true);
    }  
    public static void opcionElegida(int eleccion)throws Exception{
        v1.setVisible(false);
            if (eleccion!=4){
                if (eleccion ==3){
                    personas =  personasbd.findPersonaEntities();
                   
                }

                v2 = new VOpciones(eleccion);
                v2.setVisible(true);
            }
        else{
            v1.dispose();
            System.exit(0);
        }
    }
    public static void registroTerminado(String nombre,String edad, String profesion, String telefono) throws Exception{
        v2.dispose();
        p= new Persona(nombre,Integer.parseInt(edad),profesion,telefono);
        personasbd.create(p);
        v1.limpiar();
        v1.setVisible(true);
        
    }
    public static void consulta(String nombre) throws Exception{
        p=personasbd.findPersona(nombre);
        v2.tenDatos(p.getEdad(),p.getProfesion(),p.getTelefono());
    }
    public static void consTerm(){
        v2.dispose();
        v1.limpiar();
        v1.setVisible(true);
    }
     
    public static boolean ten(int posicion){
        boolean correcto=false;
        if (posicion>=0 && posicion<personas.size()){
            correcto=true;
            pos = posicion;
        }
        return correcto;
    }
    
     public static void ten(String que,JTextField n){        
        if (que.equals("nombre")){
            n.setText(personas.get(pos).getNombre());
        }
            else{
                if (que.equals("edad")){
                    n.setText(String.valueOf(personas.get(pos).getEdad()));
                }
                else{
                    if (que.equals("profesion")){
                    n.setText(personas.get(pos).getProfesion());
                    }
                    else{  
                        n.setText(personas.get(pos).getTelefono());
                    }
                }
            }  
        
    }
    
}
