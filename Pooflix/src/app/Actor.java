package app;

public class Actor extends Persona{

    public Actor(String nombre, int edad, String personaje){
        
        this.setNombre(nombre);
        this.setEdad(edad);
        this.personaje = personaje;
    }

    private String personaje;

    public void setPersonaje(String personaje){
        this.personaje = personaje;
    }

    public String getPersonaje(){
        return this.personaje;
    }



}