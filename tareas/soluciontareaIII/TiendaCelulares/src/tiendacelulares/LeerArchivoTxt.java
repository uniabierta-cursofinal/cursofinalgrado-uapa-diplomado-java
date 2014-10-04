/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendacelulares;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author fdc500
 */
public class LeerArchivoTxt {
    public ArrayList<String> celTxt = new ArrayList<>();
    public ArrayList<String> tabTxt = new ArrayList<>();
    public ArrayList<String> smtTxt = new ArrayList<>();
    public LeerArchivoTxt(String nombreArchivo) {
        try {
            File miArchivo = new File(nombreArchivo);
            FileReader lectorArchivo = new FileReader(miArchivo);
            BufferedReader lector = new BufferedReader(lectorArchivo);
            String linea = null;
            while ((linea = lector.readLine()) != null) {
                if (linea.startsWith("Celular")) {
                    celTxt.add(linea);
                } else if (linea.startsWith("Tableta")) {
                    tabTxt.add(linea);
                } else if (linea.startsWith("Smart")) {
                    smtTxt.add(linea);
                }
                System.out.println(linea);
            }
            lector.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
