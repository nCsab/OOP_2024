package oop.labor09.Extra;

import java.util.Objects;

public class Kondenzator implements Alkatresz {
    private double ar;
    private double ertek;

    public Kondenzator(double ar, double ertek) {
        this.ar = ar;
        this.ertek = ertek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kondenzator that = (Kondenzator) o;
        return Double.compare(ar, that.ar) == 0 && Double.compare(ertek, that.ertek) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ar, ertek);
    }

    @Override
    public double getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "Kondenzátor {Érték: " + ertek + ", Ár: " + ar + "}";
    }


}
