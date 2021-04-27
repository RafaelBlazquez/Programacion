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
    
    private Connection con;

    public BaseDatos() {
    }
    /** Establecer todos los parametros necesarios, y la conexión con la base de datos*/
    public void conectar(){
       try{
                // Identificamos el driver
                Class.forName("com.mysql.jdbc.Driver");
                 //obtenemos la conexión
                 String bd="registro";
                 String url = "jdbc:mysql://localhost:3307/"+bd;
                 String login="root";
                 String password = "usbw";
                 con = DriverManager.getConnection(url,login,password);
 
                if (con==null){
                       throw new Exception("Problemas con la conexión");
                }
          }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
    
    public Connection getCon() {
        return con;
    }
}
