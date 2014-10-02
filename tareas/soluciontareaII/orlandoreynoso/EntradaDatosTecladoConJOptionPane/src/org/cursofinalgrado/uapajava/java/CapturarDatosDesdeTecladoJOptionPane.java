package org.cursofinalgrado.uapajava.java;

import javax.swing.JOptionPane;

public class CapturarDatosDesdeTecladoJOptionPane {
    
    public static void main(String[] args) {
       
        String nombre = JOptionPane.showInputDialog("Por favor, escribir su nombre");
        
        String edad= JOptionPane.showInputDialog("Por favor, escribir su edad:");
       
        String mensaje = null;
        
        if (Integer.parseInt(edad) < 60){
            mensaje = ("Hola "  + nombre + " Eres muy joven");
        }
        else{
            mensaje = ("Hola " + nombre + " Eres muy viejo");
        }
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

/*Respuesta: 
Se convirtió la entrada del número en entero y con un if se construyó la respuesta del mensaje dependiendo el valor digitado.
*/
