package oop.labor09.Extra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Aramkor {
    private List<Alkatresz> alkatreszek;

    public Aramkor() {
        this.alkatreszek = new ArrayList<>();
    }

    public Aramkor(String fileName) {
        this();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                String[] items = line.split(",");
                String component = items[0].trim();
                switch (component) {
                    case "Kondenzátor":
                        double ar1 = Double.parseDouble(items[1].trim());
                        double ertek1 = Double.parseDouble(items[2].trim());
                        alkatreszek.add(new Kondenzator(ar1, ertek1));
                        break;
                    case "Ellenállás":
                        double ar2 = Double.parseDouble(items[1].trim());
                        double ertek2 = Double.parseDouble(items[2].trim());
                        alkatreszek.add(new Ellenallas(ar2, ertek2));
                        break;
                    case "Tranzisztor":
                        double ar3 = Double.parseDouble(items[1].trim());
                        String kod = items[2].trim();
                        alkatreszek.add(new Tranzisztor(ar3, kod));
                        break;
                    default:
                        System.err.println("Unknown component type: " + component);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        }
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aramkor aramkor = (Aramkor) o;

        if (alkatreszek.size() != aramkor.alkatreszek.size()) return false;

        for (Alkatresz alkatresz : alkatreszek) {
            if (!aramkor.alkatreszek.contains(alkatresz)) return false;
        }
        return true;
    }

    public double eredoEllenallas() {
        if (csakEllenallasok()) {
            double osszEllenallas = 0;
            for (Alkatresz alkatresz : alkatreszek) {
                if (alkatresz instanceof Ellenallas) {
                    Ellenallas ellenallas = (Ellenallas) alkatresz;
                    osszEllenallas += ((Ellenallas) alkatresz).getErtek();
                }
            }
            return osszEllenallas;
        } else {
            return -1;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(alkatreszek);
    }

    @Override
    public String toString() {
        String result = "";
        for (Alkatresz alkatresz : alkatreszek) {
            result += alkatresz.toString() + "\n";
        }
        result += "Összár: " + osszAr() + " | " + "Alkatrészek száma: " + alkatreszek.size();

        return result;
    }
}
