package ch.teko.prg2.tag05.W0rk.Hausaufgaben;


import jdk.swing.interop.SwingInterOpUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

// Klasse Main
        public class Main {
            public static void main(String[] args)
            {
                // Fahrzeuge
                Fahrzeug fahrzeug1 = new Fahrzeug("Rot"); Fahrzeug fahrzeug2 = new Fahrzeug("Gruen"); Fahrzeug fahrzeug3 = new Fahrzeug("Blau");
                // Parkplaetze
                ArrayList<Parkplatz> parkplaetze = new ArrayList<>();

                parkplaetze.add(new Parkplatz(fahrzeug1));
                parkplaetze.add(new Parkplatz(fahrzeug2));
                parkplaetze.add(new Parkplatz(fahrzeug3));


                // Parkhaus
                Parkhaus kesselturm = new Parkhaus(parkplaetze);

                // Ausgabe
                Iterator<Parkplatz> iterator = kesselturm.getParkplaetze().iterator();
                while(iterator.hasNext()) {
                    Parkplatz p = iterator.next();
                    System.out.println(p.getFahrzeug().getFarbe());
                }
    }
}
