/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapajava.java;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author ecabrerar
 * @date Wed Sep 24 14:48:36 AST 2014

 */
public class CapturarDatosDesdeTecladoJOptionPane {
    
    public static void main(String[] args) {
        
        String edad;
        do {
            // Pantalla para escribir nombre
            String nombre = JOptionPane.showInputDialog("Por favor, escribir su nombre:");
            // Prompt a user to enter his/her edad              
            edad = JOptionPane.showInputDialog("Por favor, escribir su edad:");

            try {
                if (parseInt(edad)<40) {
                    JOptionPane.showMessageDialog(null, "Hola "+nombre+", todavia eres muy joven.");
                } else {
                    JOptionPane.showMessageDialog(null, "Hola "+nombre+", eres de avanzada.");
                }
                break;
            } catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(null, "No digitó la edad correctamente.");
                edad = null;
            }
        
        } while (edad == null);
    }
}
