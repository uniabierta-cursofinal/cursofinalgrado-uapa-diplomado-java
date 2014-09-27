/*
*Corregir error de compilación
*Para ejecutar debe pasar dos parámetros, ejemplo: AppSumaParametrosMain 10 2
*Si no pasamos ningún parámetro dará el siguiente error java.lang.ArrayIndexOutOfBoundsException: 0.
*Se desea evitar el error anterior, debe colocar un bloque de control que evite la ejecución, si no existen parámetros.
*/

class AppSumaParametrosMain{
  int a;
  int b;

  public int sumar(int a, int b){
    return a+b;
  }
 
  public static void main(String[] args){

        AppSumaParametrosMain suma = new AppSumaParametrosMain();   

	int param1 = Integer.parseInt(args[0]);
	int param2 = Integer.parseInt(args[1]); // Cambiamos el nombre a la variable del parametro 2 ya que tenia el mismo que el parametro 1.
   
        int resultado  = suma.sumar(param1, param2);
        
        if( param1 > 0){  // Buscar solucion
            System.out.println("Resultado : "+resultado);
        } else {
            System.out.println("Debe introducir dos numeros enteros para sumar.");
        }
        
    }
}
