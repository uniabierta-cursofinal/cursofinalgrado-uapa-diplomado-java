package org.cursofinalgrado.uapa.java.nomina.app.interfaces;

import org.cursofinalgrado.uapa.java.nomina.app.entidades.Posicion;



public class TarifaHoraDB {
    
    public static double getTarifaHoraExtra(Posicion posicion){
        double tarifa = 0.0;
        
        if(posicion == Posicion.MECANICO){
            tarifa = 200.00;
        }else if(posicion == Posicion.PROGRAMADOR){
            tarifa = 400.00;
        }else if(posicion == Posicion.SECRETARIA){
            tarifa = 150.00;
        }else if(posicion == Posicion.SOPORTTE_TECNICO){
            tarifa = 250.00;
        }else if(posicion == Posicion.VIGILANTE){
            tarifa = 125.0;
        }            
            
        return tarifa;   
    }
}
