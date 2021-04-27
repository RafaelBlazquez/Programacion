/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import UML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author leora
 */
public class PersonaDAO {
    private static Connection con;
    private PersonaDAO pDAO;

    public PersonaDAO(Connection con) {
        this.con = con;
    } 
    public static void anadirPersona(Persona p) throws Exception{
        String plantilla1 = "insert into personas (nombre,apellido,email,usuario,contrasena)values (?,?,?,?,?)";
        int n;
        try (PreparedStatement ps = con.prepareStatement(plantilla1)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getApellido());
            ps.setString(3, p.getEmail());
            ps.setString(4, p.getUsuario());
            ps.setString(5, p.getContrasena());
            n = ps.executeUpdate();
        }
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        
    }
    public static Persona buscarPersona(String usuario) throws SQLException{
     String plantilla = "select * from personas where usuario = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, usuario);

      ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next())
       {
           // Crear objeto
           Persona p = new Persona();
           // resultado.get para coger el contenido de la columna dni
           p.setNombre(resultado.getString("nombre"));
           p.setApellido(resultado.getString("apellido"));
           p.setEmail(resultado.getString("email"));
           p.setUsuario(resultado.getString("usuario"));
           p.setContrasena(resultado.getString("contrasena"));
           return p;
       }
       else
           // No hay nadie con ese dni
           return null;
    }
    
       
    
}
