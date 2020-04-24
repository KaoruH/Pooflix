package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    public Temporada(int numeros){
        this.numeros = numeros;
    }

    private int numeros;
    private List<Episodio> episodios = new ArrayList<>();
    private List<Websodio> websodios = new ArrayList<>();

    public void setListaEpisodios(List<Episodio> episodios){
        this.episodios = episodios;
    }

    public List<Episodio> getEpisodios(){
        return this.episodios;
    }

    public void setWebsodios(List<Websodio> websodios){
        this.websodios = websodios;
    }

    public List<Websodio> getWebsodios(){
        return this.websodios;
    }

    public void setNumeros(int nro) {
        this.numeros = nro;
    }

    public int getNumeros(){
        return this.numeros;
    }

    public Websodio getWebsodio(int nro){

        for (Websodio web : this.websodios){
        
            if (web.getNumero() == nro){
                return web;
            }
        
        }

        return null;
    }


    public Episodio getEpisodio(int nro){

        for (Episodio epi : this.episodios){
            if (epi.getNumero() == nro){

                return epi;
            }
        }
        return null;
    }

    /**
     * Obtiene un episodio en base a la posicion dentro del ArrayList. Recordar que
     * los arraylist la primera posicion es 0.
     * @param pos
     * @return
     */

    public Episodio getEpisodioAtPosicion(int pos){
        return this.episodios.get(pos);
    }

    public List<Websodio> obtenerWebsodios(){
        List<Websodio> lista = new ArrayList<>();
        for (Episodio epi : this.episodios){
            if (epi instanceof Websodio){
                lista.add((Websodio) epi);
            }
        }
        return lista;
    }

}