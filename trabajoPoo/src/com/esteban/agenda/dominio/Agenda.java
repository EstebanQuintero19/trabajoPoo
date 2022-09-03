package com.esteban.agenda.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Agenda {

    List<Contacto> contactos = new ArrayList<>();

    public boolean crearContacto(String nombre, String apellido, long numero) {
        if (contactos.size() <= 50) {
            contactos.add(new Contacto(nombre, apellido, numero));
            System.out.println("contacto agregado exitosamente");
            return true;
        }
        System.out.println("no se pudo agregar contacto");
        return false;
    }

    public void eliminarContacto(long numero) {
        for (Contacto contacto : contactos) {
            if (contacto.getNumero() == numero) {
                contactos.remove(contacto);
            }

        }

    }

    public List<Contacto> buscarNombre(String nombre) {
        List<Contacto> nombres = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                nombres.add(contacto);
            }

        }
        this.contactos.forEach(i -> System.out.println(i.getNombre() + " " + i.getApellido() + "---> " + i.getNumero()));

        return nombres;
    }

    public List<Contacto> buscarApellido(String apellido) {
        List<Contacto> apellidos = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.getApellido().equals(apellido)) {
                apellidos.add(contacto);
            }

        }
        this.contactos.forEach(i -> System.out.println(i.getNombre() + " " + i.getApellido() + "---> " + i.getNumero()));

        return apellidos;
    }

    public Contacto buscarNumero(long numero) {
        for (Contacto contacto : contactos) {
            if (contacto.getNumero() == numero) {
                System.out.println(contacto);
                return contacto;
            }

        }

        return null;
    }

    public boolean cambiarNumeroCelular(long numeroViejo, long numeroNuevo) {

        for (Contacto contacto : contactos) {
            if (contacto.getNumero() == numeroViejo) {
                contactos.remove(contacto.getNumero());
                contacto.setNumero(numeroNuevo);
            }

        }
        return true;
    }

    public void ordenarContactos() {
        this.contactos.sort(Comparator.comparing(Contacto::getNombre).thenComparing(Contacto::getApellido));
        System.out.println("Se ha ordenado la agenda en orden alfabetico.");
    }

    public void mostrarContactos() {
        if (contactos.size() > 0) {
            this.contactos.forEach(i -> System.out.println(i.getNombre() + " " + i.getApellido() + "---> " + i.getNumero()));
        } else {
            System.out.println("Su agenda aun se encuenta vacia");
        }

    }

}



