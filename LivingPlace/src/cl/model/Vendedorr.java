/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model;

/**
 *
 * @author GAMERS
 */
public class Vendedorr {
    private int id;
    private String nombre;
    private String rut;

    public Vendedorr() {
    }

    public Vendedorr(String rut) {
        this.rut = rut;
    }
    

    public Vendedorr(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }
    

    public Vendedorr(int id, String nombre, String rut) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
}

