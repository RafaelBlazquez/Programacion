/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_7_5_01;

import UML.*;
import Vista.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author leora
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Contrato> lContratos = new ArrayList();
    public static ArrayList<Departamento> lDepartamentos = new ArrayList();
    public static ArrayList<Empleado> lEmpleados = new ArrayList();
    public static ArrayList<EPersonal> lEmpleadosPersonal = new ArrayList();
    public static vInicial v1 ;
    public static vEleccion v2 ;
    public static vABM v3 ;
    public static vListado v4 ;
    
    public static void main(String[] args) {   
        generarDatos();
        v1 = new vInicial();
        v1.setVisible(true);
    }
    public static void generarDatos(){
        Contrato c1 = new Contrato("indefinido");
        Contrato c2 = new Contrato("temporal");
        Contrato c3 = new Contrato("becario");
        lContratos.add(c1);
        lContratos.add(c2);
        lContratos.add(c3);
        
        Departamento d1 = new Departamento("personal");
        Departamento d2= new Departamento("residuos");
        Departamento d3 = new Departamento("jefatura");
        lDepartamentos.add(d1);
        lDepartamentos.add(d2);
        lDepartamentos.add(d3);
        
        Empleado e1 = new Empleado("12345678Z","01010","nUno","C/Locura","900124578",true,true,lContratos.get(0),lDepartamentos.get(0), LocalDate.now(), "001");
        lEmpleados.add(e1);
        
        EPersonal ep1 = new EPersonal("usuario","contrasena","12345678Z","01010","nUno","C/Locura","900124578",true,true,lContratos.get(0),lDepartamentos.get(0), LocalDate.now(), "001");
        lEmpleadosPersonal.add(ep1);
    }
    public static void aceptar(String usuario, String contrasena){
        boolean existe;
        boolean es;
        int x;
        for(x=0; x<lEmpleadosPersonal.size() && !usuario.equals(lEmpleadosPersonal.get(x).getUsuario());x++){}
        if( x<lEmpleadosPersonal.size()){
            if (contrasena.equals(lEmpleadosPersonal.get(x).getContrasena()))
                v1.eresTu();
            else{
                v1.noEresTu(); 
            }       
        }
        else{
           v1.noEresTu(); 
        }
    }
    public static void salir(){
        v1.dispose();
        System.exit(0);
    }
    public static void iniciarSesion(){
        v1.dispose();
        v2 = new vEleccion();
        v2.setVisible(true);
    }
    public static void alta() {
        v2.dispose();
        if(v4!=null){
            v4.dispose();
        }
        v3 = new vABM();
        v3.setVisible(true);
    }
     public static void baja() {
        v2.dispose();
        if(v4!=null){
            v4.dispose();
        }
        v3 = new vABM();
        v3.setVisible(true);
    }

    public static void modificar() {
        v2.dispose();
        if(v4!=null){
            v4.dispose();
        }
        v3 = new vABM();
        v3.setVisible(true);
    }
    public static void listado() {
        v2.dispose();
        if(v3!=null){
            v3.dispose();
        }
        v4 = new vListado();
        v4.setVisible(true);
    }

   
}
 