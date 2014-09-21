
//Incluir sintaxis para imprimir parámetros pasados por método main
public class AppParametrosMain {
    
    public static void main(String[] args){
    
        if(args.length > 0) {
            System.out.println("Este programa tiene "+args.length+" parámetro(s)");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Parametro No."+(i+1)+" es: "+args[i]);
            }
        } else {
            System.out.println("Ningún parametro enviado");
        }
        
    }
    
}
