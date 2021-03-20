/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import UML.Acontecimiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author leora
 */
public class AcontecimientoDAO {
    private static Connection con;

    /**
     *
     * @return 
     * @throws java.sql.SQLException
     */
    public static ArrayList<String> dameTodos() throws SQLException, Exception {
        ArrayList<String> nombres = new ArrayList();
        String plantilla = "select nombre from acontecimientos";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){           
            ResultSet resultado = ps.executeQuery();
            
            while (resultado.next())
            {
                String nombre = resultado.getString("nombre");
                nombres.add(nombre);
            }
            if (resultado == null){
                return null;
            }
        }
        return nombres;
    }
    
    public static Acontecimiento dameUno(String elegido) throws SQLException, Exception {
        Acontecimiento ac = new Acontecimiento();
        String plantilla = "select * from acontecimientos where nombre= ?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){    
            ps.setString(1, elegido);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next())
            {
                ac.setNombre(resultado.getString("nombre"));
                ac.setLugar(resultado.getString("lugar"));
                ac.setFecha(resultado.getDate("fecha").toLocalDate());
                ac.setHoraInicio(resultado.getTime("HoraInicio").toString());
                ac.setHoraFin(resultado.getTime("HoraFin").toString());
                ac.setInvitados(resultado.getInt("Asistentes"));
            }
        }
        return ac;
    }

    public static void actualizarUno(Acontecimiento ac) throws SQLException {
       String plantilla = "update acontecimientos set Asistentes= ? where nombre= ?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){    
            ps.setInt(1, Integer.parseInt(ac.getInvitados()+""));
            ps.setString(2, ac.getNombre());
            int n = ps.executeUpdate();
            System.out.println( n + " filas actualizadas");
        }
       
    }

    public static void borraUno(String elegido) throws SQLException {
        String plantilla = "delete from acontecimientos where nombre = ?";
        try (PreparedStatement ps = con.prepareStatement(plantilla)){    
            ps.setString(1, elegido);
            int n = ps.executeUpdate();
            System.out.println( n + " filas borradas");
        }
    }

    private AcontecimientoDAO acDAO;
   
    private static Date conversionDate(LocalDate fecha) {
            return java.sql.Date.valueOf(fecha);
    }

    private static Time conversionTime(String horaInicio) {
            return java.sql.Time.valueOf(horaInicio);
    }
    
    public AcontecimientoDAO (Connection con){
        this.con = con;
    }
    
    public static void anadirAcontecimiento(Acontecimiento ac) throws Exception{
        String plantilla = "insert into acontecimientos values (?,?,?,?,?,?)";
        int n;
        try (PreparedStatement ps = con.prepareStatement(plantilla)){
            ps.setString(1, ac.getNombre());
            ps.setString(2, ac.getLugar());
            ps.setDate(3, conversionDate(ac.getFecha()));
            ps.setTime(4, conversionTime(ac.getHoraInicio()));
            ps.setTime(5, conversionTime(ac.getHoraFin()));
            ps.setInt(6, ac.getInvitados());
            n = ps.executeUpdate();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
        }
    }
}
