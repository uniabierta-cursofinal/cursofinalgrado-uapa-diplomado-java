package org.cursofinalgrado.uapa.java.poo.herencia;

import java.text.DecimalFormat;
import java.util.Date;

public class NominaApp {
    
    public void imprimirNomina(){
      Empleado empleado = new Empleado();   
      empleado.setNombre("Martin Jaquez");
      empleado.setNumero_Empleado("Emple-01");
      empleado.setnumero_cedula("001-1663081-5");
      empleado.setTelefono("(829) 307-8247");
      empleado.setDireccion("Santiago");
      empleado.setPuesto("Catcher");
      empleado.setFecha_nacimiento(new Date());
      empleado.setPreciosHorasExtras(300);
      empleado.setSueldoFijo(5000);
      empleado.setHorasExtras(14);
      
       Consultor cons = new Consultor("Eduardo Roque", "QlikView Consultor", "Direccion",new Date() );
       cons.setNombre("Eduardo Roque");
       cons.setnumero_cedula("001-0747235-9");
       cons.setTelefono("(829) 531-2020");
       cons.setDireccion("Santo Domingo");
       cons.setPuesto("QlikView Consultor");
       cons.setFecha_nacimiento(new Date());
       cons.setHoraTrabajadas(40);
       cons.setPrecioHoras(2000);
       
       DecimalFormat formateador = new DecimalFormat("#,###.00");
       
        System.out.println("Nombre Consultor: "+cons.getNombre() + ", Cedula: " + cons.getnumero_cedula() + ", Direccion: " + cons.getDireccion() + ", Telefono: " + cons.getTelefono()+ ", Fecha de Nacimiento " + cons.getFecha_nacimiento() + ", Sueldo: "+ formateador.format(cons.calcularSueldo())+ "\n");
        
        System.out.println("Numero de Empleado: " + empleado.getNumero_Empleado() + "\n" + "Nombre Empleado: "+empleado.getNombre() + "\n" + "Cedula: " + empleado.getnumero_cedula() + "\n" + "Direccion: " + empleado.getDireccion() + "\n" + "Telefono " + empleado.getTelefono() + "\n" + "Fecha de Nacimiento: " + empleado.getFecha() + "\n" + "Sueldo: "+ formateador.format (empleado.calcularSueldo()));
        
   
    }   
    
    public static void main(String[] args) {
       
        NominaApp nomina = new NominaApp();
        nomina.imprimirNomina();
       
    }
    
}

/*Respuesta: 
Puse en comentario el constructor súper de la clase empleado ya que no era necesario porque esa clase no hereda de ninguna otra.
Al método calcular sueldo lo modifique para que funcionara de manera adecuada.
Agregué variables faltantes y los métodos set y get que necesitaban en las clases persona y empleado.
Instancie la clase NominaApp para poder llamar el método ImprimirNomina.
Le di formato y agregue lo que quería que el programa imprimiera.
*/

