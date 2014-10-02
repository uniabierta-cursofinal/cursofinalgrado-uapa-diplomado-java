package org.cursofinalgrado.uapajava.java;

public class NumerosMagicos {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        int min = 0;

        String mensaje = "";

        min = (num1 < num2) ? num1 : num2;
        min = (min < num3) ? min : num3;

        int r = (min < 10) ? 1 : 2;        
        
        System.out.println("número 1 = " + num1);
        System.out.println("número 2 = " + num2);
        System.out.println("número 3 = " + num3 + "\n");        
         
        
        System.out.println("El número más pequeño es = " + min + "\n");  
        
        if (r == 1 ){ 
            System.out.println("¡El número más pequeño es menor de 10!");    
                    }  
        else {
            System.out.println("¡El número más pequeño es mayor de 10!");
        }
        
         
    }
    
}

/*Respuesta: 
Se utilizó un operador ternario para comparar el resultado del número mínimo con 10, luego utilizamos un if para imprimir el mensaje dependiendo de la comparación.
*/
