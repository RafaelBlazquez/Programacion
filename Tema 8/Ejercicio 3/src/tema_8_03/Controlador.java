/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_8_03;

import ModeloBD.*;
import UML.*;
import Vista.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author leora
 */
public class Controlador {

    /**
     * PERSONA (HERENCIA A CLIENTE Y ABOGADO) 
     * TABLAS
     * CLIENTE
     * CASO (DNI)
     * ABOGADO
     * ABOGADOCASO
     * JUICIO (IDCASO) // CASOJUICIO
     * CASO (IDJUICIO) // CASOJUICIO
     */
    public static BaseDatos bd;
    
    public static VMenu v1;
    public static VCliente v2;
        public static ClienteDAO clDAO;
        public static Cliente cl;
        public static AbogadoDAO abDAO;
        public static Abogado ab;
    public static VAbogado v3;
    public static VCaso v4;
    
    public static int protagonistaS;
    public static int accionS;
    public static String dniAntiguo;
    public static  ArrayList<Cliente> clientes;
     public static  ArrayList<Abogado> abogados;
   
    public static void main(String[] args) {
        try{
            bd = new BaseDatos();
            bd.conectar();
            clDAO = new ClienteDAO(bd.getCon());
            abDAO = new AbogadoDAO(bd.getCon());
            v1= new VMenu();
            v1.setVisible(true);   
        }
        catch(Exception e){
            System.out.println(e.getMessage()+e.getClass());
        }
    }
    
    public static void toma(int accion, int protagonista) throws SQLException{
        protagonistaS= protagonista;
        accionS = accion;
        int cantidad=0;
        switch(protagonista){
            case 1:
                v1.dispose();
                if (accionS !=1){
                    clientes= ClienteDAO.buscarTodos();
                    cantidad = clientes.size();
                }
                v2= new VCliente(accion); 
                v2.ten(cantidad);
                v2.setVisible(true);
                break;
            case 2:
                v1.dispose();
                if (accionS !=1){
                    abogados= AbogadoDAO.buscarTodos();
                    cantidad = abogados.size();
                }
                v3= new VAbogado(accion);
                v3.ten(cantidad);
                v3.setVisible(true);
                break;
            case 3:
                v1.dispose();
                v4= new VCaso(accion);
                v4.setVisible(true);
                break;
        }
    }
    
    public static void datosCliente(String dni, String nombre, String apellidos, String direccion, String telefono, String email) throws Exception{
        cl = new Cliente(dni,nombre,apellidos,direccion,telefono,email);
        switch (accionS){
            case 1:
                ClienteDAO.anadirCliente(cl);
                break;
            case 2:
                ClienteDAO.eliminarCliente(cl);
                break;
            case 3:
                ClienteDAO.modificarCliente(dniAntiguo,cl);
            
                
            break;    
        }
            v2.dispose();
            v1 = new VMenu();
            v1.setVisible(true);
    }
    public static void datosAbogado(String dni, String nombre, String apellidos, String direccion) throws Exception{
        ab = new Abogado(dni,nombre,apellidos,direccion);
        switch (accionS){
            case 1:
                AbogadoDAO.anadirAbogado(ab);
                break;
            case 2:
                AbogadoDAO.eliminarAbogado(ab);
                break;
            case 3:
                AbogadoDAO.modificarAbogado(dniAntiguo,ab);
            
                
            break;    
        }
            v3.dispose();
            v1 = new VMenu();
            v1.setVisible(true);
    }
    
    public static boolean buscaUno(String posicion, String palabra) throws Exception{
        boolean encontrado=false;
        String dni;
        String nombre;
        String apellidos;
        String direccion;
        String telefono;
        String email;
        int cantidad;
        clientes = ClienteDAO.buscarTodos(posicion,palabra);
        cantidad = clientes.size();
            cl= clientes.get(0);
            if (cl.getDni()!=null){
                dni = cl.getDni();
                dniAntiguo = dni;
                nombre = cl.getNombre();
                apellidos = cl.getApellidos();
                direccion = cl.getDireccion();
                telefono = cl.getTelefono();
                email = cl.getEmail();            
                v2.dameDatos(cantidad,dni, nombre, apellidos, direccion, telefono, email);
                encontrado = true;
            }
        return encontrado;
    }
    public static boolean buscaUnoAb(String posicion, String palabra) throws Exception{
        boolean encontrado=false;
        String dni;
        String nombre;
        String apellidos;
        String direccion;
        int cantidad;
        abogados =AbogadoDAO.buscarTodos(posicion,palabra);
        cantidad = abogados.size();
            ab= abogados.get(0);
            if (ab.getDni()!=null){
                dni = ab.getDni();
                dniAntiguo = dni;
                nombre = ab.getNombre();
                apellidos = ab.getApellidos();
                direccion = ab.getDireccion();          
                v3.dameDatos(cantidad,dni, nombre, apellidos, direccion);
                encontrado = true;
            }
        return encontrado;
    }
    
    public static ArrayList<String> rellenarDatos(int contador){
        ArrayList<String> datosUno = new ArrayList();
        String palabra ;
            
            palabra = clientes.get(contador).getDni();
            datosUno.add(palabra);
            palabra = clientes.get(contador).getNombre();
            datosUno.add(palabra);
            palabra = clientes.get(contador).getApellidos();
            datosUno.add(palabra);
            palabra = clientes.get(contador).getDireccion();
            datosUno.add(palabra);
            palabra = clientes.get(contador).getTelefono();
            datosUno.add(palabra);
            palabra = clientes.get(contador).getEmail();
            datosUno.add(palabra);
        return datosUno;
    }
    public static ArrayList<String> rellenarDatosAb(int contador){
        ArrayList<String> datosUno = new ArrayList();
        String palabra ;
            
            palabra = abogados.get(contador).getDni();
            datosUno.add(palabra);
            palabra = abogados.get(contador).getNombre();
            datosUno.add(palabra);
            palabra = abogados.get(contador).getApellidos();
            datosUno.add(palabra);
            palabra = abogados.get(contador).getDireccion();
            datosUno.add(palabra);
        return datosUno;
    }
    
    public static void cancelar(){
        switch (protagonistaS){
            case 1:
                v2.dispose();
                v1.setVisible(true);
                break;
            case 2:
                v3.dispose();
                v1.setVisible(true);
                break;
            case 3:
                v4.dispose();
                v1.setVisible(true);
                break;
        }
    }
    
    public static void salir(){
        v1.dispose();
        System.exit(0);
    }
        
}
