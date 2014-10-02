package org.cursofinalgrado.uapa.java.poo.herencia;

import java.util.Date;

public class Persona {
    private String nombre;
    private String puesto;
    private String direccion;
    private Date fecha_nacimiento;
    private String Telefono;
    private String Cedula;

    public Persona(){
        
    }

    public Persona(String nombre, String puesto, String direccion, Date fecha_nacimiento) {
        super();
        this.nombre = nombre;
        this.puesto = puesto;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
