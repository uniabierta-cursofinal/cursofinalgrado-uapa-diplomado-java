package org.cursofinalgrado.uapa.java.poo.herencia;


import java.util.Date;

public class NominaApp {
    
    public void imprimirNomina(){
       Consultor cons = new Consultor("Eduardo Roque", "QlikView Consultor", "Direccion",new Date() );
       cons.setNombre("Eduardo Roque");
       cons.setnumero_cedula("001-0747235-9");
       cons.setTelefono("(829) 531-2020");
       cons.setDireccion("Santo Domingo");
       cons.setPuesto("QlikView Consultor");
       cons.setFecha_nacimiento(new Date());
       cons.setHoraTrabajadas(40);
       cons.setPrecioHoras(2000);
       
      Empleado empleado = new Empleado(); 
      empleado.setNumero_Empleado("#17");
      empleado.setNombre("Martin Jaquez");
      empleado.setnumero_cedula("056-0111734-5");
      empleado.setTelefono("(829) 343-7113");
      empleado.setDireccion("C/ 27 de Febrero #150");
      empleado.setPuesto("Catcher");
      empleado.setFecha_nacimiento(new Date());
      empleado.setPreciosHorasExtras(300);
      empleado.setSueldoFijo(5000);
      empleado.setHorasExtras(14);
      
       System.out.println("===============================");
       System.out.println("Tarea No. II Diplomado Java   || ");
       System.out.println("===============================");
       System.out.println("CONSULTOR"                  +"||" );
       System.out.println("=============================================================================================================================================================================================================================================================");
       System.out.println("Nombre Consultor: "+cons.getNombre() + " |  Cedula: " + cons.getnumero_cedula() + "| Direccion: " + cons.getDireccion() + "| Telefono: " + cons.getTelefono()+ "| Fecha de Nacimiento " + cons.getFecha_nacimiento() + "| Sueldo: "+ (cons.calcularSueldo())+ "|");
       System.out.println("=============================================================================================================================================================================================================================================================");
       System.out.println("EMPLEADO");
       System.out.println("=============================================================================================================================================================================================================================================================");
       System.out.println("Numero de Empleado: " + empleado.getNumero_Empleado() +  "  |  " + "Nombre Empleado: "+empleado.getNombre() + "   |   " + "Cedula: " + empleado.getnumero_cedula() + "   |   " + "Direccion: " + empleado.getDireccion() + "   |   " + "Telefono " + empleado.getTelefono() + "   |   " + "Fecha de Nacimiento: " + empleado.getFecha() + "   |   " + "Sueldo: "+ (empleado.calcularSueldo()));
       System.out.println("=============================================================================================================================================================================================================================================================");

   
    }   
    
    public static void main(String[] args) {
       //para poder poner el programa en funcionamiento debimos agragar las siguientes lineas de codigo
        NominaApp nomina = new NominaApp();
        nomina.imprimirNomina();
       
    }
    
}

