
import java.util.Date;

public class SmartPhone extends Dispositivos implements CalcularPrecio {

    boolean Wifi;
    boolean G3;
    boolean pantalla;
    
    public SmartPhone(String Marca, String Modelo, String AI, boolean Pantalla, String DP, String Teclado, Date fecha, double Precio, boolean Wifi, boolean G3) {

        super(Marca, Modelo, AI, Pantalla, DP, Teclado, fecha, Precio);
        this.Wifi = Wifi;
        this.G3 = G3;
        this.pantalla = Pantalla;
        
    }

    public boolean isWifi() {
        return Wifi;
    }

    public void setWifi(boolean Wifi) {
        this.Wifi = Wifi;
    }

    public boolean isG3() {
        return G3;
    }

    public void setG3(boolean G3) {
        this.G3 = G3;
    }

    public boolean isPantalla() {
        return pantalla;
    }

    public boolean setpantalla() {
        return pantalla;
    }

    @Override
    public double CalcularPrecio() {

        if (isWifi() && isG3() && isPantalla()) {
            return (super.getPrecio() + (((super.getPrecio() * 0.15)) + ((super.getPrecio() * 0.05))));

        } else if (isWifi() && isG3()) {
            return (super.getPrecio() + ((super.getPrecio() * 0.15)));

        } else if (isWifi() && isPantalla()) {
            return (super.getPrecio() + ((super.getPrecio() * 0.05)));

        } else if (isG3() && isPantalla()) {
            return (super.getPrecio() + ((super.getPrecio() * 0.05)));

        } else if (isPantalla()) {
            return (super.getPrecio() + ((super.getPrecio() * 0.05)));

        } else {
            return super.getPrecio();
        }
    }
}
