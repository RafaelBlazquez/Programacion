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
public class Acontecimiento {
    String nombre;
    String lugar;
    LocalDate fecha;
    String horaInicio;
    String horaFin;
    int invitados;

    public Acontecimiento() {
    }

    public Acontecimiento(String nombre, String lugar, LocalDate fecha, String horaInicio, String horaFin, int invitados) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.invitados = invitados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    @Override
    public String toString() {
        return "Acontecimiento{" + "nombre=" + nombre + ", lugar=" + lugar + ", fecha=" + fecha + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", invitados=" + invitados + '}';
    }
    
    
}
