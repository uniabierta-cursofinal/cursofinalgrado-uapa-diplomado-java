public class AppFactura 
{
	public static void main(String[] args) 
{
          
		double subtotal = 100; 
		double descuento = .2;  
		double montoDescuento = subtotal * descuento;       
		double Total = subtotal - montoDescuento;	
	
			System.out.println("Calculadora de Factura");	
			System.out.println();	
			System.out.println("Subtotal: " + subtotal);	
			System.out.println("Descuento : " + descuento);	
			System.out.println("Monto descuento: " + montoDescuento);	
			System.out.println("Total: " + Total);	
			System.out.println();
	
}

}
