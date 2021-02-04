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
public class Cliente extends Persona{
    
    String telefonoDeContacto;
    
//Constructores

    public Cliente() {
    }

    public Cliente(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }

    public Cliente(String telefonoDeContacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefonoDeContacto = telefonoDeContacto;
    }
    
//Getter & Setter

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }

//Funciones

    @Override
    public String mostrar() {
        return super.mostrar()+"\n   - TelefonoDeContacto= " + telefonoDeContacto;
    }

    
    
}
