package app;

public class Websodio extends Episodio {

    public Websodio(int numero, String nombre, int duracionEnMinutos, String url){
        super(numero, nombre, duracionEnMinutos);

        this.url = url;

    }


    private String url;

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl(){
        return this.url;
    }

    @Override
    public void reproducir(){

        System.out.println("Reproduciendo Websodio " + this.getNumero() + " " + this.getNombre() + " url: " + this.getUrl());
    }

    /**
     * "envia" un mail de alerta cuando la serie este online. Este metodo NO esta en EPISODIO
     */

     public void enviarAlertaDeQueEstaOnline(){
         //mandaria un mail a los usuarios avisando que ya esta disponible para ver.
         System.out.println("nviando mail con url " + this.url);
     }
}