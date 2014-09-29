package org.cursofinalgrado.uapa.java.nomina.app.entidades;

import java.util.Date;

public abstract class Persona {

    private String nombre;
    private String noEmpleado;
    private String cedula;
    private String direccion;
    private String telefono;
    private Date fecha_Nacimiento;

    /**
     * @param nombre
     * @param noEmpleado
     * @param cedula
     * @param direccion
     * @param telefono
     * @param fecha_Nacimiento
     */
    public Persona(String nombre, String noEmpleado, String cedula, String direccion, String telefono,
            Date fecha_Nacimiento) {
        super();
        this.nombre = nombre;
        this.noEmpleado = noEmpleado;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(String noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        StringBuilder mensaje = new StringBuilder(65)
                .append("Nombre: ").append(nombre)
                .append(" \n")
                .append("No. Empleado: ").append(noEmpleado)
                .append(" \n")
                .append("Cedula: ").append(cedula)
                .append(" \n")
                .append("Dirección: ").append(direccion)
                .append(" \n")
                .append("Telefono: ").append(telefono)
                .append(" \n")
                .append("Fecha Nacimiento ").append(fecha_Nacimiento)
                .append(" \n");

        return mensaje.toString();
    }

    /**
     * Imprimir informacion del objeto.
     *
     * @return
     */
    public abstract String imprimirDatos();

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
