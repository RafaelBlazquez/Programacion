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
    public static Cliente buscaUno(String posicion, String palabra) throws Exception{
        Cliente cl = new Cliente();
        String condicion = posicion + "= '" + palabra + "'";
        String plantilla = "select * from clientes where " + condicion;
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ResultSet resultado= ps.executeQuery();
            if (resultado.next()){
                cl.setDni(resultado.getString("dni"));
                cl.setNombre(resultado.getString("nombre"));
                cl.setApellidos(resultado.getString("apellidos"));
                cl.setDireccion(resultado.getString("direccion"));
                cl.setTelefono(resultado.getString("telefono"));
                cl.setEmail(resultado.getString("email"));
            }
            else{
                System.out.println("No encontrado");
            }
        }
        return cl;
    }
    public static void eliminarPersona(Cliente cl) throws Exception{
        System.out.println("tomaa");
//        String plantilla = "insert into clientes values (?,?,?,?,?,?)";
//        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
//            ps.setString(1, cl.getDni());
//            ps.setString(2, cl.getNombre());
//            ps.setString(3, cl.getApellidos());
//            ps.setString(4, cl.getDireccion());
//            ps.setString(5, cl.getTelefono());
//            ps.setString(6, cl.getEmail());
//            int n = ps.executeUpdate();
//            System.out.println( n + " filas insertadas");
//        }
    }
    
}
