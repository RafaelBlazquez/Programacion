/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_6_04;

import Clases.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author blagon
 */
public class Tema_6_04 {
    
    private static ArrayList<Pelicula> listaPeliculas;
    private static ArrayList<Estudio> listaEstudios;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Estudio e1 =AnadirEstudio1();
            Estudio e2 =AnadirEstudio2();
            
            Pelicula p1 =AnadirPelicula1();
            Pelicula p2 =AnadirPelicula2();
            Pelicula p3 =AnadirPelicula3();
            
            ArrayList<Estudio> listaEstudios0 = new ArrayList();
                listaEstudios0.add(e1);
                listaEstudios0.add(e2);
       
            ArrayList<Estudio> listaEstudios1 = new ArrayList();
                listaEstudios1.add(e1);
                
        //    ArrayList<Estudio> listaEstudios2 = new ArrayList();
        //        listaEstudios2.add(e2);

            p1.setListaEstudios(listaEstudios0);
                  
            p2.setListaEstudios(listaEstudios1);

            p3.setListaEstudios(listaEstudios1);

            listaPeliculas = new ArrayList();
            listaEstudios = new ArrayList();
            listaPeliculas.add(p1);
            listaPeliculas.add(p2);
            listaPeliculas.add(p3);
            listaEstudios.add(e1);
            listaEstudios.add(e2);

            String peliculas = mensajePeliculas();
            String estudios = mensajeEstudios();
            JOptionPane.showMessageDialog(null, "La lista de peliculas es\n"+peliculas);
            JOptionPane.showMessageDialog(null, "La lista de estudios es\n"+estudios);
            PeliculaLarga();
            MasPeliculas();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getClass());
        }
    }
    public static Estudio AnadirEstudio1() throws Exception{
        Estudio e1=new Estudio();
            e1.setNombre("Pixar");
            e1.setCiudad("Hawaii");
            e1.setDireccion("C/ Estudios Pixar");
            e1.setDirWeb("www.pixar.com");
            e1.setFechaFundacion(LocalDate.of(1990,06,21));
            e1.setPais("EEUU");
            ArrayList<String> listaTelefonosPixar = new ArrayList();
                listaTelefonosPixar.add("900900900");
                listaTelefonosPixar.add("900900800");
                listaTelefonosPixar.add("900900700");
            e1.setTelefonos(listaTelefonosPixar);
            return e1;
    }
    
    public static Estudio AnadirEstudio2() throws Exception{
        Estudio e2=new Estudio();
            e2.setNombre("Walt Disney");
            e2.setCiudad("California");
            e2.setDireccion("C/ Estudios Walt Disney");
            e2.setDirWeb("www.waltdisney.com");
            e2.setFechaFundacion(LocalDate.of(1990,01,06));
            e2.setPais("EEUU");
            ArrayList<String> listaTelefonosDisney = new ArrayList();
                listaTelefonosDisney.add("900800900");
                listaTelefonosDisney.add("900800800");
                listaTelefonosDisney.add("900800700");
            e2.setTelefonos(listaTelefonosDisney);   
            return e2;
    }
    
    public static Pelicula AnadirPelicula1() throws Exception{
        Pelicula p1=new Pelicula();
            p1.setTitulo("Madagascar");
            p1.setAno(1999);
            p1.setDuracion(120);
            p1.setTipo("Comedia");    
        return p1;
    }
    
    public static Pelicula AnadirPelicula2() throws Exception{
        Pelicula p2=new Pelicula("Los Increibles",2001,110);
        return p2;
    }
    
    public static Pelicula AnadirPelicula3() throws Exception{
        Pelicula p3=new Pelicula("Terminator",1994,130);
        return p3;
    }
    public static String mensajePeliculas()throws Exception{
        String mensaje="";
        int x;
        for (x=0; x<listaPeliculas.size();x++){
            mensaje+= "  - "+listaPeliculas.get(x).getTitulo()+"\n";
        }
        return mensaje;
    }
    public static String mensajeEstudios()throws Exception{
        String mensaje="";
        int x;
        for (x=0; x<listaEstudios.size();x++){
            mensaje+= "  - "+listaEstudios.get(x).getNombre()+"\n";
        }
        return mensaje;
    }
    public static void PeliculaLarga()throws Exception{
        float maxDuracion=0;
        int maxPelicula=0;
        String peliculaLarga = "";
        for (int x=0; x<listaPeliculas.size();x++)
            if (maxDuracion > listaPeliculas.get(x).getDuracion()){
                maxDuracion = listaPeliculas.get(x).getDuracion();
                maxPelicula = x;
            }
        for (int y=0; y<listaPeliculas.get(maxPelicula).getListaEstudios().size();y++){
            peliculaLarga+= "\n  - "+listaPeliculas.get(maxPelicula).getListaEstudios().get(y).getNombre();
        }
        JOptionPane.showMessageDialog(null, "Los estudios que han producido la película de más duración ("+listaPeliculas.get(maxPelicula).getTitulo()+" "+ listaPeliculas.get(maxPelicula).getDuracion()+"min) son: " + peliculaLarga);
    }
    public static void MasPeliculas() throws Exception{
        int estudiosParalelos[]= new int[listaEstudios.size()]; 
        for (int y=0 ; y<listaEstudios.size() ; y++){
            for (int x=0 ; x<listaPeliculas.size() ; x++){
                for (int z=0 ; z<listaPeliculas.get(x).getListaEstudios().size() ; z++){
                    if (listaEstudios.get(y).getNombre().equals(listaPeliculas.get(x).getListaEstudios().get(z).getNombre()))
                        estudiosParalelos[y]++;
                }
            }
        }
        int ymax=0;
        Estudio estudioMax=null;
        for (int y=0; y<estudiosParalelos.length;y++){
            if (estudiosParalelos[y] > ymax){
                estudioMax= listaEstudios.get(y);
                ymax= estudiosParalelos[y];
            }
        }
        JOptionPane.showMessageDialog(null,"El estudio que mas películas ha producido es: " + estudioMax.getNombre() );
    }
}
