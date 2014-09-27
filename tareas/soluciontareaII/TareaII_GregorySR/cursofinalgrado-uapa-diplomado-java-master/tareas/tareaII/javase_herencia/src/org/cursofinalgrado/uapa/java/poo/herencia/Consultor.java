package org.cursofinalgrado.uapa.java.poo.herencia;

import java.util.Date;

public class Consultor extends Persona  {
    private double horaTrabajadas;
    private double precioHoras;
    //creando las variable del constructor de la clase.
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private Date fecha_nacimiento;
    private String puesto;
    
    //Construcción del constructor por defecto de la clase.
    public Consultor()
    {
        
    }
    
    public Consultor(String nombre, String cedula, String direccion, String telefono,  Date fecha_nacimiento, String puesto) {
        super();
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.puesto = puesto;
    }
    //cree todos los metodos get y set de la clase Consultor.
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    @Override
    public String getDireccion() {
        return direccion;
    }
    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String getTelefono() {
        return telefono;
    }
    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    @Override
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double calcularSueldo() {
        return horaTrabajadas * precioHoras;
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
