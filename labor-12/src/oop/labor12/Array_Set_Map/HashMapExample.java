package oop.labor12.Array_Set_Map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap létrehozása, kulcs típusa String, érték típusa Integer
        HashMap<String, Integer> map = new HashMap<>();

        // Kulcs-érték párok hozzáadása a HashMap-hez
        map.put("alma", 10);
        map.put("körte", 5);
        map.put("banán", 7);

        // Kulcs-érték párok kiíratása
        System.out.println("HashMap tartalma:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Méret lekérdezése
        System.out.println("HashMap mérete: " + map.size());
    }
}

