package ch.teko.prg2.tag01.work.aufgabe3;

public class Main {
    public static void main(String[] args) {
        Lehrling peter = new Lehrling ("Muster", "Peter", 25, 60000, 25, 123);

        System.out.println("Hallo " + peter.getVorname() + ", deine Mitarbeiter ID ist " + peter.getMitarbeiterID());
    }
}
