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
import java.util.ArrayList;
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
        String plantilla1 = "insert into persona values (?,?,?,?)";
        int n;
        try (PreparedStatement ps = con.prepareStatement(plantilla1)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, String.valueOf(p.getEdad()));
            ps.setString(3, p.getProfesion());
            ps.setString(4, p.getTelefono());
            n = ps.executeUpdate();
        }
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        
        
    }
    
    public Persona consulta(String nombre) throws Exception {
        String plantilla = "select * from persona where nombre = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, nombre);
        
     // executeQuery NO update
      ResultSet resultado = ps.executeQuery();
      // resultado es una fila o nada..
       if (resultado.next())
       {
           // Crear objeto
           Persona p = new Persona();
           // resultado.get para coger el contenido de la columna dni
           p.setNombre(resultado.getString("nombre"));
           p.setEdad(resultado.getInt("edad"));
           p.setProfesion(resultado.getString("profesion"));
           p.setTelefono(resultado.getString("telefono"));
           return p;
       }
       else
           // No hay nadie con ese dni
           return null;
    }
    public static ArrayList<Persona> pedirPersonas() throws Exception{
        ArrayList<Persona> personas = new ArrayList();
        String plantilla = "select * from persona;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ResultSet resultado = ps.executeQuery();
        while(resultado.next()){
            Persona p = new Persona();
            p.setNombre(resultado.getString("nombre"));
            p.setEdad(resultado.getInt("edad"));
            p.setProfesion(resultado.getString("profesion"));
            p.setTelefono(resultado.getString("telefono"));
            personas.add(p);
        }
        return personas;
    }
}
