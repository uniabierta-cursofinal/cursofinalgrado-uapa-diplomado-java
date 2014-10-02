
import java.util.Date;

public class Tablet extends Dispositivos implements CalcularPrecio {

    boolean Wifi;
    boolean G3;
    boolean pantalla;
    String OS;

    public Tablet(String Marca, String Modelo, String AI, boolean pantalla, String Teclado, Date fecha, double Precio, boolean Wifi, boolean G3, String OS) {
        super(Marca, Modelo, AI, pantalla, Teclado, fecha, Precio);
        this.Wifi = Wifi;
        this.G3 = G3;
        this.pantalla = pantalla;
        this.OS = OS;
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

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public boolean ispantalla() {
        return pantalla;
    }

    public void setpantalla(boolean pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public double CalcularPrecio() {

        if (isG3()) {
            return (super.getPrecio() + (((super.getPrecio() * 0.20))));

        } else {
            return super.getPrecio();
        }
    }

}
