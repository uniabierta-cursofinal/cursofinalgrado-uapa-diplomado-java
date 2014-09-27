package cursofinalgrado.uapa.java.poo.herencia;

public class Camion extends Carro{

    private int peso;

    public Camion(int cantvelodidad, double precio, String color, int peso) {
        super(cantvelodidad, precio, color);
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }    
}
