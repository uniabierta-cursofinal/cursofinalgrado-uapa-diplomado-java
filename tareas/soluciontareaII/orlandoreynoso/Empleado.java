package org.cursofinalgrado.uapa.java.poo.herencia;

import java.util.Date;

public class Empleado  implements Sueldo{
    private double sueldoFijo;
    private double horasExtras;
    private double preciosHorasExtras;
    
    private String Nombre;
    private String Puesto;
    private Date Fecha;
    private String Numero_Empleado;
    private String Telefono;
    private String Cedula;
    private String Direccion;
    
    public Empleado(String string, String string1, String string2, Date date) {
       //super(string, string1, string2, date);
    }
    
    public Empleado(){
        
    }

    @Override
    public double calcularSueldo() {
        return (sueldoFijo + ((horasExtras)*preciosHorasExtras));
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

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setFecha (Date fecha) {
        this.Fecha = fecha;
    }
    
    public Date getFecha() {
        return Fecha;
    
    }
    
    public void setDireccion (String direccion) {
        this.Direccion = direccion;
    }
    
    public String getDireccion() {
        return Direccion;
    }
    
    public void setnumero_cedula(String cedula) {
        this.Cedula = cedula;
    }
    
    public String getnumero_cedula() {
        return Cedula;
    }
    
    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }
    
    public String getTelefono() {
        return Telefono;
    }
    
    public void setNumero_Empleado(String numero_empleado) {
        this.Numero_Empleado = numero_empleado;
    }
    
    public String getNumero_Empleado() {
        return Numero_Empleado;
    }
    
    public void setPuesto(String puesto) {
        this.Puesto = puesto;
    }
    
    public void setFecha_nacimiento(Date fecha) {
        this.Fecha = fecha;
    }
    
    
    
}
