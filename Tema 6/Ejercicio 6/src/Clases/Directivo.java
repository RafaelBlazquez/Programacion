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
public class Directivo extends Empleado {
    String categoria;
    private ArrayList<Empleado> listaEmpleadosDirectivo;
//Constructores

    public Directivo() {
    }

    
    public Directivo(String categoria) {
        this.categoria = categoria;
    }

    public Directivo(String categoria, double sueldoBruto) {
        super(sueldoBruto);
        this.categoria = categoria;
    }

    public Directivo(String categoria, double sueldoBruto, String nombre, int edad) {
        super(sueldoBruto, nombre, edad);
        this.categoria = categoria;
    }

    public Directivo(String categoria, ArrayList<Empleado> listaEmpleadosDirectivo, double sueldoBruto, String nombre, int edad) {
        super(sueldoBruto, nombre, edad);
        this.categoria = categoria;
        this.listaEmpleadosDirectivo = listaEmpleadosDirectivo;
    }
    
//Getter y Setter

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleadosDirectivo;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleadosDirectivo) {
        this.listaEmpleadosDirectivo = listaEmpleadosDirectivo;
    }
    
    
//Funciones

    @Override
    public String mostrar() {
        String mensaje="";
        for(int x=0; x<listaEmpleadosDirectivo.size(); x++){
            mensaje+= "\n       * "+listaEmpleadosDirectivo.get(x).getNombre();
        }
        return super.mostrar()+"\n   - Categoria=" + categoria+ "\n   - Empleados a su cargo "+ mensaje;
    }
    
    
}
