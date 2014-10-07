/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendacelulares;

import java.util.Date;

/**
 *
 * @author fdc500
 */
public class Tableta extends DispositivoElec implements Precio {
    private boolean wifi = false;
    private boolean band3G = false;
    private boolean pantallaMulti = false;
    private String OS;
    private final double PRECIOBASE = 15000;
    private double precioFinal = 0;

    /**
     *
     * @param nombreEquipo
     * @param marcaEquipo
     * @param versionEquipo
     * @param capacidadAlmacena
     * @param dimPantalla
     * @param teclado
     * @param fechaEquipo
     */
    public Tableta(String nombreEquipo, String marcaEquipo, String versionEquipo, String capacidadAlmacena, 
            String dimPantalla, String teclado, Date fechaEquipo) {
        super(nombreEquipo, marcaEquipo, versionEquipo, capacidadAlmacena, dimPantalla, teclado, fechaEquipo);
    }

    @Override
    public double calcularPrecio() {
        precioFinal = PRECIOBASE;
        if (wifi && band3G) {
            precioFinal += PRECIOBASE * 0.2;
        } 
        return precioFinal;
    }

    public boolean hasWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean hasBand3G() {
        return band3G;
    }

    public void setBand3G(boolean band3G) {
        this.band3G = band3G;
    }

    public boolean hasPantallaMulti() {
        return pantallaMulti;
    }

    public void setPantallaMulti(boolean pantallaMulti) {
        this.pantallaMulti = pantallaMulti;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
    
}
