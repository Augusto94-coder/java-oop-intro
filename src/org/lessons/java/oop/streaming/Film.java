package org.lessons.java.oop.streaming;

public class Film extends Contenuto{

    protected String[] cast;
    protected int durata;

    public Film(String titolo, String[] cast, int durata){
        super(titolo);
        this.cast = cast;
        this.durata = durata;
    }

    public String[] getCast(){
        return this.cast;
    }

    public void setCast(String[] cast){
        this.cast= cast;

    }

    public int getDurata(){
        return this.durata;
    }

    public void setDurata(int durata){
        this.durata = durata;
    }

    // metodi aggiuntivi


}
