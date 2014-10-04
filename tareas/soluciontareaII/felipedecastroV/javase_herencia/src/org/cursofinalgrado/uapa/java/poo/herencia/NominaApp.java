package org.cursofinalgrado.uapa.java.poo.herencia;

import java.util.Date;

/**
 * 
 * @author ecabrerar
 * @date Wed Sep 24 14:29:26 AST 2014
 */
public class NominaApp {
    
    public void imprimirNomina(){
        Empleado empleado = new Empleado("Martin Jaquez", "Catcher", "Calle 3ra, No.25, Santo Domingo", new Date());   
//        empleado.setNombre("Martin Jaquez");
//        empleado.setPuesto("Catcher");
//        empleado.setDireccion("Calle 3ra, No.25, Santo Domingo");
//        empleado.setFecha_nacimiento(new Date());
        empleado.setNumeroEmpleado(245678);
        empleado.setPreciosHorasExtras(300);
        empleado.setSueldoFijo(5000);
        empleado.setHorasExtras(14);

        Consultor cons = new Consultor("Eduardo Roque", "QlikView Consultor", "Calle 4, No.20, Santiago", new Date());
//        cons.setNombre("Eduardo Roque");
//        cons.setPuesto("QlikView Consultor");
//        cons.setDireccion("Calle 4, No.20, Santiago");
//        cons.setFecha_nacimiento(new Date());
        cons.setNumeroConsultor(487987);
        cons.setHoraTrabajadas(40);
        cons.setPrecioHoras(2000);

        System.out.println("Reporte de Nómina");
        System.out.println();
        System.out.println("Nombre : " + empleado.getNombre());
        System.out.println("Número : " + empleado.getNumeroEmpleado());
        System.out.println("Puesto : " + empleado.getPuesto());
        System.out.println("Dirección : " + empleado.getDireccion());
        System.out.println("Fecha Nac.: " + String.format("%tb %<tC, %<tY", empleado.getFecha_nacimiento()));
        System.out.println("Sueldo : " + String.format("$%,.2f", empleado.calcularSueldo()));
        System.out.println();
        System.out.println("Nombre : " + cons.getNombre());
        System.out.println("Número : " + cons.getNumeroConsultor());
        System.out.println("Puesto : " + cons.getPuesto());
        System.out.println("Dirección : " + cons.getDireccion());
        System.out.println("Fecha Nac.: " + String.format("%tb %<tC, %<tY", cons.getFecha_nacimiento()));
        System.out.println("Sueldo : " + String.format("$%,.2f", cons.calcularSueldo()));
    }
    
    
    public static void main(String[] args) {
        
        NominaApp nomina = new NominaApp();
        nomina.imprimirNomina();

    }
}
