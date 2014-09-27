/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cursofinalgrado.uapa.java.poo.herencia;

/**
 *
 * @author ecabrerar
 */
public class AutoShopApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan sdn = new Sedan(15, 5, 20000, "Silver");
        
        Ford ford1 = new Ford(2010, 3000, 5, 25000, "Black");
        Ford ford2 = new Ford(2011, 5000, 5, 35000, "White");
        
        Carro car = new Carro(5, 18000, "Red");
        
        System.out.println("Sedan Precio Venta   : " + String.format("$%,.2f", sdn.getPrecioVenta()));
        System.out.println("Ford Precio Venta    : " + String.format("$%,.2f", ford1.getPrecioVenta()));
        System.out.println("Ford II Precio Venta : " + String.format("$%,.2f", ford2.getPrecioVenta()));
        System.out.println("Carro Precio Venta   : " + String.format("$%,.2f", car.getPrecioVenta()));
    } 
}
