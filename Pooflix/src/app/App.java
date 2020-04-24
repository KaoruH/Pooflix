package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Pooflix miPooflix = new Pooflix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("Witcher");

        Temporada laMejorTemporada = bb.getTemporada(1);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(3);

        elTop.reproducir();

        elTop = laMejorTemporada.getEpisodio(8);

        elTop.reproducir();

        // laMejorTemporada.getWebsodio(1).reproducir(); es lo mismo que las dos lineas
        // de arriba, pero sin guardar variables

        System.out.println("Empezando otra cosa");

        Episodio epiDemo;

        int posicion = 0;

        // En base a un numero de posicion de episodio, obtenerlo de la lista
        System.out.println("Ingrese la posicion");

        posicion = Teclado.nextInt();

        epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();

        // Primero preguntar de que tipo es. Usando el operador "instanceOf".
        //Segundo: castearlo al tipo correspondiente (es decir "Transformarlo")
        //usando el operador de Casteo.

        if (epiDemo instanceof Websodio){

            Websodio webi = (Websodio)epiDemo;
            webi.enviarAlertaDeQueEstaOnline();
            
        }

        miPooflix.inicializarListaNominados();

        miPooflix.reproducirTrailersDeNominacion();

    


        int lala;

        lala = 0;
        

    }
}