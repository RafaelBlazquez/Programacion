/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_8_03;

import ModeloBD.*;
import UML.*;
import Vista.*;

/**
 *
 * @author leora
 */
public class Controlador {

    /**
     * PERSONA (HERENCIA A CLIENTE Y ABOGADO) 
     * TABLAS
     * CLIENTE
     * CASO (DNI)
     * ABOGADO
     * ABOGADOCASO
     * JUICIO (IDCASO) // CASOJUICIO
     * CASO (IDJUICIO) // CASOJUICIO
     */
    public static BaseDatos bd;
    public static ClienteDAO clDAO;
    public static Cliente cl;
    public static VMenu v1;
    public static VCliente v2;
    public static VAbogado v3;
    public static VCaso v4;
    public static VJuicio v5;
    public static int protagonistaS;
    public static int accionS;
    public static void main(String[] args) {
        try{
            bd = new BaseDatos();
            bd.conectar();
            clDAO = new ClienteDAO(bd.getCon());
            v1= new VMenu();
            v1.setVisible(true);   
        }
        catch(Exception e){
            System.out.println(e.getMessage()+e.getClass());
        }
    }
    public static void toma(int accion, int protagonista){
        protagonistaS= protagonista;
        accionS = accion;
        switch(protagonista){
            case 1:
                v1.setVisible(false);
                v2= new VCliente(accion);
                v2.setVisible(true);
                break;
            case 2:
                v1.setVisible(false);
                v3= new VAbogado(accion);
                v3.setVisible(true);
                break;
            case 3:
                v1.setVisible(false);
                v4= new VCaso(accion);
                v4.setVisible(true);
                break;
            case 4:
                v1.setVisible(false);
                v5= new VJuicio(accion);
                v5.setVisible(true);
                break;
        }
    }
    public static void cancelar(){
        switch (protagonistaS){
            case 1:
                v2.dispose();
                v1.setVisible(true);
                break;
            case 2:
                v3.dispose();
                v1.setVisible(true);
                break;
            case 3:
                v4.dispose();
                v1.setVisible(true);
                break;
            case 4:
                v5.dispose();
                v1.setVisible(true);
                break;
        }
    }
    public static void salir(){
        v1.dispose();
        System.exit(0);
    }
        
}
