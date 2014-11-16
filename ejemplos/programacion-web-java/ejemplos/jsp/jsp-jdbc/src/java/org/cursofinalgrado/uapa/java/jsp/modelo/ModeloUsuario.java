package org.cursofinalgrado.uapa.java.jsp.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import org.cursofinalgrado.uapa.java.jsp.entidades.Usuario;
/**
 * 
 * @author ecabrerar
 */
public class ModeloUsuario {

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
            System.out.println("Error en el SQl");
        }

        return usuarios;

    }

}
