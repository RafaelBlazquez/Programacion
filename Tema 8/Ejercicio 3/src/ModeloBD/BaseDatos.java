/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author leora
 */
public class BaseDatos {
    
    public static Connection con;
    
    public Connection getCon() {
       return con;
    }
    
    public void conectar(){
        try{
            // >> Driver
            Class.forName("com.mysql.jdbc.Driver");
            // >> Conexión
            String bd = "bdtema_8_03";
            String url = "jdbc:mysql://localhost:3307/"+bd;
            String login = "root";
            String password = "usbw";
            con = DriverManager.getConnection(url, login, password);
            
            if (con == null){
                throw new Exception("Problemas con la conexión");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage()+ e.getClass());
        }
    }

    
}
