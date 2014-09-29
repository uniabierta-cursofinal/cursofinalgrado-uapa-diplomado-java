package org.cursofinalgrado.uapa.java.poo.herencia;

import java.util.Date;

public class Consultor extends Persona  {
    private double horaTrabajadas;
    private double precioHoras;
    
    public Consultor(String string, String string1, String string2, Date date) {
        super(string, string1, string2, date);
    }

    Consultor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //@Override 
   // lo he renombrado porque no se puede implementar en un metodo de super tipo
   //Para calcular el sueldo el retorno no debe de ser 0 ya que estamos haciendo un calculo y debemos retornar un valor para
    //que nos funciones debemos de agregar el siguiente retorno horaTrabajadas * precioHoras
    public double calcularSueldo() {
        return horaTrabajadas * precioHoras ;
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
