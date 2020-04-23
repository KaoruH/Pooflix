package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<>();

    public List<Serie> series = new ArrayList<>();

    public void inicializarCatalogo() {


    }

    public Serie buscarSerie(String titulo) {

        for (Serie s : this.series){
            
            if (s.nombre.equals(titulo)){

                return s;
            }

        }

        return null;

    }

}