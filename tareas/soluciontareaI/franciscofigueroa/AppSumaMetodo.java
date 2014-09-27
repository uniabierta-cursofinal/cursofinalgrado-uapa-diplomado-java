/**Corregir error y poner a imprimir el resultado de la suma*/

class AppSumaMetodo{
  int a;
  int b;

  public int sumar(int a, int b){
    return a+b;
  }
 
  public static void main(String[] args){

       AppSumaMetodo suma = new AppSumaMetodo();      
        int resultado = suma.sumar(10,20); // Creamos la variable resultado como tipo de dato int para que pueda almcenar el valor numerico de la suma.

      System.out.println("Resultado : "+resultado);
    }
}
