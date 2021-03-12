/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_8_01;

import ModeloBD.*;
import UML.*;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author leora
 */
public class Controlador {

    private static BaseDatos bd;
    private static PersonaDAO pDao;
    
    private static VMenu v1;
    private static VOpciones v2;
  
    private static int pos;
    private static Persona p;
    private static ArrayList<Persona> personas;

    public static void main(String[] args) {
        try{
        
        bd = new BaseDatos();
        bd.conectar();
        
        pDao=new PersonaDAO(bd.getCon()); 
        
        ventanaMenu();
        }
        catch(Exception e){
        System.out.println(e.getMessage());}
    }
    public static void ventanaMenu(){
        v1 = new VMenu();
        v1.setVisible(true);
    }  
    public static void opcionElegida(int eleccion)throws Exception{
        v1.setVisible(false);
        if (eleccion!=4){
            if (eleccion ==3){
                personas = PersonaDAO.pedirPersonas();
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
        PersonaDAO.anadirPersona(p);
        v1.limpiar();
        v1.setVisible(true);
        
    }

    public static void consulta(String nombre) throws Exception{
        p = pDao.consulta(nombre);
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
