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
public class Celular extends DispositivoElec implements Precio {
    
    @Override
    public double calcularPrecio() {
        switch(super.getMarcaEquipo()) {
            case "Motorola":
                return 3500;
            case "Samsung":
                return 4000;
            case "Sony Ericsson":
                return 3500;
            case "Acatel":
                return 1500;
            case "Nokia":
                return 2500;
            default :
                return 0;
        }
    }

    public Celular(String nombreEquipo, String marcaEquipo, String versionEquipo, String capacidadAlmacena, 
            String dimPantalla, String teclado, Date fechaEquipo) {
        super(nombreEquipo, marcaEquipo, versionEquipo, capacidadAlmacena, dimPantalla, teclado, fechaEquipo);
    }
}
