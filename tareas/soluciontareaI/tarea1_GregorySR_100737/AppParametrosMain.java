
//Incluir sintaxis para imprimir parámetros pasados por método main

import java.io.*;
import java.lang.String;

public class AppParametrosMain 
{
    public static void main(String[] args)
	{
      
	  if(args.length > 0) 
	  {
		System.out.println("Este programa tiene " +args.length+ " parámetros");
		int i;
		for (i=0;i <args.length; i++) 
		{
		System.out.println("Parámetro " +i+ ": " +args[i]); 
		}
      }
	   else 
	  {
         System.out.println("Ningún parametro enviado");
      }	  
	}
}
