package ch.teko.prg2.tag02.Work.ue_oop_02_02;

public class Main {
    public static void main(String[] args) {
        // neues SportTicket
        Ticket sportTicket = new SportTicket(new Ort("Luzern"), "Pokalfinale", 50, 5);
        Ticket kinoTicket = new KinoTicket (new Ort("Luzern"), "Avengers", 10, 160);
        Ticket konzertTicket = new KonzertTicket (new Ort("Luzern"), "Eminem", 20, 4);

        System.out.printf("%s Ticketpreis: %f.-%n", sportTicket.getEventName(), sportTicket.berechneTicketPreis());
        System.out.printf("%s Ticketpreis: %f.-%n", kinoTicket.getEventName(), kinoTicket.berechneTicketPreis());
        System.out.printf("%s Ticketpreis: %f.-%n", konzertTicket.getEventName(), konzertTicket.berechneTicketPreis());
    }
}
