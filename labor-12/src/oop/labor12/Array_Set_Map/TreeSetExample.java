package oop.labor12.Array_Set_Map;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet létrehozása, típusa String
        TreeSet<String> set = new TreeSet<>();

        // Elemek hozzáadása a TreeSet-hez
        set.add("alma");
        set.add("körte");
        set.add("banán");

        // Elemek kiíratása (rendezett sorrendben)
        System.out.println("TreeSet tartalma:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Méret lekérdezése
        System.out.println("TreeSet mérete: " + set.size());
    }
}

