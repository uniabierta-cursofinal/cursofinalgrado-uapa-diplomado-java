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
        Sedan sdn = new Sedan(2014, 15, 5, 20000, "Silver");//agreagmos el anio para poder visualizarlo
        
        Ford ford1 = new Ford(2010, 3000, 5, 25000, "Black");
        
        Ford ford2 = new Ford(2011, 5000, 5, 35000, "White");
        
        Carro car = new Carro(5, 18000, "Red");
        
   
        //agregue los colores ya que tienen diferentes precios
        //agregamos el ano las velocidades 
        System.out.println("Marcas      Color       Anio     Velocidades    Precio");
        System.out.println();
        System.out.println("Sedan       "+sdn.getColor()+"      "+sdn.getAnio()+"     "+sdn.getCantVelocidad()+"              "+sdn.getPrecioVenta());
        System.out.println("Ford        "+ford1.getColor()+"       "+ford1.getAnio()+"     "+ford1.getCantVelocidad()+"              "+ford1.getPrecioVenta());
        System.out.println("Ford II     "+ford2.getColor()+"       "+ford2.getAnio()+"     "+ford2.getCantVelocidad()+"              "+ford2.getPrecioVenta());
        System.out.println();
        System.out.println("Carro Precio Venta :"+car.getPrecioVenta());
        
    }
}
