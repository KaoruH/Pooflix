package app;

public class Clasificacion {

    public Clasificacion(String tipo, int edadMin, String descripcion){
        this.tipo = tipo;
        this.edadMin = edadMin;
        this.descripcion = descripcion;
    }

    private String tipo;

    private int edadMin;

    private String descripcion;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEdadMin(int edadMin){
        this.edadMin = edadMin;
    }

    public int getEdadMin(){
        return this.edadMin;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

}