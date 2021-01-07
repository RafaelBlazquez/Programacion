/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_6_03;

import Clases.Persona;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author blagon
 */
public class Tema_6_03 {

    public static ArrayList<Persona> personas = new ArrayList();
    public static ArrayList<LocalDate> fechas = new ArrayList();
    
    public static void main(String[] args) {
        try{
            int continuar=0;
            do 
            {  
               AnadirPersona();
               continuar=JOptionPane.showConfirmDialog(null, "Quieres introducir otra Persona?");
            }
            while (continuar==0);
            MasMayor();
            Elchesinos();
            MayorDeEdad();
        }
        catch(Exception e){}
    }
    
    public static void AnadirPersona() throws Exception{
               String nombre = Asignar("nombre");
               int dNacimiento = Integer.parseInt(Asignar("dia de nacimiento"));
               int mNacimiento = Integer.parseInt(Asignar("mes de nacimiento"));
               int aNacimiento = Integer.parseInt(Asignar("ano de nacimiento"));
               String direccion = Asignar("direccion");
               String codigoPostal = Asignar("codigo postal");
               String ciudad = Asignar("ciudad");
               personas.add(new Persona(nombre,dNacimiento,mNacimiento,aNacimiento,direccion,codigoPostal,ciudad));
               FechaNacimiento(dNacimiento,mNacimiento,aNacimiento);
    }
    public static String Asignar(String pregunta) throws Exception{
        String respuesta=(JOptionPane.showInputDialog("Introduce "+pregunta));
        return respuesta;
    }
    public static void FechaNacimiento(int dia,int mes, int ano) throws Exception{
        LocalDate fechaNacimiento= LocalDate.of(ano,mes,dia);
        fechas.add(fechaNacimiento);
    }
    public static void MasMayor() throws Exception{
        LocalDate fechaMayor= LocalDate.now();
        for (int x=0; x<personas.size();x++)
            if (fechas.get(x).isBefore(fechaMayor)){
                fechaMayor=fechas.get(x);
            }
        int posicion = fechas.indexOf(fechaMayor);
        JOptionPane.showMessageDialog(null, "La persona más mayor es "+ personas.get(posicion).getNombre());
    }
    public static void Elchesinos()throws Exception{
        ArrayList<String> Elchesinos = new ArrayList();
        String mensaje="";
        for (int y=0; y<personas.size(); y++)
            if (personas.get(y).getCiudad().equalsIgnoreCase("Elche")){
                Elchesinos.add(personas.get(y).getNombre());
                mensaje=mensaje+"\n"+ Elchesinos.get(y);
            }
        JOptionPane.showMessageDialog(null,"Personas que viven en Elche :"+mensaje);
    }
    public static void MayorDeEdad()throws Exception{
        ArrayList<String> MayoresDeEdad = new ArrayList();
        String mensaje="";
        for (int y=0; y<personas.size(); y++)
            if ((LocalDate.now()).compareTo(fechas.get(y))>18){
                MayoresDeEdad.add(personas.get(y).getNombre());
                mensaje=mensaje+"\n"+ MayoresDeEdad.get(y);
            }
        JOptionPane.showMessageDialog(null,"Personas mayores de edad :"+mensaje);
    }
    
}
