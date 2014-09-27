package org.cursofinalgrado.uapa.java.poo.herencia;


import java.util.Date;

/**
 * 
 * @author ecabrerar
 * @date Wed Sep 24 14:29:26 AST 2014
 */
public class NominaApp {
    
    public void imprimirNomina(){
      Empleado empleado = new Empleado();   
      empleado.setNombre("Martin Jaquez");
      empleado.setPuesto("Catcher");
      empleado.setFecha_nacimiento(new Date());
      empleado.setPreciosHorasExtras(300);
      empleado.setSueldoFijo(5000);
      empleado.setHorasExtras(14);
      
      Empleado empleado2 = new Empleado();   
      empleado2.setNombre("Maria Estefany");
      empleado2.setPuesto("Ingeniera Software");
      empleado2.setFecha_nacimiento(new Date());
      empleado2.setPreciosHorasExtras(400);
      empleado2.setSueldoFijo(30000);
      empleado2.setHorasExtras(3);
      
      
       Consultor cons = new Consultor();
       cons.setNombre("Eduardo Roque");
       cons.setPuesto("QlikView Consultor");
       cons.setFecha_nacimiento(new Date());
       cons.setHoraTrabajadas(40);
       cons.setPrecioHoras(2000);
       
        System.out.println("Nombre: "+cons.getNombre() + " Sueldo: "+cons.calcularSueldo());
        
        System.out.println("Nombre: "+empleado.getNombre() + " Sueldo: "+empleado.calcularSueldo());
        
        System.out.println("Nombre: "+empleado2.getNombre() + " Sueldo: "+empleado2.calcularSueldo());
        
   
    }
    
    
    public static void main(String[] args) {
       
        NominaApp nomina=new NominaApp();
        nomina.imprimirNomina();
        
    }
}
