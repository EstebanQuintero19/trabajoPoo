package com.esteban.dispensador.dominio;

public class Mecato {
    private String nombre;
    private int codigo;
    private int cantidad;
    private int valor;


    public Mecato(String nombre, int codigo, int cantidad, int valor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public Mecato(String nombre, int codigo, int valor) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}