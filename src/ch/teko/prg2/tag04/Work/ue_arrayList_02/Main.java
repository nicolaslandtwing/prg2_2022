/*package ch.teko.prg2.tag04.Work.ue_arrayList_02;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Zug intercity1 = new Zug(21738946123123L, new Kontrolleur("Beat Meier"));
        ArrayList<Pendler> pendler = new ArrayList<Pendler>();

        Pendler p1 = new Pendler("Hans");

        Pendler p2 = new Pendler("Peter");
        pendler.set(0, p2);
        Pendler p3 = new Pendler("Meier");
        Pendler p4 = new Pendler("Stocker");
        Pendler p5 = new Pendler("Hüsler");
        pendler.clear();

        // Pendler steigen ein
        intercity1.einsteigen(p1);
        intercity1.einsteigen(p2);
        intercity1.einsteigen(p3);
        intercity1.einsteigen(p4);
        intercity1.einsteigen(p5);

        // Ausgabe
        for (Pendler p : intercity1.getPendler()) {
            System.out.println(p.getName());
        }

        // Pendler 4 steigt aus
        intercity1.aussteigen(p4);

        // Ausgabe
        for (Pendler p : intercity1.getPendler()) {
            System.out.println(p.getName());
        }
        // Test


        ArrayList<String> meineListe = new ArrayList<String>();
       // meineListe.add(new Integer(42)); // <-- Kompilierfehler
        String s = meineListe.get(0);
    }


}
*/