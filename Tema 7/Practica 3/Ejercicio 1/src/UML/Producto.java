/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw01
 */
public class Producto {
    String nombre;
    int unidades;
    double precio;
    ArrayList<Proveedor> proveedoresProducto = new ArrayList();

    public Producto() {
    }

    public Producto(String nombre, double precio, int unidades) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
       
    }

    public Producto(String nombre, double precio, int unnidades, ArrayList<Proveedor> proveedoresProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
        this.proveedoresProducto = proveedoresProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public ArrayList<Proveedor> getProveedoresProducto() {
        return proveedoresProducto;
    }

    public void setProveedoresProducto(ArrayList<Proveedor> proveedoresProducto) {
        this.proveedoresProducto = proveedoresProducto;
    }
    public void setProveedorProducto(Proveedor proveedor){
        proveedoresProducto.add(proveedor);
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", unidades=" + unidades + ", precio=" + precio + ", proveedoresProducto=" + proveedoresProducto + '}';
    }

    

    
    
}
