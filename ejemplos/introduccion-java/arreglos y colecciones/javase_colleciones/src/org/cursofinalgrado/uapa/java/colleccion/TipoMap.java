package org.cursofinalgrado.uapa.java.colleccion;

import java.util.HashMap;
import java.util.Map;

public class TipoMap {
    public static void main(String[] args) {
       
       
        Map<String,Integer> nota = new HashMap<String,Integer>();
        
        nota.put("Richard Reinoso", 80);
        nota.put("Martin Jaquez",60);
        nota.put("Yordany Diaz",80);
                                    
                                    
        for(Map.Entry cal : nota.entrySet()){
            System.out.println(cal.getKey()+"  "+cal.getValue());            
            
        }


    }
}
