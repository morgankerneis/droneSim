package com.drone.entities;

public interface Rechargeable {
    public static final int BATTERIE_INIT = 100;

    void recharger();

    int niveauBatterie(); // returns percentage
}
