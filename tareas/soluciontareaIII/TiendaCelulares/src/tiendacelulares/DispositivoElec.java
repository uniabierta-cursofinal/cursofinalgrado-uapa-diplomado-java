/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendacelulares;
/**
 *
 * @author fdc500
 */
import java.util.Date;

public class DispositivoElec {
    private String nombreEquipo;
    private String marcaEquipo;
    private String versionEquipo;
    private String capacidadAlmacena;
    private String dimPantalla;
    private String teclado;
    private Date fechaEquipo;

    public DispositivoElec(String nombreEquipo, String marcaEquipo, String versionEquipo, String capacidadAlmacena, 
            String dimPantalla, String teclado, Date fechaEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.marcaEquipo = marcaEquipo;
        this.versionEquipo = versionEquipo;
        this.capacidadAlmacena = capacidadAlmacena;
        this.dimPantalla = dimPantalla;
        this.teclado = teclado;
        this.fechaEquipo = fechaEquipo;
    }
    
    public String getCapacidadAlmacena() {
        return capacidadAlmacena;
    }

    public void setCapacidadAlmacena(String capacidadAlmacena) {
        this.capacidadAlmacena = capacidadAlmacena;
    } 

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getMarcaEquipo() {
        return marcaEquipo;
    }

    public void setMarcaEquipo(String marcaEquipo) {
        this.marcaEquipo = marcaEquipo;
    }

    public String getVersionEquipo() {
        return versionEquipo;
    }

    public void setVersionEquipo(String versionEquipo) {
        this.versionEquipo = versionEquipo;
    }

    public String getDimPantalla() {
        return dimPantalla;
    }

    public void setDimPantalla(String dimPantalla) {
        this.dimPantalla = dimPantalla;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public Date getFechaEquipo() {
        return fechaEquipo;
    }

    public void setFechaEquipo(Date fechaEquipo) {
        this.fechaEquipo = fechaEquipo;
    }
      
}
