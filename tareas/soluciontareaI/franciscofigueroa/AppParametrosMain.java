
//Incluir sintaxis para imprimir parámetros pasados por método main

public class AppParametrosMain {

    public static void main(String[] args){

        
      if(args.length > 0) {
	System.out.println("Este programa tiene "+args.length+" parametros");
		System.out.println("Los parametros introducidos son: "+args[0]); //Con este codigo imprimimos los parametros introducidos en consola.
      } else {
         System.out.println("Ningun parametro enviado");
      }
      
    }

}
