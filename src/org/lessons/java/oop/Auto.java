package org.lessons.java.oop;

public class Auto {
    public static void main(String[] args) {

    }
    
    private String brand;
    private String model;
    private String color;
    private int hp = 0;
    private int numberOfDoors = 0;
    private boolean hasStarted;
    private boolean inWorkshop = false;

    public Auto(String brand, String model, String color, int hp, int numberOfDoors){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.numberOfDoors = numberOfDoors;
        this.hasStarted = false;
        this.inWorkshop = false;

    }

    public String getBrand (){
        return this.brand;
    }

    public void setBrand ( String brand){
        if (brand != null)
         this.brand = brand;
    }


    public String getModel (){
        return this.model;
    }

    public void setModel ( String model){
        if (model != null)
         this.model = model;
    }

    public String getColor (){
        return this.color;
    }

    public void setColor (String color){
        if (color != null)
         this.color = color;
    }

    public int getHp (){
        return this.hp;
    }

    public void setHp (int hp){
        if (hp > 0)
         this.hp = hp;
    }

    public int getNumberOfDoors ( int numberOfDoors){
        return this.numberOfDoors;
    }

    public void setHasStarted ( boolean hasStarted){
        
         this.hasStarted = hasStarted;
    }

    public boolean getInWorkshop (){
        return this.inWorkshop;
    }

    public void setInWorkshop ( boolean inWorkshop){
        
         this.inWorkshop = inWorkshop;
    }

    public void startUp (){
        this.hasStarted = true;
    }

    public void turnOff (){
        
         this.hasStarted = false;
    }
}
