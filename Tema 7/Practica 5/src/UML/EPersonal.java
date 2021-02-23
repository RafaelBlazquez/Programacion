/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;

/**
 *
 * @author leora
 */
public class EPersonal extends Empleado{
    String usuario;
    String contrasena;

    public EPersonal(String usuario, String contrasena, String dNI, String nSS, String nombreApellidos, String direccion, String telefono, boolean sexo, boolean estadoCivil, Contrato tipoContrato, Departamento nombreDepartamento, LocalDate fechaAlta) {
        super(dNI, nSS, nombreApellidos, direccion, telefono, sexo, estadoCivil, tipoContrato, nombreDepartamento, fechaAlta);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public EPersonal(String usuario, String contrasena, String dNI, String nSS, String nombreApellidos, String direccion, String telefono, boolean sexo, boolean estadoCivil, Contrato tipoContrato, Departamento nombreDepartamento, LocalDate fechaAlta, String numeroEmpleado) {
        super(dNI, nSS, nombreApellidos, direccion, telefono, sexo, estadoCivil, tipoContrato, nombreDepartamento, fechaAlta, numeroEmpleado);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return super.toString() +"Usuario{" + "usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
    
}
