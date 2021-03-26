/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import UML.Abogado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author leora
 */
public class AbogadoDAO {
    private static Connection con;
    
    public AbogadoDAO (Connection con) {
        this.con = con;
    }
    
    public static void anadirAbogado(Abogado ab) throws Exception{
        String plantilla = "insert into abogados values (?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, ab.getDni());
            ps.setString(2, ab.getNombre());
            ps.setString(3, ab.getApellidos());
            ps.setString(4, ab.getDireccion());
            int n = ps.executeUpdate();
            System.out.println( n + " filas insertadas");
        }
    }
    
    public static ArrayList<Abogado> buscaUno(String posicion, String palabra) throws Exception{
        ArrayList<Abogado> abogados = new ArrayList();
        Abogado ab = new Abogado();
        int contador=0;
        String plantilla = "select * from abogados where " + posicion +"=?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, palabra);
            ResultSet resultado= ps.executeQuery();
            while (resultado.next()){
                ab.setDni(resultado.getString("dni"));
                ab.setNombre(resultado.getString("nombre"));
                ab.setApellidos(resultado.getString("apellidos"));
                ab.setDireccion(resultado.getString("direccion"));
                
                contador +=1;
                abogados.add(ab);
            }
            if(contador ==0){
                System.out.println("No encontrado");
            }
            System.out.println(contador);
        }
        return abogados;
    }
    
    public static ArrayList<Abogado> buscarTodos(String posicion,String palabra) throws SQLException{
    
    ArrayList<Abogado> abogados = new ArrayList();
        String plantilla = "select * from abogados where " + posicion +"=?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, palabra);
            ResultSet resultado= ps.executeQuery();
            while (resultado.next()){
                Abogado ab = new Abogado();
                ab.setDni(resultado.getString("dni"));
                ab.setNombre(resultado.getString("nombre"));
                ab.setApellidos(resultado.getString("apellidos"));
                ab.setDireccion(resultado.getString("direccion"));
                abogados.add(ab);
            }
        }
    return abogados;
    }
    public static ArrayList<Abogado> buscarTodos() throws SQLException{
    
    ArrayList<Abogado> abogados = new ArrayList();
        String plantilla = "select * from abogados";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ResultSet resultado= ps.executeQuery();
            while (resultado.next()){
                Abogado ab = new Abogado();
                ab.setDni(resultado.getString("dni"));
                ab.setNombre(resultado.getString("nombre"));
                ab.setApellidos(resultado.getString("apellidos"));
                ab.setDireccion(resultado.getString("direccion"));
               
                abogados.add(ab);
            }
        }
    return abogados;
    }
    public static void eliminarAbogado(Abogado ab) throws Exception{
        
        String plantilla = "delete from abogados where dni= ?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, ab.getDni());
            int n = ps.executeUpdate();
            System.out.println( n + " filas eliminadas");
        }
    }
    
    public static void modificarAbogado(String dniAntiguo,Abogado ab) throws Exception{
        String plantilla = "update abogados set dni = ?, nombre = ?, apellidos = ?, direccion=? where dni=?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, ab.getDni());
            ps.setString(2, ab.getNombre());
            ps.setString(3, ab.getApellidos());
            ps.setString(4, ab.getDireccion());
            
            ps.setString(7, dniAntiguo);
            int n = ps.executeUpdate();
            System.out.println( n + " filas actualizadas");
        }
    }
    
}
