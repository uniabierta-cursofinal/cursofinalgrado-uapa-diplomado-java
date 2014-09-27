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
      empleado.setTelefono("809.525.5275");
      empleado.setDireccion("C/ DUARTE #1, BEJUCAL, BONAO, RD.");
      empleado.setCedula("402-2112928-7");

      
      Consultor cons = new Consultor();
      cons.setNombre("Eduardo Roque");
      cons.setPuesto("QlikView Consultor");
      cons.setFecha_nacimiento(new Date());
      cons.setHoraTrabajadas(40);
      cons.setPrecioHoras(2000);
       
        System.out.println("=================================DATOS DE CONSULTOR=============================");
        int sal;
        if(cons.getHoraTrabajadas() > 44)
        {
        sal= (int) (cons.getHoraTrabajadas() * cons.getPrecioHoras());
        System.out.println("Nombre Consultor: "+cons.getNombre() + "\nSueldo: "+sal);
        }
        else
        {
        System.out.println("Nombre Consultor: "+cons.getNombre() + "\nSueldo: "+cons.calcularSueldo());
        }
        
        System.out.println("=================================DATOS DE EMPLEADO==============================");
        
        System.out.println("Nombre Empleado: "+empleado.getNombre() + "\nSueldo: "+empleado.calcularSueldo()
                + "\nPuesto: "+empleado.getPuesto() +"\nCédula: "+ empleado.getCedula()+ "\nTeléfono: " + empleado.getTelefono() + "\nSueldo Fijo: "+ empleado.getSueldoFijo()
               +"\nHoras Extras: "+ empleado.getPreciosHorasExtras() + "\nFecha Nacimiento: " + empleado.getFecha_nacimiento()
               +"\nDirección: " + empleado.getDireccion() 
                );
        System.out.println("================================================================================");

    }    
    
    public static void main(String[] args) {

         NominaApp nomina = new NominaApp();
         nomina.imprimirNomina();
    }
}
