package org.lessons.java.oop;

public class Main {
    public static void main(String[] args) {
        
        Auto cinquecento = new Auto("Fiat", "Cinquecento", "Giallo", 40, 3);
        Auto alfaGiulia = new Auto("Alfa Romeo", "Giulia", "Rosso",180, 5);

        /* cinquecento.brand = "Fiat";
        cinquecento.model = "Cinquecento";
        cinquecento.color = "Giallo";
        cinquecento.hp = 40;
        cinquecento.numberOfDoors = 3;

        alfaGiulia.brand = "Alfa Romeo";
        alfaGiulia.model = "Giulia";
        alfaGiulia.color = "Rosso";
        alfaGiulia.hp = 180;
        alfaGiulia.numberOfDoors = 5; */

        /* System.out.println(cinquecento.model);
        System.out.println(cinquecento.hp);
        System.out.println(alfaGiulia.model);
        System.out.println(alfaGiulia.hp);

        cinquecento.changeHp(55);
        System.out.println(cinquecento.hp);
        System.out.println(alfaGiulia.hp); */

        System.out.println(cinquecento.getBrand());
        System.out.println(cinquecento.getModel());
        System.out.println(cinquecento.getColor());
        System.out.println(cinquecento.getHp());

        cinquecento.setColor("Blu elettrico");
        System.out.println(cinquecento.getColor());

        System.out.println(alfaGiulia.getBrand());
        System.out.println(alfaGiulia.getModel());
        System.out.println(alfaGiulia.getColor());
        System.out.println(alfaGiulia.getHp()); 
        
    }
}
