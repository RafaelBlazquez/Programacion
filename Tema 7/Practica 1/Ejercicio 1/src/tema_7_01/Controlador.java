/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_7_01;

import Vista.*;

public class Controlador {
    private static V1 v1;
    
    public static void main(String[] args) {
        try{

        v1 = new V1();
        v1.setVisible(true);  
        }
        catch  (Exception e) {
            e.getClass();
        }
}

    public static void salir(){
        v1.dispose();
        System.exit(0);
    }
}   
    