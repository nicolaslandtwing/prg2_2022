package ch.teko.prg2.tag07.pruefungvorb;


import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Fahrzeuge
        Fahrzeug fahrzeug1 = new Fahrzeug("Rot");
        Fahrzeug fahrzeug2 = new Fahrzeug("Gruen");
        Fahrzeug fahrzeug3 = new Fahrzeug("Blau");

        // Parkplaetze
        ArrayList<Parkplatz> parkplaetze = new ArrayList<>();
        Parkplatz parkplatz1 = new Parkplatz (fahrzeug1);
        Parkplatz parkplatz2 = new Parkplatz (fahrzeug1);
        Parkplatz parkplatz3 = new Parkplatz (fahrzeug1);
        parkplaetze.add(parkplatz1);
        parkplaetze.add(parkplatz2);
        parkplaetze.add(parkplatz3);

        // Parkhaus
        Parkhaus kesselturm = new Parkhaus(parkplaetze);

        // Ausgabe
        Iterator<Parkplatz> itr = parkplaetze.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getFahrzeug().getFarbe());
        }



    }
}
