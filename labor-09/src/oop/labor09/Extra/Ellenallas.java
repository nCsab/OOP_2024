package oop.labor09.Extra;

public class Ellenallas implements Alkatresz {
    private double ar;
    private double ertek;

    public Ellenallas(double ar, double ertek) {
        this.ar = ar;
        this.ertek = ertek;
    }

    public double getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "Ellenállás {Érték: " + ertek + ", Ár: " + ar + "}";
    }
}