/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author blagon
 */
public class Persona {
    private String nombre;
    private int dNacimiento;
    private int mNacimiento;
    private int aNacimiento;
    private String direccion;
    private String codigoPostal;
    private String ciudad;
//Constructor vaci
    public Persona() {
    }  
//Constructor completamente lleno

    public Persona(String nombre, int dNacimiento, int mNacimiento, int aNacimiento, String direccion, String codigoPostal, String ciudad) {
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.aNacimiento = aNacimiento;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
    }
//Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(int dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public int getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(int mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
    