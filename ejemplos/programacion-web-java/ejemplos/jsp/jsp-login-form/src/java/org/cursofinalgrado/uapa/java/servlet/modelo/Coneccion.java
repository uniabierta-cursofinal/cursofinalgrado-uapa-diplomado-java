package org.cursofinalgrado.uapa.java.servlet.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author ecabrerar
 */
public class Coneccion {

    private static final Coneccion INSTANCIA = new Coneccion();

    private Coneccion() {    }

    public static Coneccion getInstancia() {
        return INSTANCIA;
    }

    public Connection getConeccion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(getClass().getName()).info("Driver not found");

        }

        //Establish connection to MySQL database
        String connectionURL = "jdbc:mysql://127.0.0.1/tallerjavadb";
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(connectionURL, "root", "rootweb");
        } catch (SQLException e) {
            Logger.getLogger(getClass().getName()).log(Level.INFO, "Connection failed !!!{0}", e.getMessage());

        }

        return connection;
    }

}
