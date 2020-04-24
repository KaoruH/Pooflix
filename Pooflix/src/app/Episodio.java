package app;

public class Episodio {

    public Episodio(int numero, String nombre, int duracionEnMinutos){
        this.numero = numero;
        this.nombre = nombre;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    private int numero;

    private String nombre;

    private int duracionEnMinutos;

    private String descripcion;

    public void setDuracionEnMinutos(int duracionEnMinutos){
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getDuracionEnMinutos(){
        return this.duracionEnMinutos;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }


    public void setNumero(int nro){
        this.numero = nro;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void reproducir(){

        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }

}