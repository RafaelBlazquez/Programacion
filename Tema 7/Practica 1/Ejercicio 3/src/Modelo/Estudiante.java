/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author blagon
 */
public class Estudiante {
    
    private String dni;
    private String nombre; 
    private String apellidos; 
    private Curso curso;

    public Estudiante() {
    }

    public Estudiante(String dni, String nombre, String apellidos, Curso curso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
    }

   

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + '}';
    }

    
    
    
     
}
