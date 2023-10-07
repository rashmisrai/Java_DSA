package com.mod;

public class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;

    public void setTicketId(int ticketid){
        this.ticketid=ticketid;
    }
    public int getTicketId(){
        return ticketid;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setAvailableTickets(int availableTickets){
        this.availableTickets=availableTickets;
    }
    public int getAvailableTickets(){
        return availableTickets;
    }

    public int calculateTicketCost(int nooftickets)
    {
        if(availableTickets>=nooftickets){
            availableTickets=availableTickets - nooftickets;
            return (nooftickets*price);
        }
        else if (availableTickets==0){
            return -1;
        }
        else if (availableTickets< nooftickets){
            return -1;
        }
        return 0;
    }
}
