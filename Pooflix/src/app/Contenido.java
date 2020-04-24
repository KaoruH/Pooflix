package app;

import java.util.ArrayList;
import java.util.List;

public abstract class Contenido {

    private String nombre;

    private Clasificacion clasificacion;

    private Genero genero;

    private int anio;

    private String descripcion;

    private List<Actor> elenco = new ArrayList<>();

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setClasificacion(Clasificacion clasificacion){
        this.clasificacion = clasificacion;
    }

    public Clasificacion getClasificacion(){
        return this.clasificacion;
    }

    public void setGenero(Genero genero){
        this.genero = genero;
    }

    public Genero getGenero(){
        return this.genero;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public int getAnio(){
        return this.anio;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setElenco(List<Actor> elenco){
        this.elenco = elenco;
    }

    public List<Actor> getElenco(){
        return this.elenco;
    }



}