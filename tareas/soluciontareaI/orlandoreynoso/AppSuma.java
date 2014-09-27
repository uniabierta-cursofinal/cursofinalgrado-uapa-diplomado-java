class AppSuma
{  
int a;  
int b;
   
	AppSuma(int c, int d) 
	{
		a=c;
		b=d;
	}
   
		public int sumar()
			{
				return a+b;
			}
 
				public static void main(String[] args)
					{       
						AppSuma suma = new AppSuma(10,20);       
						int resultado = suma.sumar();      
						System.out.println("Resultado: "+resultado);    
					}
}

