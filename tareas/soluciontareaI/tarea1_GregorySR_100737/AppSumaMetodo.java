/**Corregir error y poner a imprimir el resultado de la suma*/

class AppSumaMetodo
{
  int a;
  int b;
  public static int resultado;

  public int sumar(int a, int b)
  {
    return a+b;
  }
 
  public static void main(String[] args)
  {
       AppSumaMetodo suma = new AppSumaMetodo();      
        resultado = suma.sumar(10,20);
      System.out.println("Resultado : " +resultado);
    }
}
