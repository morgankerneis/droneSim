package com.drone.entities;

public class Avion implements Volant {
    private String modele;
    private double vitesseMax;
    private int nbMoteurs;

    public Avion(String modele, double vitesseMax, int nbMoteurs) {
        this.modele = modele;
        this.vitesseMax = vitesseMax;
        this.nbMoteurs = nbMoteurs;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public int getNbMoteurs() {
        return nbMoteurs;
    }

    public void setNbMoteurs(int nbMoteurs) {
        this.nbMoteurs = nbMoteurs;
    }

    @Override
    public void voler() {
        System.out.println("L'avion " + this.modele + " vole à une vitesse maximale de " + this.vitesseMax + " km/h.");
    }
}
