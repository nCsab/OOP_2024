package oop.labor09.Extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aramkor {
    private List<Alkatresz> alkatreszek;

    public Aramkor() {
        this.alkatreszek = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aramkor aramkor = (Aramkor) o;
        return Objects.equals(alkatreszek, aramkor.alkatreszek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alkatreszek);
    }

    public void alkatreszHozzaad(Alkatresz alkatresz) {
        alkatreszek.add(alkatresz);
    }

    public void alkatreszEltavolit(Alkatresz alkatresz) {
        alkatreszek.remove(alkatresz);
    }

    public int alkatreszekSzama() {
        return alkatreszek.size();
    }

    public double osszAr() {
        double osszeg = 0;
        for (Alkatresz alkatresz : alkatreszek) {
            osszeg += alkatresz.getAr();
        }
        return osszeg;
    }

    public boolean keresAlkatresz(Alkatresz alkatresz) {
        return alkatreszek.contains(alkatresz);
    }

    public boolean csakEllenallasok() {
        for (Alkatresz alkatresz : alkatreszek )
            if(!(alkatresz instanceof Ellenallas)){
                 return false;}
        return true;
    }
    @Override
    public String toString() {
        String result = "";
        for (Alkatresz alkatresz : alkatreszek) {
            result += alkatresz.toString() + "\n";
        }
        result += "Összár: " + osszAr();
        return result;
    }
}
