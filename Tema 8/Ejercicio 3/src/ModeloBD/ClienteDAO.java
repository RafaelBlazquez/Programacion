/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBD;

import java.sql.Connection;

/**
 *
 * @author leora
 */
public class ClienteDAO {
    private static Connection con;
    
    public ClienteDAO (Connection con) {
        this.con = con;
    }
    
    
}
