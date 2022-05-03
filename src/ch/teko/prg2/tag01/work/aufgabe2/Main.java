package ch.teko.prg2.tag01.work.aufgabe2;

public class Main {
    public static void main(String[] args) {
        Angestellter worker1 = new Angestellter("Landtwing", "Nicolas", 25, 175);
        Person person1 = new Person();
        Person person2 = new Person("Bucher", "Leandra");

        worker1.printInformation();
        person1.printInformation();
        person2.printInformation();
    }
}
