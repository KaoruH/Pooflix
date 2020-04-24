package app;

import java.util.List;

public class Actor extends Persona implements INominable {

    public Actor(String nombre, int edad, String personaje) {

        this.setNombre(nombre);
        this.setEdad(edad);
        this.personaje = personaje;
    }

    private String personaje;

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return this.personaje;
    }

    @Override
    public boolean ganoPreviamente() {

        return true;
    }

    @Override
    public void reproducirTrailerNominacion() {

        System.out.println("Reproducindo escenas de " + this.getNombre());

    }

    @Override
    public void sacarSelfie(List<Actor> elenco) {


    }

    @Override
    public boolean estaNominado() {

        return true;
    }



}