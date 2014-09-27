
/**
 No imprime resultado de la operación suma
*/

class AppSuma
{
  int a = 10;
  int b = 20;

   AppSuma(int a, int b)
   {	
   }
 
   int sumar()
   {
    return a+b;
   }
 
  public static void main(String[] args)
  {
       AppSuma suma = new AppSuma(10,20);
       int resultado = suma.sumar();

      System.out.println("Resultado : " +resultado);
  }
}
