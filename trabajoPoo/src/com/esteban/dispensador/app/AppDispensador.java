package com.esteban.dispensador.app;

import com.esteban.dispensador.dominio.Dispensador;
import com.esteban.dispensador.dominio.Mecato;

import java.util.Scanner;

public class AppDispensador {
    public static void main(String[] args) {

        Dispensador dispensador = new Dispensador();
        Scanner in = new Scanner(System.in);
        byte codigo;
        int valor;
        String nombre;

        System.out.println("----MAQUINA DESPACHADORA-----");

        while (true) {

            System.out.println("\n1. Agregar  mecato\n2. Sacar por codigo\n3. Sacar por nombre\n" +
                    "4. Aumentar  cantidad de unidades\n5. Quitar un snak\n6.Obtenerunidades de un snak\n" +
                    "7. Nombres snaks agotados\n8. Nombres y cantidad actuales\n"+
                    "9. Ordenar por precio\n10. Ordenar por cantidad\n11. Salir\n\n-----");

            byte eleccion = in.nextByte();

            Scanner teclado = new Scanner(System.in);

            switch (eleccion) {
                case 1 -> {
                    System.out.print("nombre: ");
                    nombre = in.next();
                    System.out.print("precio: ");
                    valor = in.nextInt();
                    System.out.println("codigo: ");
                    codigo = in.nextByte();
                    dispensador.agregarMecato(nombre,valor,codigo);
                    dispensador.mostrarLista();
                }
                case 2 -> {
                    System.out.println("nombre del snack que quiere sacar ");
                    nombre = in.next();
                    dispensador.sacarMecatoNom(nombre);
                    dispensador.mostrarLista();
                }
                case 3 -> {
                    System.out.println("codigo del snack que quiere sacar ");
                    codigo = in.nextByte();
                    dispensador.sacarMecatoCod(codigo);
                    dispensador.mostrarLista();
                }
                case 4 -> {
                    System.out.println("Ingresa el nombre del snack que quiere aumentar su cantidad ");
                    nombre = in.next();
                    dispensador.aumentarCantidad(nombre);
                    dispensador.mostrarLista();
                }
                case 5 -> {
                    System.out.println("Ingresa el Snack que quiere eliminar ");
                    nombre = in.next();
                    dispensador.quitarMecato(nombre);
                }
                case 6 -> {
                    System.out.println("Ingresa nombre Snack ");
                    nombre = in.next();
                    dispensador.obtenerCantidadMecato(nombre);

                }
                case 7 ->{
                    dispensador.obtenerNAgotados();
                }
                case 8 ->{
                    dispensador.obtenerNActivos();
                }
                case 9 ->{
                    dispensador.deValorMayorAMenor();
                }
                case 10 ->{
                    dispensador.deCantidadMenorAMayor();
                }
                case 11 ->{

                    System.out.println("nombre del snack que quiere validar ");
                    nombre = in.next();
                    dispensador.mostrarExistencia(nombre);
                }
                case 12->{
                    boolean activo = false;
                }
                default -> System.out.println("está fuera de las opciones");
            }

        }
    }
}