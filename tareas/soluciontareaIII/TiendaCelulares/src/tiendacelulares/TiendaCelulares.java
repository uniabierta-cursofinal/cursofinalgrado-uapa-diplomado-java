/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendacelulares;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author fdc500
 */
public class TiendaCelulares {
    private static final String NOMBREARCHIVO = "/Users/fdc500/Documents/workspace/TiendaCelulares/src/DatosCelulares.txt"; //
    private ArrayList<Celular> cel;
    private Tableta[] tab;
    private SmartPhone[] smart;
    
    private void procesarArchivo() throws ParseException {
        LeerArchivoTxt lector1 = new LeerArchivoTxt(NOMBREARCHIVO);            
        cel = new ArrayList<>();
        for (String celTxt : lector1.celTxt) {
            String[] campos = celTxt.split(",");
            DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            cel.add(new Celular(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], formatoFecha.parse(campos[6])));
        }
        tab = new Tableta[lector1.tabTxt.size()];
        for (int i = 0; i < lector1.tabTxt.size(); i++) {
            String[] campos = lector1.tabTxt.get(i).split(",");
            DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            tab[i] = new Tableta(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], formatoFecha.parse(campos[6]));
            tab[i].setOS(campos[7]);
            for (int n = 8; n < campos.length; n++) {
                tab[i].setWifi((tab[i].hasWifi()) ? true :campos[n].equals("wifi"));
                tab[i].setBand3G((tab[i].hasBand3G()) ? true :campos[n].equals("band3G"));
                tab[i].setPantallaMulti((tab[i].hasPantallaMulti()) ? true :campos[n].equals("pantallaMulti"));
            }
        }    
        smart = new SmartPhone[lector1.smtTxt.size()];
        for (int i = 0; i < lector1.smtTxt.size(); i++) {
            String[] campos = lector1.smtTxt.get(i).split(",");
            DateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            smart[i] = new SmartPhone(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5], formatoFecha.parse(campos[6]));
            for (int n = 7; n < campos.length; n++) {
                smart[i].setMemoriaSD((smart[i].getMemoriaSD() != null) ? smart[i].getMemoriaSD() :
                        (campos[n].contains("SD")) ? campos[n] :null);
                smart[i].setWifi((smart[i].hasWifi()) ? true :campos[n].equals("wifi"));
                smart[i].setBand2G((smart[i].hasBand2G()) ? true :campos[n].equals("band2G"));
                smart[i].setBand3G((smart[i].hasBand3G()) ? true :campos[n].equals("band3G"));
                smart[i].setPantallaMulti((smart[i].hasPantallaMulti()) ? true :campos[n].equals("pantallaMulti"));
                smart[i].setGPS((smart[i].hasGPS()) ? true :campos[n].equals("GPS"));
            }
        } 
        int t = cel.size()+tab.length+smart.length;
        System.out.println();
        System.out.print("Total de dispositivos procesados : " + t);
        System.out.println();
    }
    
    public void imprimeReporte() {
        System.out.println("Reporte de Dispositivos en Inventario");
        for (int i = 0; i < cel.size(); i++) {
            System.out.println();
            System.out.println("Dispositivo: " + cel.get(i).getNombreEquipo());
            System.out.println("Marca      : " + cel.get(i).getMarcaEquipo());
            System.out.println("Versión    : " + cel.get(i).getVersionEquipo());
            System.out.println("Capacidad  : " + cel.get(i).getCapacidadAlmacena());
            System.out.println("Teclado    : " + cel.get(i).getTeclado());
            System.out.println("Pantalla   : " + cel.get(i).getDimPantalla());
            System.out.println("Fecha      : " + String.format("%tb %<te, %<tY", cel.get(i).getFechaEquipo()));
            System.out.println("Precio     : " + String.format("$%,.2f", cel.get(i).calcularPrecio()));
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println();
            System.out.println("Dispositivo: " + tab[i].getNombreEquipo());
            System.out.println("Marca      : " + tab[i].getMarcaEquipo());
            System.out.println("Versión    : " + tab[i].getVersionEquipo());
            System.out.println("Capacidad  : " + tab[i].getCapacidadAlmacena());
            System.out.println("Teclado    : " + tab[i].getTeclado());
            System.out.println("Pantalla   : " + tab[i].getDimPantalla());
            System.out.println("Fecha      : " + String.format("%tb %<te, %<tY", tab[i].getFechaEquipo()));
            System.out.println("Sistema Ope: " + tab[i].getOS());
            System.out.println("Posee WiFi : " + ((tab[i].hasWifi())? "Si" : "No"));
            System.out.println("Posee 3G   : " + ((tab[i].hasBand3G())? "Si" : "No"));
            System.out.println("Pantalla Multi: " + ((tab[i].hasPantallaMulti())? "Si" : "No"));
            System.out.println("Precio     : " + String.format("$%,.2f", tab[i].calcularPrecio()));
        }
        for (int i = 0; i < smart.length; i++) {
            System.out.println();
            System.out.println("Dispositivo: " + smart[i].getNombreEquipo());
            System.out.println("Marca      : " + smart[i].getMarcaEquipo());
            System.out.println("Versión    : " + smart[i].getVersionEquipo());
            System.out.println("Capacidad  : " + smart[i].getCapacidadAlmacena());
            System.out.println("Teclado    : " + smart[i].getTeclado());
            System.out.println("Pantalla   : " + smart[i].getDimPantalla());
            System.out.println("Fecha      : " + String.format("%tb %<te, %<tY", smart[i].getFechaEquipo()));
            System.out.println("Memoria SD : " + ((smart[i].getMemoriaSD() != null)? smart[i].getMemoriaSD() : "No"));
            System.out.println("Posee WiFi : " + ((smart[i].hasWifi())? "Si" : "No"));
            System.out.println("Posee 2G   : " + ((smart[i].hasBand2G())? "Si" : "No"));
            System.out.println("Posee 3G   : " + ((smart[i].hasBand3G())? "Si" : "No"));
            System.out.println("Pantalla Multi: " + ((smart[i].hasPantallaMulti())? "Si" : "No"));
            System.out.println("Posee GPS  : " + ((smart[i].hasGPS())? "Si" : "No"));
            System.out.println("Precio     : " + String.format("$%,.2f", smart[i].calcularPrecio()));
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do {
            try {
                TiendaCelulares start = new TiendaCelulares();
                Scanner reader = new Scanner(System.in);
                System.out.println("Bienvenido al Sistema de Administracion de la Tienda de Celulares");
                System.out.println();
                System.out.println("Digite 1 para realizar la carga del archivo de equipos, digite 0 para salir :");
                int a = reader.nextInt();
                if (a == 1) {
                    start.procesarArchivo();
                    System.out.println();
                    System.out.println("El archivo fue procesado exitosamente, digite 1 para imprimir reporte, 0 para salir :");
                    a = reader.nextInt();
                    if (a == 1) {
                        start.imprimeReporte();
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } catch (ParseException pe) {
                break;
            } catch (InputMismatchException ime) {
                break;
            }

        } while (true);
    }
    
}
