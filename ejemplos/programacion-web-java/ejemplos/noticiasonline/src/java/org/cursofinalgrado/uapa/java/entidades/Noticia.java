/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cursofinalgrado.uapa.java.entidades;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author ecabrerar
 */
public class Noticia {

    private int id;
    private String descripcion;
    private Date fecha;
    private Usuario usuario;
    private Ubicacion ubicacion;
    private Time hora;
    private TipoNoticia tipoNoticia;
    private Categoria categoria;
    private String foto;
    private String video;
    private String visitas;
    private String desc_corta;

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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
     * @return the hora
     */
    public Time getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Time hora) {
        this.hora = hora;
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
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
     * @return the video
     */
    public String getVideo() {
        return video;
    }

    /**
     * @param video the video to set
     */
    public void setVideo(String video) {
        this.video = video;
    }

    /**
     * @return the visitas
     */
    public String getVisitas() {
        return visitas;
    }

    /**
     * @param visitas the visitas to set
     */
    public void setVisitas(String visitas) {
        this.visitas = visitas;
    }

    /**
     * @return the desc_corta
     */
    public String getDesc_corta() {
        return desc_corta;
    }

    /**
     * @param desc_corta the desc_corta to set
     */
    public void setDesc_corta(String desc_corta) {
        this.desc_corta = desc_corta;
    }
}
