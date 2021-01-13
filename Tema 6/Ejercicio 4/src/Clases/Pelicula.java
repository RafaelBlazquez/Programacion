/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author blagon
 */
public class Pelicula {
    private String titulo ;
    private int ano;
    private float duracion;
    private String tipo;
    private ArrayList<Estudio> listaEstudios;
//Constructores
    //Constructor vacío
    public Pelicula() {
    }
    //Constructor semi-lleno
    public Pelicula(String titulo, int ano, float duracion) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracion = duracion;
    }
    //Constructor lleno

    public Pelicula(String titulo, int ano, float duracion, String tipo, ArrayList<Estudio> estudio) {
        this.titulo = titulo;
        this.ano = ano;
        this.duracion = duracion;
        this.tipo = tipo;
        this.listaEstudios= new ArrayList();
    }
    
//Getter & Setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }    

    public ArrayList<Estudio> getListaEstudios() {
        return listaEstudios;
    }

    public void setListaEstudios(ArrayList<Estudio> listaEstudios) {
        this.listaEstudios = listaEstudios;
    }

    
//Funciones añadidas
    public void ModificaPelicula(){
    
    }
    
    public void DespliegaPelicula(){
    
    }
    
    public void EliminaPelicula(){
    
    }
    
}
