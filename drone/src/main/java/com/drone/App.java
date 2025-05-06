package com.drone;

import java.util.ArrayList;
import java.util.List;

import com.drone.entities.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Avion volant1 = new Avion("A400M", 900, 2);
        Avion volant2 = new Avion("A480", 1200, 4);
        Drone volant3 = new Drone(69420, 140);
        Drone volant4 = new Drone(5442, 80);

        List<Volant> liste = new ArrayList<>();

        liste.add(volant1);
        liste.add(volant2);
        liste.add(volant3);
        liste.add(volant4);

        for (Volant volant : liste) {
            volant.voler();
            if (volant instanceof Rechargeable) {
                ((Rechargeable) volant).recharger();
            }
        }
    }
}
