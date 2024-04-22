package oop.labor09.Extra;

import java.util.Objects;

public class Ellenallas implements Alkatresz {
    private double ar;
    private double ertek;

    public Ellenallas(double ar, double ertek) {
        this.ar = ar;
        this.ertek = ertek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ellenallas that = (Ellenallas) o;
        return Double.compare(ar, that.ar) == 0 && Double.compare(ertek, that.ertek) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ar, ertek);
    }

    public double getAr() {
        return ar;
    }

    public double getErtek() {
        return ertek;
    }

    @Override
    public String toString() {
        return "Ellenállás {Érték: " + ertek + ", Ár: " + ar + "}";
    }
}