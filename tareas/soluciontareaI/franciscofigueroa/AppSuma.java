
/**
 No imprime resultado de la operación suma
*/

class AppSuma{
  int a;
  int b;
 
   public int sumar(int a, int b){
    return a+b;
  }
 
  public static void main(String[] args){
       AppSuma suma = new AppSuma();
       int resultado = suma.sumar(10,20);

      System.out.println("Resultado : "+resultado);
    }
}
