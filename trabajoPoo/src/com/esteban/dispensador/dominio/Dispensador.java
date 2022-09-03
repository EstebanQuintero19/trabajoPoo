package com.esteban.dispensador.dominio;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Dispensador {
    List<Mecato> mecato = new ArrayList<>();
    private final static int LIMITE_SNACK = 12,LIMITE_UNIDAD = 6;

    public boolean agregarMecato(String nombre,int valor, byte codigo){
        Mecato snack = new Mecato(nombre,this.mecato.size() + 1,valor);
        for(Mecato i: mecato){
            if((i.getNombre().equals(nombre)) || mecato.size() > LIMITE_SNACK || i.getCantidad() > LIMITE_UNIDAD) {
                return false;
            }
        }
        this.mecato.add(snack);
        snack.setCantidad(LIMITE_UNIDAD);
        return true;

    }
    public boolean sacarMecatoCod(byte codigo){
        for(Mecato i: mecato){

            if(i.getCodigo() == codigo && i.getCantidad() != 0){
                i.setCantidad(i.getCantidad() - 1);
                return true;
            }
        }
        return false;
    }
    public boolean sacarMecatoNom(String nombre){

        for(Mecato i: mecato){

            if(i.getNombre().equals(nombre) && i.getCantidad() != 0){

                i.setCantidad(i.getCantidad() - 1);
                return true;
            }
        }
        return false;
    }
    public boolean aumentarCantidad(String nombre){
        for(Mecato i: mecato){
            if(i.getNombre().equals(nombre) && i.getCantidad() < 6){
                i.setCantidad(i.getCantidad()+1);
                return true;
            }
        }
        return false;
    }
    public boolean quitarMecato(String nombre){
        for(Mecato i: mecato){
            if(i.getNombre().equals(nombre) && i.getCantidad() > 0){
                mecato.remove(i);
                return true;
            }
        }
        return false;
    }
    public int obtenerCantidadMecato(String nombre){

        for(Mecato i: mecato){
            if(i.getNombre().equals(nombre)){
                return i.getCantidad();
            }
        }
        return 0;
    }
    public List<String> obtenerNAgotados(){
        List<String> agotados = new ArrayList<>();
        for(Mecato i: mecato){
            if(i.getCantidad() == 0){
                agotados.add(i.getNombre());
            }
        }
        return agotados;
    }
    public List<String> obtenerNActivos(){

        List<String> activos = new ArrayList<>();
        for(Mecato i: mecato){
            if(i.getCantidad() != 0){
                activos.add(i.getNombre());
            }
        }
        return activos;

    }
    public List<Mecato> deValorMayorAMenor() {
        List<Mecato> ordenada = mecato;
        ordenada.sort(Comparator.comparing(Mecato::getValor).reversed());
        return ordenada;
    }

    public List<Mecato> deCantidadMenorAMayor() {
        List<Mecato> ordenada = mecato;
        ordenada.sort(Comparator.comparing(Mecato::getCantidad));
        return ordenada;
    }
    public boolean mostrarExistencia(String nombre){
        for(Mecato i: mecato){
            if(i.getNombre().equals(nombre) && i.getCantidad() > 0){
                return true;
            }
        }
        return false;

    }
    public  List<Mecato> mostrarLista(){
        for (Mecato i: mecato) {
            System.out.println(i.getNombre() + i.getCantidad() + i.getValor());
        }
        return null;
    }
}
