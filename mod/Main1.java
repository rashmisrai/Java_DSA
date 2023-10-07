package com.mod;

import java.util.Scanner;

public class Main1 {

    static int availableTickets;
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n,nt;
        String name="";
        int ticketid, price;
        System.out.println("Enter movie name");
        name=sc.next();
        System.out.println("Enter no of bookings");
        n=sc.nextInt();
        System.out.println("Enter the available tickets");
        availableTickets=sc.nextInt();

        for (int i=0; i<n;i++ ){
            System.out.println("Enter the ticketid");
            ticketid=sc.nextInt();
            System.out.println("Enter the price");
            price=sc.nextInt();
            System.out.println("Enter the no of tickets");
            nt=sc.nextInt();

            Ticket o1=new Ticket();
            o1.setTicketId(ticketid);
            o1.setPrice(price);
            o1.setAvailableTickets(availableTickets);
            System.out.println("Available tickets: "+availableTickets);
            if(availableTickets>=nt){
                System.out.println("Total amount: "+o1.calculateTicketCost(nt));
                availableTickets=availableTickets-nt;
                if(availableTickets!=0){
                    System.out.println("Available ticket after booking: "+availableTickets);
                }else{
                    System.out.println("House full");
                    break;
                }
            }
            else{
                System.out.println("Tickets are not available");
            }
        }
    }
}
