/**Corregir error y poner a imprimir el resultado de la suma*/

class AppSumaMetodo{
  int a=10;
  int b=20;

AppSumaMetodo(int a, int b){
}
 public int sumar(){
    return a+b;
  }
 
  public static void main(String[] args){
       AppSumaMetodo suma = new AppSumaMetodo(10,20);
       int resultado = suma.sumar();
       
      System.out.println("Resultado : "+resultado);
    }

}
