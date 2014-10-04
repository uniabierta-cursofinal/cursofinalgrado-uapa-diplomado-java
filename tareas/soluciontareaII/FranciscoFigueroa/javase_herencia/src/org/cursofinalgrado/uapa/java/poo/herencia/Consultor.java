package org.cursofinalgrado.uapa.java.poo.herencia;

 import java.util.Date;

public class Consultor extends Persona {
    /*** Hacemos un extend a la clase Persona asi heredamos sus atributos ***/
    
    private double horaTrabajadas;
    private double precioHoras;
    
    private int numeroConsultor;

    public void setNumeroConsultor(int numeroConsultor) {
        this.numeroConsultor = numeroConsultor;
    }

    public int getNumeroConsultor() {
        return numeroConsultor;
    }
    
    /*** Se especifican los tipos de datos heredados de la clase Persona ***/
    public Consultor(String nombre, String puesto, String direccion, String telefono, String cedula, Date fecha_nacimiento) {
     super(nombre, puesto, direccion, telefono, cedula, fecha_nacimiento);
    }

    public double calcularSueldo() {
        return 0;
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
