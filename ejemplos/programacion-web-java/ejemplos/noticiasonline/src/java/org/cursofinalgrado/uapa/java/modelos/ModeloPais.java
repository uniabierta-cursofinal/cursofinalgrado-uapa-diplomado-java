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
import org.cursofinalgrado.uapa.java.entidades.Pais;

/**
 *
 * @author ecabrerar
 */
public class ModeloPais {

    private static final ModeloPais INSTANCIA = new ModeloPais();

    private ModeloPais() {
    }

    public static ModeloPais getInstancia() {
        return INSTANCIA;
    }

    public List<Pais> getListadoPais() {

        List<Pais> lista = new ArrayList<Pais>();

        String sql = "select * from pais";

        Connection con = Coneccion.getInstancia().getConeccion();
        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Pais pais = new Pais();
                pais.setId(rs.getInt("codigo_pais"));
                pais.setNombre(rs.getString("nombre"));

                lista.add(pais);
            }

        } catch (SQLException e) {
            Logger.getLogger(ModeloPais.class.getName()).log(Level.SEVERE, null, e);
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
                Logger.getLogger(ModeloPais.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return lista;
    }

    public Pais getPaisPorId(int id) {

        String sql = "select * from pais where codigo_pais=?";

        Connection con = Coneccion.getInstancia().getConeccion();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pais pais = null;

        try {

            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();

            rs.next();
            pais = new Pais();
            pais.setId(rs.getInt("codigo_pais"));
            pais.setNombre(rs.getString("nombre"));

        } catch (SQLException e) {
            Logger.getLogger(ModeloPais.class.getName()).log(Level.SEVERE, null, e);
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
                Logger.getLogger(ModeloPais.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return pais;
    }
}
