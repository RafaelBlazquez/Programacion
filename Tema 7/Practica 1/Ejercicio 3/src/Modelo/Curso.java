/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author blagon
 */
public class Curso {
    
    private String codigo;
    private ArrayList<Estudiante> estudiantesCurso;

    public Curso() {
    }

    public Curso(String codigo) {
        this.codigo = codigo;
    }

    public Curso(String codigo, ArrayList<Estudiante> estudiantesCurso) {
        this.codigo = codigo;
        this.estudiantesCurso = estudiantesCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   
  
    public ArrayList<Estudiante> getEstudiantesCurso() {
        return estudiantesCurso;
    }

    public void setEstudiantesCurso(ArrayList<Estudiante> estudiantesCurso) {
        this.estudiantesCurso = estudiantesCurso;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", estudiantesCurso=" + estudiantesCurso + '}';
    }
  
    
    

 

   

    
    
    
}
