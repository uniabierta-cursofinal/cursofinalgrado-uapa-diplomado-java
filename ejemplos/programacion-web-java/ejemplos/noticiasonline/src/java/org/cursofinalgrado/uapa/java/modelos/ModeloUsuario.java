package org.cursofinalgrado.uapa.java.modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import org.cursofinalgrado.uapa.java.entidades.Usuario;

/**
 * 
 * @author ecabrerar
 */
public class ModeloUsuario {

    public List<Usuario> getUsuarios() {

        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            
            Statement stmt = Coneccion.getInstancia().getConeccion().createStatement();
                
            ResultSet rs = stmt.executeQuery("select * from usuario");

                while (rs.next()) {

                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("id"));
                    usuario.setNombre(rs.getString("nombre"));
                   usuario.setCorreo(rs.getString("correo"));
                    usuario.setUsuario_login(rs.getString("usuario_login"));
                    usuario.setClave(rs.getString("clave"));
                    usuarios.add(usuario);
                }
            

        } catch (SQLException e) {
            System.out.println("Error en el SQl");
        }

        return usuarios;

    }

}
