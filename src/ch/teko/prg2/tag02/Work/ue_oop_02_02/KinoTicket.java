package ch.teko.prg2.tag02.Work.ue_oop_02_02;

public class KinoTicket extends Ticket{
    private int filmDauer;

    public KinoTicket(Ort eventOrt, String eventName, int basisPreis, int Filmdauer){
        super(eventOrt, eventName, basisPreis);
        this.filmDauer=filmDauer;
    }

    public int getFilmDauer() {
        return filmDauer;
    }

    @Override
    public double berechneTicketPreis() {
        if (this.getFilmDauer() > 150) {
            this.setTicketPreis((this.getBasisPreis()) + 3);
        }
        else {
            this.setTicketPreis(this.getBasisPreis());
        }
        return this.getTicketPreis();
    }
}
