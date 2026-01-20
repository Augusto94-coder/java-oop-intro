package org.lessons.java.oop.streaming;

public class Main {
    public static void main(String[] args) {

        Contenuto contenuto = new Contenuto("Documentario su Van Gogh");
        System.out.println(contenuto.getTitolo());
        System.out.println(contenuto.riproduci());

        String[] cast = {"Jude Law", "Meril Streep", "Leonardo Di Caprio", "Robert De Niro"};
        String[] listaEpisodi = {"1 - L'Inizio", "2 - Ridge si innamora", "3 - Che confusione!", "4 - Non finira' piu'"};

        Film ilSignoreDegliAnelli = new Film("Il Signore degli anelli: Le due Torri", cast, 181);
        System.out.println(ilSignoreDegliAnelli.getTitolo());

        Serie beautiful = new Serie("Beautiful", cast, listaEpisodi);
        System.out.println(beautiful.riproduci());
        System.out.println(beautiful.getEpisodi());
    }
}
