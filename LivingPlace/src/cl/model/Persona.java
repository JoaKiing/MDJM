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
public class Persona {
     private int id;
    private String nombre;
    private String rut;
    private int tipo_FK;

    public Persona() {
    }

    public Persona(int id, String nombre, String rut, int tipo_FK) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.tipo_FK = tipo_FK;
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

    public int getTipo_FK() {
        return tipo_FK;
    }

    public void setTipo_FK(int tipo_FK) {
        this.tipo_FK = tipo_FK;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", rut=" + rut + ", tipo_FK=" + tipo_FK + '}';
    }
    
}

