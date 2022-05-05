package ch.teko.prg2.tag02.Work.ue_oop_02_01;

public class Identitaetskarte extends Ausweis{
    private  Buergerort buergerort;

    public Identitaetskarte(int ausweisNummer, Mensch besitzer, Nation nationalitaet, String ablaufDatum, Buergerort buergerort){
        super(ausweisNummer, besitzer, nationalitaet, ablaufDatum);
        this.buergerort = buergerort;
    }

    public Buergerort getBuergerort() {
        return buergerort;
    }

    @Override
    public void printAusweisInformationen() {
        super.printAusweisInformationen();
        System.out.printf("Bürgerort: %s, %s",
                this.buergerort.getName(), this.buergerort.getNation().getKuerzel());
    }
}
