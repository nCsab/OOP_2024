package oop.labor09.Extra;

public class Tranzisztor implements Alkatresz {
    private double ar;
    private String kod;

    public Tranzisztor(double ar, String kod) {
        this.ar = ar;
        this.kod = kod;
    }

    public double getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "Tranzisztor {Kód: " + kod + ", Ár: " + ar + "}";
    }
}