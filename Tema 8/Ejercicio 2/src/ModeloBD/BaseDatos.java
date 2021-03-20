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
  
    private static Connection con;
    
    public BaseDatos(){
    }
    
    public void conectar(){
        try{
               // Identificamos el driver
                Class.forName("com.mysql.jdbc.Driver");
                 //obtenemos la conexión
                 String bd="bdtema_8_02";
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
    
    public static Connection getCon(){
        return con;
    }
}
