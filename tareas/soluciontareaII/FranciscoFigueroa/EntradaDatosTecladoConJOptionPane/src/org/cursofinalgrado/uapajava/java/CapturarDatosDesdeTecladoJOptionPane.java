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
       

        /*** Convertir la edad de tipo de dato String en un entero Interger ***/
        int edadentero = Integer.parseInt(edad);
        

        /*** Utilizamos las condicionales IF y ELSE para determinar si el usuario es menor o mayor al parametro preestablecido ***/
        if ( edadentero < 18 ) {
                JOptionPane.showMessageDialog(null, "Hola "+nombre+" todavia eres menor de edad.");
        }
        else {
             JOptionPane.showMessageDialog(null, "Hola "+nombre+" eres mayor de edad.");
        }
        
        /**
         * TODO: Convertir la edad digitada a un entero y si es menor de 18 escribir el siguiente mensaje:
         * Hola 'Nombre Persona', todavia eres menor de edad
         * En caso de ser mayor de 18 escribir el siguiente mensaje:
         *  Hola 'Nombre Persona', eres de mayor de edad
         */
  
        // JOptionPane.showMessageDialog(null, mensaje);
    }
}
