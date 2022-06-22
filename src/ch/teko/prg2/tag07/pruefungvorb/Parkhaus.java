package ch.teko.prg2.tag07.pruefungvorb;

import java.util.ArrayList;

public class Parkhaus {
    private ArrayList<Parkplatz> parkplaetze;

    public Parkhaus (ArrayList parkplaetze){
        this.parkplaetze=parkplaetze;
    }

    public ArrayList<Parkplatz> getParkplaetze(){
        return parkplaetze;
    }

}
