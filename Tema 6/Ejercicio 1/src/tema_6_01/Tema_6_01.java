/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_6_01;

import Clases.*;
import Excepciones.DatoIncorrecto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author blagon
 */
public class Tema_6_01 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Esfera> esferas = new ArrayList();
    
    public static void main(String[] args) {
        try{
            int continuar;
            do{
            //  AnadirEsferas1();       //Función con constructor vacío
                AnadirEsferas2();       //Función con constructor con ("radio")
                continuar = JOptionPane.showConfirmDialog(null,"¿Quieres continuar?");
            }
            while(continuar==0);
            MostrarValores();
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getClass());
        }
    }
    
    
/*  
    //Constructor vacío
    
    public static void AnadirEsferas1(){
        boolean error=true;
        do{
        try{
            esferas.add(new Esfera());
            esferas.get(esferas.size()-1).setRadio(Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio")));
            error=false;   
        }
        catch(NumberFormatException | NullPointerException e){
            JOptionPane.showMessageDialog(null,"El radio debe ser un número");
            error=true;
        }
        }
        while(error);
    }
*/
    
    //Constructor con ("radio")
    
    public static void AnadirEsferas2(){
        boolean error=true;
        do{
        try{
            esferas.add(new Esfera(Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"))));
            if (esferas.get(esferas.size()-1).getRadio()<0)
                throw new DatoIncorrecto();
            error=false;   
        }
        
        catch(NumberFormatException | NullPointerException e){
            JOptionPane.showMessageDialog(null,"El radio debe ser un número");
            error=true;
           
        }
        catch(DatoIncorrecto e){
            JOptionPane.showMessageDialog(null,"El radio debe ser positivo");
            esferas.remove(esferas.size()-1);
        }
        }
        while(error);
    }
    public static void MostrarValores(){
        Esfera objeto;
        for(int x=0;x<esferas.size();x++){
            objeto=esferas.get(x);
            JOptionPane.showMessageDialog(null,"La longitud de la circunferencia "+ (x+1) +" es "+ Math.round(objeto.getLongitud()) +"\n"
                    + "El area de la circunferencia " + (x+1) + " es "+Math.round(objeto.getArea())+"\n"
                    + "El volumen formado por la circunferencia " + (x+1) + " es "+Math.round(objeto.getVolumen()));
        }
    }
}
