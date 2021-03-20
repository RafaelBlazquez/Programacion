/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import UML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author leora
 */
public class PersonaDAO {
    private static Connection con;
     public PersonaDAO (Connection con){
        this.con = con;
    }
    
    public static void anadirUno(String dni, String nombre) throws SQLException{
        Persona p = new Persona();
        String plantilla = "insert into personas values (?,?)";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){ 
            ps.setString(1, dni);
            ps.setString(2, nombre);
            int n = ps.executeUpdate();
            System.out.println( n + " filas insertadas");
        }
    }
}
