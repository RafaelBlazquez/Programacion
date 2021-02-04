/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_7_03;

import Modelo.*;
import Vista.*;
import java.util.ArrayList;

/**
 *
 * @author blagon
 */
public class Controlador {

   
    private static vIntroducirDatos v1;
    private static vAccion v2;
    private static vModificarAlumno v3;
    public static ArrayList<Estudiante> todosEstudiantes = new ArrayList();
    public static ArrayList<Curso> todosCursos = new ArrayList();
    public static void main(String[] args) {
       RellenarCursos();
       v1 = new vIntroducirDatos();
       v1.setVisible(true);
    }
    public static void RellenarCursos(){
        String mensaje = "";
        for (int x=0; x<4; x++){
            switch(x){
                case 0:
                    mensaje= "1";
                   
                    break;
                case 1:
                    mensaje= "2";
                    break;
                case 2:
                    mensaje= "3";
                    break;
                case 3:
                    mensaje= "4";
                    break;
            }
            for (int y=0; y<4; y++){
                switch(y){
                case 0:
                    mensaje+="A";
                    Curso c1= new Curso(mensaje); 
                    todosCursos.add(c1);
                    break;
                case 1:
                    mensaje+="B";
                    Curso c2= new Curso(); 
                    todosCursos.add(c2);
                    break;
                case 2:
                    mensaje+="C";
                    Curso c3= new Curso(); 
                    todosCursos.add(c3);
                    break;
                case 3:
                    mensaje+="D";
                    Curso c4= new Curso(); 
                    todosCursos.add(c4);
                    break;
                }
            }
        }
            
    }
    public static void TenControlador(String dni,String nombre, String apellidos, String curso){
        Curso c1=new Curso();
        c1 = todosCursos.stream().findFirst(); //forma larga
        Estudiante e1= new Estudiante(dni,nombre,apellidos,todosCursos.get(posicionCurso));
        todosEstudiantes.add(e1);
    }
    public static void FinalizarEjecucion(){
        v1.dispose();
        System.exit(0);
    }
}
