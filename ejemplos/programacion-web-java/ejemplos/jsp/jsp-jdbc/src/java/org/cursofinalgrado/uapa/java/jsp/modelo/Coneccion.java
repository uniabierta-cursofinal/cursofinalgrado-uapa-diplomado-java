package org.cursofinalgrado.uapa.java.jsp.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Logger;
/**
 * 
 * @author ecabrerar
 */
public class Coneccion { 

    private static Coneccion instancia=null;
    
    public Coneccion() {
        setDriver();
    } 
    
    public static Coneccion getInstancia(){
        if(instancia==null){
            instancia=new Coneccion();
        }
        
        return instancia;
    }
       
    private  void setDriver(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {            
            Logger.getLogger(getClass().getName()).info(MessageFormat.format("Driver not found {0}", e.getMessage()));
        }
    }
    
    public Connection getConeccion(){
        
        
        //Establish connection to MySQL database
        String connectionURL = "jdbc:mysql://127.0.0.1/tallerjavadb";
        Connection connection=null;

        try {
            connection = DriverManager.getConnection(connectionURL, "root", "rootweb");
        } catch (SQLException e) {
            Logger.getLogger(getClass().getName()).info(String.format("Connection failed !!! %s", e.getMessage()));
        }
        
        return connection;
    }
    
}
