class Ticket {
    int id;
    String name;

    public Ticket(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class TicketService {
    Ticket[] tickets;

    public TicketService() {
        tickets = new Ticket[10];
        for (int i = 0; i < 10; i++) {
            tickets[i] = new Ticket(i + 1, "Ticket " + (i + 1));
        }
    }

    public Ticket getTicketById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.id == id) {
                return ticket;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TicketService ticketService = new TicketService();


        int ticketId = 5;
        Ticket ticket = ticketService.getTicketById(ticketId);

        if (ticket != null) {
            System.out.println("Found Ticket: ID = " + ticket.id + ", Name = " + ticket.name);
        } else {
            System.out.println("Ticket with ID " + ticketId + " Can not be found.");
        }
    }
}
