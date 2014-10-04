package org.cursofinalgrado.uapa.java.poo.herencia;

import java.util.Date;

public class Empleado extends Persona implements Sueldo  {
   //*** Hacemos un extend a la clase Persona asi heredamos sus atributos ***/
    
    private double sueldoFijo;
    private double preciosHorasExtras;
    private double horasExtras;
    private int numeroEmpleado;

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }
    
    /*** Se especifican los tipos de datos heredados de la clase Persona ***/
    public Empleado(String nombre, String puesto, String direccion, String telefono, String cedula, Date fecha_nacimiento) {
      super(nombre, puesto, direccion, telefono, cedula, fecha_nacimiento);
        
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
