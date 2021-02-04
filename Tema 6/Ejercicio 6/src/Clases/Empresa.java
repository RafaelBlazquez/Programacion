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
public class Empresa {
    String nombre;
    private ArrayList<Empleado> listaEmpleadosEmpresa;
    private ArrayList<Cliente> listaClientesEmpresa;
//Constructores

    public Empresa() {
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Empresa(String nombre, ArrayList<Empleado> listaEmpleadosEmpresa, ArrayList<Cliente> listaClientesEmpresa) {
        this.nombre = nombre;
        this.listaEmpleadosEmpresa = listaEmpleadosEmpresa;
        this.listaClientesEmpresa = listaClientesEmpresa;
    }

   
//Getter & Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Empleado> getListaEmpleadosEmpresa() {
        return listaEmpleadosEmpresa;
    }

    public void setListaEmpleadosEmpresa(ArrayList<Empleado> listaEmpleadosEmpresa) {
        this.listaEmpleadosEmpresa = listaEmpleadosEmpresa;
    }
    
    public ArrayList<Cliente> getListaClienteEmpresa() {
        return listaClientesEmpresa;
    }

    public void setListaClientesEmpresa(ArrayList<Cliente> listaClientesEmpresa) {
        this.listaClientesEmpresa = listaClientesEmpresa;
    }
    
//Funciones   

    public String mostrar() {
        String empleados="";
        for(int x=0; x<listaEmpleadosEmpresa.size(); x++){
            empleados+= "\n       * "+listaEmpleadosEmpresa.get(x).getNombre();
        }
        String clientes="";
        for(int x=0; x<listaClientesEmpresa.size(); x++){
            clientes+= "\n       * "+listaClientesEmpresa.get(x).getNombre();
        }
        return nombre + " \n   - Empleados" + empleados +" \n   - Clientes" + clientes;
    }
    
    
    
}
