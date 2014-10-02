package cursofinalgrado.uapa.java.poo.herencia;

public class Ford extends Carro{
   private int anio;
   private int descuentoFabricante;

    public Ford(int anio, int descuentoFabricante, int cantvelodidad, double precio, String color) {
        super(cantvelodidad, precio, color);
        this.anio = anio;
        this.descuentoFabricante = descuentoFabricante;
    }
    
    
   @Override
    public double getPrecioVenta(){
        return (super.getPrecioRegular() - descuentoFabricante);
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDescuentoFabricante() {
        return descuentoFabricante;
    }

    public void setDescuentoFabricante(int descuentoFabricante) {
        this.descuentoFabricante = descuentoFabricante;
    }

    
   
   
}
