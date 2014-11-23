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
import org.cursofinalgrado.uapa.java.entidades.Categoria;

/**
 *
 * @author ecabrerar
 */
public class ModeloCategoria {

    private static final ModeloCategoria INSTANCIA = new ModeloCategoria();

    public static ModeloCategoria getInstancia() {
        return INSTANCIA;
    }

    private ModeloCategoria() {
    }

    public boolean crearCategoria(Categoria categoria) {

        boolean estado = false;
        PreparedStatement stmt = null ;
        String sql = "insert into categorias(descripcion) values(?)";
        
         Connection con = Coneccion.getInstancia().getConeccion();

        try {

            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getDescripcion());

            stmt.executeUpdate();
            
            estado = true;

        } catch (SQLException e) {
            estado = false;
             Logger.getLogger(ModeloCategoria.class.getName()).log(Level.SEVERE, null, e);
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

    public List<Categoria> getListadoCategorias() {

        List<Categoria> lista = new ArrayList<Categoria>();

        String sql = "select * from categorias";

        Connection con = Coneccion.getInstancia().getConeccion();
        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("codigo_categoria"));
                categoria.setDescripcion(rs.getString("descripcion"));

                lista.add(categoria);
            }

        } catch (SQLException e) {
            Logger.getLogger(ModeloCategoria.class.getName()).log(Level.SEVERE, null, e);
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
                Logger.getLogger(ModeloCategoria.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return lista;
    }

}
