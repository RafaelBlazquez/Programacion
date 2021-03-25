/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import UML.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author leora
 */
public class ClienteDAO {
    private static Connection con;
    
    public ClienteDAO (Connection con) {
        this.con = con;
    }
    
    public static void anadirPersona(Cliente cl) throws Exception{
        String plantilla = "insert into clientes values (?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, cl.getDni());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getApellidos());
            ps.setString(4, cl.getDireccion());
            ps.setString(5, cl.getTelefono());
            ps.setString(6, cl.getEmail());
            int n = ps.executeUpdate();
            System.out.println( n + " filas insertadas");
        }
    }
    
    public static ArrayList<Cliente> buscaUno(String posicion, String palabra) throws Exception{
        ArrayList<Cliente> clientes = new ArrayList();
        Cliente cl = new Cliente();
        int contador=0;
        String plantilla = "select * from clientes where " + posicion +"=?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, palabra);
            ResultSet resultado= ps.executeQuery();
            while (resultado.next()){
                cl.setDni(resultado.getString("dni"));
                cl.setNombre(resultado.getString("nombre"));
                cl.setApellidos(resultado.getString("apellidos"));
                cl.setDireccion(resultado.getString("direccion"));
                cl.setTelefono(resultado.getString("telefono"));
                cl.setEmail(resultado.getString("email"));
                contador +=1;
                clientes.add(cl);
            }
            if(contador ==0){
                System.out.println("No encontrado");
            }
            System.out.println(contador);
        }
        return clientes;
    }
    
    public static ArrayList<Cliente> buscarTodos(String posicion,String palabra) throws SQLException{
    
    ArrayList<Cliente> clientes = new ArrayList();
        String plantilla = "select * from clientes where " + posicion +"=?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, palabra);
            ResultSet resultado= ps.executeQuery();
            while (resultado.next()){
                Cliente cl = new Cliente();
                cl.setDni(resultado.getString("dni"));
                cl.setNombre(resultado.getString("nombre"));
                cl.setApellidos(resultado.getString("apellidos"));
                cl.setDireccion(resultado.getString("direccion"));
                cl.setTelefono(resultado.getString("telefono"));
                cl.setEmail(resultado.getString("email"));
                clientes.add(cl);
            }
        }
    return clientes;
    }
    public static ArrayList<Cliente> buscarTodos() throws SQLException{
    
    ArrayList<Cliente> clientes = new ArrayList();
        String plantilla = "select * from clientes";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ResultSet resultado= ps.executeQuery();
            while (resultado.next()){
                Cliente cl = new Cliente();
                cl.setDni(resultado.getString("dni"));
                cl.setNombre(resultado.getString("nombre"));
                cl.setApellidos(resultado.getString("apellidos"));
                cl.setDireccion(resultado.getString("direccion"));
                cl.setTelefono(resultado.getString("telefono"));
                cl.setEmail(resultado.getString("email"));
                clientes.add(cl);
            }
        }
    return clientes;
    }
    public static void eliminarPersona(Cliente cl) throws Exception{
        
        String plantilla = "delete from clientes where dni= ?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, cl.getDni());
            int n = ps.executeUpdate();
            System.out.println( n + " filas eliminadas");
        }
    }
    
    public static void modificarPersona(String dniAntiguo,Cliente cl) throws Exception{
        String plantilla = "update clientes set dni = ?, nombre = ?, apellidos = ?, direccion=?, telefono=?, email=? where dni=?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, cl.getDni());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getApellidos());
            ps.setString(4, cl.getDireccion());
            ps.setString(5, cl.getTelefono());
            ps.setString(6, cl.getEmail());
            ps.setString(7, dniAntiguo);
            int n = ps.executeUpdate();
            System.out.println( n + " filas actualizadas");
        }
    }
    
}
