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
public class Empleado {
    String dNI;
    String nSS;
    String nombreApellidos;
    String direccion;
    String telefono;
    boolean sexo;
    boolean estadoCivil;
    Contrato tipoContrato;
    Departamento nombreDepartamento;
    LocalDate fechaAlta;
    String numeroEmpleado;

    public Empleado(String dNI, String nSS, String nombreApellidos, String direccion, String telefono, boolean sexo, boolean estadoCivil, Contrato tipoContrato, Departamento departamento, LocalDate fechaAlta) {
        this.dNI = dNI;
        this.nSS = nSS;
        this.nombreApellidos = nombreApellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.tipoContrato = tipoContrato;
        this.nombreDepartamento = departamento;
        this.fechaAlta = fechaAlta;
    }

    public Empleado(String dNI, String nSS, String nombreApellidos, String direccion, String telefono, boolean sexo, boolean estadoCivil, Contrato tipoContrato, Departamento departamento, LocalDate fechaAlta, String numeroEmpleado) {
        this.dNI = dNI;
        this.nSS = nSS;
        this.nombreApellidos = nombreApellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.tipoContrato = tipoContrato;
        this.nombreDepartamento = departamento;
        this.fechaAlta = fechaAlta;
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getdNI() {
        return dNI;
    }

    public void setdNI(String dNI) {
        this.dNI = dNI;
    }

    public String getnSS() {
        return nSS;
    }

    public void setnSS(String nSS) {
        this.nSS = nSS;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Contrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(Contrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Departamento getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(Departamento nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dNI=" + dNI + ", nSS=" + nSS + ", nombreApellidos=" + nombreApellidos + ", direccion=" + direccion + ", telefono=" + telefono + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", tipoContrato=" + tipoContrato + ", departamento=" + nombreDepartamento + ", fechaAlta=" + fechaAlta + ", numeroEmpleado=" + numeroEmpleado + '}';
    }
    
    
}
