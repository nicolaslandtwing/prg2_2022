package ch.teko.prg2.tag05.W0rk.Hausaufgaben;

import java.util.ArrayList;

public class Parkhaus {
    private ArrayList<Parkplatz> parkplaetze;

    public Parkhaus (ArrayList parkplaetze) {
        this.parkplaetze = parkplaetze;
    }

    public ArrayList<Parkplatz> getParkplaetze() {
        return parkplaetze;
    }
}