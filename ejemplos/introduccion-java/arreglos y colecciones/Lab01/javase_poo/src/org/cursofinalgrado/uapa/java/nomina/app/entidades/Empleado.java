package org.cursofinalgrado.uapa.java.nomina.app.entidades;

import java.text.NumberFormat;

import java.util.Date;
import org.cursofinalgrado.uapa.java.nomina.app.interfaces.Sueldo;



public class Empleado extends Persona implements Sueldo {
    private Double sueldoFijo;
    private Double horasTrabajadas;
    private Double tarifaHoraExtra;
    private Posicion posicion;

    public Empleado() {
        super();
    }

    public Empleado(String string, String string1, String string2, String string3, String string4, Date date) {
        super(string, string1, string2, string3, string4, date);
    }

    @Override
    public double calcularSueldo() {

        if (horasTrabajadas > 44.0) {
            return (sueldoFijo + ((horasTrabajadas - 44) * tarifaHoraExtra));
        } else {
            return sueldoFijo;
        }
    }

    public Double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(Double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    public Double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Double getTarifaHoraExtra() {
        return tarifaHoraExtra;
    }

    public void setTarifaHoraExtra(Double tarifaHoraExtra) {
        this.tarifaHoraExtra = tarifaHoraExtra;
    }

    @Override
    public String imprimirDatos() {
        String info = super.toString() + "Sueldo Fijo :" + NumberFormat.getInstance().getCurrencyInstance().format(calcularSueldo()) + "\n" +
            "Posicion :" + posicion + "\n" +
            "Horas Trabajadas: " + horasTrabajadas + "\n";

        if (horasTrabajadas > 44.0) {
            info += "Horas Extras :" + (horasTrabajadas - 44) + "\n";
            info += "Tarifa :" + tarifaHoraExtra + "\n";

        }
        return info;
    }

    /**
     * @return
     */
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
