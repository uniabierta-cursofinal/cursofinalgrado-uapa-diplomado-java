/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapa.java.entidades;

/**
 *
 * @author ecabrerar
 */
public class Ubicacion {
    private int id;
    private String nombre;
    private Ciudad ciudad;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ciudad
     */
    public Ciudad getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    
}
