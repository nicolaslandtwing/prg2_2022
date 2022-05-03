package ch.teko.prg2.tag01.work.aufgabe2;

public class Person {
    private String nachname;
    private String vorname;
    public int alter;

    public Person(final String nachname, final String vorname){
        this.nachname = nachname;
        this.vorname = vorname;
    }
    //Nutzung des oberen Konstruktors mit this und Initialisierung der Parameter
    public Person() {
        this("Peter","Hans");
    }

    public void printInformation() {
        System.out.println("The Name ist:" + nachname + " " + vorname);
        System.out.println("Age: " + alter);
    }


}
