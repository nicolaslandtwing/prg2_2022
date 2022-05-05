package ch.teko.prg2.tag02.Work.ue_oop_02_02;

public class KonzertTicket extends Ticket{
    private int sitzreihe;

    public KonzertTicket(Ort eventOrt, String eventName, int basisPreis, int sitzreihe){
        super(eventOrt, eventName, basisPreis);
        this.sitzreihe=sitzreihe;
    }

    public int getsitzreihe() {
        return sitzreihe;
    }

    @Override
    public double berechneTicketPreis() {
        this.setTicketPreis((getBasisPreis())*(1+1/getsitzreihe()));
        return this.getTicketPreis();
    }
}
