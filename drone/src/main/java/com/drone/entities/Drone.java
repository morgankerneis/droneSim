package com.drone.entities;

public class Drone implements Volant, Rechargeable {
    int id;
    int autonomie;
    double vitesseMax;

    public Drone(int id, double vitesseMax) {
        this.id = id;
        this.autonomie = BATTERIE_INIT;
        this.vitesseMax = vitesseMax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void voler() {
        if (this.autonomie > 5) {
            System.out.println(
                    "Le drone " + this.id + " survole la zone avec une autonomie de " + this.autonomie + " minutes.");
            autonomie -= 5;
        } else {
            System.out.println("Rechergez drone. Nv batterie : " + autonomie + "%");
        }
    }

    @Override
    public void recharger() {
        this.autonomie = 100;
    }

    @Override
    public int niveauBatterie() {
        return this.autonomie;
    }
}
