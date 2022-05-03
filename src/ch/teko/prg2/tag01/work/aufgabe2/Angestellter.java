package ch.teko.prg2.tag01.work.aufgabe2;

public class Angestellter extends Person{
    private int mitarbeiterID;

    //Nutzung des Konstruktors der Oberklasse mit super und Definition von weiteren Parametern in diesem Konstruktor
    public Angestellter(String nachname, String vorname, int alter, int mitarbeiterID) {
        super(nachname, vorname);
        this.alter=alter;
        this.mitarbeiterID=mitarbeiterID;
    }

    //Überschreiben der Methode der Oberklasse
    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("MitarbeiterID: " + mitarbeiterID);
    }
}
