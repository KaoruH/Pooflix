package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    private List<Pelicula> peliculas = new ArrayList<>();

    private List<Serie> series = new ArrayList<>();

    private List<INominable> nominados = new ArrayList<>();

    public void setSerie(List<Serie> series) {
        this.series = series;
    }

    public List<Serie> getSerie() {
        return this.series;
    }

    public void setPelicula(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Pelicula> getPelicula() {
        return this.peliculas;
    }

    public void inicializarCatalogo() {

        this.inicializarWitcher();
        this.inicializarTwelveMonkeys();
        this.inicializarPelis();

    }

    public void inicializarPelis() {

        Pelicula peli = new Pelicula("Inception", 2010, 148);
        Actor actor = new Actor("Leonardo DiCaprio", 45,"Dom Cobb");

        peli.getElenco().add(actor);

        this.peliculas.add(peli);

        peli = new Pelicula("Interstellar", 2014, 169);
        actor = new Actor("Matthew McConaughey", 50,"Joseph Cooper");

        peli.getElenco().add(actor);

        this.peliculas.add(peli);     

    }

    public void inicializarWitcher() {

        Clasificacion sixteenplus = new Clasificacion("Mayor 16", 16, "Sólo mayor 16 años");

        Genero fantasy = new Genero("Fantasy", "Cosas que no existen. Supuestamente.");
        //fantasy.setNombre("Fantasy");
        //fantasy.setDescripcion("Cosas que no existen");

        Serie witcher = new Serie("Witcher", 2019, fantasy, sixteenplus);
        //witcher.setNombre("Witcher");
        //witcher.setAnio(2019);
        witcher.setDescripcion("Geralt of Rivia is a witcher. Ciri is his child of surprise. Surprise.");
        //witcher.setGenero(fantasy);
        //witcher.setClasificacion(sixteenplus);

        Actor actor = new Actor("Henry Cavill", 36, "Geralt of Rivia");
        //actor.setNombre("Henry Cavill");
        //actor.setEdad(36);
        //actor.setPersonaje("Geralt of Rivia");

        witcher.getElenco().add(actor);

        actor = new Actor("Freya Allan", 18, "Ciri");
        //actor.setNombre("Freya Allan");
        //actor.setEdad(18);
        //actor.setPersonaje("Ciri");

        witcher.getElenco().add(actor);

        actor = new Actor("Anya Chalotra", 23, "Yennefer de Vengerberg");
        //actor.setNombre("Anya Chalotra");
        //actor.setEdad(23);
        //actor.setPersonaje("Yennefer de Vengerberg");

        witcher.getElenco().add(actor);

        this.series.add(witcher);

        Temporada temporadaWitcher = new Temporada(1);
        // temporadaWitcher.setNumeros(1);

        witcher.getTemporadas().add(temporadaWitcher);

        Episodio episodiosWitcher = new Episodio(1, "The End's Beginning", 61);
        episodiosWitcher.setDescripcion("Geralt enters the town of Blaviken and meets Renfri");

        temporadaWitcher.getEpisodios().add(episodiosWitcher);

        episodiosWitcher = new Episodio(2, "Four Marks", 60);
        episodiosWitcher.setDescripcion("Yennefer from Vengerberg of Aedirn is sold to Tissaia de Vries");

        temporadaWitcher.getEpisodios().add(episodiosWitcher);

        episodiosWitcher = new Episodio(3, "Betrayer Moon", 67);
        episodiosWitcher.setDescripcion("Yennefer and Istredd become lovers while finishing their training");

        temporadaWitcher.getEpisodios().add(episodiosWitcher);

        episodiosWitcher = new Episodio(4, "Of Banquets, Bastards and Burials", 62);
        episodiosWitcher.setDescripcion("Geralt accompanies Jaskier to the betrothal feast of Princess Pavetta.");

        temporadaWitcher.getEpisodios().add(episodiosWitcher);

        Websodio webi = new Websodio(8, "Chaos Chaos Websodio", 15, "https://locasoyyo.com");
        webi.setDescripcion("Un websodio creado sólo para chequear");

        temporadaWitcher.getEpisodios().add(webi);

    }

    public void inicializarTwelveMonkeys() {

        Clasificacion fourteenplus = new Clasificacion("Mayor 14", 14, "Sólo mayor 14 años");

        Genero cienciaFiccion = new Genero("Ciencia Ficción", "Que todavia no existe. Soy optimista.");
        //cienciaFiccion.setNombre("Ciencia Ficción");
        //cienciaFiccion.setDescripcion("Que es ficticio y que es ciencia.");

        Serie twelveMonkeys = new Serie("Twelve Monkeys", 2015, cienciaFiccion, fourteenplus);
        //twelveMonkeys.setNombre("Twelve Monkeys");
        //twelveMonkeys.setAnio(2015);
        twelveMonkeys.setDescripcion("Time traveler James Cole trying to avoid a lethal virus");
        //twelveMonkeys.setGenero(cienciaFiccion);
        //twelveMonkeys.setClasificacion(fourteenplus);
        

        Actor actor = new Actor("Aaron Stanford", 42, "James Cole");
        //actor.setNombre("Aaron Stanford");
        //actor.setEdad(43);
        //actor.setPersonaje("James Cole");

        twelveMonkeys.getElenco().add(actor);

        actor = new Actor("Amanda Schull", 41, "Dr. Cassandra Railly");
        //actor.setNombre("Amanda Schull");
        //actor.setEdad(41);
        //actor.setPersonaje("Dr. Cassandra Railly");

        twelveMonkeys.getElenco().add(actor);

        this.series.add(twelveMonkeys);

        Temporada temporadaTwelveMonkeys = new Temporada(1);
        // temporadaTwelveMonkeys.setNumeros(1);

        twelveMonkeys.getTemporadas().add(temporadaTwelveMonkeys);

        temporadaTwelveMonkeys = new Temporada(2);
        // temporadaTwelveMonkeys.setNumeros(2);

        twelveMonkeys.getTemporadas().add(temporadaTwelveMonkeys);

        temporadaTwelveMonkeys = new Temporada(3);
        // temporadaTwelveMonkeys.setNumeros(3);

        twelveMonkeys.getTemporadas().add(temporadaTwelveMonkeys);

        temporadaTwelveMonkeys = new Temporada(4);
        // temporadaTwelveMonkeys.setNumeros(4);

        twelveMonkeys.getTemporadas().add(temporadaTwelveMonkeys);

        Episodio episodiosTwelveMonkeys = new Episodio(1, "Splinter", 57);
        episodiosTwelveMonkeys
                .setDescripcion("En 2017, una plaga mortal mata a 7 billones de personas a nivel mundial");

        temporadaTwelveMonkeys.getEpisodios().add(episodiosTwelveMonkeys);

        episodiosTwelveMonkeys = new Episodio(5, "Bodies of Water", 60);
        episodiosTwelveMonkeys
                .setDescripcion("Jennifer envía a Railly al 2016 para encontrarse con su versión más joven");

        temporadaTwelveMonkeys.getEpisodios().add(episodiosTwelveMonkeys);

        episodiosTwelveMonkeys = new Episodio(10, "Witness", 59);
        episodiosTwelveMonkeys.setDescripcion("Cole, Railly y Athan llegan en 1959 a la Casa de Cedro y Pino.");

        temporadaTwelveMonkeys.getEpisodios().add(episodiosTwelveMonkeys);

        episodiosTwelveMonkeys = new Episodio(1, "The End", 62);
        episodiosTwelveMonkeys.setDescripcion("Sin spoilers ;)");

        temporadaTwelveMonkeys.getEpisodios().add(episodiosTwelveMonkeys);

    }

    public Serie buscarSerie(String titulo) {

        for (Serie s : this.series) {

            if (s.getNombre().equals(titulo)) {

                return s;
            }

        }

        return null;

    }

    public List<INominable> getNominados() {
        return nominados;
    }

    public void setNominados(List<INominable> nominados) {
        this.nominados = nominados;
    }

    public void inicializarListaNominados() {

        for (Pelicula peli : this.peliculas) {
            this.getNominados().add(peli);
            for (Actor actor : peli.getElenco())
                this.getNominados().add(actor);

        }
        for (Serie serie : this.series) {
            for (Actor actor : serie.getElenco())
                this.getNominados().add(actor);

        }
    }

    public void reproducirTrailersDeNominacion() {
        for (INominable nominado : this.getNominados()) {
            nominado.reproducirTrailerNominacion();
            if(nominado instanceof Actor){
                Actor actor = (Actor)nominado;
                actor.decirDiscurso();
            }
        }
    }


}