package oop.labor12.Array_Set_Map;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList létrehozása, típusa String
        ArrayList<String> list = new ArrayList<>();

        // Elemek hozzáadása az ArrayList-hez
        list.add("alma");
        list.add("körte");
        list.add("banán");

        // Elemek kiíratása
        System.out.println("ArrayList tartalma:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Méret lekérdezése
        System.out.println("ArrayList mérete: " + list.size());

        // Elem elérésének példa
        System.out.println("Az első elem: " + list.get(0));
    }
}
