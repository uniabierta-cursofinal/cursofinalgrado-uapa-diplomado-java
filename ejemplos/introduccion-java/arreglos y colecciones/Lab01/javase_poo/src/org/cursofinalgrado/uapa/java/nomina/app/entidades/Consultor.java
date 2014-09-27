package org.cursofinalgrado.uapa.java.nomina.app.entidades;

import java.text.NumberFormat;

import java.util.Date;
import org.cursofinalgrado.uapa.java.nomina.app.interfaces.Sueldo;



public class Consultor extends Persona implements Sueldo {
    private double horasTrabajadas;
    private final double TARIFA_POR_HORA = 2000;
    
    
    public Consultor() {
        super();
    }

    public Consultor(String string, String string1, String string2, String string3, String string4, Date date) {
        super(string, string1, string2, string3, string4, date);
    }

    /**
     * Calcular el sueldo del consultor
     * @return
     * double
     */
    @Override
    public double calcularSueldo() {
        return (horasTrabajadas * TARIFA_POR_HORA);
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String imprimirDatos() {
        return super.toString() + "Sueldo : "+NumberFormat.getCurrencyInstance().format(calcularSueldo());
    }
}
