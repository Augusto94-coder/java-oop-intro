package org.lessons.java.oop;

public class Auto {
    public static void main(String[] args) {

    }
    
    public String brand;
    public String model;
    public String color;
    public int hp = 0;
    public int numberOfDoors = 0;
    public boolean hasStarted;
    public boolean inWorkshop = false;

    public Auto(String brand, String model, String color, int hp, int numberOfDoors){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.hp = hp;
        this.numberOfDoors = numberOfDoors;
        this.hasStarted = false;
        this.inWorkshop = false;

    }

    public void startUp(){
        hasStarted = true;
    }

    public void turnOff(){
        this.hasStarted = false;
    }

    public void changeHp( int hp ){
        this.hp = hp;
    }
}
