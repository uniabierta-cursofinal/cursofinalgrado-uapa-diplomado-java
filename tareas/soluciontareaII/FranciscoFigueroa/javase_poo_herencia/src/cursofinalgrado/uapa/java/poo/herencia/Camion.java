/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cursofinalgrado.uapa.java.poo.herencia;

/**
 *
 * @author ecabrerar
 */
public class Camion extends Carro {

    /*** Creamos una nueva propiedad llamada peso ya que es privada de la clase Camion y no es heredada del extend que se le hizo a Carro ***/
    private int peso;
   

    public Camion(int cantVelodidad, double precio, String color, int peso) {
        super(cantVelodidad, precio, color);
        this.peso = peso;
    }

    
    @Override
    public double getPrecioVenta() {
        if (peso > 2000) {
            return (super.getPrecioRegular() - (super.getPrecioRegular() * 0.1));
        } else {
            return (super.getPrecioRegular() - (super.getPrecioRegular() * 0.2));
        }
    }

    /**
     * @return the peso
     */
    
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

 
    
    
}
