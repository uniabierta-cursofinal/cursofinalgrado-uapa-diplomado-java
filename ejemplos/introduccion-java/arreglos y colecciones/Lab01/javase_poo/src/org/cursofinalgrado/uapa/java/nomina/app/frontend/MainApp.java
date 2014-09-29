package org.cursofinalgrado.uapa.java.nomina.app.frontend;




import java.util.ArrayList;
import java.util.List;
import org.cursofinalgrado.uapa.java.nomina.app.entidades.Consultor;
import org.cursofinalgrado.uapa.java.nomina.app.entidades.Empleado;
import org.cursofinalgrado.uapa.java.nomina.app.entidades.Posicion;
import org.cursofinalgrado.uapa.java.nomina.app.interfaces.SueldoFijo;
import org.cursofinalgrado.uapa.java.nomina.app.interfaces.TarifaHoraDB;
import org.cursofinalgrado.uapa.java.nomina.app.utilidades.FormatearFecha;






public class MainApp {
    
    public void ListaConsultores (List<Consultor> consultores){
        for (Consultor consultor : consultores) {
            System.out.println(consultor.imprimirDatos());
        }
    }
    
    
    public void ListaEmpleados(List<Empleado> empleados){
        for (Empleado empleado : empleados) {
            System.out.println(empleado.imprimirDatos());
        }
    }
    
    public static void main(String[] args) {
        
        //Crear instancia de la clase Empleado
        Empleado emp1 = new Empleado();
        emp1.setNombre("Pedro Cruz");
        emp1.setNoEmpleado("7630");
        emp1.setCedula("031-000455-3");
        emp1.setDireccion("Hato del yaque");
        emp1.setTelefono("809-775-8090");                    
        emp1.setFecha_Nacimiento(FormatearFecha.getFecha("7/15/1981"));
        emp1.setHorasTrabajadas(new Double(44));
        emp1.setPosicion(Posicion.PROGRAMADOR);
        emp1.setSueldoFijo(SueldoFijo.getSueldoFijo().get(Posicion.PROGRAMADOR));
        emp1.setTarifaHoraExtra(TarifaHoraDB.getTarifaHoraExtra(Posicion.PROGRAMADOR));
        emp1.calcularSueldo();
        
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(emp1);
        
        //TODO: crear nuevos objetos y agregarlo a la lista de Empleados
        
        Consultor consultor1 = new Consultor();
        consultor1.setNombre("Sang Shin");
        consultor1.setNoEmpleado("000");
        consultor1.setCedula("N/A");
        consultor1.setDireccion("NY City");
        consultor1.setTelefono("1-718-567-8900");
        consultor1.setFecha_Nacimiento(FormatearFecha.getFecha("7/6/1970"));    
        consultor1.setHorasTrabajadas(40.0);
        
        //TODO: crear nuevos objetos y agregarlo a la lista de Consutores
        
        List<Consultor> consultores = new ArrayList<>();
        consultores.add(consultor1);        
        
        MainApp mainApp = new MainApp();
        mainApp.ListaEmpleados(empleados);
        mainApp.ListaConsultores(consultores);
    }
}
