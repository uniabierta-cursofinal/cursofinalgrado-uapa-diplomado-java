/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.cursofinalgrado.uapa.java.entidades;

import java.util.Date;

/**
 *
 * @author ecabrerar
 */
public class Usuario {
    
    
  private int id;  
private Date fechaIngreso;
private String nombre ;          
private Date fechaNacimiento; 
private String foto;             
private String correo  ;         
private String sexo  ;           
private String identificacion ;  
private Profesion profesion; 
private Ocupacion ocupacion; 
private TipoNoticia tipoNoticia ;    
private String clave;            
private Ubicacion ubicacion;
private String usuario_login;    
private String rol;         

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
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return the profesion
     */
    public Profesion getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    /**
     * @return the ocupacion
     */
    public Ocupacion getOcupacion() {
        return ocupacion;
    }

    /**
     * @param ocupacion the ocupacion to set
     */
    public void setOcupacion(Ocupacion ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * @return the tipoNoticia
     */
    public TipoNoticia getTipoNoticia() {
        return tipoNoticia;
    }

    /**
     * @param tipoNoticia the tipoNoticia to set
     */
    public void setTipoNoticia(TipoNoticia tipoNoticia) {
        this.tipoNoticia = tipoNoticia;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the ubicacion
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the usuario_login
     */
    public String getUsuario_login() {
        return usuario_login;
    }

    /**
     * @param usuario_login the usuario_login to set
     */
    public void setUsuario_login(String usuario_login) {
        this.usuario_login = usuario_login;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }



}
