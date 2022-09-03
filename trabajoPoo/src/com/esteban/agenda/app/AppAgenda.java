package com.esteban.agenda.app;

import com.esteban.agenda.dominio.Agenda;


import java.util.List;
import java.util.Scanner;

public class AppAgenda {
    public static void main(String[] args) {
        byte eleccion;

        Scanner teclado = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.println("---------Agenda Telefónica-------------");

        while (true) {

            System.out.println("\n1. Crear un nuevo contacto\n2. Eliminar un contacto\n3. Buscar contacto\n4. Cambiar numero de un contacto\n5. Ordenar  contactos\n6. Mostrar lista de contactos\n7. Salir\n\n------");

            eleccion = teclado.nextByte();

            if (eleccion == 1) {//crear contacto
                String nombre, apellido;
                long numero;
                System.out.println("ingrese el nombre para su nuevo contacto");
                nombre = teclado.next();
                System.out.println("ingrese el apellido para el contacto");
                apellido = teclado.next();
                System.out.println("ingrese el número");
                numero = teclado.nextLong();
                agenda.crearContacto(nombre, apellido, numero);
            } else if (eleccion == 2) {//eliminar contacto


            } else if (eleccion == 3) {//buscar un contacto
                byte accion;
                System.out.println("\n1. Buscar contacto por nombre\n2. Buscar contacto por apellido\n3. Buscar contacto por numero\n");
                accion = teclado.nextByte();
                if (accion == 1) {
                    String nombre;
                    System.out.println("ingrese el nombre que desea buscar");
                    nombre = teclado.next();
                    agenda.buscarNombre(nombre);
                } else if (accion == 2) {
                    String apellido;
                    System.out.println("ingrese el apellido por el que quiere buscar");
                    apellido = teclado.next();
                    agenda.buscarApellido(apellido);
                } else if (accion == 3) {
                    long numero;
                    System.out.println("ingrese el numero que quiere buscar");
                    numero = teclado.nextLong();
                    agenda.buscarNumero(numero);
                } else {
                    break;
                }
            } else if (eleccion == 4) {//cambiar numero
                long numero;
                long numeroViejo;
                numero = teclado.nextLong();
                numeroViejo = teclado.nextLong();
                agenda.cambiarNumeroCelular(numeroViejo, numero);
            } else if (eleccion == 5) {

            } else if (eleccion == 6) {//mostrar contactos en la lista
                agenda.mostrarContactos();
            } else {
                break;
            }

            }  if (eleccion==7){//salir
            System.out.println("has salido\n");
            }
    }
}