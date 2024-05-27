package oop.labor13;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Date date = new Date(2024,5,17);
        System.out.println("Date: " + date);
        date.setYear(2003);
        date.setMonth(12);
        date.setDay(11);
        System.out.println("date: " + date);*/

        ArrayList<Tanfolyam> tanfolyamok = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File("tanfolyamok.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String nev = parts[0];
                double ar = Double.parseDouble(parts[1]);
                Date kezdesiDatum = Date.parse(parts[2]);

                Tanfolyam tanfolyam = new Tanfolyam(nev, ar, kezdesiDatum);
                tanfolyamok.add(tanfolyam);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Fájl nem található: " + e.getMessage());
        }

        for (Tanfolyam tanfolyam : tanfolyamok) {
            System.out.println(tanfolyam);
        }
    }
    }
}
