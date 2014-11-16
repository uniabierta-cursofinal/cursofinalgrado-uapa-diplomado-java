package org.cursofinalgrado.uapa.java.servlet.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.cursofinalgrado.uapa.java.servlet.entidades.Usuario;

/**
 * 
 * @author ecabrerar
 */
public class ModeloUsuario {

    public ModeloUsuario() {
    }

    /**
     * Metodo para obtener un listado de todos los usuarios registrados
     *
     * @return
     */
    public List<Usuario> getUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();

        try (Statement stmt = Coneccion.getInstancia().getConeccion().createStatement()) {

            try (ResultSet rs = stmt.executeQuery("select * from usuario")) {

                while (rs.next()) {

                    Usuario usuario = new Usuario();
                    usuario.setCodigo(rs.getInt("codigo"));
                    usuario.setNombres(rs.getString("nombre"));
                    usuario.setApellidos(rs.getString("apellido"));
                    usuario.setUsuario(rs.getString("usuario"));
                    usuario.setPass(rs.getString("clave"));
                    usuarios.add(usuario);
                }

            }

        } catch (SQLException e) {
            Logger.getLogger(getClass().getName()).info("Error en el SQl");
           
        }

        return usuarios;

    }

    /**
     * Comprobar si un usuario esta registrado en la base de datos
     *
     * @param usuario
     * @param pass
     * @return
     */
    public Usuario checkUsuario(String usuario, String pass) {

        Connection con = Coneccion.getInstancia().getConeccion();
        Usuario usuario1 = null;

        try (PreparedStatement pstmt = con.prepareStatement("select * from usuario where usuario = ? and clave= ?")) {

            pstmt.setString(1, usuario);
            pstmt.setString(2, pass);

            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("Usuario: " + usuario + " Pass : " + pass);

                if (rs.next()) {

                    usuario1 = new Usuario();
                    usuario1.setCodigo(rs.getInt("codigo"));
                    usuario1.setNombres(rs.getString("nombre"));
                    usuario1.setApellidos(rs.getString("apellido"));
                    usuario1.setUsuario(rs.getString("usuario"));
                    usuario1.setPass(rs.getString("clave"));

                }
            }

        } catch (SQLException e) {
            Logger.getLogger(getClass().getName()).info(MessageFormat.format("Error en el SQl{0}", e.getMessage()));
            return null;
        }

        return usuario1;
    }

}
