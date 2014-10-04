import java.util.Date;

public class Celular extends Dispositivos implements CalcularPrecio {

    public Celular(String Marca, String Modelo, String AI, boolean Pantalla, String DP, String Teclado, Date fecha, double Precio) {
        super(Marca, Modelo, AI, Pantalla, DP, Teclado, fecha, Precio);
    }

    @Override
    public double CalcularPrecio() {
        if (super.getMarca().equals("Motorola")) {
            return 3500;

        } else if (super.getMarca().equals("Samsung")) {
            return 4000;

        } else if (super.getMarca().equals("SonyEricsson")) {
            return 3500;
            
        } else if (super.getMarca().equals("Alcatel")) {
            return 1500;
            
        } else return 0;
            
    }
}