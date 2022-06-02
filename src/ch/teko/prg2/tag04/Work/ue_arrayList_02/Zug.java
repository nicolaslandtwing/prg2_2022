package ch.teko.prg2.tag04.Work.ue_arrayList_02;

import java.util.ArrayList;

public class Zug implements IZug {
    private long uid;
    private Kontrolleur kontrolleur;
//    private ArrayList<Pendler> pendler;
   // ArrayList<Pendler> pendler = new ArrayList<Pendler>();
    public Zug(long uid, Kontrolleur kontrolleur) {
        this.uid = uid;
        this.kontrolleur = kontrolleur;
    //    this.pendler = new ArrayList<>();
    }

    public ArrayList<Pendler> getPendler() {
        return pendler;
    }

    @Override
    public void einsteigen(Pendler pendler) {
    this.pendler.add(pendler);
    }

    @Override
    public void aussteigen(Pendler pendler) {
    this.pendler.remove(pendler);
    }

}
