package org.cursofinalgrado.uapa.java.colleccion;

import java.util.ArrayList;
import java.util.Collection;

public class TipoCollection {
    public static void main(String[] args) {
        
        Collection<String> col = new ArrayList<String>();
        col.add("Java");
        col.add("C++");
        
        
        for(String lenguaje : col){
            System.out.println(lenguaje);
            
        }

        
        
    }
}
