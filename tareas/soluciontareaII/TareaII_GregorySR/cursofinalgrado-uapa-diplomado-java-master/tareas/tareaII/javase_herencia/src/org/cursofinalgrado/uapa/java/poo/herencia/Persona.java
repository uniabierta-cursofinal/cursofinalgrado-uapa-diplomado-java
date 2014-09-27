package org.cursofinalgrado.uapa.java.poo.herencia;

import java.util.Date;
/**
 * @date Wed Sep 24 14:29:26 AST 2014
 * @author ecabrerar
 */
public class Persona {
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    private Date fecha_nacimiento;

    public Persona(){
        
    }

    public Persona(String nombre, String cedula, String telefono, String direccion, Date fecha_nacimiento) {
        super();
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //cree los metodos get y set de Cedula
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
