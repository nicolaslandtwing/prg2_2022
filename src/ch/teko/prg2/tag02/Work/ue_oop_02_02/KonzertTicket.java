package ch.teko.prg2.tag02.Work.ue_oop_02_02;

public class KonzertTicket extends Ticket{
    private int sitzreihe;

    public KonzertTicket(Ort eventOrt, String eventName, int basisPreis, int sitzreihe){
        super(eventOrt, eventName, basisPreis);
        this.sitzreihe=sitzreihe;
    }

    public double getsitzreihe() {
        return this.sitzreihe;
    }

    @Override
    public double berechneTicketPreis() {
        double berechneticketpreis;
        berechneticketpreis =this.getBasisPreis() * (1 + 1.0/this.getsitzreihe());
        this.setTicketPreis(berechneticketpreis);
        return this.getTicketPreis();
    }
}
