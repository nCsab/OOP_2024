package oop.labor10.Lab10_02;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dates = new ArrayList<>();
        int currentYear = java.time.LocalDate.now().getYear();
        for (int i = 0; i < 10; i++) {
            int month = (int) (Math.random() * 12) + 1;
            int day = (int) (Math.random() * 28) + 1;
            dates.add(new MyDate(currentYear, month, day));
        }
        System.out.println("Rendezetlen datumok:");
        for (MyDate date : dates) {
            System.out.println(date);
        }
        Collections.sort(dates);
        System.out.println("\nRendezet datumok:");
        for (MyDate date : dates) {
            System.out.println(date);
        }
    }
}

