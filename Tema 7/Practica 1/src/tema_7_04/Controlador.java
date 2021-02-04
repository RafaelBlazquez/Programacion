/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_7_04;

import Modelo.Producto;
import Vista.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author blagon
 */
public class Controlador {
    //falta restar unidades
    //falta resetear tf
    private static int cantidadCompra;
    private static String productoCompra;
    private static final vEleccion v1 = new vEleccion();
    private static final vComprar v2 = new vComprar();
    private static final vVender v3= new vVender();
    private static final vConsultas v4= new vConsultas();
    public static ArrayList<Producto> productos= new ArrayList();
    public static void main(String[] args) {
        RellenarProductos();
        v1.setVisible(true);
     
    }
    public static void RellenarProductos(){
        Producto p1= new Producto("Limon",50,1.25);
        Producto p2= new Producto("Naranja",50,1.2);
        Producto p3= new Producto("Fresa",50,0.5);
        Producto p4= new Producto("Manzana",50,1.1);
        Producto p5= new Producto("Pera",50,1.15);
        Producto p6= new Producto("Uva",50,0.6);
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        
    }
    public static void Comprar(){
        v2.setVisible(true);
    }
    public static void TenControlador(int cantidad, String producto){
        cantidadCompra = cantidad;
        productoCompra = producto;
    }
    public static void ActualizarConsultas(){
        WEVQ
        v4.setVisible(true);
    }
    public static double validarNombre(String nombreProducto){
        double correcto=-1;
        for(int x=0; x<productos.size(); x++){
            if (productos.get(x).getNombre().equalsIgnoreCase(nombreProducto)){
                correcto=productos.get(x).getPrecio();
            }    
        }
      return correcto;  
    }
    public static void Vender(){
        v3.setVisible(true);
        
    }
    public static void finAceptar(String palabra){
        if (palabra.equals("comprar")){
            for (int x=0 ; x<productos.size(); x++)
                if (productos.get(x).getNombre().equals(productoCompra)){
                    productos.get(x).setCantidad(productos.get(x).getCantidad()-cantidadCompra);
                    JOptionPane.showMessageDialog(null,productos.get(x).getCantidad());
                }
            v2.setVisible(false);
        }
        if (palabra.equals("vender")){
            
            v3.setVisible(false);
        }
        v1.setVisible(true);
    }
    public static void finCancelar(String palabra){
        if (palabra.equals("comprar")){
            JOptionPane.showMessageDialog(null,"Operación cancelada con éxito");
            v2.setVisible(false);
        }
        if (palabra.equals("vender")){
            JOptionPane.showMessageDialog(null,"Operación cancelada con éxito");
            v3.setVisible(false);
        }
        v1.setVisible(true);
    }
    public static void Salir(){
        v1.setVisible(false);
        System.exit(0);
    }
}
