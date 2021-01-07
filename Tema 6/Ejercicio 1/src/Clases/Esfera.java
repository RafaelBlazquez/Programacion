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
public class Esfera {
    private int radio;
    private double longitud;
    private double area;
    private double volumen;
//Constructores
    public Esfera() {
    }
    
    public Esfera(int radio) {
        this.radio = radio;
    }
//Setter
    public void setRadio(int radio) {
        this.radio = radio;
    }
//Getter
    public int getRadio() {
        return radio;
    }
    public double getLongitud() {
        longitud=2*Math.PI*radio;
        return longitud;
    }
    public double getArea() {
        area=Math.PI*(Math.pow(radio, 2));
        return area;
    }
    public double getVolumen() {
        volumen=(4*Math.PI*(Math.pow(radio, 2)))/3;
        return volumen;
    }

    
    
}
