package ch.teko.prg2.tag02.Work.ue_oop_02_01;

public class Main {
    public static void main(String[] args) {
        // neue Ausweise erfassen
        Ausweis ausweis1 = new Ausweis(1223344, new Mensch("Meier", "Peter", 180), new Nation("CH"), "31.12.2024");
        Ausweis ausweis2 = new Ausweis(1223345, new Mensch("Hammer", "Michael", 185), new Nation("DE"), "31.12.2024");
        Ausweis ausweis3 = new Ausweis(1223346, new Mensch("Klammer", "Franz", 190), new Nation("AUT"), "31.12.2024");
        Identitaetskarte identitaetskarte1 = new Identitaetskarte(123456, new Mensch("Landtwing", "Nicolas", 180), new Nation("CH"), "31.12.2025", new Buergerort("Zug", new Nation("CH")) );

        // Ausweisinformationen ausgeben
        ausweis1.printAusweisInformationen();
        ausweis2.printAusweisInformationen();
        ausweis3.printAusweisInformationen();
        identitaetskarte1.printAusweisInformationen();
    }
}
