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
    public static Estudiante estudianteElegido;
    public static int posicionElegida;
    public static void main(String[] args) {
       rellenarCursos();
       generarDatos();
       v1 = new vIntroducirDatos();
       v1.setVisible(true);
    }
    public static void rellenarCursos(){
        String mensaje = "";
        for (int x=0; x<4; x++){
            
            for (int y=0; y<4; y++){
                mensaje =""+(x+1);
                switch (y){
                    case 0:
                        mensaje += "A";
                        Curso c1 = new Curso(mensaje);
                        todosCursos.add(c1);
                        break;
                    case 1:
                        mensaje += "B";
                        Curso c2 = new Curso(mensaje);
                        todosCursos.add(c2);
                        break;
                    case 2:
                        mensaje += "C";
                        Curso c3 = new Curso(mensaje);
                        todosCursos.add(c3);
                        break;
                    case 3:
                        mensaje += "D";
                        Curso c4 = new Curso(mensaje);
                        todosCursos.add(c4);
                        break;
                        
                }
                        
            }
                
                
            
        }
    }
    public static void generarDatos(){
        Estudiante e1 = new Estudiante ("98765432A","Juan","Ores",todosCursos.get(1));
        Estudiante e2 = new Estudiante ("12345678Z","Ramon","Garcia",todosCursos.get(1));
        Estudiante e3 = new Estudiante ("84628462B","Nai","Pueblos",todosCursos.get(1));   
        Estudiante e4 = new Estudiante ("13579135C","Kevin","Marcos",todosCursos.get(1));        
        todosEstudiantes.add(e1);
        todosEstudiantes.add(e2);
        todosEstudiantes.add(e3);
        todosEstudiantes.add(e4);

    }
    public static void tenControlador(String dni,String nombre, String apellidos, String curso){
        boolean continuar = true;
        int w;
        for (w=0; w<todosEstudiantes.size() && !dni.equalsIgnoreCase(todosEstudiantes.get(w).getDni()) ;w++){}
            if (w<todosEstudiantes.size()){
                estudianteElegido = todosEstudiantes.get(w);
                posicionElegida = w;
                v2 = new vAccion();
                v2.setVisible(true);
                v1.setVisible(false);
                continuar = false;
            }
        if (continuar){
            int x;
            for (x=0; x<todosCursos.size() && !curso.equalsIgnoreCase(todosCursos.get(x).getCodigo()) ;x++){}
                if (x<todosCursos.size()){
                    Estudiante e5 = new Estudiante (dni,nombre,apellidos,todosCursos.get(x));
                    todosEstudiantes.add(e5);
                }
                else 
                    v1.cursoIncorrecto();
    }
    }
    public static void eliminarAlumno(){
        todosEstudiantes.remove(posicionElegida);
        //todosEstudiantes.remove(estudianteElegido);
    }
    public static void modificarAlumno(){
        v2.dispose();
        v3 = new vModificarAlumno(estudianteElegido.getCurso().getCodigo());
        v3.setVisible(true);
    }
    public static void modificado(String codigo){
        estudianteElegido.getCurso().setCodigo(codigo);
        v3.dispose();
        v1.setVisible(true);
    }
    public static void finalizarEjecucion(){
        v1.dispose();
        System.exit(0);
    }
}
