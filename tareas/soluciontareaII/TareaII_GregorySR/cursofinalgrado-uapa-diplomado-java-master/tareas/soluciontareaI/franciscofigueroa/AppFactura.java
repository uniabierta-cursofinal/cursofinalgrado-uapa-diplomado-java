//Corregir errores
//Salida esperada después de corregir errores 
//Total: 80.0

public class AppFactura {

public static void main(String[] args) {
       // declaracion de variables
       double subtotal = 100; // asignar 100 a  subtotal
       // Quitamos las comillas al valor 100 de subtotal ya que es una valor numerico no de texto.
       
       double descuento = .2; // porcentaje descuento
       // Cambiamos el tipo de dato de la variable descuento a double ya que se trata de un monetario y estos pueden contener decimales.
       
       double montoDescuento = subtotal * descuento;
       double Total = subtotal - montoDescuento;

	// imprimir en la consola
	System.out.println("Calculadora de Factura");
	System.out.println();
	System.out.println("Subtotal: " + subtotal);
	System.out.println("Descuento : " + descuento);
	System.out.println("Monto descuento: " + montoDescuento);
	System.out.println("Total: " + Total);
	System.out.println();
	}
}
