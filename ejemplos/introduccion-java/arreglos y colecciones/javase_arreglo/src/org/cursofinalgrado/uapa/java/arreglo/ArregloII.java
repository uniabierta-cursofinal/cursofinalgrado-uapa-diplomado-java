package org.cursofinalgrado.uapa.java.arreglo;

public class ArregloII {
    public static void main(String[] args) {
        
        int [] notas = new int [10]; // crear un arreglo de enteros

        notas[0] = 100;
        notas[1] =  80;
        notas[2] = 90;
        notas[3] =  75;
        //etc      
           
        
        int[] notasAbr = {100, 80, 90, 75, 60, 50, 70, 80, 90,100};

        //obtener el promedio de la nota sacada en el grupo
        
        double total = 0;
        for(int i=0;i < notasAbr.length;i++){
          total += notasAbr[i];   
        }
        
        double promedio = total / notasAbr.length;
        
        System.out.println("El promedio del grupo es de: "+promedio);

            
    }
}
