/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_7_3_01;

import UML.*;
import Vista.*;
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
    public static ArrayList<Cliente> listaClientes = new ArrayList();
    public static VistaGeneral v1 ;
    public static Producto productoSeleccionado;
    public static void main(String[] args) {
        rellenarProveedores();
        rellenarProductos();
        v1= new VistaGeneral();
        v1.setVisible(true);
        
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
    public static boolean ValidarProducto(String producto){
        int x;
        for (x=0;x<listaProductos.size() && !producto.equalsIgnoreCase(listaProductos.get(x).getNombre()); x++);
        if (x<listaProductos.size())
        {
            productoSeleccionado = listaProductos.get(x);
            return true;
        }
        else
        return false;
    }
    public static double damePrecio(){
        double precio = productoSeleccionado.getPrecio();
        return precio;
    }
    public static ArrayList<String> DameProveedores(){
        int x;
        ArrayList<String> listaNombres = new ArrayList();
        for(x=0; x<productoSeleccionado.getProveedoresProducto().size(); x++)
            listaNombres.add(productoSeleccionado.getProveedoresProducto().get(x).getNombre());
        return listaNombres;
    }
    public static void aceptar(){
        v1.dispose();
        v1= new VistaGeneral();
        v1.setVisible(true);
    }
    public static void salir(){
        v1.removeAll();
        System.exit(0);
    }
}
