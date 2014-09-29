/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapajava.java;

import javax.swing.JOptionPane;

/**
 *
 * @author ecabrerar
 * @date Wed Sep 24 14:48:36 AST 2014

 */
public class CapturarDatosDesdeTecladoJOptionPane {
    
    public static void main(String[] args) {

       
        // Pantalla para escribir nombre
         String nombre = JOptionPane.showInputDialog("Por favor, escribir su nombre");
        
        // Prompt a user to enter his/her edad              
        String edad= JOptionPane.showInputDialog("Por favor, escribir su edad:");
      int EdadDigitada = Integer.parseInt(edad);//converti la edad digitada en un entero, utilice la estructura de control if haciendo una comparacion de 
                                                //los mismos obtuvimos el resultado esperado, para los mensajes concatenamos    
        if (EdadDigitada <40) {     
        String mensaje = "Hola, " +nombre + "Todavía eres muy Joven";
         JOptionPane.showMessageDialog(null, mensaje);
        }
        else
            if (EdadDigitada >60)
            {
                 String mensaje = "Hola, " +nombre + " eres de avanzada edad";
                  JOptionPane.showMessageDialog(null, mensaje);
            }
        /**
         * TODO: Convertir la edad digitada a un entero y si es menor de 60 escribir el siguiente mensaje:
         * Hola 'Nombre Persona', todavia eres muy joven
         * En caso de ser mayor de 60 escribir el siguiente mensaje:
         *  Hola 'Nombre Persona', eres de avanzada edad
         */
  
       // JOptionPane.showMessageDialog(null, mensaje);
    }
}
