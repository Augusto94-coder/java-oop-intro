package org.lessons.java.oop.streaming;

public class Contenuto {

    protected String titolo; 

    public Contenuto(String titolo){
        this.titolo = titolo;        
    }

    public String getTitolo(){
        return this.titolo;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public String riproduci(){
        return String.format("Sta riproducendo: %s", this.titolo);
    }
}
