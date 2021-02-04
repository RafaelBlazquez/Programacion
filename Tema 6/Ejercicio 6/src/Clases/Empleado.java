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
public class Empleado extends Persona{
    double sueldoBruto;
    
//Constructores
    
    public Empleado() {
    }

    public Empleado(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(double sueldoBruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

//Getter & Setter

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
//Funciones

    @Override
    public String mostrar() {
        return super.mostrar() + "\n   - SueldoBruto= " + sueldoBruto;
    }
    
    public static void CalcularSalarioNeto(){
        
    }
    
}
