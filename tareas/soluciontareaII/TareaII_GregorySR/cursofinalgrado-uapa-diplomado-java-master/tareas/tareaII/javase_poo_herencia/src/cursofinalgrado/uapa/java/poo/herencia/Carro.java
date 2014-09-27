
package cursofinalgrado.uapa.java.poo.herencia;

//Implemente la nueva interface PrecioVenta
public class Carro implements PrecioVenta{

    private int cantVelocidad;
    private double precioRegular;
    private String color;

    public Carro(int cantVelocidad, double precio, String color) {
        this.cantVelocidad = cantVelocidad;
        this.precioRegular = precio;
        this.color = color;
    }

    public int getCantVelocidad() {
        return cantVelocidad;
    }

    public void setCantVelocidad(int cantVelocidad) {
        this.cantVelocidad = cantVelocidad;
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioVenta() {
        return 0;
    }
}
