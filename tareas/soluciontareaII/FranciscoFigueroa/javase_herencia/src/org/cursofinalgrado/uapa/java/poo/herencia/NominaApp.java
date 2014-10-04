package org.cursofinalgrado.uapa.java.poo.herencia;


import java.util.Date;

/**
 * 
 * @author ecabrerar
 * @date Wed Sep 24 14:29:26 AST 2014
 */
public class NominaApp {
    
    public void imprimirNomina(){
      Empleado empleado = new Empleado("Martin Jaquez", "Catcher", "Res. Don Zoilo, La Vega", "809-573-1111", "047-000000-1", new Date());   
      empleado.setNombre("Martin Jaquez");
      empleado.setPuesto("Catcher");
      empleado.setDireccion("Res. Don Zoilo, La Vega");
      empleado.setTelefono("809-573-1111");
      empleado.setCedula("047-000000-1");
      empleado.setFecha_nacimiento(new Date());
      empleado.setNumeroEmpleado(50);
      empleado.setPreciosHorasExtras(300);
      empleado.setSueldoFijo(5000);
      empleado.setHorasExtras(14);
      
       Consultor cons = new Consultor("Eduardo Roque", "QlikView Consultor", "Villa Rosa, La Vega","809-784-1514", "057-109003-2", new Date());
       cons.setNombre("Eduardo Roque");
       cons.setPuesto("QlikView Consultor");
       cons.setDireccion("Villa Rosa, La Vega");
       cons.setTelefono("809-784-1514");
       cons.setCedula("057-109003-2");
       cons.setFecha_nacimiento(new Date());
       cons.setNumeroConsultor(100);
       cons.setHoraTrabajadas(40);
       cons.setPrecioHoras(2000);
       

       /*** Imprimimos los datos de nomina segun el caso ***/ 
       
        System.out.println("Empleado");
        System.out.println("-=========================-");
        System.out.println("Nombre : " + empleado.getNombre());
        System.out.println("Número : " + empleado.getNumeroEmpleado());
        System.out.println("Puesto : " + empleado.getPuesto());
        System.out.println("Dirección : " + empleado.getDireccion());
        System.out.println("Telefono : " + empleado.getTelefono());
        System.out.println("Cedula : " + empleado.getCedula());
        System.out.println("Fecha Nac.: " + String.format("%tb %<tC, %<tY", empleado.getFecha_nacimiento()));
        System.out.println("Sueldo : " + String.format("$%,.2f", empleado.calcularSueldo()));
        System.out.println("-=========================-");
        System.out.println("Consultor");
        System.out.println("-=========================-");
        System.out.println("Nombre : " + cons.getNombre());
        System.out.println("Número : " + cons.getNumeroConsultor());
        System.out.println("Puesto : " + cons.getPuesto());
        System.out.println("Dirección : " + cons.getDireccion());
        System.out.println("Telefono : " + cons.getTelefono());
        System.out.println("Cedula : " + cons.getCedula());
        System.out.println("Fecha Nac.: " + String.format("%tb %<tC, %<tY", cons.getFecha_nacimiento()));
        System.out.println("Sueldo : " + String.format("$%,.2f", cons.calcularSueldo()));
   
    }
    
    
    public static void main(String[] args) {
      /*** Creamos el objeto a imprimir ***/  
        NominaApp nomina = new NominaApp();
        nomina.imprimirNomina();

    }
}
