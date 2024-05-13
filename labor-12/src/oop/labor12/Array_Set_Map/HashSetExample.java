package oop.labor12.Array_Set_Map;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet létrehozása, típusa String
        HashSet<String> set = new HashSet<>();

        // Elemek hozzáadása a HashSet-hez
        set.add("alma");
        set.add("körte");
        set.add("banán");

        // Elemek kiíratása
        System.out.println("HashSet tartalma:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Méret lekérdezése
        System.out.println("HashSet mérete: " + set.size());
    }
}
