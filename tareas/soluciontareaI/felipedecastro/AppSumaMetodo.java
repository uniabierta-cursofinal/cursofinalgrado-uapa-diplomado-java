/**Corregir error y poner a imprimir el resultado de la suma*/

public class AppSumaMetodo {
    //int a;
    //int b;
    
    public int sumar(int a, int b) {
        return a+b;
    }
 
    public static void main(String[] args) {
        AppSumaMetodo suma = new AppSumaMetodo();
        int resultado = suma.sumar(10,20);
        System.out.println("Resultado : "+resultado);
    }
    
}
