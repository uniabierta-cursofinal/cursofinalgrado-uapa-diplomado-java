package org.cursofinalgrado.uapa.java.nomina.app.utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class FormatearFecha {

    /**
     * Metodo para obtener la fecha, el parametro debe ser en el siguiente formato <code>MM/dd/yyyy</code>.
     * @param fecha
     * @return
     */
    public static Date getFecha(String fecha){
        Date date = new Date();
        String formato = "MM/dd/yyyy";        
        SimpleDateFormat format = new SimpleDateFormat(formato);
        
            try {
              
               date = format.parse(fecha);
              
            } catch (ParseException e) {
            }  
            return date;
    }
}
