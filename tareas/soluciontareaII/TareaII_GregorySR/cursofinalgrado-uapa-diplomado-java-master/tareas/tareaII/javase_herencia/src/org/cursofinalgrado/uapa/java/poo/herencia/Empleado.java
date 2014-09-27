package org.cursofinalgrado.uapa.java.poo.herencia;

import java.util.Date;

public class Empleado  implements Sueldo{
    private double sueldoFijo;
    private double horasExtras;
    private double preciosHorasExtras;
    //cree las variables del Constructor Empleado
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;    
    private Date fecha_nacimiento;
    private String puesto;
      
    public Empleado(String nombre, String cedula, String direccion, String telefono, Date fecha_nacimiento, String puesto) {
        super();
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.puesto = puesto;
    }
    
    public Empleado(){
        
    }

    //cree todos los metodos get y set de la clase Empleado.    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getPuesto(){
        return puesto;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
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
