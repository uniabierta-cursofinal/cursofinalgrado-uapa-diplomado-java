/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapa.java.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.cursofinalgrado.uapa.java.entidades.Ciudad;

/**
 *
 * @author ecabrerar
 */
public class ModeloCiudad {
    private static final ModeloCiudad INSTANCIA = new ModeloCiudad();
    
    public static ModeloCiudad getInstancia(){
        return INSTANCIA;
    }

    private ModeloCiudad() { }
    
    public List<Ciudad> getListadoCiudades() {

        List<Ciudad> lista = new ArrayList<Ciudad>();

        String sql = "select * from ciudades";

        Connection con = Coneccion.getInstancia().getConeccion();
        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
               
                Ciudad ciudad = new Ciudad();
                ciudad.setId(rs.getInt("codigo_ciudad"));
                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setPais(ModeloPais.getInstancia().getPaisPorId(rs.getInt("codigo_pais")));

                lista.add(ciudad);
            }

        } catch (SQLException e) {
            Logger.getLogger(ModeloCiudad.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                Logger.getLogger(ModeloCiudad.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return lista;
    }
    
    public boolean crearCiudad(Ciudad ciudad) {

        boolean estado = false;
        PreparedStatement stmt = null ;
        String sql = "insert into ciudades(nombre,codigo_pais) values(?,?)";
        
         Connection con = Coneccion.getInstancia().getConeccion();

        try {

             stmt = con.prepareStatement(sql);
             stmt.setString(1, ciudad.getNombre());
             stmt.setInt(2, ciudad.getPais().getId());

            stmt.executeUpdate();
            
            estado = true;

        } catch (SQLException e) {
            estado = false;
             Logger.getLogger(ModeloCiudad.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ModeloCategoria.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
        }
        
        return estado;

    }
}