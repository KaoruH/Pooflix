package app;

import java.util.List;

public class Pelicula extends Contenido implements INominable {

    public Pelicula(String nombre, int anio){
        this.setNombre(nombre);
        this.setAnio(anio);
    }

    public Pelicula(String nombre, int anio, int duracionEnMinutos) {
        this(nombre, anio);
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public Director director;

    public int duracionEnMinutos;

    @Override
    public boolean ganoPreviamente() {

        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {

        System.out.println("Reproducindo trailer de pelicula " + this.getNombre());

    }

    @Override
    public void sacarSelfie(List<Actor> elenco) {

    }

    @Override
    public boolean estaNominado() {

        return false;
    }

}