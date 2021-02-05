/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw01
 */
public class Cuenta {
    String numeroCuenta;
    double saldo;
    ArrayList<Movimiento> movimientosCuenta = new ArrayList();
    
    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Movimiento> getMovimientosCuenta() {
        return movimientosCuenta;
    }

    public void setMovimientosCuenta(ArrayList<Movimiento> movimientosCuenta) {
        this.movimientosCuenta = movimientosCuenta;
    }
    
    public void Ingreso(double importe){
        this.saldo += importe;
    }
    
    public void Retirada(double importe){
        this.saldo -= importe;
    }
}
