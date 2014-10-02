/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapajava.java;

/**
 *
 * @author ecabrerar
 * @date Wed Sep 24 15:04:26 AST 2014
 */
public class NumerosMagicos {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 23;
        int num3 = 11;
        int min = 0;

        String mensaje = "";

        //determinar el número mas pequeño 
        min = (num1 < num2) ? num1 : num2;
        min = (min < num3) ? min : num3;

        
        System.out.println("número 1 = " + num1);
        System.out.println("número 2 = " + num2);
        System.out.println("número 3 = " + num3);
        
        System.out.println("El número más pequeño es = " + min);
        System.out.println("El número más pequeño es "+((min<10)?"menor":"mayor o igual")+ " que 10!");
    }   
}
