package com.bastian.indicadores.models;

/**
 * Created by cutiko on 25-10-16.
 */

public class Indicator {

    private String codigo, nombre, unidad_medidad, fecha;
    private double valor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad_medidad() {
        return unidad_medidad;
    }

    public void setUnidad_medidad(String unidad_medidad) {
        this.unidad_medidad = unidad_medidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
