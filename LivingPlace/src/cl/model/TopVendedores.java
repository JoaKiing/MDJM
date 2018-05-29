/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class TopVendedores extends Vendedorr{
    private int CantidadVentas;

    public TopVendedores(int CantidadVentas) {
        this.CantidadVentas = CantidadVentas;
    }

    public TopVendedores(int CantidadVentas, int id, String nombre, String rut) {
        super(id, nombre, rut);
        this.CantidadVentas = CantidadVentas;
    }

    TopVendedores() {
       
    }

    public int getCantidadVentas() {
        return CantidadVentas;
    }

    public void setCantidadVentas(int CantidadVentas) {
        this.CantidadVentas = CantidadVentas;
    }
    
    
}
