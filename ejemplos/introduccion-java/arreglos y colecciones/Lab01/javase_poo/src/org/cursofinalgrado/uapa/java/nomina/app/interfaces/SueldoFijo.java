package org.cursofinalgrado.uapa.java.nomina.app.interfaces;

import java.util.HashMap;
import java.util.Map;
import org.cursofinalgrado.uapa.java.nomina.app.entidades.Posicion;



public class SueldoFijo {
    
    public static Map<Posicion,Double> getSueldoFijo(){
        
        Map<Posicion,Double> sueldoFijos = new HashMap<>();
        
        sueldoFijos.put(Posicion.MECANICO, 8000.00);
        sueldoFijos.put(Posicion.PROGRAMADOR, 25000.00);
        sueldoFijos.put(Posicion.SECRETARIA, 15000.00);
        sueldoFijos.put(Posicion.VIGILANTE, 7000.00);
        sueldoFijos.put(Posicion.SOPORTTE_TECNICO, 18000.00);     
               
        return sueldoFijos;
        
    }
}
