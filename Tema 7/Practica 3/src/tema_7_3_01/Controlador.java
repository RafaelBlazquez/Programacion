/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_7_3_01;

import UML.*;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw01
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Proveedor> listaProveedores = new ArrayList();
    public static ArrayList<Producto> listaProductos = new ArrayList();
    public static void main(String[] args) {
        rellenarProveedores();
        rellenarProductos();
    }
    public static void rellenarProveedores(){
        Proveedor p0 = new Proveedor("Juan");
        Proveedor p1 = new Proveedor("Jaime");
        Proveedor p2 = new Proveedor("Jacinta");
        Proveedor p3 = new Proveedor("Jevardo");
        Proveedor p4 = new Proveedor("Jorge");
        listaProveedores.add(p0);
        listaProveedores.add(p1);
        listaProveedores.add(p2);
        listaProveedores.add(p3);
        listaProveedores.add(p4);        
    }
    public static void rellenarProductos(){
        Producto producto1 = new Producto("Producto uno",15,50);
        producto1.setProveedorProducto(listaProveedores.get(0));
        producto1.setProveedorProducto(listaProveedores.get(1));
        Producto producto2 = new Producto("Producto dos",20,50);
        producto2.setProveedorProducto(listaProveedores.get(2));
        Producto producto3 = new Producto("Producto tres", 25,50);
        producto3.setProveedorProducto(listaProveedores.get(3));
        producto3.setProveedorProducto(listaProveedores.get(4));
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);
    }  
}
