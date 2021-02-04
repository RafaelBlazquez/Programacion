/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_6_06;

import Clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author blagon
 */
public class Tema_6_06 {
    private static final ArrayList<Empresa> empresas = new ArrayList();
    private static final ArrayList<Cliente> clientes = new ArrayList();
    private static final ArrayList<Empleado> empleados = new ArrayList();
    //private static final ArrayList<Directivo> directivos = new ArrayList();
    
    
    public static void main(String[] args) {
        try{
            AnadirEmpresas();
            
            AnadirClientes();
            AnadirClientesEmpresa();
            
            AnadirEmpleados();
            AnadirDirectivos();
            AnadirEmpleadosEmpresa();
            
            
            AnadirEmpleadosDirectivo();
            
            MostrarEmpresas();
            MostrarClientes();
            MostrarEmpleados();
            MostrarDirectivos();
            
            MasSubordinados();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getClass());
        }
    }
    public static void AnadirEmpresas()throws Exception{
        Empresa e1 = new Empresa("Empresa 1");
        Empresa e2 = new Empresa("Empresa 2");
        Empresa e3 = new Empresa("Empresa 3");
        empresas.add(e1);
        empresas.add(e2);
        empresas.add(e3);
      
    }
    
    public static void AnadirClientes()throws Exception{
        Cliente c1 = new Cliente(numeroDeTelefono(),"Cliente 1",20);
        Cliente c2 = new Cliente(numeroDeTelefono(),"Cliente 2",22);
        Cliente c3 = new Cliente(numeroDeTelefono(),"Cliente 3",24);
        Cliente c4 = new Cliente(numeroDeTelefono(),"Cliente 4",26);
        Cliente c5 = new Cliente(numeroDeTelefono(),"Cliente 5",28);
        Cliente c6 = new Cliente(numeroDeTelefono(),"Cliente 6",32);
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);
    }
    public static void AnadirClientesEmpresa()throws Exception{
        ArrayList<Cliente> clientesEmpresa1 = new ArrayList();
        clientesEmpresa1.add(clientes.get(0));
        clientesEmpresa1.add(clientes.get(1));
        clientesEmpresa1.add(clientes.get(2));
        ArrayList<Cliente> clientesEmpresa2 = new ArrayList();
        clientesEmpresa2.add(clientes.get(3));
        clientesEmpresa2.add(clientes.get(4));
         ArrayList<Cliente> clientesEmpresa3= new ArrayList();
        clientesEmpresa3.add(clientes.get(5));
        
        empresas.get(0).setListaClientesEmpresa(clientesEmpresa1);
        empresas.get(1).setListaClientesEmpresa(clientesEmpresa2);        
        empresas.get(2).setListaClientesEmpresa(clientesEmpresa3);
    }
    
    public static void AnadirEmpleados()throws Exception{
        Directivo d1 = new Directivo("Tipo 1",2500,"Directivo 1",36);
        Directivo d2 = new Directivo("Tipo 1",2600,"Directivo 2",40);
        Directivo d3 = new Directivo("Tipo 1",2700,"Directivo 3",44);
        Empleado e1 = new Empleado(1500,"Empleado 1",20);
        Empleado e2 = new Empleado(1550,"Empleado 2",22);
        Empleado e3 = new Empleado(1600,"Empleado 3",24);
        Empleado e4 = new Empleado(1650,"Empleado 4",26);
        Empleado e5 = new Empleado(1700,"Empleado 5",28);
        Empleado e6 = new Empleado(1750,"Empleado 6",32);
        empleados.add(d1);
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(d2);
        empleados.add(e4);
        empleados.add(e5);
        empleados.add(d3);
        empleados.add(e6);
        
    }
    public static void AnadirDirectivos()throws Exception{
 
        //directivos.add(d1);
        //directivos.add(d2);
        //directivos.add(d3);
    }
    public static void AnadirEmpleadosEmpresa()throws Exception{
        ArrayList<Empleado> empleadosEmpresa1 = new ArrayList();
            empleadosEmpresa1.add(empleados.get(0)); 
            empleadosEmpresa1.add(empleados.get(1));
            empleadosEmpresa1.add(empleados.get(2));
            empleadosEmpresa1.add(empleados.get(3));
        ArrayList<Empleado> empleadosEmpresa2 = new ArrayList();
            empleadosEmpresa2.add(empleados.get(4)); 
            empleadosEmpresa2.add(empleados.get(5));
            empleadosEmpresa2.add(empleados.get(6));
        ArrayList<Empleado> empleadosEmpresa3= new ArrayList();
            empleadosEmpresa3.add(empleados.get(7)); 
            empleadosEmpresa3.add(empleados.get(8));
        
        empresas.get(0).setListaEmpleadosEmpresa(empleadosEmpresa1);
        empresas.get(1).setListaEmpleadosEmpresa(empleadosEmpresa2);
        empresas.get(2).setListaEmpleadosEmpresa(empleadosEmpresa3);
    }
    
   
    public static void CrearSubordinados()throws Exception{
        ArrayList<Empleado> subordinados1 = new ArrayList();
            subordinados1.add(empleados.get(1));
            subordinados1.add(empleados.get(2));
            subordinados1.add(empleados.get(3));
        ArrayList<Empleado> subordinados2 = new ArrayList();
            subordinados2.add(empleados.get(5));
            subordinados2.add(empleados.get(6));
        ArrayList<Empleado> subordinados3 = new ArrayList();
            subordinados3.add(empleados.get(8));
        
        directivos.get(0).setListaEmpleados(subordinados1);
        directivos.get(1).setListaEmpleados(subordinados2);
        directivos.get(2).setListaEmpleados(subordinados3);
     }

    
    public static void MostrarEmpresas()throws Exception{
        String mensaje="";
        for (int x =0; x<empresas.size(); x++)
            mensaje+= empresas.get(x).mostrar()+"\n";
        JOptionPane.showMessageDialog(null,mensaje);
    }
    public static void MostrarClientes()throws Exception{
        String mensaje="";
        for (int x =0; x<clientes.size(); x++)
            mensaje+= clientes.get(x).mostrar()+"\n";
        JOptionPane.showMessageDialog(null,mensaje);
    }    
    public static void MostrarEmpleados()throws Exception{
        String mensaje="";
        for (int x =0; x<empleados.size(); x++)
            mensaje+= empleados.get(x).mostrar()+"\n";
        JOptionPane.showMessageDialog(null,mensaje);
    }   
    public static void MostrarDirectivos()throws Exception{
        String mensaje="";
        for (int x =0; x<directivos.size(); x++)
            mensaje+= directivos.get(x).mostrar()+"\n";
        JOptionPane.showMessageDialog(null,mensaje);
    }
    
    public static void MasSubordinados()throws Exception{
        int subordinados=0;
        Directivo masSubordinados= new Directivo();
        for (int x =0; x<directivos.size(); x++)
            if (directivos.get(x).getListaEmpleados().size()>subordinados){
                subordinados=directivos.get(x).getListaEmpleados().size();
                masSubordinados= directivos.get(x);
            }    
        JOptionPane.showMessageDialog(null, "El directivo con más subordinados es "+ masSubordinados.getNombre()+"\n"+ masSubordinados.mostrar());
    }
    
    public static String numeroDeTelefono()throws Exception{
        String numeroDeTelefono="9";
        numeroDeTelefono+= Math.round(Math.random()*100000000);
        return numeroDeTelefono;
    }
}
