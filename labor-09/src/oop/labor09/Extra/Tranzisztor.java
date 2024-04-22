package oop.labor09.Extra;

import java.util.Objects;

public class Tranzisztor implements Alkatresz {
    private double ar;
    private String kod;

    public Tranzisztor(double ar, String kod) {
        this.ar = ar;
        this.kod = kod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tranzisztor that = (Tranzisztor) o;
        return Double.compare(ar, that.ar) == 0 && Objects.equals(kod, that.kod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ar, kod);
    }

    public double getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "Tranzisztor {Kód: " + kod + ", Ár: " + ar + "}";
    }
}