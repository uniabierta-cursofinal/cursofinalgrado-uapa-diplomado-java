
class AppSumaParametrosMain
{  
	int a;  
	int b;
  
		public int sumar(int a, int b)
			{    
				return a+b;  
			}
   
				public static void main(String[] args)
					{
						if(args.length == 2) 
							{    
								AppSumaParametrosMain suma = new AppSumaParametrosMain();  	
								int param1 = Integer.parseInt(args[0]);	
								int param2 = Integer.parseInt(args[1]);        
								int resultado  = suma.sumar(param1, param2);      
								System.out.println("Resultado: "+resultado);
							}

									else
										{
											System.out.println("Debe Digitar dos Parametros");
										}
					}
}

