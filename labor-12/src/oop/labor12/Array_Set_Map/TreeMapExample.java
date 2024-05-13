package oop.labor12.Array_Set_Map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // TreeMap létrehozása, kulcs típusa String, érték típusa Integer
        TreeMap<String, Integer> map = new TreeMap<>();

        // Kulcs-érték párok hozzáadása a TreeMap-hez
        map.put("alma", 10);
        map.put("körte", 5);
        map.put("banán", 7);

        // Kulcs-érték párok kiíratása (rendezett sorrendben)
        System.out.println("TreeMap tartalma:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Méret lekérdezése
        System.out.println("TreeMap mérete: " + map.size());
    }
}

