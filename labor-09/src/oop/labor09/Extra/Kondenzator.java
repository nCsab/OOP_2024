package oop.labor09.Extra;

public class Kondenzator implements Alkatresz {
    private double ar;
    private double ertek;

    public Kondenzator(double ar, double ertek) {
        this.ar = ar;
        this.ertek = ertek;
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
