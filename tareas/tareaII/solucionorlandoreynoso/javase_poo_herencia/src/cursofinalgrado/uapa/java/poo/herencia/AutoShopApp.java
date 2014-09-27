package cursofinalgrado.uapa.java.poo.herencia;

public class AutoShopApp {

    public static void main(String[] args) {
        Sedan sdn = new Sedan(15, 5, 20000, "Silver");
        
        Ford ford1 = new Ford(2010, 3000, 5, 25000, "Black");
        Ford ford2 = new Ford(2011, 5000, 5, 35000, "White");
        
        Carro car = new Carro(5, 18000, "Red");
        
        System.out.println ("Marca     " + "     Año" + "      Velocidades" + "    Precio"+ "\n");
        
        System.out.println( "Sedan     " + "     2015" +  "        "+ sdn.getCantVelocidad()+ "       "+  sdn.getPrecioVenta());
        System.out.println("Ford      " + "     2010" +  "        "+ ford1.getCantVelocidad()+ "       "+  ford1.getPrecioVenta());
        System.out.println("Ford II   " + "     2011" +  "        "+ ford2.getCantVelocidad()+ "       "+ ford2.getPrecioVenta()+"\n");
        
        System.out.println("Carro Precio Venta:" +car.getPrecioVenta());
        
    }
}

/*Respuesta: 
Cree la interface getPrecioVenta y la implemente en la clase carro, por tanto cualquier clase que herede de la clase carro tiene que sobrescribir el método getPreciVenta.
*/