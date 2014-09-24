
/**
 No imprime resultado de la operación suma
*/

public class AppSuma {
    int a;
    int b;

    AppSuma(int a1, int b1) {
        a = a1;
        b = b1;
    }
    
    int sumar() {
        return a+b;
    }
 
    public static void main(String[] args) {
        AppSuma suma = new AppSuma(10,20);
        int resultado = suma.sumar();
        System.out.println("Resultado : "+resultado);
    }
}
