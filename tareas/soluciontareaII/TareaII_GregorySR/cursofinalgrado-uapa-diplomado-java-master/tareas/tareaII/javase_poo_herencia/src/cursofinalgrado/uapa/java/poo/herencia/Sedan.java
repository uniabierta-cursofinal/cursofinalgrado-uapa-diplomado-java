package cursofinalgrado.uapa.java.poo.herencia;

public class Sedan extends Carro{

    private int longitud;

    public Sedan(int puertas, int cantvelocidad, double precioRegular, String color) {
        super(cantvelocidad, precioRegular, color);
        this.longitud = puertas;
    } 
   
    @Override
    public double getPrecioVenta() {
        if(getLongitud() > 20){
            return (super.getPrecioRegular() - (super.getPrecioRegular() * 0.05));
        }else{
            return (super.getPrecioRegular() - (super.getPrecioRegular() * 0.10));
        }
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
