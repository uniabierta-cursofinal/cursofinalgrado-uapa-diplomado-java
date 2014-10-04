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
public class SmartPhone extends DispositivoElec implements Precio {
    private boolean wifi = false;
    private boolean band2G = false;
    private boolean band3G = false;
    private boolean pantallaMulti = false;
    private boolean GPS = false;
    private String memoriaSD = null; 
    private boolean tecladoFisico = false;
    private final double PRECIOBASE = 8000;
    private double precioFinal = 0;

    public SmartPhone(String nombreEquipo, String marcaEquipo, String versionEquipo, String capacidadAlmacena, 
            String dimPantalla, String teclado, Date fechaEquipo) {
        super(nombreEquipo, marcaEquipo, versionEquipo, capacidadAlmacena, dimPantalla, teclado, fechaEquipo);
    }

    @Override
    public double calcularPrecio() {
        precioFinal = PRECIOBASE;
        if (wifi && band3G) {
            precioFinal += PRECIOBASE * 0.15;
        } 
        if (pantallaMulti) {
            precioFinal += precioFinal * 0.05;
        } 
        return precioFinal;
    }
    
    public String getMemoriaSD() {
        return memoriaSD;
    }

    public void setMemoriaSD(String memoriaSD) {
        this.memoriaSD = memoriaSD;
    }

    public boolean hasWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean hasBand2G() {
        return band2G;
    }

    public void setBand2G(boolean band2G) {
        this.band2G = band2G;
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

    public boolean hasGPS() {
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public boolean hasTecladoFisico() {
        return tecladoFisico;
    }

    public void setTecladoFisico(boolean tecladoFisico) {
        this.tecladoFisico = tecladoFisico;
    }

    
}
