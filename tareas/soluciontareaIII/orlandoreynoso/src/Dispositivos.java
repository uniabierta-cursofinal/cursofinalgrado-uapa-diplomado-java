
import java.util.Date;

public class Dispositivos implements CalcularPrecio {

    private String Marca;
    private String Modelo;
    private String AI;
    private boolean Pantalla;
    private String Teclado;
    private double Precio;
    private Date fecha;

    public Dispositivos(String Marca, String Modelo, String AI, boolean Pantalla, String Teclado, Date fecha, double Precio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.AI = AI;
        this.Pantalla = Pantalla;
        this.Teclado = Teclado;
        this.Precio = Precio;
        this.fecha = fecha;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getAI() {
        return AI;
    }

    public void setAI(String AI) {
        this.AI = AI;
    }

    public boolean getPantalla() {
        return Pantalla;
    }

    public void setPantalla(boolean Pantalla) {
        this.Pantalla = Pantalla;
    }

    public String getTeclado() {
        return Teclado;
    }

    public void setTeclado(String Teclado) {
        this.Teclado = Teclado;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    double CalcularPrecio(){
        return 0;
    }

    
    
}
