package org.cursofinalgrado.uapa.java.poo.herencia;

import java.util.Date;
// empleado no estaba heredando de la clase persona
 public class Empleado extends Persona implements Sueldo{
    private double sueldoFijo;
    private double horasExtras;
    private double preciosHorasExtras;
    
    
    public Empleado(String string, String string1, String string2, Date date) {
        super(string, string1, string2, date);
    }
   
    
    public Empleado(){
        
    }

    @Override
    public double calcularSueldo() {
        return (sueldoFijo + (horasExtras));
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getPreciosHorasExtras() {
        return preciosHorasExtras;
    }

    public void setPreciosHorasExtras(double preciosHorasExtras) {
        this.preciosHorasExtras = preciosHorasExtras;
    }
}
