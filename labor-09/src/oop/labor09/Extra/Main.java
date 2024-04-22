package oop.labor09.Extra;

public class Main {
    public static void main(String[] args) {
        // Teszt
        Alkatresz kondenzator = new Kondenzator(10.5, 100);
        Alkatresz ellenallas = new Ellenallas(5.2, 200);
        Alkatresz tranzisztor = new Tranzisztor(8.75, "ABC034" );

        System.out.println(kondenzator);
        System.out.println(ellenallas);
        System.out.println(tranzisztor);

        // 3-4.
        Aramkor aramkor = new Aramkor();

        aramkor.alkatreszHozzaad(kondenzator);
        aramkor.alkatreszHozzaad(ellenallas);
        aramkor.alkatreszHozzaad(tranzisztor);

        System.out.println("\nÁramkör tartalma:");
        System.out.println(aramkor);

        aramkor.alkatreszEltavolit(kondenzator);
        aramkor.alkatreszEltavolit(tranzisztor);
        System.out.println("\nÁramkör tartalma az eltávolítás után:");
        System.out.println(aramkor + "\n");

        // 5.
        System.out.println("Kondenzátor az áramkör része: " + aramkor.keresAlkatresz(kondenzator));
        System.out.println("Ellenállás az áramkör része: " + aramkor.keresAlkatresz(ellenallas));

        //7.
        System.out.println("\nCsak az ellenállás az áramkör része: " + aramkor.csakEllenallasok());

        //6.
        Aramkor aramkor1 = new Aramkor();
        aramkor1.alkatreszHozzaad(kondenzator);
        aramkor1.alkatreszHozzaad(ellenallas);

        Aramkor aramkor2 = new Aramkor();
        aramkor2.alkatreszHozzaad(ellenallas);
        aramkor2.alkatreszHozzaad(ellenallas);

        System.out.println("\nAramkor1 és Aramkor2 egyenlőek: " + aramkor1.equals(aramkor2));

        double eredoEllenallas = aramkor2.eredoEllenallas();
        if (eredoEllenallas != -1) {
            System.out.println("\nEredő ellenállás: " + eredoEllenallas + " Ω");
        } else {
            System.out.println("\nNem csak ellenállások vannak az áramkörben.");
        }

        System.out.println("\n");
        String filename = "alkatreszek.txt";
        Aramkor aramkorFile = new Aramkor(filename);

        System.out.println("Az áramkör tartalma:");
        System.out.println(aramkorFile);
    }
}
