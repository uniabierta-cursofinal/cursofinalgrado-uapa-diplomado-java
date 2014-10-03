package org.cursofinalgrado.uapa.java.poo.herencia;

import java.util.Date;

public class Consultor extends Persona implements Sueldo {
    private double horaTrabajadas;
    private double precioHoras;
    
    private int numeroConsultor;

    public void setNumeroConsultor(int numeroConsultor) {
        this.numeroConsultor = numeroConsultor;
    }

    public int getNumeroConsultor() {
        return numeroConsultor;
    }
    
    public Consultor(String string, String string1, String string2, Date date) {
        super(string, string1, string2, date);
    }
    
    public Consultor() {
        
    }
    
    @Override
    public double calcularSueldo() {
        return (horaTrabajadas * precioHoras);
    }

    public double getHoraTrabajadas() {
        return horaTrabajadas;
    }

    public void setHoraTrabajadas(double horaTrabajadas) {
        this.horaTrabajadas = horaTrabajadas;
    }

    public double getPrecioHoras() {
        return precioHoras;
    }

    public void setPrecioHoras(double precioHoras) {
        this.precioHoras = precioHoras;
    }
}
