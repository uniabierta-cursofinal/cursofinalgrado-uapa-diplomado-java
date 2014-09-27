
//Incluir sintaxis para imprimir parámetros pasados por método main
public class AppParametrosMain {

    public static void main(String[] args){

      if(args.length > 0) {
	System.out.println("Este programa tiene "+args.length+" parámetros");
      } else {
         System.out.println("Ningún parametro enviado");
      }
      
    }

}
